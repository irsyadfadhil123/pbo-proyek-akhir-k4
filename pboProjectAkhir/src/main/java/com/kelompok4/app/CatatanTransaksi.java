/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;

import com.kelompok4.design.PanelRound;
import com.kelompok4.pboprojectakhir.Database;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Irsyad Fadhil
 */
public class CatatanTransaksi extends javax.swing.JFrame {
        
    /**
     * Creates new form landingPage
     */
    public CatatanTransaksi() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false); 
        Database db = new Database();
        con = Database.getConnection();
        show_table();
        
        TabelTransaksi.setDefaultRenderer(Object.class, new CustomTableCellRenderer());
        
        ((PanelRound) tmblcttjual).setRoundTopLeft(40); //set round
        ((PanelRound) tmblcttjual).setRoundTopRight(40);
        ((PanelRound) tmblcttjual).setRoundBottomLeft(40);
        ((PanelRound) tmblcttjual).setRoundBottomRight(40);
        
        ((PanelRound) tmblcttbeli).setRoundTopLeft(40); // set round
        ((PanelRound) tmblcttbeli).setRoundTopRight(40);
        ((PanelRound) tmblcttbeli).setRoundBottomLeft(40);
        ((PanelRound) tmblcttbeli).setRoundBottomRight(40);
        
        ((PanelRound) contentpanel).setRoundTopLeft(40); // set round
        ((PanelRound) contentpanel).setRoundTopRight(40);
        ((PanelRound) contentpanel).setRoundBottomLeft(40);
        ((PanelRound) contentpanel).setRoundBottomRight(40);
        ((PanelRound) contentpanel).setOpacity(0.7f); // set opacity
    }
    
    private static final Logger LOGGER = Logger.getLogger(CatatanPenjualan.class.getName());
    private final Connection con;
    private PreparedStatement pst;
    private PreparedStatement pst2;
    private ResultSet rs;
    
    private void show_table() {
        int CC;

        try {
            String sql = "SELECT 'penjualan' AS tipe, p.tanggal, sb.nama_barang COLLATE utf8mb4_general_ci AS nama_barang, " +
                         "p.jumlah_barang, p.uang_masuk, p.catatan " +
                         "FROM penjualan p " +
                         "JOIN stokbarang sb ON p.id_barang = sb.id_barang " +
                         "UNION " +
                         "SELECT 'pembelian' AS tipe, b.tanggal, sb.nama_barang COLLATE utf8mb4_general_ci AS nama_barang, " +
                         "b.jumlah_barang, b.uang_keluar, b.catatan " +
                         "FROM pembelian b " +
                         "JOIN stokbarang sb ON b.id_barang = sb.id_barang " +
                         "ORDER BY tanggal DESC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            CC = RSMD.getColumnCount();

            DefaultTableModel DFT = (DefaultTableModel) TabelTransaksi.getModel();

            DFT.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= CC; i++) {
                    v2.add(rs.getString(i));
                }

                DFT.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CatatanTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public class CustomTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Mendapatkan nilai kolom "tipe" dari model
        String tipe = (String) table.getModel().getValueAt(row, 0);

        if (tipe.equals("pembelian")) {
            c.setBackground(Color.LIGHT_GRAY);            
            c.setForeground(Color.BLACK);
        } else if (tipe.equals("penjualan")) {
            c.setBackground(Color.WHITE);            
            c.setForeground(Color.BLACK);
        } else {
            c.setBackground(Color.WHITE);            
            c.setForeground(Color.BLACK);
        }

        return c;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        contentpanel = new com.kelompok4.design.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelTransaksi = new javax.swing.JTable();
        tmblcttjual = new com.kelompok4.design.PanelRound();
        lblcttjual = new javax.swing.JLabel();
        tmblcttbeli = new com.kelompok4.design.PanelRound();
        lblcttbeli = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(854, 510));
        setSize(new java.awt.Dimension(854, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setMaximumSize(new java.awt.Dimension(1920, 1080));
        header.setMinimumSize(new java.awt.Dimension(1280, 720));
        header.setName(""); // NOI18N
        header.setPreferredSize(new java.awt.Dimension(1280, 720));
        header.setRequestFocusEnabled(false);
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Artha");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 15, 79, 24));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Dasbor");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);

        jButton5.setContentAreaFilled(false);

        jButton5.setFocusPainted(false);

        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        header.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 6, 95, 32));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Catatan Transaksi");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);

        jButton6.setContentAreaFilled(false);

        jButton6.setFocusPainted(false);

        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        header.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 6, -1, 32));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Utang/Piutang");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);

        jButton7.setContentAreaFilled(false);

        jButton7.setFocusPainted(false);

        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        header.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 6, -1, 32));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("Stok");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);

        jButton8.setContentAreaFilled(false);

        jButton8.setFocusPainted(false);

        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        header.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 6, -1, 32));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setText("Profil");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);

        jButton9.setContentAreaFilled(false);

        jButton9.setFocusPainted(false);

        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        header.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 6, -1, 32));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 854, 50));

        contentpanel.setBackground(new java.awt.Color(255, 255, 255));
        contentpanel.setAlignmentX(0.0F);
        contentpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipe", "Tanggal", "Nama Barang", "Jumlah Barang", "Uang Masuk/Keluar", "Catatan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelTransaksi);

        contentpanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 670, 280));

        tmblcttjual.setBackground(new java.awt.Color(124, 195, 223));
        tmblcttjual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmblcttjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmblcttjualMouseClicked(evt);
            }
        });
        tmblcttjual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcttjual.setBackground(new java.awt.Color(255, 255, 255));
        lblcttjual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcttjual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcttjual.setText("Semua Catatan Penjualan");
        tmblcttjual.add(lblcttjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        contentpanel.add(tmblcttjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 230, 40));

        tmblcttbeli.setBackground(new java.awt.Color(124, 195, 223));
        tmblcttbeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmblcttbeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmblcttbeliMouseClicked(evt);
            }
        });
        tmblcttbeli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcttbeli.setBackground(new java.awt.Color(124, 195, 223));
        lblcttbeli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcttbeli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcttbeli.setText("Semua Catatan Pembelian");
        tmblcttbeli.add(lblcttbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        contentpanel.add(tmblcttbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 230, 40));

        getContentPane().add(contentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 770, 370));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setName(""); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Dasbor dasborFrame = new Dasbor();
        dasborFrame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        CatatanTransaksi catatantransaksiFrame = new CatatanTransaksi();
        catatantransaksiFrame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        UtangPiutang utangpiutangFrame = new UtangPiutang();
        utangpiutangFrame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        Stok stokFrame = new Stok();
        stokFrame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
        Profil stokFrame = new Profil();
        stokFrame.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tmblcttjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmblcttjualMouseClicked
        dispose();
        CatatanPenjualan catatanpenjualanFrame = new CatatanPenjualan();
        catatanpenjualanFrame.setVisible(true);
    }//GEN-LAST:event_tmblcttjualMouseClicked

    private void tmblcttbeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmblcttbeliMouseClicked
        dispose();
        CatatanPembelian catatanpembelianFrame = new CatatanPembelian();
        catatanpembelianFrame.setVisible(true);
    }//GEN-LAST:event_tmblcttbeliMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Memulai aplikasi...");

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatatanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatatanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatatanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatatanTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatatanTransaksi().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTable TabelTransaksi;
    private javax.swing.JPanel contentpanel;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcttbeli;
    private javax.swing.JLabel lblcttjual;
    private javax.swing.JPanel tmblcttbeli;
    private javax.swing.JPanel tmblcttjual;
    // End of variables declaration//GEN-END:variables
}
