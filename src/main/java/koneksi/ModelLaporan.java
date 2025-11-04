package koneksi;

public class ModelLaporan {
    private int idLaporan;
    private String nama;
    private String layanan;
    private String wilayah;
    private String status;

    public int getIdLaporan() { return idLaporan; }
    public void setIdLaporan(int idLaporan) { this.idLaporan = idLaporan; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getLayanan() { return layanan; }
    public void setLayanan(String layanan) { this.layanan = layanan; }

    public String getWilayah() { return wilayah; }
    public void setWilayah(String wilayah) { this.wilayah = wilayah; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}