package koneksi;

import java.sql.*;

public class AuthDAO {

    /**
     * Login umum: cocok untuk admin, petugas, dan masyarakat.
     * @param username username dari form login
     * @param password password dari form login
     * @return peran (role) user jika berhasil, null jika gagal
     */
    public String login(String username, String password) {
        String role = null;
        String sql = "SELECT u.id_user, u.username, u.password, "
                   + "CASE "
                   + " WHEN a.id_user IS NOT NULL THEN 'Admin' "
                   + " WHEN p.id_user IS NOT NULL THEN 'Petugas' "
                   + " WHEN m.id_user IS NOT NULL THEN 'Masyarakat' "
                   + " ELSE 'Tidak Dikenal' END AS role "
                   + "FROM user u "
                   + "LEFT JOIN admin a ON u.id_user = a.id_user "
                   + "LEFT JOIN petugas p ON u.id_user = p.id_user "
                   + "LEFT JOIN masyarakat m ON u.id_user = m.id_user "
                   + "WHERE u.username = ? AND u.password = ?";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    role = rs.getString("role");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return role; // null = gagal login
    }

    /**
     * Ambil ID user berdasarkan username
     */
    public int getUserId(String username) {
        String sql = "SELECT id_user FROM user WHERE username = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt("id_user");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}