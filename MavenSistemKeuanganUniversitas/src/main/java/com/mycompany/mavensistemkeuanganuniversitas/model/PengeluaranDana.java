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
public class PengeluaranDana {
    private String idPengeluaran;
    private String idFakultas;
    private String tahunAjar;
    private String keterangan;
    private int total;

    public PengeluaranDana(String idPengeluaran, String idFakultas, String tahunAjar, String keterangan, int total) {
        this.idPengeluaran = idPengeluaran;
        this.idFakultas = idFakultas;
        this.tahunAjar = tahunAjar;
        this.keterangan = keterangan;
        this.total = total;
    }

    public String getIdPengeluaran() {
        return idPengeluaran;
    }

    public void setIdPengeluaran(String idPengeluaran) {
        this.idPengeluaran = idPengeluaran;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getTahunAjar() {
        return tahunAjar;
    }

    public void setTahunAjar(String tahunAjar) {
        this.tahunAjar = tahunAjar;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }   
}