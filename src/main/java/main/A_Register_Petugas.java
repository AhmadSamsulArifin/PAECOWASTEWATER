package main;
import javax.swing.*;
import koneksi.PetugasDAO;
import koneksi.WilayahDAO;
import java.util.List;


public class A_Register_Petugas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(A_Register_Petugas.class.getName());

    /**
     * Creates new form Login
     */
    public A_Register_Petugas() {
        initComponents();
        loadWilayah();
    }
    
// Mengambil daftar wilayah dari tabel wilayah
private void loadWilayah() {
    WilayahDAO dao = new WilayahDAO();
    jComboBox1.removeAllItems();
    jComboBox1.addItem("-- Pilih Wilayah --");
    for (String nama : dao.getAllWilayah()) {
        jComboBox1.addItem(nama);
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Panel_register_petugas_Admin = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tanggal2 = new javax.swing.JTextField();
        tanggal3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        tanggal4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_register_petugas_Admin.setBackground(new java.awt.Color(255, 255, 255));
        Panel_register_petugas_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_register_petugas_Admin.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_register_petugas_Admin.setPreferredSize(new java.awt.Dimension(1200, 675));
        Panel_register_petugas_Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setBackground(new java.awt.Color(204, 204, 204));
        save.setText("S I M P A N");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 240, 40));

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setText("B A T A L");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("WILAYAH PENUGASAN :");
        Panel_register_petugas_Admin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("NAMA LENGKAP :");
        Panel_register_petugas_Admin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PASSWORD :");
        Panel_register_petugas_Admin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("USERNAME :");
        Panel_register_petugas_Admin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 20));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 430, 30));

        tanggal2.setBackground(new java.awt.Color(204, 204, 204));
        Panel_register_petugas_Admin.add(tanggal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 430, 30));

        tanggal3.setBackground(new java.awt.Color(204, 204, 204));
        Panel_register_petugas_Admin.add(tanggal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 430, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NO TELPON :");
        Panel_register_petugas_Admin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 30));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        Panel_register_petugas_Admin.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 430, 30));

        tanggal4.setBackground(new java.awt.Color(204, 204, 204));
        Panel_register_petugas_Admin.add(tanggal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 430, 30));

        jButton2.setBackground(new java.awt.Color(149, 211, 241));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 50));

        jButton5.setBackground(new java.awt.Color(149, 211, 241));
        jButton5.setText("Lihat Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 50));

        jButton1.setBackground(new java.awt.Color(149, 211, 241));
        jButton1.setText("Hapus Laporan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 50));

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setText("Register Petugas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 50));

        jButton6.setBackground(new java.awt.Color(149, 211, 241));
        jButton6.setText("Ubah Status");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, 50));

        jButton7.setBackground(new java.awt.Color(149, 211, 241));
        jButton7.setText("Lihat Data Petugas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 50));

        jButton8.setBackground(new java.awt.Color(149, 211, 241));
        jButton8.setText("Edit Data Petugas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, 50));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_register_petugas_Admin.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\Register.png")); // NOI18N
        Panel_register_petugas_Admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1200, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_register_petugas_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_register_petugas_Admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    String nama = tanggal4.getText();
    String username = tanggal2.getText();
    String password = new String(jPasswordField1.getPassword());
    String noTelp = tanggal3.getText();
    String wilayah = jComboBox1.getSelectedItem().toString();

    if (nama.isEmpty() || username.isEmpty() || password.isEmpty() || noTelp.isEmpty() || jComboBox1.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!");
        return;
    }

    PetugasDAO dao = new PetugasDAO();
    if (dao.insertPetugas(nama, username, password, noTelp, wilayah)) {
        JOptionPane.showMessageDialog(this, "Registrasi berhasil!");
        tanggal4.setText("");
        tanggal2.setText("");
        jPasswordField1.setText("");
        tanggal3.setText("");
        jComboBox1.setSelectedIndex(0);
    } else {
        JOptionPane.showMessageDialog(this, "Registrasi gagal!");
    }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        tanggal4.setText("");
        tanggal2.setText("");
        jPasswordField1.setText("");
        tanggal3.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        A_Welcome a_Welcome = new A_Welcome();
        a_Welcome.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    A_Lihat_Laporan a_Lihat_Laporan = new A_Lihat_Laporan();
    a_Lihat_Laporan.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        A_Hapus_Laporan hapus_laporan = new A_Hapus_Laporan();   // buka halaman login
        hapus_laporan.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        A_Register_Petugas a_register = new A_Register_Petugas();
        a_register.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        A_Edit_Status a_Edit_Status = new A_Edit_Status();
        a_Edit_Status.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        A_Lihat_Data_Petugas a_Lihat_Data_Petugas = new A_Lihat_Data_Petugas();
        a_Lihat_Data_Petugas.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    A_update_data_petugas a_update_data_petugas = new A_update_data_petugas();
    a_update_data_petugas.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Landing_Page landing_Page = new Landing_Page();
        landing_Page.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_register_petugas_Admin;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton save;
    private javax.swing.JTextField tanggal2;
    private javax.swing.JTextField tanggal3;
    private javax.swing.JTextField tanggal4;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new A_Register_Petugas().setVisible(true);
    });
}
}