package koneksi;

import java.sql.*;

public class LoginDAO {

    // ✅ Cek login dari tabel supertype (user)
    public boolean validateLogin(String username, String password, String role) {
    String sql = "";

    // Pilih query berdasarkan role
    switch (role.toLowerCase()) {
        case "admin":
            sql = "SELECT u.* FROM user u JOIN admin a ON u.id_user = a.id_user WHERE u.username=? AND u.password=?";
            break;
        case "petugas":
            sql = "SELECT u.* FROM user u JOIN petugas p ON u.id_user = p.id_user WHERE u.username=? AND u.password=?";
            break;
        case "masyarakat":
            sql = "SELECT u.* FROM user u JOIN masyarakat m ON u.id_user = m.id_user WHERE u.username=? AND u.password=?";
            break;
        default:
            return false;
    }

    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}



    // ✅ Ambil id_user berdasarkan username & role
    public int getUserId(String username, String role) {
    String sql = "";

    switch (role.toLowerCase()) {
        case "admin":
            sql = "SELECT u.id_user FROM user u JOIN admin a ON u.id_user = a.id_user WHERE u.username=?";
            break;
        case "petugas":
            sql = "SELECT u.id_user FROM user u JOIN petugas p ON u.id_user = p.id_user WHERE u.username=?";
            break;
        case "masyarakat":
            sql = "SELECT u.id_user FROM user u JOIN masyarakat m ON u.id_user = m.id_user WHERE u.username=?";
            break;
        default:
            return 0;
    }

    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("id_user");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}


    // ✅ (Opsional) Mengecek apakah id_user tersebut memang punya data di tabel subtype
    public boolean isExist(String tableName, int id_user) throws SQLException {
        Connection conn = DatabaseConfig.getConnection();
        String sql = "SELECT * FROM " + tableName + " WHERE id_user=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id_user);
        ResultSet rs = ps.executeQuery();
        boolean exist = rs.next();
        rs.close();
        ps.close();
        conn.close();
        return exist;
    }

}
