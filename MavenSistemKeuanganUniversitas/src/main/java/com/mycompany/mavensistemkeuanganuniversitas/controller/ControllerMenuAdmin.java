/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.controller;

import com.mycompany.mavensistemkeuanganuniversitas.model.Aplikasi;
import com.mycompany.mavensistemkeuanganuniversitas.model.Database;
import com.mycompany.mavensistemkeuanganuniversitas.model.Pembayaran;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControllerMenuAdmin implements ActionListener{
    private Aplikasi model;
    private MenuAdmin view;
    private Database data = new Database();

    ControllerMenuAdmin(Aplikasi model) {
            this.model = model;
            data.connect();
            view= new MenuAdmin();            
            view.refresh("");
            view.setVisible(true);
            view.addListener(this);
            model.showTabelPembayaran(view);
    }
  
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == view.getBtnKonfirmasiPembayaran()){
            if ("".equals(view.getTfIDPembayaranKonfirmasiA().getText())){
                JOptionPane.showMessageDialog(null, "Fill the ID!");
            } else {
                Pembayaran pb = model.cariIDPembayaran(view.getTfIDPembayaranKonfirmasiA().getText());
                if (pb != null){
                    if (view.getRbSetuju().isSelected()){
                        model.konfirmasiPembayaran(view.getTfIDPembayaranKonfirmasiA().getText(), "1");
                    } else {
                        model.konfirmasiPembayaran(view.getTfIDPembayaranKonfirmasiA().getText(), "-1");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry ID can't be found!");
                }
            }           
        } else if (source == view.getBtnAddPembayaranA()){
            if ("".equals(view.getTfIDMahasiswaA().getText())|| "".equals(view.getTfTotalBayarA().getText())){
                JOptionPane.showMessageDialog(null, "Fill all the textfield!");
            } else {
                if (model.cariMahasiswa(view.getTfIDMahasiswaA().getText()) != null){
                    Pembayaran pb = new Pembayaran(view.getTfIDPembayaranA().getText(), view.getTfIDMahasiswaA().getText(), (String)view.getComboTahunAjarA().getSelectedItem(), Integer.parseInt(view.getTfTotalBayarA().getText()), "0", "0");
                    model.tambahPembayaran(pb);
                    }
                }
            }
         else if (source == view.getBtnLogout()){
            new ControllerLogin(model);
            view.dispose();
        }
        model.showTabelPembayaran(view);
        view.refresh("");
    }
}
