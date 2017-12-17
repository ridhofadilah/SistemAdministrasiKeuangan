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
public class Pembayaran {
    private String idPembayaran;
    private String idMahasiswa;
    private String ajaran;
    private int total;
    private String status;
    private String statusBayar;

    public Pembayaran(String idPembayaran, String idMahasiswa, String ajaran, int total, String status, String statusBayar) {
        this.idPembayaran = idPembayaran;
        this.idMahasiswa = idMahasiswa;
        this.ajaran = ajaran;
        this.total = total;
        this.status = status;
        this.statusBayar = statusBayar;
    }

    public Pembayaran(String idPembayaran, String idMahasiswa, String ajaran, int total) {
        this.idPembayaran = idPembayaran;
        this.idMahasiswa = idMahasiswa;
        this.ajaran = ajaran;
        this.total = total;
    }

    public Pembayaran(String idPembayaran, String idMahasiswa, int total, String status) {
        this.idPembayaran = idPembayaran;
        this.idMahasiswa = idMahasiswa;
        this.total = total;
        this.status = status;
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public String getAjaran() {
        return ajaran;
    }

    public int getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public void setAjaran(String ajaran) {
        this.ajaran = ajaran;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }
}
