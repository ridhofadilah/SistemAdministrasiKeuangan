/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadmininstrasikeuangan;

/**
 *
 * @author User
 */
public class AdminFakultas extends User{
    private String idFakultas;

    public AdminFakultas(String username, String password, String name, String kontak) {
        super(username, password, name, kontak);
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }
    
    
}
