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
public class User {
    private String username;
    private String password;
    private String name;
    private String kontak;

    public User(String username, String password, String name, String kontak) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.kontak = kontak;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
    
}
