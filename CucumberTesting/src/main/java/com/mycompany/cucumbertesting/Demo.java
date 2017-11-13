/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cucumbertesting;

/**
 *
 * @author MIAfandi
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test");
    }
    public static String addUser(String user){
        if (user.equals("badu"))
            return "user sukses dimasukan";
        else
            return "duplicate";
                
    }
    
    public static String validasiLogin(String account){
        if (account.equals("irwan"))
            return "Login Berhasil";
        else
            return "Login Gagal cek account anda";                
    }
    
    public static String cekStatusPembayaran(String nim){
        if (nim.equals("1301154424"))
            return "Status Pembayaran Lunas";
        else
            return "Segera Lakukan Pembayaran";                
    }
    
    public static String inputKonfirmasiPembayaran(String kodeKonfirmasi){
        if (kodeKonfirmasi.equals("PB001"))
            return "Pembayaran berhasil dikonfimasi";
        else
            return "Gagal data tidak lengkap";                
    }
    
    public static String viewPembagianDana(String btnViewPembagianDana){
        if (btnViewPembagianDana.equals("view pembagian dana"))
            return "Tampil Data Pembagian Dana"; 
        return "Tampil Data Pembagian Dana";
    }
}
