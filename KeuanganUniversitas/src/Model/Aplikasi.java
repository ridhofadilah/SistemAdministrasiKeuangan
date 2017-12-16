package Model;

import View.MenuMahasiswa;
import View.MenuWakilRektor;
import View.MenuFakultas;
import View.MenuAdmin;
import javax.swing.JTextField;

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

    public void konfirmasiPengajuan(String text, String setuju) {
        data.konfirmasiPengajuanDana(text,setuju);
    }

    public void konfirmasiPembayaran(String text, String setuju) {
        data.konfirmasiPembayaranMahasiswa(text, setuju);
    }
    
    public PengajuanDana cariIDPengajuan(String text) {
        pengajuan = data.findIDPengajuan(text);
        if (pengajuan != null){
            return pengajuan;
        } else {
            return null;
        }
    }
    
    public Pembayaran cariIDPembayaran(String text) {
        pembayaran = data.findIDPembayaran(text);
        if (pembayaran != null){
            return pembayaran;
        } else {
            return null;
        }
    }

    public void showTabelPengajuan(MenuWakilRektor view) {
        data.loadDataPengajuanWR(view);
        data.loadDataPengajuanDiterima(view);
        data.loadDataPengajuanDitolak(view);
    }

    public void showTabelDana(MenuWakilRektor view) {
        data.loadDataDanaMasuk(view);
        data.loadDataDanaKeluar(view);
    }

    public void showTabelPembayaran(MenuAdmin view) {
        data.loadDataPembayaran(view);
    }
    
    public void showTabelPembagianWR(MenuWakilRektor view) {
        data.loadPembagianWR(view);
    }
    
    public Fakultas cariFakultas(String text) {
        fakultas = data.searchFakultas(text);
        if (fakultas !=null){
            return fakultas;
        } else {
            return null;
        }
    }
    
    public Pembayaran cariPembayaran(String text) {
        pembayaran = data.searchPembayaran(text);
        if (pembayaran !=null){
            return pembayaran;
        } else {
            return null;
        }
    }
    
    public Mahasiswa cariMahasiswa(String text) {
        mahasiswa = data.searchMahasiswa(text);
        if (mahasiswa !=null){
            return mahasiswa;
        } else {
            return null;
        }
    }

    public void tambahPembagianDana(PembagianDana pd) {
        data.addPembagianDana(pd);
    }

    public void updateDanaFakultas(PembagianDana pd, Fakultas f) {
        data.UpdateDanaF(pd, f);
    }
    
    public void tambahPembayaran(Pembayaran pb) {
        data.addPembayaran(pb);
    }

    public int showDana() {
        return data.showDanaUniversitas();
    }
    
    //fakultas

    public void tambahPengeluaranFakultas(PengeluaranDana f){
        data.addPengeluaranFakultas(f);
    }
    
    public int showDanaSisa(String id){
        return (data.sumPembagianDanaFakultas(id)-data.sumPengeluranFakultas(id));
    }
    
    public void showTabelPembagianDanaFakultas(MenuFakultas view,String id){
        data.loadPembagianDanaFakultas(view, id);
    }
}
