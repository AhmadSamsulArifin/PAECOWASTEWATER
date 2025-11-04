package main;
import javax.swing.table.DefaultTableModel;
import koneksi.LaporanDAO;

public class A_Lihat_Laporan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(A_Lihat_Laporan.class.getName());

    /**
     * Creates new form Login
     */
    public A_Lihat_Laporan() {
        initComponents();
        loadTable();
    }
private void loadTable() {
        LaporanDAO dao = new LaporanDAO();
        DefaultTableModel model = dao.getLaporanTableModel();  // Ambil data laporan dari OOP
        jTable1.setModel(model);

        // Nonaktifkan edit di tabel
        jTable1.setDefaultEditor(Object.class, null);
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_lihat_laporan_admin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        Panel_lihat_laporan_admin.setBackground(new java.awt.Color(255, 255, 255));
        Panel_lihat_laporan_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_lihat_laporan_admin.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_lihat_laporan_admin.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_lihat_laporan_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Panel_lihat_laporan_admin.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 750, 320));

        jButton2.setBackground(new java.awt.Color(149, 211, 241));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 50));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setText("Lihat Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 50));

        jButton1.setBackground(new java.awt.Color(149, 211, 241));
        jButton1.setText("Hapus Laporan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 50));

        jButton4.setBackground(new java.awt.Color(149, 211, 241));
        jButton4.setText("Register Petugas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 50));

        jButton6.setBackground(new java.awt.Color(149, 211, 241));
        jButton6.setText("Ubah Status");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 130, 50));

        jButton7.setBackground(new java.awt.Color(149, 211, 241));
        jButton7.setText("Lihat Data Petugas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 130, 50));

        jButton8.setBackground(new java.awt.Color(149, 211, 241));
        jButton8.setText("Edit Data Petugas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 130, 50));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_lihat_laporan_admin.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\Lihat Laporan Admin.png")); // NOI18N
        Panel_lihat_laporan_admin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_lihat_laporan_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_lihat_laporan_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel Panel_lihat_laporan_admin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new A_Lihat_Laporan().setVisible(true);
    });
}
}
