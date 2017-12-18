/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas;
import com.mycompany.mavensistemkeuanganuniversitas.controller.ControllerLogin;
import com.mycompany.mavensistemkeuanganuniversitas.model.Aplikasi;

/**
 *
 * @author MIAfandi
 */
public class TestingFile {
    public static void main(String[] args) {
        Aplikasi driver = new Aplikasi();
        new ControllerLogin(driver);
    }
    
    public static String cekStatusPembayaran(String nim){
        if("1301154424".equals(nim))
            return "Status Pembayaran Lunas";
        else
            return "Segera Lakukan Pembayaran";                
    }
    
    public static String validasiLogin(String account){
        if ("irwan".equals(account))
            return "Login Berhasil";
        else
            return "Login Gagal cek account anda";                
    }
}
