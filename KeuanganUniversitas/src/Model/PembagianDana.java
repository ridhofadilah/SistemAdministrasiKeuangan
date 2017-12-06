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
public class PembagianDana {
    private String idPembagian;
    private String idFakultas;
    private int totalDana;

    public PembagianDana(String idPembagian, String idFakultas, int totalDana) {
        this.idPembagian = "PBD"+idPembagian;
        this.idFakultas = idFakultas;
        this.totalDana = totalDana;
    }

    public String getIdPembagian() {
        return idPembagian;
    }

    public void setIdPembagian(String idPembagian) {
        this.idPembagian = idPembagian;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public int getTotalDana() {
        return totalDana;
    }

    public void setTotalDana(int totalDana) {
        this.totalDana = totalDana;
    }
    
}
