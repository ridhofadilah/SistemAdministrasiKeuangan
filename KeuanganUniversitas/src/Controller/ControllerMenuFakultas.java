package Controller;

import Model.Aplikasi;
import Model.Database;
import Model.Fakultas;
import Model.PengeluaranDana;
import View.MenuFakultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
        view.refresh("");
        view.getTfDana().setText(Integer.toString(model.showDanaSisa(fakultas.getIdFakultas())));
        model.showTabelPembagianDanaFakultas(view,fakultas.getIdFakultas());
        model.showTabelPengeluaranDanaFakultas(view, fakultas.getIdFakultas());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    Object source = ae.getSource();
       
        if (source == view.getBtnAddPengeluaran()){          
            if(!view.getTaKeterangan().getText().equals("")&&!view.getTfTotalPengeluaran().getText().equals("")){
                String idPengeluran = view.getTfIDPengeluaran().getText();
                String tahunAjar = (String)view.getComboTahunAjar().getSelectedItem();
                String taKeterangan = view.getTaKeterangan().getText();
                int totalPengeluaran = Integer.parseInt(view.getTfTotalPengeluaran().getText());
                if (model.showDanaSisa(fakultas.getIdFakultas())-totalPengeluaran>0){
                    PengeluaranDana p = new PengeluaranDana(idPengeluran, fakultas.getIdFakultas(), tahunAjar, taKeterangan, totalPengeluaran);
                    model.tambahPengeluaranFakultas(p);
                    JOptionPane.showMessageDialog(null, "Input Success");
                }else{
                    JOptionPane.showMessageDialog(null, "Not enough Dana that we have");
                } 
                view.getTaKeterangan().setText("");
                view.getTfTotalPengeluaran().setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Fill all the data");
            }           
        }else if (source == view.getBtnLihatKeterangan()){
            String keterangan = view.getTfLihatIDPengeluaran().getText();
            if(!view.getTfLihatIDPengeluaran().getText().equals("")){
                PengeluaranDana p = model.cariPengeluaran(keterangan);
                if(p!=null){
                    view.getLabelKeterangan().setText(p.getKeterangan());
                    view.getTfLihatIDPengeluaran().setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "ID not found, please fill the true ID");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please fill ID Pengeluaran");
            }
        }else if (source == view.getBtnAddPengajuan()){
            
        }else if (source == view.getBtnLogoutFakultas()){
            new ControllerLogin(model);
            view.dispose();
        }
        model.showTabelPengeluaranDanaFakultas(view, fakultas.getIdFakultas());
        view.getTfDana().setText(Integer.toString(model.showDanaSisa(fakultas.getIdFakultas())));
        view.refresh("");
    }
   
}
