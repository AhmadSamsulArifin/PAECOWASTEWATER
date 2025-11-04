package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import koneksi.PetugasDAO;
import koneksi.WilayahDAO;
import java.sql.ResultSet;
import koneksi.ModelWilayah;


public class A_update_data_petugas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(A_update_data_petugas.class.getName());
    private boolean loading = false;
    /**
     * Creates new form Login
     */
// di bagian field kelas

public A_update_data_petugas() {
    initComponents();
    loading = true;
    loadWilayah();
    loadPetugas();
    loading = false;
}

private void loadPetugas() {
        PetugasDAO dao = new PetugasDAO();
        jComboBoxNama.removeAllItems();
        jComboBoxNama.addItem("-- Pilih Petugas --");
        for (String nama : dao.getAllPetugas()) {
            jComboBoxNama.addItem(nama);
        }
    }

    private void loadWilayah() {
        WilayahDAO dao = new WilayahDAO();
        jComboBox2.removeAllItems();
        jComboBox2.addItem("-- Pilih Wilayah --");
        for (String nama : dao.getAllWilayah()) {
            jComboBox2.addItem(nama);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Update_Data_Petugas = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxNama = new javax.swing.JComboBox<>();
        tanggal2 = new javax.swing.JTextField();
        tanggal3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_Update_Data_Petugas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Update_Data_Petugas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Update_Data_Petugas.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_Update_Data_Petugas.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_Update_Data_Petugas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setBackground(new java.awt.Color(51, 153, 255));
        save.setText("S I M P A N");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 240, 40));

        cancel.setBackground(new java.awt.Color(51, 153, 255));
        cancel.setText("B A T A L");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("WILAYAH PENUGASAN :");
        Panel_Update_Data_Petugas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("NAMA LENGKAP :");
        Panel_Update_Data_Petugas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("PASSWORD :");
        Panel_Update_Data_Petugas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("USERNAME :");
        Panel_Update_Data_Petugas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 20));

        jComboBoxNama.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNamaActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jComboBoxNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 430, 30));

        tanggal2.setBackground(new java.awt.Color(204, 204, 204));
        tanggal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggal2ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(tanggal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 430, 30));

        tanggal3.setBackground(new java.awt.Color(204, 204, 204));
        tanggal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggal3ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(tanggal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 430, 30));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 430, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NO TELPON :");
        Panel_Update_Data_Petugas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 30));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 430, 30));

        jButton2.setBackground(new java.awt.Color(149, 211, 241));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 50));

        jButton5.setBackground(new java.awt.Color(149, 211, 241));
        jButton5.setText("Lihat Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 50));

        jButton1.setBackground(new java.awt.Color(149, 211, 241));
        jButton1.setText("Hapus Laporan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 50));

        jButton4.setBackground(new java.awt.Color(149, 211, 241));
        jButton4.setText("Register Petugas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, 50));

        jButton6.setBackground(new java.awt.Color(149, 211, 241));
        jButton6.setText("Ubah Status");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 50));

        jButton7.setBackground(new java.awt.Color(149, 211, 241));
        jButton7.setText("Lihat Data Petugas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 130, 50));

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setText("Edit Data Petugas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 130, 50));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_Update_Data_Petugas.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 130, 50));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\UPDATE PETUGAS.png")); // NOI18N
        Panel_Update_Data_Petugas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Update_Data_Petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Update_Data_Petugas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    String nama = (String) jComboBoxNama.getSelectedItem();
        String username = tanggal2.getText();
        String password = new String(jPasswordField1.getPassword());
        String noTelp = tanggal3.getText();
        String wilayah = (String) jComboBox2.getSelectedItem();

        if (nama.equals("-- Pilih Petugas --") || wilayah.equals("-- Pilih Wilayah --")) {
            JOptionPane.showMessageDialog(this, "Pilih petugas dan wilayah terlebih dahulu!");
            return;
        }

        PetugasDAO dao = new PetugasDAO();
        if (dao.updatePetugas(nama, username, password, noTelp, wilayah)) {
            JOptionPane.showMessageDialog(this, "Data petugas berhasil diperbarui!");
        } else {
            JOptionPane.showMessageDialog(this, "Gagal memperbarui data!");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
 jComboBoxNama.setSelectedIndex(0);
    jComboBox2.setSelectedIndex(0);
    tanggal2.setText("");
    jPasswordField1.setText("");
    tanggal3.setText("");

    }//GEN-LAST:event_cancelActionPerformed

    private void jComboBoxNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNamaActionPerformed
       if (loading) return;
        String selectedPetugas = (String) jComboBoxNama.getSelectedItem();
        if (selectedPetugas == null || selectedPetugas.equals("-- Pilih Petugas --")) return;

        try {
            PetugasDAO dao = new PetugasDAO();
            ResultSet rs = dao.getPetugasByNama(selectedPetugas);
            if (rs.next()) {
                tanggal2.setText(rs.getString("username"));
                jPasswordField1.setText(rs.getString("password"));
                tanggal3.setText(rs.getString("no_telepon"));
                jComboBox2.setSelectedItem(rs.getString("wilayah_penugasan"));
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data petugas: " + e.getMessage());
        }
    }//GEN-LAST:event_jComboBoxNamaActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
 if (loading) return;
    String selectedWilayah = (String) jComboBox2.getSelectedItem();
    if (selectedWilayah == null || selectedWilayah.equals("-- Pilih Wilayah --")) return;

    try {
        WilayahDAO dao = new WilayahDAO();
        ModelWilayah mw = dao.getWilayahByNamaModel(selectedWilayah);
        if (mw != null) {
            // tidak perlu text field, jadi cukup logika berikut:
            System.out.println("Wilayah dipilih: " + mw.getNamaWilayah());
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data wilayah: " + e.getMessage());
    }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void tanggal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggal2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void tanggal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggal3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        A_Welcome a_Welcome = new A_Welcome();
        a_Welcome.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    A_Lihat_Data_Petugas a_Lihat_Data_Petugas = new A_Lihat_Data_Petugas();
    a_Lihat_Data_Petugas.setVisible(true);
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
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Landing_Page landing_Page = new Landing_Page();
        landing_Page.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Update_Data_Petugas;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton save;
    private javax.swing.JTextField tanggal2;
    private javax.swing.JTextField tanggal3;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new A_update_data_petugas().setVisible(true);
    });
}

    private void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
