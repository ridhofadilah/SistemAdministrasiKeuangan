/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class PengeluaranDana {
    private String idPengeluaran;
    private String idFakultas;
    private String tujuan;
    private String waktu;
    private int total;
    private String keterangan;

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

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public PengeluaranDana(String idPengeluaran, String idFakultas, String tujuan, String waktu, int total, String keterangan) {
        this.idPengeluaran = "PLD"+idPengeluaran;
        this.idFakultas = idFakultas;
        this.tujuan = tujuan;
        this.waktu = waktu;
        this.total = total;
        this.keterangan = keterangan;
    }
    
}
