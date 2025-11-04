package koneksi;

public class ModelPetugas {
    private int idPetugas;
    private int idUser;
    private String wilayahPenugasan;

    public int getIdPetugas() { return idPetugas; }
    public void setIdPetugas(int idPetugas) { this.idPetugas = idPetugas; }

    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }

    public String getWilayahPenugasan() { return wilayahPenugasan; }
    public void setWilayahPenugasan(String wilayahPenugasan) { this.wilayahPenugasan = wilayahPenugasan; }
}