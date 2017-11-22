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
public class Mahasiswa extends User {
    private String NIM;
    private String alamat;
    private String TTL;

    public Mahasiswa(String NIM, String alamat, String TTL, String username, String password, String name, String kontak) {
        super(username, password, name, kontak);
        this.NIM = NIM;
        this.alamat = alamat;
        this.TTL = TTL;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }
    
    
}
