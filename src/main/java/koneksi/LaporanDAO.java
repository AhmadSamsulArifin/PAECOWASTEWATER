package koneksi;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class LaporanDAO {

    // Ambil semua laporan kecuali yang berstatus 'Dihapus'
    public DefaultTableModel getLaporanTableModel() {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"id_laporan","No","Nama","Layanan","Wilayah","Status"}, 0
        );

        String sql = "SELECT l.id_laporan AS id_laporan, u.nama AS nama, "
                   + "ly.jenis_layanan AS layanan, w.nama_wilayah AS wilayah, l.status AS status "
                   + "FROM laporan l "
                   + "JOIN masyarakat m ON l.masyarakat_id_user = m.id_user "
                   + "JOIN user u ON m.id_user = u.id_user "
                   + "JOIN wilayah w ON l.wilayah_kode_wilayah = w.kode_wilayah "
                   + "LEFT JOIN layanan ly ON l.layanan_id_layanan = ly.id_layanan "
                   + "WHERE l.status <> 'Dihapus' "
                   + "ORDER BY l.id_laporan ASC";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            int no = 1;
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_laporan"),
                    no++,
                    rs.getString("nama"),
                    rs.getString("layanan"),
                    rs.getString("wilayah"),
                    rs.getString("status")
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return model;
    }

    // update status (Diterima / Ditolak / Menunggu / dll)
    public boolean updateStatus(String idLaporan, String statusBaru) {
        String sql = "UPDATE laporan SET status = ? WHERE id_laporan = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, statusBaru);
            pst.setString(2, idLaporan);
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // soft delete -> set status = 'Dihapus'
    public boolean hapusLaporan(String idLaporan) {
        String sql = "UPDATE laporan SET status = 'Dihapus' WHERE id_laporan = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, idLaporan);
            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}