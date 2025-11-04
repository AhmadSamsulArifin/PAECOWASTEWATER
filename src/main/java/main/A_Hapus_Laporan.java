package main;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import koneksi.LaporanDAO;

public class A_Hapus_Laporan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(A_Hapus_Laporan.class.getName());

    /**
     * Creates new form Login
     */
    public A_Hapus_Laporan() {
        initComponents();
        loadTable();
    }
 
private void loadTable() {
        LaporanDAO dao = new LaporanDAO();
        DefaultTableModel model = dao.getLaporanTableModel(); // ambil data laporan dari DAO
        jTable1.setModel(model);
    }

    private void hapusLaporan() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih laporan yang ingin dihapus terlebih dahulu!");
            return;
        }

        // ambil id_laporan dari kolom pertama
        String idLaporan = jTable1.getValueAt(row, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Yakin ingin menghapus laporan dengan ID " + idLaporan + "?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            LaporanDAO dao = new LaporanDAO();
            boolean success = dao.hapusLaporan(idLaporan);
            if (success) {
                JOptionPane.showMessageDialog(this, "Laporan berhasil dihapus (status = 'Dihapus').");
                loadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menghapus laporan!");
            }
        }
    }
    // =======
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_hapus_laporan_admin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_hapus_laporan_admin.setBackground(new java.awt.Color(255, 255, 255));
        Panel_hapus_laporan_admin.setToolTipText("");
        Panel_hapus_laporan_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_hapus_laporan_admin.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_hapus_laporan_admin.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_hapus_laporan_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Panel_hapus_laporan_admin.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 810, 370));

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Hapus");
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, 140, 40));

        jButton2.setBackground(new java.awt.Color(149, 211, 241));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 50));

        jButton9.setBackground(new java.awt.Color(149, 211, 241));
        jButton9.setText("Lihat Laporan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 50));

        jButton10.setBackground(new java.awt.Color(51, 153, 255));
        jButton10.setText("Hapus Laporan");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 50));

        jButton11.setBackground(new java.awt.Color(149, 211, 241));
        jButton11.setText("Register Petugas");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 50));

        jButton12.setBackground(new java.awt.Color(149, 211, 241));
        jButton12.setText("Ubah Status");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 130, 50));

        jButton13.setBackground(new java.awt.Color(149, 211, 241));
        jButton13.setText("Lihat Data Petugas");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 130, 50));

        jButton14.setBackground(new java.awt.Color(149, 211, 241));
        jButton14.setText("Edit Data Petugas");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 130, 50));

        jButton15.setBackground(new java.awt.Color(51, 153, 255));
        jButton15.setText("Keluar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Panel_hapus_laporan_admin.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\Hapus_Laporan_Admin.png")); // NOI18N
        Panel_hapus_laporan_admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_hapus_laporan_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_hapus_laporan_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    int row = jTable1.getSelectedRow();
    if (row == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Pilih laporan yang ingin dihapus terlebih dahulu!");
        return;
    }

    // ambil ID laporan dari kolom pertama tabel
    String idLaporan = jTable1.getValueAt(row, 0).toString();

    int confirm = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "Yakin ingin menghapus laporan dengan ID " + idLaporan + "?",
        "Konfirmasi Hapus",
        javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        // gunakan DAO, bukan query langsung
        koneksi.LaporanDAO dao = new koneksi.LaporanDAO();
        boolean success = dao.hapusLaporan(idLaporan);

        if (success) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Status laporan berhasil diubah menjadi 'Dihapus'!");
            loadTable(); // refresh tabel agar status terbaru muncul
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Gagal memperbarui status laporan. Coba lagi.");
        }
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        A_Welcome a_Welcome = new A_Welcome();
        a_Welcome.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        A_Lihat_Laporan a_Lihat_Laporan = new A_Lihat_Laporan();
        a_Lihat_Laporan.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        A_Hapus_Laporan hapus_laporan = new A_Hapus_Laporan();   // buka halaman login
        hapus_laporan.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        A_Register_Petugas a_register = new A_Register_Petugas();
        a_register.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        A_Edit_Status a_Edit_Status = new A_Edit_Status();
        a_Edit_Status.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        A_Lihat_Data_Petugas a_Lihat_Data_Petugas = new A_Lihat_Data_Petugas();
        a_Lihat_Data_Petugas.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        A_update_data_petugas a_update_data_petugas = new A_update_data_petugas();
        a_update_data_petugas.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Landing_Page landing_Page = new Landing_Page();
        landing_Page.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_hapus_laporan_admin;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new A_Hapus_Laporan().setVisible(true);
    });
}
}
