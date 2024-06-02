/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;

import com.kelompok4.design.PanelRound;
import java.awt.Color;
import javax.swing.border.Border;


/**
 *
 * @author Irsyad Fadhil
 */
public class PelangganSupplier extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form landingPage
     */
    public PelangganSupplier() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);   
        
        ((PanelRound) tmblpelanggan).setRoundTopLeft(40); //set round
        ((PanelRound) tmblpelanggan).setRoundTopRight(40);
        ((PanelRound) tmblpelanggan).setRoundBottomLeft(40);
        ((PanelRound) tmblpelanggan).setRoundBottomRight(40);
        
        ((PanelRound) tmblsupplier).setRoundTopLeft(40); // set round
        ((PanelRound) tmblsupplier).setRoundTopRight(40);
        ((PanelRound) tmblsupplier).setRoundBottomLeft(40);
        ((PanelRound) tmblsupplier).setRoundBottomRight(40);
        
        ((PanelRound) contentpanel).setRoundTopLeft(40); // set round
        ((PanelRound) contentpanel).setRoundTopRight(40);
        ((PanelRound) contentpanel).setRoundBottomLeft(40);
        ((PanelRound) contentpanel).setRoundBottomRight(40);
        ((PanelRound) contentpanel).setOpacity(0.7f); // set opacity
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
        jTable1 = new javax.swing.JTable();
        tmblpelanggan = new com.kelompok4.design.PanelRound();
        lblpelanggan = new javax.swing.JLabel();
        tmblsupplier = new com.kelompok4.design.PanelRound();
        lblpiutang = new javax.swing.JLabel();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        contentpanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 670, 280));

        tmblpelanggan.setBackground(new java.awt.Color(124, 195, 223));
        tmblpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmblpelangganMouseClicked(evt);
            }
        });
        tmblpelanggan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpelanggan.setBackground(new java.awt.Color(255, 255, 255));
        lblpelanggan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblpelanggan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpelanggan.setText("Pelanggan");
        tmblpelanggan.add(lblpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        contentpanel.add(tmblpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 230, 40));

        tmblsupplier.setBackground(new java.awt.Color(124, 195, 223));
        tmblsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmblsupplierMouseClicked(evt);
            }
        });
        tmblsupplier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpiutang.setBackground(new java.awt.Color(124, 195, 223));
        lblpiutang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblpiutang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpiutang.setText("Supplier");
        tmblsupplier.add(lblpiutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        contentpanel.add(tmblsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 230, 40));

        getContentPane().add(contentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 770, 370));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setName(""); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
        CatatanTransaksi catatantransaksiFrame = new CatatanTransaksi();
        catatantransaksiFrame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        dispose();
        PelangganSupplier utangpiutangFrame = new PelangganSupplier();
        utangpiutangFrame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
        Stok stokFrame = new Stok();
        stokFrame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tmblpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmblpelangganMouseClicked
        // TODO add your handling code here:
        dispose();
        Pelanggan pelangganFrame = new Pelanggan();
        pelangganFrame.setVisible(true);
    }//GEN-LAST:event_tmblpelangganMouseClicked

    private void tmblsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmblsupplierMouseClicked
        // TODO add your handling code here:
        dispose();
        Supplier supplierFrame = new Supplier();
        supplierFrame.setVisible(true);
    }//GEN-LAST:event_tmblsupplierMouseClicked

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
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PelangganSupplier().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel contentpanel;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblpelanggan;
    private javax.swing.JLabel lblpiutang;
    private javax.swing.JPanel tmblpelanggan;
    private javax.swing.JPanel tmblsupplier;
    // End of variables declaration//GEN-END:variables
}
