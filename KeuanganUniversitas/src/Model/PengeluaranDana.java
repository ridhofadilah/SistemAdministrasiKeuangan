package Model;

public class PengeluaranDana {
    private String idPengeluaran;
    private String idFakultas;
    private String tahunAjar;
    private String Keterangan;
    private int total;

    public PengeluaranDana(String idPengeluaran, String idFakultas, String tahunAjar, String Keterangan, int total) {
        this.idPengeluaran = idPengeluaran;
        this.idFakultas = idFakultas;
        this.tahunAjar = tahunAjar;
        this.Keterangan = Keterangan;
        this.total = total;
    }

    public String getIdPengeluaran() {
        return idPengeluaran;
    }

    public void setIdPengeluaran(String idPengeluaran) {
        this.idPengeluaran = idPengeluaran;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getTahunAjar() {
        return tahunAjar;
    }

    public void setTahunAjar(String tahunAjar) {
        this.tahunAjar = tahunAjar;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }   
}
