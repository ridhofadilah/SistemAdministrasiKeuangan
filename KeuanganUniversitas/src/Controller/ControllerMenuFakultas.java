/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Database;
import View.MenuFakultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControllerMenuFakultas implements ActionListener{
    private Aplikasi model;
    private MenuFakultas view;
    private Database data = new Database();

    ControllerMenuFakultas(Aplikasi model) {
        this.model = model;
        data.connect();
        this.view = new MenuFakultas();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
    }
    
}
