/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MIAfandi
 */
public class Pembayaran {
    private String idPembayaran;
    private String ajaran;
    private int total;
    private String status;
    private Mahasiswa [] mahasiswa = new Mahasiswa[1];

    public Pembayaran(String idPembayaran, String ajaran, int total) {
        this.idPembayaran = "PMB"+idPembayaran;
        this.ajaran = ajaran;
        this.total = total;
        this.status = "0";
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getAjaran() {
        return ajaran;
    }

    public void setAjaran(String ajaran) {
        this.ajaran = ajaran;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //masih bingung polanya gimana
    
}
