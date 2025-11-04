package koneksi;

public class ModelWilayah {
    private int kodeWilayah;
    private String namaWilayah;

    public ModelWilayah(int kodeWilayah, String namaWilayah) {
        this.kodeWilayah = kodeWilayah;
        this.namaWilayah = namaWilayah;
    }
    public int getKodeWilayah() { return kodeWilayah; }
    public String getNamaWilayah() { return namaWilayah; }
}