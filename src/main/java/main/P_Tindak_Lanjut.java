package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import koneksi.DatabaseConfig;

public class P_Tindak_Lanjut extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(P_Tindak_Lanjut.class.getName());

    /**
     * Creates new form Login
     */

    // --- di level class ---
private String selectedId = null;      // menyimpan id_laporan yang dipilih
private String selectedWilayah = null; // menyimpan wilayah laporan yang dipilih (untuk konfirmasi)

    public P_Tindak_Lanjut() {
        initComponents();
        loadTable();
        attachTableClick();
        attachPhotoChooser();
    }
    
     private void loadTable() {
        DefaultTableModel model = new DefaultTableModel(
            new Object[]{"ID", "No", "Nama", "Layanan", "Wilayah", "Status"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String sql = """
            SELECT l.id_laporan, u.nama AS nama,
                   ly.jenis_layanan AS layanan, w.nama_wilayah AS wilayah,
                   l.status
            FROM laporan l
            JOIN masyarakat m ON l.masyarakat_id_user = m.id_user
            JOIN user u ON m.id_user = u.id_user
            JOIN wilayah w ON l.wilayah_kode_wilayah = w.kode_wilayah
            LEFT JOIN layanan ly ON l.layanan_id_layanan = ly.id_layanan
            WHERE l.status != 'Dihapus'
            ORDER BY l.id_laporan DESC
        """;

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
            JOptionPane.showMessageDialog(this, "Gagal memuat laporan: " + ex.getMessage(),
                    "Kesalahan Database", JOptionPane.ERROR_MESSAGE);
        }

        jTable1.setModel(model);

        // sembunyikan kolom ID laporan
        try {
            jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
        } catch (Exception ignored) {}
    }
     

    private void attachTableClick() {
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int viewRow = jTable1.getSelectedRow();
                if (viewRow < 0) return;

                int modelRow = jTable1.convertRowIndexToModel(viewRow);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                selectedId = String.valueOf(model.getValueAt(modelRow, 0));
                selectedWilayah = String.valueOf(model.getValueAt(modelRow, 4));

                jTextField2.setText(LocalDate.now().toString());
                JOptionPane.showMessageDialog(P_Tindak_Lanjut.this,
                        "Laporan dari wilayah: " + selectedWilayah + " dipilih.",
                        "Laporan Dipilih", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
    // 🔹 Double klik kolom foto untuk memilih file
    private void attachPhotoChooser() {
        jTextField3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() >= 2) {
                    JFileChooser chooser = new JFileChooser();
                    chooser.setDialogTitle("Pilih Foto Hasil Tindakan");
                    if (chooser.showOpenDialog(P_Tindak_Lanjut.this) == JFileChooser.APPROVE_OPTION) {
                        File f = chooser.getSelectedFile();
                        jTextField3.setText(f.getAbsolutePath());
                    }
                }
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_edit_status_petugas = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        keHome = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_edit_status_petugas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_edit_status_petugas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_edit_status_petugas.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_edit_status_petugas.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_edit_status_petugas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 140, 40));

        keHome.setBackground(new java.awt.Color(149, 211, 241));
        keHome.setText("Home");
        keHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keHomeActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(keHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 50));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 130, 50));

        jButton5.setBackground(new java.awt.Color(149, 211, 241));
        jButton5.setText("Lihat Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 50));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Panel_edit_status_petugas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 117, 670, 110));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 500, 50));

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 500, 50));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        Panel_edit_status_petugas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 500, 140));

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setText("Tindak Lanjut");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 50));

        jButton7.setBackground(new java.awt.Color(149, 211, 241));
        jButton7.setText("Ubah Status");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\tindak.jpg")); // NOI18N
        Panel_edit_status_petugas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_edit_status_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_edit_status_petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    P_Lihat_Laporan p_Lihat_Laporan = new P_Lihat_Laporan();
        p_Lihat_Laporan.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void keHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keHomeActionPerformed
P_Welcome p_Welcome = new P_Welcome();
        p_Welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keHomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Landing_Page landing_page = new Landing_Page();   // buka halaman login
    landing_page.setVisible(true);
    this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        P_Edit_Status p_Edit_Status = new P_Edit_Status();
        p_Edit_Status.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
  if (selectedId == null) {
            JOptionPane.showMessageDialog(this, "Pilih laporan dulu dari tabel!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String tanggal = jTextField2.getText().trim();
        String fotoPath = jTextField3.getText().trim();
        String keterangan = jTextArea1.getText().trim();

        if (tanggal.isEmpty() || fotoPath.isEmpty() || keterangan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom wajib diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int konfirmasi = JOptionPane.showConfirmDialog(this,
                "Simpan tindak lanjut untuk wilayah " + selectedWilayah + "?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirmasi != JOptionPane.YES_OPTION) return;

        try (Connection conn = DatabaseConfig.getConnection()) {
            conn.setAutoCommit(false);

            int idPetugas = Session.getUserId(); // pastikan Session sudah terisi saat login

            // INSERT ke tabel tindaklanjut
            String insertSql = """
                INSERT INTO tindaklanjut (laporan_id_laporan, petugas_id_user, tanggal_tindaklanjut, foto_hasil, hasil_tindakan)
                VALUES (?, ?, ?, ?, ?)
            """;
            try (PreparedStatement pst = conn.prepareStatement(insertSql)) {
                pst.setString(1, selectedId);
                pst.setInt(2, idPetugas);
                pst.setString(3, tanggal);
                pst.setString(4, fotoPath);
                pst.setString(5, keterangan);
                pst.executeUpdate();
            }

            // UPDATE status laporan menjadi "Selesai"
            String updateSql = "UPDATE laporan SET status = 'Selesai' WHERE id_laporan = ?";
            try (PreparedStatement pst = conn.prepareStatement(updateSql)) {
                pst.setString(1, selectedId);
                pst.executeUpdate();
            }

            conn.commit();
            JOptionPane.showMessageDialog(this, "Tindak lanjut berhasil disimpan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            selectedId = null;
            selectedWilayah = null;
            jTextField2.setText("");
            jTextField3.setText("");
            jTextArea1.setText("");
            loadTable();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan tindak lanjut: " + ex.getMessage(),
                    "Kesalahan Database", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_edit_status_petugas;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton keHome;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new P_Tindak_Lanjut().setVisible(true);
    });
}

    private void attachSubmit() {
    }
}
