package Controller;

import Model.Aplikasi;
import Model.Database;
import Model.Fakultas;
import View.MenuFakultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMenuFakultas implements ActionListener{
    private Aplikasi model;
    private MenuFakultas view;
    private Database data = new Database();
    private Fakultas fakultas;

    ControllerMenuFakultas(Aplikasi model, Fakultas f) {
        this.model = model;
        this.fakultas = f;
        data.connect();
        this.view = new MenuFakultas();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
    }
   
}
