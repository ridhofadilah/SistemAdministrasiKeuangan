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
public class Fakultas {
    private String idFakultas;
    private String namaFakultas;
    private String password;

    public Fakultas(String idFakultas, String namaFakultas, String password) {
        this.idFakultas = "fak"+idFakultas;
        this.namaFakultas = namaFakultas;
        this.password = password;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
