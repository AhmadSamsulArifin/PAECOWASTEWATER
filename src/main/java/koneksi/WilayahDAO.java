package koneksi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class WilayahDAO {

    // kembalikan semua nama wilayah (untuk mengisi combobox)
    public List<String> getAllWilayah() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT nama_wilayah FROM wilayah ORDER BY nama_wilayah ASC";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(rs.getString("nama_wilayah"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat wilayah: " + e.getMessage());
        }
        return list;
    }

    // kembalikan model wilayah berdasarkan nama (mengandung kode dan nama)
    public ModelWilayah getWilayahByNamaModel(String namaWilayah) {
        String sql = "SELECT kode_wilayah, nama_wilayah FROM wilayah WHERE nama_wilayah = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, namaWilayah);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int kode = rs.getInt("kode_wilayah");
                    String nama = rs.getString("nama_wilayah");
                    return new ModelWilayah(kode, nama);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat wilayah: " + e.getMessage());
        }
        return null;
    }

    // Jika kamu memang mau method bernama getNamaWilayah, definisikan begini:
    public String getNamaWilayah(String kodeWilayah) {
        String sql = "SELECT nama_wilayah FROM wilayah WHERE kode_wilayah = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, kodeWilayah);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getString("nama_wilayah");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal: " + e.getMessage());
        }
        return null;
    }
}