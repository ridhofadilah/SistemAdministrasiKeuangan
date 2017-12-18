/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.model;

/**
 *
 * @author MIAfandi
 */

import com.mycompany.mavensistemkeuanganuniversitas.view.MenuAdmin;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuFakultas;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuMahasiswa;
import com.mycompany.mavensistemkeuanganuniversitas.view.MenuWakilRektor;

public class Aplikasi {

    private Database data;
    private Mahasiswa mahasiswa;
    private Fakultas fakultas;
    private Pembayaran pembayaran;
    
    public Aplikasi(){
        this.data = new Database();
        data.connect();
    }
    
    public Mahasiswa findMahasiswa(String uname, String pw) {
        mahasiswa = data.cekMahasiswa(uname, pw);
        if (mahasiswa != null){
            return mahasiswa;
        } else {
            return null;
        }
    }

    public Fakultas findFakultas(String uname, String pw) {
        fakultas = data.cekFakultas(uname, pw);
        if (fakultas != null){
            return fakultas;
        }else {
            return null;
        }
    }

    public void showTabelTagihan(MenuMahasiswa view, String idMahasiswa) {
       data.loadDataTagihan(view, idMahasiswa);
    }

    public Pembayaran findIDPembayaran(String id, String idMahasiswa) {
        pembayaran = data.cekIDPembayaran(id, idMahasiswa);
        if (pembayaran != null){
            return pembayaran;
        } else {
            return null;
        }
    }

    public void updatePembayaranM(String id) {
        data.updatePembayaranMahasiswa(id);
    }

    public void konfirmasiPengajuan(String text, String setuju) {
        data.konfirmasiPengajuanDana(text,setuju);
    }

    public void konfirmasiPembayaran(String text, String setuju) {
        data.konfirmasiPembayaranMahasiswa(text, setuju);
    }
    
    public PengajuanDana cariIDPengajuan(String text) {
        PengajuanDana pengajuan = data.findIDPengajuan(text);
        if (pengajuan != null){
            return pengajuan;
        } else {
            return null;
        }
    }
    
    public Pembayaran cariIDPembayaran(String text) {
        pembayaran = data.findIDPembayaran(text);
        if (pembayaran != null){
            return pembayaran;
        } else {
            return null;
        }
    }

    public void showTabelPengajuan(MenuWakilRektor view) {
        data.loadDataPengajuanWR(view);
        data.loadDataPengajuanDiterima(view);
        data.loadDataPengajuanDitolak(view);
    }

    public void showTabelDana(MenuWakilRektor view) {
        data.loadDataDanaMasuk(view);
        data.loadDataDanaKeluar(view);
    }

    public void showTabelPembayaran(MenuAdmin view) {
        data.loadDataPembayaran(view);
    }
    
    public void showTabelPembagianWR(MenuWakilRektor view) {
        data.loadPembagianWR(view);
    }
    
    public Fakultas cariFakultas(String text) {
        fakultas = data.searchFakultas(text);
        if (fakultas !=null){
            return fakultas;
        } else {
            return null;
        }
    }
    
    public Pembayaran cariPembayaran(String text) {
        pembayaran = data.searchPembayaran(text);
        if (pembayaran !=null){
            return pembayaran;
        } else {
            return null;
        }
    }
    
    public Mahasiswa cariMahasiswa(String text) {
        mahasiswa = data.searchMahasiswa(text);
        if (mahasiswa !=null){
            return mahasiswa;
        } else {
            return null;
        }
    }

    public void tambahPembagianDana(PembagianDana pd) {
        data.addPembagianDana(pd);
    }

    public void updateDanaFakultas(PembagianDana pd, Fakultas f) {
        data.updateDanaF(pd, f);
    }
    
    public void tambahPembayaran(Pembayaran pb) {
        data.addPembayaran(pb);
    }

    public int showDana() {
        return data.showDanaUniversitas();
    }
    
    //fakultas

    public void tambahPengeluaranFakultas(PengeluaranDana f){
        data.addPengeluaranFakultas(f);
    }
    
    public int showDanaSisa(String id){
        return data.sumPembagianDanaFakultas(id)-data.sumPengeluranFakultas(id);
    }
    
    public void showTabelPembagianDanaFakultas(MenuFakultas view,String id){
        data.loadPembagianDanaFakultas(view, id);
    }
    
    public void showTabelPengeluaranDanaFakultas(MenuFakultas view,String id){
        data.loadPengeluaranFakultas(view, id);
    }
    
    public PengeluaranDana cariPengeluaran(String idPengeluran) {
        PengeluaranDana pengeluaran = data.cariPengeluaran(idPengeluran);
        if (pengeluaran !=null){
            return pengeluaran;
        } else {
            return null;
        }
    } 
    
    public void addPengajuanDana(PengajuanDana pj){
        data.tambahPengajuanDanaFakultas(pj);
    }
    
    public void showTablePengajuanDanaFakultas(MenuFakultas view, String idFakultas){
        data.loadPengajuanDanaFakultas(view, idFakultas);
    }
}
