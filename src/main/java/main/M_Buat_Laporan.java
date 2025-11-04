package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashMap;
import javax.swing.*;
import koneksi.DatabaseConfig;
import javax.swing.JFileChooser;

public class M_Buat_Laporan extends javax.swing.JFrame {
    private Connection conn;
    private HashMap<String, String> mapWilayah = new HashMap<>();
    private HashMap<String, String> mapLayanan = new HashMap<>();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(M_Buat_Laporan.class.getName());

    /**
     * Creates new form Login
     */
    public M_Buat_Laporan() {
        initComponents();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        connectDatabase();
        loadWilayah();
        loadLayanan();
javax.swing.JButton jButtonPilihFoto = new javax.swing.JButton("Pilih Foto");
jButtonPilihFoto.setBackground(new java.awt.Color(149, 211, 241));
jButtonPilihFoto.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Pilih Foto");
        fileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(M_Buat_Laporan.this);
        if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileChooser.getSelectedFile();
            jTextField3.setText(file.getAbsolutePath());
        }
    }
});
Panel_Buat_Laporan_masyarakat.add(jButtonPilihFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 100, 40));

    }
    
 private void connectDatabase() {
        try {
            conn = DatabaseConfig.getConnection();
            if (conn != null) System.out.println("✅ Koneksi database berhasil.");
            else JOptionPane.showMessageDialog(this, "❌ Gagal konek ke database.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Koneksi gagal: " + e.getMessage());
        }
    }

    private void loadWilayah() {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT kode_wilayah, nama_wilayah FROM wilayah")) {
            jComboBox2.removeAllItems();
            while (rs.next()) {
                String nama = rs.getString("nama_wilayah");
                mapWilayah.put(nama, rs.getString("kode_wilayah"));
                jComboBox2.addItem(nama);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat wilayah: " + e.getMessage());
        }
    }

    private void loadLayanan() {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_layanan, jenis_layanan, total_harga FROM layanan")) {
            jComboBox1.removeAllItems();
            while (rs.next()) {
                String nama = rs.getString("jenis_layanan");
                String harga = rs.getString("total_harga");
                String display = nama + " — Rp " + harga;
                mapLayanan.put(display, rs.getString("id_layanan"));
                jComboBox1.addItem(display);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat layanan: " + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel_Buat_Laporan_masyarakat = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        keHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_Buat_Laporan_masyarakat.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Buat_Laporan_masyarakat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Buat_Laporan_masyarakat.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_Buat_Laporan_masyarakat.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_Buat_Laporan_masyarakat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Simpan");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 140, 40));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Buat_Laporan_masyarakat.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 440, 40));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        Panel_Buat_Laporan_masyarakat.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 440, 40));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 440, 40));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Buat_Laporan_masyarakat.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 440, 40));

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 440, 40));

        keHome.setBackground(new java.awt.Color(149, 211, 241));
        keHome.setText("Home");
        keHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keHomeActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(keHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TANGGAL LAPORAN :");
        Panel_Buat_Laporan_masyarakat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 400, 130, -1));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 130, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("WILAYAH :");
        Panel_Buat_Laporan_masyarakat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jButton5.setBackground(new java.awt.Color(149, 211, 241));
        jButton5.setText("Lihat Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("FOTO :");
        Panel_Buat_Laporan_masyarakat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("LAYANAN :");
        Panel_Buat_Laporan_masyarakat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 280, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NAMA LENGKAP :");
        Panel_Buat_Laporan_masyarakat.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setText("Buat Laporan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_Buat_Laporan_masyarakat.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\Buat laporan.png")); // NOI18N
        Panel_Buat_Laporan_masyarakat.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Buat_Laporan_masyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Buat_Laporan_masyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    M_Lihat_Laporan lihat_laporan = new M_Lihat_Laporan();   // buka halaman lihat laporan
    lihat_laporan.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void keHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keHomeActionPerformed
        M_Welcome m_Welcome = new M_Welcome();
        m_Welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keHomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Landing_Page landing_Page = new Landing_Page();
    landing_Page.setVisible(true);   
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    String namaLengkap = jTextField1.getText().trim();
        String wilayahNama = (String) jComboBox2.getSelectedItem();
        String layananNama = (String) jComboBox1.getSelectedItem();
        String foto = jTextField3.getText().trim();
        String tanggal = jTextField2.getText().trim();

        // ===== VALIDASI =====
        if (namaLengkap.isEmpty() || wilayahNama == null || layananNama == null || foto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field wajib diisi!");
            return;
        }
        if (tanggal.isEmpty()) {
            tanggal = LocalDate.now().toString();
        }

        String kodeWilayah = mapWilayah.get(wilayahNama);
        String idLayanan = mapLayanan.get(layananNama);

        if (kodeWilayah == null || idLayanan == null) {
            JOptionPane.showMessageDialog(this, "Data wilayah atau layanan tidak valid.");
            return;
        }

        // ambil id_user dari Session
        int idUser = 0;
        try {
            idUser = Session.getUserId();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Anda belum login. Silakan login kembali.");
            return;
        }

        if (idUser == 0) {
            JOptionPane.showMessageDialog(this, "ID pengguna tidak ditemukan. Silakan login ulang.");
            return;
        }

        String sql = """
            INSERT INTO laporan 
            (tanggal_laporan, status, foto, tanggapan_admin, admin_id_user, wilayah_kode_wilayah, masyarakat_id_user, layanan_id_layanan) 
            VALUES (?, 'Menunggu', ?, '', ?, ?, ?, ?)
            """;
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, tanggal);
            pst.setString(2, foto);
            pst.setInt(3, 1); // admin default (bisa diubah nanti)
            pst.setString(4, kodeWilayah);
            pst.setInt(5, idUser);
            pst.setString(6, idLayanan);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Laporan berhasil disimpan!");
            jTextField1.setText("");
            jTextField3.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan laporan: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
      JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih Foto");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileChooser.getSelectedFile();
            jTextField3.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Buat_Laporan_masyarakat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton keHome;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new M_Buat_Laporan().setVisible(true);
    });
}
}
