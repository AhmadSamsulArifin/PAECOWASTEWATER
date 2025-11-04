package koneksi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PetugasDAO {

    // Insert petugas baru (dipakai di A_Register_Petugas)
    public boolean insertPetugas(String nama, String username, String password, String noTelp, String wilayah) {
        try (Connection conn = DatabaseConfig.getConnection()) {
            // Insert ke tabel user
            String sqlUser = "INSERT INTO user (username, password, no_telepon, nama) VALUES (?, ?, ?, ?)";
            PreparedStatement psUser = conn.prepareStatement(sqlUser, Statement.RETURN_GENERATED_KEYS);
            psUser.setString(1, username);
            psUser.setString(2, password);
            psUser.setString(3, noTelp);
            psUser.setString(4, nama);
            psUser.executeUpdate();

            ResultSet rs = psUser.getGeneratedKeys();
            int idUser = 0;
            if (rs.next()) idUser = rs.getInt(1);

            // Insert ke tabel petugas
            String sqlPetugas = "INSERT INTO petugas (id_user, wilayah_penugasan) VALUES (?, ?)";
            PreparedStatement psPetugas = conn.prepareStatement(sqlPetugas);
            psPetugas.setInt(1, idUser);
            psPetugas.setString(2, wilayah);
            psPetugas.executeUpdate();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menambah petugas: " + e.getMessage());
            return false;
        }
    }

    // Ambil semua nama petugas (untuk combo di update)
    public List<String> getAllPetugas() {
        List<String> list = new ArrayList<>();
        try (Connection conn = DatabaseConfig.getConnection()) {
            String sql = "SELECT u.nama FROM user u JOIN petugas p ON u.id_user = p.id_user ORDER BY u.nama ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) list.add(rs.getString("nama"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat petugas: " + e.getMessage());
        }
        return list;
    }

    // Ambil data lengkap petugas by nama
    public ResultSet getPetugasByNama(String nama) throws SQLException {
        Connection conn = DatabaseConfig.getConnection();
        String sql = "SELECT u.username, u.password, u.no_telepon, p.wilayah_penugasan " +
                     "FROM user u JOIN petugas p ON u.id_user = p.id_user WHERE u.nama = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        return ps.executeQuery();
    }

    // Update data petugas (dipakai di A_update_data_petugas)
    public boolean updatePetugas(String nama, String username, String password, String noTelp, String wilayah) {
        try (Connection conn = DatabaseConfig.getConnection()) {
            String sql = "UPDATE user u JOIN petugas p ON u.id_user = p.id_user " +
                         "SET u.username=?, u.password=?, u.no_telepon=?, p.wilayah_penugasan=? WHERE u.nama=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, noTelp);
            ps.setString(4, wilayah);
            ps.setString(5, nama);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal update petugas: " + e.getMessage());
            return false;
        }
    }
    // Ambil semua data petugas untuk ditampilkan di tabel
public javax.swing.table.DefaultTableModel getPetugasTableModel() {
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
    model.addColumn("ID User");
    model.addColumn("Nama");
    model.addColumn("Username");
    model.addColumn("No Telepon");
    model.addColumn("Wilayah Penugasan");

    String sql = """
        SELECT u.id_user, u.nama, u.username, u.no_telepon, p.wilayah_penugasan
        FROM user u
        JOIN petugas p ON u.id_user = p.id_user
        ORDER BY u.id_user ASC
    """;

    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Object[] row = {
                rs.getInt("id_user"),
                rs.getString("nama"),
                rs.getString("username"),
                rs.getString("no_telepon"),
                rs.getString("wilayah_penugasan")
            };
            model.addRow(row);
        }

    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Gagal memuat data petugas: " + e.getMessage());
    }

    return model;
}

}