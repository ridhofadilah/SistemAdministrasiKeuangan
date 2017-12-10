package Model;

public class Fakultas {
    private String idFakultas;
    private String namaFakultas;
    private String password;
    private int danaFakultas;
    
    public Fakultas(String idFakultas, String namaFakultas, String password, int danaFakultas) {
        this.idFakultas = idFakultas;
        this.namaFakultas = namaFakultas;
        this.password = password;
        this.danaFakultas = danaFakultas;
    }

    public int getDanaFakultas() {
        return danaFakultas;
    }

    public void setDanaFakultas(int danaFakultas) {
        this.danaFakultas = danaFakultas;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
}
