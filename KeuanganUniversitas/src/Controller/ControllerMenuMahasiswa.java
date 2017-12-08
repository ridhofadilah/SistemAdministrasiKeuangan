/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Database;
import View.MenuMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControllerMenuMahasiswa implements ActionListener{
    private Aplikasi model;
    private MenuMahasiswa view;
    private Database data = new Database();
    
    ControllerMenuMahasiswa(Aplikasi model){
        this.model = model;
        data.connect();
        this.view = new MenuMahasiswa();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
    }
    
}
