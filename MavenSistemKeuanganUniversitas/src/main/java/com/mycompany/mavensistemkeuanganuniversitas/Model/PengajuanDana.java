/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas.Model;

/**
 *
 * @author MIAfandi
 */
public class PengajuanDana {
    public String idPengajuan;
    public String idFakultas;
    public String tujuan;
    public int total;
    private String status;

    public PengajuanDana(String idPengajuan, String idFakultas, String tujuan, int total, String status) {
        this.idPengajuan = idPengajuan;
        this.idFakultas = idFakultas;
        this.tujuan = tujuan;
        this.total = total;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdPengajuan() {
        return idPengajuan;
    }

    public void setIdPengajuan(String idPengajuan) {
        this.idPengajuan = idPengajuan;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }   
}

