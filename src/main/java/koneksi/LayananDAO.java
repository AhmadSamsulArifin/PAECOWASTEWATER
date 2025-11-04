package koneksi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LayananDAO {
    public List<String> getAllJenisLayanan() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT jenis_layanan FROM layanan ORDER BY jenis_layanan ASC";
        try (Connection conn = DatabaseConfig.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(rs.getString("jenis_layanan"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}