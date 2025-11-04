package main;

public class M_Welcome extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(M_Welcome.class.getName());

    /**
     * Creates new form Login
     */
    public M_Welcome() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_welcome = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        A_lihat_laporan = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_welcome.setBackground(new java.awt.Color(255, 255, 255));
        Panel_welcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_welcome.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_welcome.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_welcome.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 50));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_welcome.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 130, 50));

        A_lihat_laporan.setBackground(new java.awt.Color(149, 211, 241));
        A_lihat_laporan.setText("Lihat Laporan");
        A_lihat_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_lihat_laporanActionPerformed(evt);
            }
        });
        Panel_welcome.add(A_lihat_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 50));

        jButton6.setBackground(new java.awt.Color(149, 211, 241));
        jButton6.setText("Buat Laporan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_welcome.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\Welcome pengguna.png")); // NOI18N
        Panel_welcome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     M_Buat_Laporan buat_Laporan = new M_Buat_Laporan();
      buat_Laporan.setVisible(true);
      this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void A_lihat_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_lihat_laporanActionPerformed
      M_Lihat_Laporan m_Lihat_Laporan = new M_Lihat_Laporan();
      m_Lihat_Laporan.setVisible(true);
      this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_A_lihat_laporanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Landing_Page landing_Page = new Landing_Page();
    landing_Page.setVisible(true);   
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new M_Welcome().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_lihat_laporan;
    private javax.swing.JPanel Panel_welcome;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
