/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.MenuMahasiswa;

/**
 *
 * @author User
 */
public class Aplikasi {

    private Database data;
    private Mahasiswa mahasiswa;
    private Fakultas fakultas;
    private PembagianDana pembagian;
    private Pembayaran pembayaran;
    private PengajuanDana pengajuan;
    private PengeluaranDana pengeluaran;
    
    public Aplikasi(){
        this.data = new Database();
        data.connect();
    }
    
    public Mahasiswa findMahasiswa(String uname, String pw) {
        mahasiswa = data.cekMahasiswa(uname, pw);
        if (mahasiswa != null){
            return mahasiswa;
        } else {
            return null;
        }
    }

    public Fakultas findFakultas(String uname, String pw) {
        fakultas = data.cekFakultas(uname, pw);
        if (fakultas != null){
            return fakultas;
        }else {
            return null;
        }
    }

    public void showTabelTagihan(MenuMahasiswa view, String idMahasiswa) {
       data.LoadDataTagihan(view, idMahasiswa);
    }

    public Pembayaran findIDPembayaran(String id, String idMahasiswa) {
        pembayaran = data.cekIDPembayaran(id, idMahasiswa);
        if (pembayaran != null){
            return pembayaran;
        } else {
            return null;
        }
    }

    public void updatePembayaranM(String id, String idMahasiswa) {
        data.updatePembayaranMahasiswa(id,idMahasiswa);
    }

   
}
