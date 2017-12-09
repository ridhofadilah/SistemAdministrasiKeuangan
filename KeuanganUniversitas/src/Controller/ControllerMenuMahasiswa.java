/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Database;
import Model.Mahasiswa;
import Model.Pembayaran;
import View.MenuMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControllerMenuMahasiswa implements ActionListener{
    private Aplikasi model;
    private MenuMahasiswa view;
    private Database data = new Database();
    private Mahasiswa mahasiswa;
    
    ControllerMenuMahasiswa(Aplikasi model, Mahasiswa m) {
        this.model = model;
        this.mahasiswa = m;
        data.connect();
        this.view = new MenuMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        model.showTabelTagihan(view,mahasiswa.getIdMahasiswa());
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == view.getBtnAddPembayaran()){
            if (view.getTfIDPembayaran().getText().equals("") || view.getTfTotalBayar().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill all the text");
            } else {
                String id = view.getTfIDPembayaran().getText();
                int total = Integer.parseInt(view.getTfTotalBayar().getText());
                if (model.findIDPembayaran(id,mahasiswa.getIdMahasiswa()) != null){
                    Pembayaran p = model.findIDPembayaran(id, mahasiswa.getIdMahasiswa());
                    if (total == p.getTotal()){
                        model.updatePembayaranM(id,mahasiswa.getIdMahasiswa());
//                        new ControllerMenuMahasiswa(model, mahasiswa);
//                        view.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry incorrect amount");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry Can't find that ID");
                }
            }   
        } else if (source == view.getBtlLogoutMahasiswa()){
            new ControllerLogin(model);
            view.dispose();
        }
        view.refresh("");
    }
    
}
