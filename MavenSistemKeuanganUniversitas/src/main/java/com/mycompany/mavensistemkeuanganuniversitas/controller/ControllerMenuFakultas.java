/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.controller;

import com.mycompany.mavensistemkeuanganuniversitas.model.Aplikasi;
import com.mycompany.mavensistemkeuanganuniversitas.model.Database;
import com.mycompany.mavensistemkeuanganuniversitas.model.Fakultas;
import com.mycompany.mavensistemkeuanganuniversitas.model.PengajuanDana;
import com.mycompany.mavensistemkeuanganuniversitas.model.PengeluaranDana;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuFakultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
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
        model.showTablePengajuanDanaFakultas(view, fakultas.getIdFakultas());
        view.setIDPengajuan("");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    Object source = ae.getSource();
       
        if (source == view.getBtnAddPengeluaran()){          
            if(!"".equals(view.getTaKeterangan().getText())&&!"".equals(view.getTfTotalPengeluaran().getText())){
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
            if(!"".equals(view.getTfLihatIDPengeluaran().getText())){
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
            if(!"".equals(view.getTaTujuanPengajuan().getText()) && !"".equals(view.getTfTotalPengajuan().getText())){
                String idPengajuan = view.getTfPengajuan().getText();
                String idFakultas = fakultas.getIdFakultas();
                String tujuanPengajuan = view.getTaTujuanPengajuan().getText();
                int totalPengajuan = Integer.parseInt(view.getTfTotalPengajuan().getText());
                PengajuanDana pj = new PengajuanDana(idPengajuan, idFakultas, tujuanPengajuan, totalPengajuan, "0");
                model.addPengajuanDana(pj); 
                JOptionPane.showMessageDialog(null, "Add Data Success");
                //setText
                view.getTaTujuanPengajuan().setText("");
                view.getTfTotalPengajuan().setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Plese fill all the blank");
            }
        }else if (source == view.getBtnLogoutFakultas()){
            new ControllerLogin(model);
            view.dispose();
        }
        model.showTabelPengeluaranDanaFakultas(view, fakultas.getIdFakultas());
        view.getTfDana().setText(Integer.toString(model.showDanaSisa(fakultas.getIdFakultas())));
        view.refresh("");
        view.setIDPengajuan("");
        model.showTablePengajuanDanaFakultas(view, fakultas.getIdFakultas());
    }
}
