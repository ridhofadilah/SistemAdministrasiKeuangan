/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Database;
import View.MenuWakilRektor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControllerMenuWakilRektor implements ActionListener{
    private Aplikasi model;
    private MenuWakilRektor view;
    private Database data = new Database();
    
    ControllerMenuWakilRektor(Aplikasi model){
        this.model = model;
        data.connect();
        this.view = new MenuWakilRektor();
        view.setVisible(true);
        view.addListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
 
    }
    
}
