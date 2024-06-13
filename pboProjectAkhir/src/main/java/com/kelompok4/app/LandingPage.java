/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;

import com.kelompok4.design.PanelRound;
import com.kelompok4.design.RoundedBorder;
import java.awt.Color;

/**
 *
 * @author Irsyad Fadhil
 */
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form landingPage
     */
    public LandingPage() {
        initComponents();
        panelContent.setBackground(new Color(255,255,255,200));
        setLocationRelativeTo(null);
        setResizable(false);
        
        ((PanelRound) panelContent).setOpacity(0.7f);
        ((PanelRound) panelContent).setRoundTopLeft(40);
        ((PanelRound) panelContent).setRoundTopRight(40);
        ((PanelRound) panelContent).setRoundBottomLeft(40);
        ((PanelRound) panelContent).setRoundBottomRight(40);
        
        ((PanelRound) buttonMulai).setRoundTopLeft(40);
        ((PanelRound) buttonMulai).setRoundTopRight(40);
        ((PanelRound) buttonMulai).setRoundBottomLeft(40);
        ((PanelRound) buttonMulai).setRoundBottomRight(40);        
        
        ((PanelRound) buttonPanduan).setRoundTopLeft(40);
        ((PanelRound) buttonPanduan).setRoundTopRight(40);
        ((PanelRound) buttonPanduan).setRoundBottomLeft(40);
        ((PanelRound) buttonPanduan).setRoundBottomRight(40);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new com.kelompok4.design.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonMulai = new com.kelompok4.design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        buttonPanduan = new com.kelompok4.design.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(854, 480));
        setSize(new java.awt.Dimension(854, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelContent.setMinimumSize(new java.awt.Dimension(1280, 720));
        panelContent.setName(""); // NOI18N
        panelContent.setPreferredSize(new java.awt.Dimension(1280, 720));
        panelContent.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("<html>Selamat Datang di <b>Artha</b></html?");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Artha adalah aplikasi keuangan usaha yang dirancang untuk membantu pemilik usaha dalam mengelola keuangan  dengan lebih efisien dan terorganisir.  Dengan fitur-fitur yang komprehensif, Artha memberikan  solusi yang lengkap untuk kebutuhan keuangan bisnis Anda. </html>");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonMulai.setBackground(new java.awt.Color(124, 195, 223));
        buttonMulai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMulai.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonMulai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMulaiMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Masuk ->  ");

        javax.swing.GroupLayout buttonMulaiLayout = new javax.swing.GroupLayout(buttonMulai);
        buttonMulai.setLayout(buttonMulaiLayout);
        buttonMulaiLayout.setHorizontalGroup(
            buttonMulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        buttonMulaiLayout.setVerticalGroup(
            buttonMulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonMulaiLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        buttonPanduan.setBackground(new java.awt.Color(124, 195, 223));
        buttonPanduan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPanduan.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonPanduan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPanduanMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Panduan Pengguna");

        javax.swing.GroupLayout buttonPanduanLayout = new javax.swing.GroupLayout(buttonPanduan);
        buttonPanduan.setLayout(buttonPanduanLayout);
        buttonPanduanLayout.setHorizontalGroup(
            buttonPanduanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        buttonPanduanLayout.setVerticalGroup(
            buttonPanduanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanduanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                            .addComponent(buttonPanduan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(717, Short.MAX_VALUE))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonMulai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanduan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(345, Short.MAX_VALUE))
        );

        getContentPane().add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 600, 400));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setName(""); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMulaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMulaiMouseClicked
        dispose();
        LoginPage loginFrame = new LoginPage();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_buttonMulaiMouseClicked

    private void buttonPanduanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanduanMouseClicked
        dispose();
        PanduanPengguna panduanPenggunaFrame = new PanduanPengguna();
        panduanPenggunaFrame.setVisible(true);
    }//GEN-LAST:event_buttonPanduanMouseClicked

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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel buttonMulai;
    private javax.swing.JPanel buttonPanduan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelContent;
    // End of variables declaration//GEN-END:variables
}
