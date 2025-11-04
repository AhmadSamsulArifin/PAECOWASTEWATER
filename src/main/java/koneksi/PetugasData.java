package koneksi;

public class PetugasData {
    private String username;
    private String password;
    private String noTelp;
    private String wilayah;

    public PetugasData(String username, String password, String noTelp, String wilayah) {
        this.username = username;
        this.password = password;
        this.noTelp = noTelp;
        this.wilayah = wilayah;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getNoTelp() { return noTelp; }
    public String getWilayah() { return wilayah; }
}