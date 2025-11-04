package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import koneksi.DatabaseConfig;

public class P_Edit_Status extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(P_Edit_Status.class.getName());

    /**
     * Creates new form Login
     */
    public P_Edit_Status() {
        initComponents();
        loadTable();
    }
    
private void loadTable() {
        // Model tabel (kolom pertama untuk id_laporan disembunyikan)
        DefaultTableModel model = new DefaultTableModel(new Object[]{
            "id_laporan", "No", "Nama", "Layanan", "Wilayah", "Status"
        }, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // hanya kolom status yang bisa diubah
                return column == 5;
            }
        };

        String sql = """
            SELECT l.id_laporan AS id_laporan, u.nama AS nama,
                   ly.jenis_layanan AS layanan, w.nama_wilayah AS wilayah, 
                   l.status AS status
            FROM laporan l
            JOIN masyarakat m ON l.masyarakat_id_user = m.id_user
            JOIN user u ON m.id_user = u.id_user
            JOIN wilayah w ON l.wilayah_kode_wilayah = w.kode_wilayah
            LEFT JOIN layanan ly ON l.layanan_id_layanan = ly.id_layanan
            ORDER BY l.id_laporan ASC
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
            JOptionPane.showMessageDialog(this, "Gagal memuat data laporan: " + ex.getMessage());
        }

        jTable1.setModel(model);

        // Sembunyikan kolom ID
        try {
            jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
        } catch (Exception ignored) {}

        // Tambahkan combobox editor untuk kolom status
        javax.swing.JComboBox<String> comboStatus = new javax.swing.JComboBox<>(
            new String[]{"Menunggu", "Diproses", "Selesai"}
        );
        try {
            jTable1.getColumnModel().getColumn(4).setCellEditor(new javax.swing.DefaultCellEditor(comboStatus));
        } catch (Exception ignored) {}

        // Sorter tabel (bisa klik header)
        RowSorter<? extends TableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);

        // Deteksi perubahan status
        model.addTableModelListener(e -> {
            if (e.getType() == javax.swing.event.TableModelEvent.UPDATE && e.getColumn() == 5) {
                int row = e.getFirstRow();
                if (row < 0) return;

                String idLaporan = String.valueOf(model.getValueAt(row, 0));
                String wilayah = String.valueOf(model.getValueAt(row, 4));
                String statusBaru = String.valueOf(model.getValueAt(row, 5));

                int konfirmasi = JOptionPane.showConfirmDialog(
                        this,
                        "Ubah status laporan wilayah \"" + wilayah + "\" menjadi \"" + statusBaru + "\"?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION
                );

                if (konfirmasi == JOptionPane.YES_OPTION) {
                    updateStatus(idLaporan, statusBaru);
                    loadTable();
                } else {
                    loadTable(); // batalkan perubahan
                }
            }
        });
    }

    private void updateStatus(String idLaporan, String statusBaru) {
        String sql = "UPDATE laporan SET status = ? WHERE id_laporan = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, statusBaru);
            pst.setString(2, idLaporan);
            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Status laporan berhasil diperbarui.");
            } else {
                JOptionPane.showMessageDialog(this, "Tidak ada data yang diubah.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memperbarui status: " + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_edit_status_petugas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        keHome = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Layanan", "Wilayah", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Panel_edit_status_petugas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 750, 320));

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

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setText("Ubah Status");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 50));

        jButton7.setBackground(new java.awt.Color(149, 211, 241));
        jButton7.setText("Tindak Lanjut");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_edit_status_petugas.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\UPDATE Status Petugas.png")); // NOI18N
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
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void keHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keHomeActionPerformed
        P_Welcome p_Welcome = new P_Welcome();
        p_Welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keHomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Landing_Page landing_page = new Landing_Page();   // buka halaman login
    landing_page.setVisible(true);
    this.dispose();             // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    P_Tindak_Lanjut p_Tindak_Lanjut = new P_Tindak_Lanjut();
        p_Tindak_Lanjut.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_edit_status_petugas;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keHome;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new P_Edit_Status().setVisible(true);
    });
}
}
