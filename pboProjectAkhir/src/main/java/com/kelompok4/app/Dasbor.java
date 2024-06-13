/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;

import com.kelompok4.design.PanelRound;
import com.kelompok4.pboprojectakhir.Database;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.border.Border;


/**
 *
 * @author Irsyad Fadhil
 */
public class Dasbor extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form landingPage
     */
    public Dasbor() {
        Date today = new Date();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);   
        totalPembelian(today);
        totalPenjualan(today);
        totalUtang(today);
        totalPiutang(today);
        peringatanStok();
                
        ((PanelRound) contentpanel).setRoundTopLeft(40); 
        ((PanelRound) contentpanel).setRoundTopRight(40);
        ((PanelRound) contentpanel).setRoundBottomLeft(40);
        ((PanelRound) contentpanel).setRoundBottomRight(40);
        ((PanelRound) contentpanel).setOpacity(0.7f); 

        ((PanelRound) buttonCari).setRoundTopLeft(40); 
        ((PanelRound) buttonCari).setRoundTopRight(40);
        ((PanelRound) buttonCari).setRoundBottomLeft(40);
        ((PanelRound) buttonCari).setRoundBottomRight(40);
    }
    
    public Dasbor(Date tanggal) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);   
        totalPembelian(tanggal);
        totalPenjualan(tanggal);
        totalUtang(tanggal);
        totalPiutang(tanggal);
        peringatanStok();

        ((PanelRound) contentpanel).setRoundTopLeft(40); 
        ((PanelRound) contentpanel).setRoundTopRight(40);
        ((PanelRound) contentpanel).setRoundBottomLeft(40);
        ((PanelRound) contentpanel).setRoundBottomRight(40);
        ((PanelRound) contentpanel).setOpacity(0.7f); 

        ((PanelRound) buttonCari).setRoundTopLeft(40); 
        ((PanelRound) buttonCari).setRoundTopRight(40);
        ((PanelRound) buttonCari).setRoundBottomLeft(40);
        ((PanelRound) buttonCari).setRoundBottomRight(40);

    }

    public void totalPembelian(java.util.Date tanggal) {
        java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());

        try (Connection conn = Database.getConnection()){
            String sql = "SELECT SUM(uang_keluar) AS total_pembelian FROM pembelian WHERE tanggal = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, sqlDate);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                String total_pembelian = resultSet.getString("total_pembelian");
                labelTotalPembelian.setText(total_pembelian != null ? total_pembelian : "0");
            } else {
                labelTotalPembelian.setText("0");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void totalPenjualan(java.util.Date tanggal) {
        java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());

        try (Connection conn = Database.getConnection()){
            String sql = "SELECT SUM(uang_masuk) AS total_penjualan FROM penjualan WHERE tanggal = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, sqlDate);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                String total_penjualan = resultSet.getString("total_penjualan");
                labelTotalPenjualan.setText(total_penjualan != null ? total_penjualan : "0");
            } else {
                labelTotalPenjualan.setText("0");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void totalUtang(java.util.Date tanggal) {
        java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());

        try (Connection conn = Database.getConnection()){
            String sql = "SELECT SUM(jumlah) AS total_utang FROM utang WHERE tanggal = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, sqlDate);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                String total_utang = resultSet.getString("total_utang");
                labelTotalUtang.setText(total_utang != null ? total_utang : "0");
            } else {
                labelTotalUtang.setText("0");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void totalPiutang(java.util.Date tanggal) {
        java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());

        try (Connection conn = Database.getConnection()){
            String sql = "SELECT SUM(jumlah) AS total_piutang FROM piutang WHERE tanggal = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, sqlDate);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                String total_piutang = resultSet.getString("total_piutang");
                labelTotalPiutang.setText(total_piutang != null ? total_piutang : "0");
            } else {
                labelTotalPiutang.setText("0");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void peringatanStok() {
        try (Connection conn = Database.getConnection()){
            String sql = "SELECT COUNT(*) AS total_data FROM stokbarang WHERE jumlah <= peringatan_minimum";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                int total_data = resultSet.getInt("total_data");
                labelStok.setText(total_data == 0 ? "<html><b>" + total_data + "</b> Stok Barang Menipis" : "Stok Barang Aman</html>");
            } else {
                labelStok.setText("Stok Barang Aman");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        labelTotalPiutang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelTotalPembelian = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelTotalPenjualan = new javax.swing.JLabel();
        labelTotalUtang = new javax.swing.JLabel();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        buttonCari = new com.kelompok4.design.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Laporan Keuangan");
        contentpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labelTotalPiutang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotalPiutang.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalPiutang.setText("totalPiutang");
        contentpanel.add(labelTotalPiutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total Penjualan:");
        contentpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        labelTotalPembelian.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotalPembelian.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalPembelian.setText("totalPembelian");
        contentpanel.add(labelTotalPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total Pembelian:");
        contentpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Utang:");
        contentpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Piutang:");
        contentpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Masukkan Tanggal Laporan Keuangan:");
        contentpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        labelTotalPenjualan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotalPenjualan.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalPenjualan.setText("totalPenjualan");
        contentpanel.add(labelTotalPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        labelTotalUtang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotalUtang.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalUtang.setText("totalUtang");
        contentpanel.add(labelTotalUtang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
        contentpanel.add(inputTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 312, 190, 30));

        buttonCari.setBackground(new java.awt.Color(124, 195, 223));
        buttonCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCari.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCariMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cari");
        jLabel11.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonCariLayout = new javax.swing.GroupLayout(buttonCari);
        buttonCari.setLayout(buttonCariLayout);
        buttonCariLayout.setHorizontalGroup(
            buttonCariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        buttonCariLayout.setVerticalGroup(
            buttonCariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonCariLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        contentpanel.add(buttonCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Stok:");
        contentpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        labelStok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelStok.setForeground(new java.awt.Color(0, 0, 0));
        labelStok.setText("stok");
        contentpanel.add(labelStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        getContentPane().add(contentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 770, 370));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setName(""); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void buttonCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCariMouseClicked
        Date tanggal = inputTanggal.getDate();
        dispose();
        Dasbor dasborFrame = new Dasbor(tanggal);
        dasborFrame.setVisible(true);
    }//GEN-LAST:event_buttonCariMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasbor().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel buttonCari;
    private javax.swing.JPanel contentpanel;
    private javax.swing.JPanel header;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelStok;
    private javax.swing.JLabel labelTotalPembelian;
    private javax.swing.JLabel labelTotalPenjualan;
    private javax.swing.JLabel labelTotalPiutang;
    private javax.swing.JLabel labelTotalUtang;
    // End of variables declaration//GEN-END:variables
}
