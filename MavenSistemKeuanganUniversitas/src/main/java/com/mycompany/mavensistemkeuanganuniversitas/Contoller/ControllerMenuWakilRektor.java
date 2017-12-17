/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.Contoller;

import com.mycompany.mavensistemkeuanganuniversitas.Model.Aplikasi;
import com.mycompany.mavensistemkeuanganuniversitas.Model.Database;
import com.mycompany.mavensistemkeuanganuniversitas.Model.Fakultas;
import com.mycompany.mavensistemkeuanganuniversitas.Model.PembagianDana;
import com.mycompany.mavensistemkeuanganuniversitas.Model.PengajuanDana;
import com.mycompany.mavensistemkeuanganuniversitas.View.MenuWakilRektor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControllerMenuWakilRektor implements ActionListener {
    private Aplikasi model;
    private MenuWakilRektor view;
    private Database data = new Database();
    
    ControllerMenuWakilRektor(Aplikasi model){
        this.model = model;
        data.connect();
        this.view = new MenuWakilRektor();
        view.setVisible(true);
        view.addListener(this);
        view.refresh("");
        model.showTabelPengajuan(view);
        model.showTabelDana(view);
        model.showTabelPembagianWR(view);
        view.getTfDanaUniversitas().setText(Integer.toString(model.showDana()));
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == view.getBtnAddKonfirmasiPengajuan()){
            if (view.getTfIDPengajuanWR().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill the ID");
            } else {
                PengajuanDana pd = model.cariIDPengajuan(view.getTfIDPengajuanWR().getText());
                if (pd != null){
                    if (view.getRbSetujuPengajuan().isSelected()){
                        if (pd.getTotal() > Integer.parseInt(view.getTfDanaUniversitas().getText())){
                            JOptionPane.showMessageDialog(null, "Sorry insufficient funds!");
                        } else {
                            model.konfirmasiPengajuan(view.getTfIDPengajuanWR().getText(), "1");
                        }
                    } else {
                        model.konfirmasiPengajuan(view.getTfIDPengajuanWR().getText(), "-1");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry ID can't be found!");
                }
            }
        } else if (source == view.getBtnAddPembagianDana()){
            if (view.getTfFakultas().equals("") || view.getTfTotaLDana().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the textfield!");
            } else {
                if (model.cariFakultas(view.getTfFakultas().getText()) != null){
                    PembagianDana pd = new PembagianDana(view.getTfPembagian().getText(), view.getTfFakultas().getText(), Integer.parseInt(view.getTfTotaLDana().getText()));
                    Fakultas f = model.cariFakultas(view.getTfFakultas().getText());
                    if (pd.getTotalDana() > Integer.parseInt(view.getTfDanaUniversitas().getText())){
                        JOptionPane.showMessageDialog(null, "Sorry insufficient funds!");
                    } else {
                        model.tambahPembagianDana(pd);
                        model.updateDanaFakultas(pd, f);
                    }
                }
            }
        } else if (source == view.getBtnLogout()){
            new ControllerLogin(model);
            view.dispose();
        }
        model.showTabelPengajuan(view);
        view.getTfDanaUniversitas().setText(Integer.toString(model.showDana()));
        view.refresh("");
    }
}
