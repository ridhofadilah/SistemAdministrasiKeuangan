/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadministrasikeuangan1;

/**
 *
 * @author User
 */
public class WakilRektor extends User{
    private String NIP;

    public WakilRektor(String NIP, String username, String password, String name, String kontak) {
        super(username, password, name, kontak);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    
}
