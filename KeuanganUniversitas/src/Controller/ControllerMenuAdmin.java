/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Database;
import View.MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author User
 */
public class ControllerMenuAdmin implements ActionListener {
    private Aplikasi model;
    private MenuAdmin view;
    private Database data = new Database();

    ControllerMenuAdmin(Aplikasi model) {
            this.model=model;
            data.connect();
            view= new MenuAdmin();
            view.setVisible(true);
            view.addListener(this);
    }
  
    
    @Override
    public void actionPerformed(ActionEvent ae) {
   
    }
    
    
}
