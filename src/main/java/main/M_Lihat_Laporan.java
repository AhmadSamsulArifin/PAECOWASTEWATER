package main;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import koneksi.DatabaseConfig;
import javax.swing.JOptionPane;

public class M_Lihat_Laporan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(M_Lihat_Laporan.class.getName());

    /**
     * Creates new form Login
     */
    public M_Lihat_Laporan() {
        initComponents();
        loadTable();
    }
    
private void loadTable() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // tidak bisa diedit langsung
            }
        };

        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Layanan");
        model.addColumn("Wilayah");
        model.addColumn("Status");

        try {
            int idUser = Session.getUserId(); // Ambil id user yang login
            if (idUser == 0) {
                JOptionPane.showMessageDialog(this, "Session belum aktif. Silakan login ulang.");
                new Login().setVisible(true);
                this.dispose();
                return;
            }

            String sql = """
                SELECT u.nama AS Nama,
                       ly.jenis_layanan AS Layanan,
                       w.nama_wilayah AS Wilayah,
                       l.status AS Status
                FROM laporan l
                JOIN masyarakat m ON l.masyarakat_id_user = m.id_user
                JOIN user u ON m.id_user = u.id_user
                JOIN wilayah w ON l.wilayah_kode_wilayah = w.kode_wilayah
                JOIN layanan ly ON l.layanan_id_layanan = ly.id_layanan
                WHERE l.masyarakat_id_user = ?
                ORDER BY l.id_laporan ASC
                """;

            Connection conn = DatabaseConfig.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, idUser);
            ResultSet res = pst.executeQuery();

            int no = 1;
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                    res.getString("Nama"),
                    res.getString("Layanan"),
                    res.getString("Wilayah"),
                    res.getString("Status")
                });
            }

            jTable1.setModel(model);
            res.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data laporan: " + e.getMessage());
        }
}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Lihat_Laporan_Pengguna = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        keHome = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_Lihat_Laporan_Pengguna.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Lihat_Laporan_Pengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Lihat_Laporan_Pengguna.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_Lihat_Laporan_Pengguna.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_Lihat_Laporan_Pengguna.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Panel_Lihat_Laporan_Pengguna.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 750, 320));

        keHome.setBackground(new java.awt.Color(149, 211, 241));
        keHome.setText("Home");
        keHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keHomeActionPerformed(evt);
            }
        });
        Panel_Lihat_Laporan_Pengguna.add(keHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 130, 50));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_Lihat_Laporan_Pengguna.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 130, 50));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setText("Lihat Laporan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel_Lihat_Laporan_Pengguna.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 50));

        jButton6.setBackground(new java.awt.Color(149, 211, 241));
        jButton6.setText("Buat Laporan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_Lihat_Laporan_Pengguna.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\Lihat Lap Pengguna.png")); // NOI18N
        Panel_Lihat_Laporan_Pengguna.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Lihat_Laporan_Pengguna, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Lihat_Laporan_Pengguna, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    M_Buat_Laporan buat_Laporan = new M_Buat_Laporan();
      buat_Laporan.setVisible(true);
      this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    M_Lihat_Laporan m_Lihat_Laporan = new M_Lihat_Laporan();
    m_Lihat_Laporan.setVisible(true);
this.dispose();    // TODO add your handling code here:
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Lihat_Laporan_Pengguna;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keHome;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new M_Lihat_Laporan().setVisible(true);
    });
}
}
