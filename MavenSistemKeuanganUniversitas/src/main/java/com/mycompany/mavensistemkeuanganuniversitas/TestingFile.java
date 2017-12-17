/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensistemkeuanganuniversitas;

/**
 *
 * @author MIAfandi
 */
public class TestingFile {
    public static void main(String[] args) {
        System.out.println("This for testing Project");
    }
    
    public static String cekStatusPembayaran(String nim){
        if (nim.equals("1301154424"))
            return "Status Pembayaran Lunas";
        else
            return "Segera Lakukan Pembayaran";                
    }
    
    public static String validasiLogin(String account){
        if (account.equals("irwan"))
            return "Login Berhasil";
        else
            return "Login Gagal cek account anda";                
    }
}
