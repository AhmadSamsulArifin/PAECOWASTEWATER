package main;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import koneksi.LaporanDAO;
public class A_Edit_Status extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(A_Edit_Status.class.getName());

    /**
     * Creates new form Login
     */
    public A_Edit_Status() {
        initComponents();
        loadTable();
    }
private void loadTable() {
        LaporanDAO dao = new LaporanDAO();
        DefaultTableModel model = dao.getLaporanTableModel();

        // hanya kolom Status yang bisa diedit jika status saat ini = "Menunggu"
        DefaultTableModel restrictedModel = new DefaultTableModel(
                new Object[]{"id_laporan", "No", "Nama", "Layanan", "Wilayah", "Status"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column != 5) return false;
                Object current = getValueAt(row, 5);
                return current != null && "Menunggu".equalsIgnoreCase(String.valueOf(current).trim());
            }
        };

        // isi restrictedModel dengan data dari dao
        for (int i = 0; i < model.getRowCount(); i++) {
            restrictedModel.addRow(new Object[]{
                model.getValueAt(i, 0),
                model.getValueAt(i, 1),
                model.getValueAt(i, 2),
                model.getValueAt(i, 3),
                model.getValueAt(i, 4),
                model.getValueAt(i, 5)
            });
        }

        jTable1.setModel(restrictedModel);

        // sembunyikan kolom id_laporan (kolom 0)
        try {
            javax.swing.table.TableColumn idCol = jTable1.getColumnModel().getColumn(0);
            jTable1.removeColumn(idCol);
        } catch (Exception ignored) {}

        // buat combo editor untuk kolom Status
        javax.swing.JComboBox<String> comboStatus = new javax.swing.JComboBox<>();
        comboStatus.addItem("Diterima");
        comboStatus.addItem("Ditolak");

        int viewIndexForStatus = -1;
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            if ("Status".equalsIgnoreCase(jTable1.getColumnName(i))) {
                viewIndexForStatus = i;
                break;
            }
        }
        if (viewIndexForStatus >= 0) {
            jTable1.getColumnModel().getColumn(viewIndexForStatus)
                    .setCellEditor(new javax.swing.DefaultCellEditor(comboStatus));
        }

        // buat sorter
        RowSorter<? extends TableModel> sorter = new TableRowSorter<>(restrictedModel);
        jTable1.setRowSorter(sorter);

        // listener perubahan status
        restrictedModel.addTableModelListener(e -> {
            if (e.getType() == javax.swing.event.TableModelEvent.UPDATE && e.getColumn() == 5) {
                int row = e.getFirstRow();
                if (row < 0) return;

                String idLaporan = String.valueOf(restrictedModel.getValueAt(row, 0));
                String statusBaru = String.valueOf(restrictedModel.getValueAt(row, 5));

                if (!"Diterima".equalsIgnoreCase(statusBaru) &&
                    !"Ditolak".equalsIgnoreCase(statusBaru)) {
                    JOptionPane.showMessageDialog(this, "Status hanya boleh 'Diterima' atau 'Ditolak'.");
                    loadTable();
                    return;
                }

                int confirm = JOptionPane.showConfirmDialog(this,
                        "Ubah status laporan ID " + idLaporan + " menjadi " + statusBaru + "?",
                        "Konfirmasi", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    boolean success = dao.updateStatus(idLaporan, statusBaru);
                    if (success) {
                        JOptionPane.showMessageDialog(this, "Status berhasil diperbarui!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal memperbarui status.");
                    }
                    loadTable();
                } else {
                    loadTable();
                }
            }
        });
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Edit_Status_Petugas = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));

        Panel_Edit_Status_Petugas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Edit_Status_Petugas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Edit_Status_Petugas.setMinimumSize(new java.awt.Dimension(950, 475));
        Panel_Edit_Status_Petugas.setPreferredSize(new java.awt.Dimension(950, 475));
        Panel_Edit_Status_Petugas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Panel_Edit_Status_Petugas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 750, 320));

        jButton8.setBackground(new java.awt.Color(149, 211, 241));
        jButton8.setText("Lihat Data Petugas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 130, 50));

        jButton2.setBackground(new java.awt.Color(149, 211, 241));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 50));

        jButton9.setBackground(new java.awt.Color(149, 211, 241));
        jButton9.setText("Lihat Laporan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 50));

        jButton10.setBackground(new java.awt.Color(149, 211, 241));
        jButton10.setText("Hapus Laporan");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 50));

        jButton11.setBackground(new java.awt.Color(149, 211, 241));
        jButton11.setText("Register Petugas");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 50));

        jButton12.setBackground(new java.awt.Color(51, 153, 255));
        jButton12.setText("Ubah Status");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 130, 50));

        jButton13.setBackground(new java.awt.Color(149, 211, 241));
        jButton13.setText("Edit Data Petugas");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 130, 50));

        jButton14.setBackground(new java.awt.Color(51, 153, 255));
        jButton14.setText("Keluar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Panel_Edit_Status_Petugas.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 130, 50));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmad samuel\\Documents\\PA_SISA_OOP fiks\\PA_SISA_OOP\\src\\main\\java\\icon\\UPDATE Status.png")); // NOI18N
        Panel_Edit_Status_Petugas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Edit_Status_Petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Edit_Status_Petugas, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        A_Lihat_Data_Petugas a_Lihat_Data_Petugas = new A_Lihat_Data_Petugas();
        a_Lihat_Data_Petugas.setVisible(true);
        this.dispose();// TODO add your handling code here:
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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        A_Edit_Status a_Edit_Status = new A_Edit_Status();
        a_Edit_Status.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    A_update_data_petugas a_update_data_petugas = new A_update_data_petugas();
    a_update_data_petugas.setVisible(true);
    this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Landing_Page landing_Page = new Landing_Page();
        landing_Page.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        A_Register_Petugas a_register = new A_Register_Petugas();
        a_register.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Edit_Status_Petugas;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new A_Edit_Status().setVisible(true);
    });
}
}
