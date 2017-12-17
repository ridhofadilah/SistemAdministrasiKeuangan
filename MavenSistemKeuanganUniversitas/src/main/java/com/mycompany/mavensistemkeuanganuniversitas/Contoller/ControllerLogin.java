/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.Contoller;

import com.mycompany.mavensistemkeuanganuniversitas.Model.Aplikasi;
import com.mycompany.mavensistemkeuanganuniversitas.Model.Database;
import com.mycompany.mavensistemkeuanganuniversitas.Model.Fakultas;
import com.mycompany.mavensistemkeuanganuniversitas.Model.Mahasiswa;
import com.mycompany.mavensistemkeuanganuniversitas.View.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControllerLogin implements ActionListener{
    private Aplikasi model;
    private Login view;
    private Database data = new Database();

    public ControllerLogin(Aplikasi model) {
            this.model=model;
            data.connect();
            view = new Login();
            view.setVisible(true);
            view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == view.getBtnLogin()){
            String uname = view.getTfUsername();
            String pw = view.getTfPassword();
            if (uname.equals("")|| pw.equals("")){
                JOptionPane.showMessageDialog(null,"Fill the username/password");
            } else if (uname.equals("admin") && pw.equals("admin")){
                new ControllerMenuAdmin(model);
                view.dispose();
            } else if (uname.equals("wakilrektor") && pw.equals("wakilrektor")){
                new ControllerMenuWakilRektor(model);
                view.dispose();
            } else if (model.findMahasiswa(uname,pw) != null){
                Mahasiswa m = model.findMahasiswa(uname, pw);
                new ControllerMenuMahasiswa(model, m);
                view.dispose();
            } else if (model.findFakultas(uname,pw) != null){
                Fakultas f = model.findFakultas(uname, pw);
                new ControllerMenuFakultas(model, f);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry user is not in database!");
            }
        }
    }
}
