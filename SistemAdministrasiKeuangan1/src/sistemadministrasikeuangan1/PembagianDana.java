/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadministrasikeuangan1;

/**
 *
 * @author MIAfandi
 */
public class PembagianDana {
    private String idFakultas;
    private int dana;

    public PembagianDana(String idFakultas, int dana) {
        this.idFakultas = idFakultas;
        this.dana = dana;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public int getDana() {
        return dana;
    }

    public void setDana(int dana) {
        this.dana = dana;
    }
       
}
