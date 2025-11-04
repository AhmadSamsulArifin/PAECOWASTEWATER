package koneksi;

import java.sql.*;

public class UserDAO {

    // insert user, return generated id_user (0 jika gagal)
    public int insertUser(ModelUser user) {
        String sql = "INSERT INTO user (username, password, no_telepon, nama) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNoTelepon());
            ps.setString(4, user.getNama());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    // get user by username (for login or detail)
    public ModelUser getUserByUsername(String username) {
        String sql = "SELECT * FROM user WHERE username = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    ModelUser u = new ModelUser();
                    u.setIdUser(rs.getInt("id_user"));
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setNama(rs.getString("nama"));
                    u.setNoTelepon(rs.getString("no_telepon"));
                    return u;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}