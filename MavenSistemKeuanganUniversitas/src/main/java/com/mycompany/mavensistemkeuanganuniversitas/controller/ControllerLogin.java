/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.controller;

import com.mycompany.mavensistemkeuanganuniversitas.model.Aplikasi;
import com.mycompany.mavensistemkeuanganuniversitas.model.Database;
import com.mycompany.mavensistemkeuanganuniversitas.model.Fakultas;
import com.mycompany.mavensistemkeuanganuniversitas.model.Mahasiswa;
import com.mycompany.mavensistemkeuanganuniversitas.view.Login;
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
            if ("".equals(uname)|| "".equals(pw)){
                JOptionPane.showMessageDialog(null,"Fill the username/password");
            } else if ("admin".equals(uname) && "admin".equals(pw)){
                new ControllerMenuAdmin(model);
                view.dispose();
            } else if ("wakilrektor".equals(uname) && "wakilrektor".equals(pw)){
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
