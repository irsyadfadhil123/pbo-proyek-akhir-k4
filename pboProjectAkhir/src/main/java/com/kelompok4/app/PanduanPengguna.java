/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;

import com.kelompok4.design.PanelRound;
import java.awt.CardLayout;

/**
 *
 * @author Irsyad Fadhil
 */
public class PanduanPengguna extends javax.swing.JFrame {
    CardLayout cardLayout;
    /**
     * Creates new form landingPage
     */
    public PanduanPengguna() {
        initComponents();
//        panelContent.setBackground(new Color(255,255,255,200));
        setLocationRelativeTo(null);
        setResizable(false);
        cardLayout = (CardLayout) (cardPanel.getLayout());
        
        cardPanel.add(panelGuideMain, "Main");
        cardPanel.add(panelGuideCatatanTransaksi1, "Catatan Transaksi 1");
        cardPanel.add(panelGuideCatatanTransaksi2, "Catatan Transaksi 2");
        cardPanel.add(panelGuideCatatanTransaksi3, "Catatan Transaksi 3");
        cardPanel.add(panelGuideUtangPiutang1, "Utang Piutang 1");
        cardPanel.add(panelGuideUtangPiutang2, "Utang Piutang 2");
        cardPanel.add(panelGuideUtangPiutang3, "Utang Piutang 3");
        cardPanel.add(panelGuideStok1, "Stok 1");
        cardPanel.add(panelGuideDasbor1, "Dasbor 1");
        cardPanel.add(panelGuideLaporanKeuangan1, "Laporan Keuangan 1");
        cardPanel.add(panelGuideTargetKeuangan1, "Target Keuangan 1");
        cardPanel.add(panelGuideProfil1, "Profil 1");
        
        //Design
        ((PanelRound) cardPanel).setOpacity(0.0f);
                
        //panel design
        setRoundedCorners((PanelRound) panelGuideMain, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideCatatanTransaksi1, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideCatatanTransaksi2, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideCatatanTransaksi3, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideUtangPiutang1, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideUtangPiutang2, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideUtangPiutang3, 0.7f, 40);
        setRoundedCorners((PanelRound) panelGuideStok1, 0.7f, 40);

        //button main design
        setRoundedCorners((PanelRound) buttonBack, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideLogin, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideCatatanTransaksi, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideDasbor, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideLaporanKeuangan, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideProfil, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideStok, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideTargetKeuangan, 1.0f, 40);
        setRoundedCorners((PanelRound) buttonGuideUtangPiutang, 1.0f, 40);

        //button back design
        setRoundedCorners((PanelRound) buttonBack0, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack1, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack2, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack3, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack4, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack5, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack6, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack7, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack8, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack9, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack10, 1.0f, 40);     
        setRoundedCorners((PanelRound) buttonBack11, 1.0f, 40);     

        //button next design
        setRoundedCorners((PanelRound) buttonNextCT1, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextCT2, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextUP1, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextUP2, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextS1, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextD1, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextLK1, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextTK1, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonNextP1, 1.0f, 20);

        //button previous design
        setRoundedCorners((PanelRound) buttonPreviousCT2, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonPreviousCT3, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonPreviousUP2, 1.0f, 20);
        setRoundedCorners((PanelRound) buttonPreviousUP3, 1.0f, 20);
        
    }

        private void setRoundedCorners(PanelRound panel, float opacity, int radius) {
        panel.setOpacity(opacity);
        panel.setRoundTopLeft(radius);
        panel.setRoundTopRight(radius);
        panel.setRoundBottomLeft(radius);
        panel.setRoundBottomRight(radius);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPanel = new com.kelompok4.design.PanelRound();
        panelGuideMain = new com.kelompok4.design.PanelRound();
        buttonBack = new com.kelompok4.design.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonGuideLogin = new com.kelompok4.design.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        buttonGuideCatatanTransaksi = new com.kelompok4.design.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        buttonGuideDasbor = new com.kelompok4.design.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        buttonGuideUtangPiutang = new com.kelompok4.design.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        buttonGuideStok = new com.kelompok4.design.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        buttonGuideLaporanKeuangan = new com.kelompok4.design.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        buttonGuideTargetKeuangan = new com.kelompok4.design.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        buttonGuideProfil = new com.kelompok4.design.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        panelGuideLogin1 = new com.kelompok4.design.PanelRound();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        buttonBack7 = new com.kelompok4.design.PanelRound();
        jLabel45 = new javax.swing.JLabel();
        buttonNextL1 = new com.kelompok4.design.PanelRound();
        jLabel46 = new javax.swing.JLabel();
        panelGuideDasbor1 = new com.kelompok4.design.PanelRound();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        buttonBack8 = new com.kelompok4.design.PanelRound();
        jLabel49 = new javax.swing.JLabel();
        buttonNextD1 = new com.kelompok4.design.PanelRound();
        jLabel50 = new javax.swing.JLabel();
        panelGuideCatatanTransaksi1 = new com.kelompok4.design.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonBack0 = new com.kelompok4.design.PanelRound();
        jLabel23 = new javax.swing.JLabel();
        buttonNextCT1 = new com.kelompok4.design.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        panelGuideCatatanTransaksi2 = new com.kelompok4.design.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonBack1 = new com.kelompok4.design.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        buttonNextCT2 = new com.kelompok4.design.PanelRound();
        jLabel21 = new javax.swing.JLabel();
        buttonPreviousCT2 = new com.kelompok4.design.PanelRound();
        jLabel22 = new javax.swing.JLabel();
        panelGuideCatatanTransaksi3 = new com.kelompok4.design.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonBack2 = new com.kelompok4.design.PanelRound();
        jLabel25 = new javax.swing.JLabel();
        buttonPreviousCT3 = new com.kelompok4.design.PanelRound();
        jLabel27 = new javax.swing.JLabel();
        panelGuideUtangPiutang1 = new com.kelompok4.design.PanelRound();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        buttonBack3 = new com.kelompok4.design.PanelRound();
        jLabel33 = new javax.swing.JLabel();
        buttonNextUP1 = new com.kelompok4.design.PanelRound();
        jLabel34 = new javax.swing.JLabel();
        panelGuideUtangPiutang2 = new com.kelompok4.design.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        buttonBack4 = new com.kelompok4.design.PanelRound();
        jLabel28 = new javax.swing.JLabel();
        buttonNextUP2 = new com.kelompok4.design.PanelRound();
        jLabel29 = new javax.swing.JLabel();
        buttonPreviousUP2 = new com.kelompok4.design.PanelRound();
        jLabel30 = new javax.swing.JLabel();
        panelGuideUtangPiutang3 = new com.kelompok4.design.PanelRound();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        buttonBack5 = new com.kelompok4.design.PanelRound();
        jLabel38 = new javax.swing.JLabel();
        buttonPreviousUP3 = new com.kelompok4.design.PanelRound();
        jLabel40 = new javax.swing.JLabel();
        panelGuideStok1 = new com.kelompok4.design.PanelRound();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        buttonBack6 = new com.kelompok4.design.PanelRound();
        jLabel41 = new javax.swing.JLabel();
        buttonNextS1 = new com.kelompok4.design.PanelRound();
        jLabel42 = new javax.swing.JLabel();
        panelGuideLaporanKeuangan1 = new com.kelompok4.design.PanelRound();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        buttonBack9 = new com.kelompok4.design.PanelRound();
        jLabel53 = new javax.swing.JLabel();
        buttonNextLK1 = new com.kelompok4.design.PanelRound();
        jLabel54 = new javax.swing.JLabel();
        panelGuideTargetKeuangan1 = new com.kelompok4.design.PanelRound();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        buttonBack10 = new com.kelompok4.design.PanelRound();
        jLabel57 = new javax.swing.JLabel();
        buttonNextTK1 = new com.kelompok4.design.PanelRound();
        jLabel58 = new javax.swing.JLabel();
        panelGuideProfil1 = new com.kelompok4.design.PanelRound();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        buttonBack11 = new com.kelompok4.design.PanelRound();
        jLabel61 = new javax.swing.JLabel();
        buttonNextP1 = new com.kelompok4.design.PanelRound();
        jLabel62 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(854, 480));
        setSize(new java.awt.Dimension(854, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        cardPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        cardPanel.setName(""); // NOI18N
        cardPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        cardPanel.setRequestFocusEnabled(false);
        cardPanel.setLayout(new java.awt.CardLayout());

        panelGuideMain.setBackground(new java.awt.Color(255, 255, 255));
        panelGuideMain.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelGuideMain.setMinimumSize(new java.awt.Dimension(1280, 720));
        panelGuideMain.setName(""); // NOI18N
        panelGuideMain.setRequestFocusEnabled(false);

        buttonBack.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBackMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("<");
        jLabel19.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBackLayout = new javax.swing.GroupLayout(buttonBack);
        buttonBack.setLayout(buttonBackLayout);
        buttonBackLayout.setHorizontalGroup(
            buttonBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBackLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBackLayout.setVerticalGroup(
            buttonBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBackLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Panduan Pengguna");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Memulai");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fitur");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonGuideLogin.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideLogin.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideLoginMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Login");
        jLabel11.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideLoginLayout = new javax.swing.GroupLayout(buttonGuideLogin);
        buttonGuideLogin.setLayout(buttonGuideLoginLayout);
        buttonGuideLoginLayout.setHorizontalGroup(
            buttonGuideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideLoginLayout.setVerticalGroup(
            buttonGuideLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideLoginLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        buttonGuideCatatanTransaksi.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideCatatanTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideCatatanTransaksi.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideCatatanTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideCatatanTransaksiMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Catatan Transaksi");
        jLabel12.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideCatatanTransaksiLayout = new javax.swing.GroupLayout(buttonGuideCatatanTransaksi);
        buttonGuideCatatanTransaksi.setLayout(buttonGuideCatatanTransaksiLayout);
        buttonGuideCatatanTransaksiLayout.setHorizontalGroup(
            buttonGuideCatatanTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideCatatanTransaksiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideCatatanTransaksiLayout.setVerticalGroup(
            buttonGuideCatatanTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideCatatanTransaksiLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        buttonGuideDasbor.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideDasbor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideDasbor.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideDasbor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideDasborMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Dasbor");
        jLabel13.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideDasborLayout = new javax.swing.GroupLayout(buttonGuideDasbor);
        buttonGuideDasbor.setLayout(buttonGuideDasborLayout);
        buttonGuideDasborLayout.setHorizontalGroup(
            buttonGuideDasborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideDasborLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideDasborLayout.setVerticalGroup(
            buttonGuideDasborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideDasborLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        buttonGuideUtangPiutang.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideUtangPiutang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideUtangPiutang.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideUtangPiutang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideUtangPiutangMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Utang/Piutang");
        jLabel14.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideUtangPiutangLayout = new javax.swing.GroupLayout(buttonGuideUtangPiutang);
        buttonGuideUtangPiutang.setLayout(buttonGuideUtangPiutangLayout);
        buttonGuideUtangPiutangLayout.setHorizontalGroup(
            buttonGuideUtangPiutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideUtangPiutangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideUtangPiutangLayout.setVerticalGroup(
            buttonGuideUtangPiutangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideUtangPiutangLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        buttonGuideStok.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideStok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideStok.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideStokMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Stok");
        jLabel15.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideStokLayout = new javax.swing.GroupLayout(buttonGuideStok);
        buttonGuideStok.setLayout(buttonGuideStokLayout);
        buttonGuideStokLayout.setHorizontalGroup(
            buttonGuideStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideStokLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideStokLayout.setVerticalGroup(
            buttonGuideStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideStokLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        buttonGuideLaporanKeuangan.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideLaporanKeuangan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideLaporanKeuangan.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideLaporanKeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideLaporanKeuanganMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Laporan Keuangan");
        jLabel16.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideLaporanKeuanganLayout = new javax.swing.GroupLayout(buttonGuideLaporanKeuangan);
        buttonGuideLaporanKeuangan.setLayout(buttonGuideLaporanKeuanganLayout);
        buttonGuideLaporanKeuanganLayout.setHorizontalGroup(
            buttonGuideLaporanKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideLaporanKeuanganLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideLaporanKeuanganLayout.setVerticalGroup(
            buttonGuideLaporanKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideLaporanKeuanganLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        buttonGuideTargetKeuangan.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideTargetKeuangan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideTargetKeuangan.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideTargetKeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideTargetKeuanganMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Target Keuangan");
        jLabel17.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideTargetKeuanganLayout = new javax.swing.GroupLayout(buttonGuideTargetKeuangan);
        buttonGuideTargetKeuangan.setLayout(buttonGuideTargetKeuanganLayout);
        buttonGuideTargetKeuanganLayout.setHorizontalGroup(
            buttonGuideTargetKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideTargetKeuanganLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideTargetKeuanganLayout.setVerticalGroup(
            buttonGuideTargetKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideTargetKeuanganLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        buttonGuideProfil.setBackground(new java.awt.Color(124, 195, 223));
        buttonGuideProfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuideProfil.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonGuideProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuideProfilMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Profil");
        jLabel18.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonGuideProfilLayout = new javax.swing.GroupLayout(buttonGuideProfil);
        buttonGuideProfil.setLayout(buttonGuideProfilLayout);
        buttonGuideProfilLayout.setHorizontalGroup(
            buttonGuideProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideProfilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonGuideProfilLayout.setVerticalGroup(
            buttonGuideProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonGuideProfilLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideMainLayout = new javax.swing.GroupLayout(panelGuideMain);
        panelGuideMain.setLayout(panelGuideMainLayout);
        panelGuideMainLayout.setHorizontalGroup(
            panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideMainLayout.createSequentialGroup()
                .addGroup(panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(681, Short.MAX_VALUE))
            .addGroup(panelGuideMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuideMainLayout.createSequentialGroup()
                        .addComponent(buttonGuideStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonGuideLaporanKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonGuideTargetKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGuideMainLayout.createSequentialGroup()
                        .addComponent(buttonGuideDasbor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonGuideLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelGuideMainLayout.createSequentialGroup()
                                .addComponent(buttonGuideCatatanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonGuideUtangPiutang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelGuideMainLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(buttonGuideProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideMainLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelGuideMainLayout.setVerticalGroup(
            panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideMainLayout.createSequentialGroup()
                .addGroup(panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuideMainLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGuideLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonGuideCatatanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGuideDasbor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGuideUtangPiutang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelGuideMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonGuideLaporanKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGuideTargetKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGuideStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(buttonGuideProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideMain, "card2");

        panelGuideLogin1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("<html>Login diperlukan untuk mengakses Aplikasi, gunakan email dan password yang terdaftar dan tekan tombol login. Gunakan email <b>admin</b> dan password <b>admin</b> jika pertama kali menggunakan aplikasi</html>");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideStok1.png"))); // NOI18N
        jLabel44.setText("jLabel5");

        buttonBack7.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack7.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack7MouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("<");
        jLabel45.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack7Layout = new javax.swing.GroupLayout(buttonBack7);
        buttonBack7.setLayout(buttonBack7Layout);
        buttonBack7Layout.setHorizontalGroup(
            buttonBack7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack7Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack7Layout.setVerticalGroup(
            buttonBack7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack7Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextL1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextL1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextL1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextL1MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("->");
        jLabel46.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextL1Layout = new javax.swing.GroupLayout(buttonNextL1);
        buttonNextL1.setLayout(buttonNextL1Layout);
        buttonNextL1Layout.setHorizontalGroup(
            buttonNextL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextL1Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextL1Layout.setVerticalGroup(
            buttonNextL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextL1Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideLogin1Layout = new javax.swing.GroupLayout(panelGuideLogin1);
        panelGuideLogin1.setLayout(panelGuideLogin1Layout);
        panelGuideLogin1Layout.setHorizontalGroup(
            panelGuideLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideLogin1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideLogin1Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideLogin1Layout.setVerticalGroup(
            panelGuideLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideLogin1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(buttonBack7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideLogin1, "card3");

        panelGuideDasbor1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("<html>Dasbor memiliki fungsi untuk menampilkan target keuangan dan laporan keuangan. Pilih periode waktu untuk target keuangan dan laporan keuangan yang sudah dibuat. </html>");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideStok1.png"))); // NOI18N
        jLabel48.setText("jLabel5");

        buttonBack8.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack8.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack8MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("<");
        jLabel49.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack8Layout = new javax.swing.GroupLayout(buttonBack8);
        buttonBack8.setLayout(buttonBack8Layout);
        buttonBack8Layout.setHorizontalGroup(
            buttonBack8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack8Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack8Layout.setVerticalGroup(
            buttonBack8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack8Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextD1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextD1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextD1MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("->");
        jLabel50.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextD1Layout = new javax.swing.GroupLayout(buttonNextD1);
        buttonNextD1.setLayout(buttonNextD1Layout);
        buttonNextD1Layout.setHorizontalGroup(
            buttonNextD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextD1Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextD1Layout.setVerticalGroup(
            buttonNextD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextD1Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideDasbor1Layout = new javax.swing.GroupLayout(panelGuideDasbor1);
        panelGuideDasbor1.setLayout(panelGuideDasbor1Layout);
        panelGuideDasbor1Layout.setHorizontalGroup(
            panelGuideDasbor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideDasbor1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideDasbor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideDasbor1Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideDasbor1Layout.setVerticalGroup(
            panelGuideDasbor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideDasbor1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideDasbor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(buttonBack8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideDasbor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideDasbor1, "card3");

        panelGuideCatatanTransaksi1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<html>Catatan Transaksi menampilkan sebuah tabel yang berisi Catatan Penjualan dan Pembelian. Catatan yang ditampilkan sudah diurutkan sesuai dengan tanggal terbaru Catatan tersebut ditambahkan.</html>");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideCatatanTransaksi2.png"))); // NOI18N
        jLabel7.setText("jLabel5");

        buttonBack0.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack0.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack0MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("<");
        jLabel23.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack0Layout = new javax.swing.GroupLayout(buttonBack0);
        buttonBack0.setLayout(buttonBack0Layout);
        buttonBack0Layout.setHorizontalGroup(
            buttonBack0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack0Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack0Layout.setVerticalGroup(
            buttonBack0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack0Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextCT1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextCT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextCT1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextCT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextCT1MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("->");
        jLabel24.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextCT1Layout = new javax.swing.GroupLayout(buttonNextCT1);
        buttonNextCT1.setLayout(buttonNextCT1Layout);
        buttonNextCT1Layout.setHorizontalGroup(
            buttonNextCT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextCT1Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextCT1Layout.setVerticalGroup(
            buttonNextCT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextCT1Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideCatatanTransaksi1Layout = new javax.swing.GroupLayout(panelGuideCatatanTransaksi1);
        panelGuideCatatanTransaksi1.setLayout(panelGuideCatatanTransaksi1Layout);
        panelGuideCatatanTransaksi1Layout.setHorizontalGroup(
            panelGuideCatatanTransaksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideCatatanTransaksi1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideCatatanTransaksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideCatatanTransaksi1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextCT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideCatatanTransaksi1Layout.setVerticalGroup(
            panelGuideCatatanTransaksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideCatatanTransaksi1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideCatatanTransaksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(buttonBack0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideCatatanTransaksi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextCT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideCatatanTransaksi1, "card3");

        panelGuideCatatanTransaksi2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("<html>Menekan tombol di Catatan Transaksi akan menampilkan Catatan Pembelian/Penjualan secara lengkap. Serta terdapat opsi untuk menambah, mengedit, dan menghapus Catatan Pembelian/Penjualan.</html>");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideCatatanTransaksi2.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        buttonBack1.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack1MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("<");
        jLabel20.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack1Layout = new javax.swing.GroupLayout(buttonBack1);
        buttonBack1.setLayout(buttonBack1Layout);
        buttonBack1Layout.setHorizontalGroup(
            buttonBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack1Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack1Layout.setVerticalGroup(
            buttonBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack1Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextCT2.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextCT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextCT2.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextCT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextCT2MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("->");
        jLabel21.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextCT2Layout = new javax.swing.GroupLayout(buttonNextCT2);
        buttonNextCT2.setLayout(buttonNextCT2Layout);
        buttonNextCT2Layout.setHorizontalGroup(
            buttonNextCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextCT2Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextCT2Layout.setVerticalGroup(
            buttonNextCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextCT2Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonPreviousCT2.setBackground(new java.awt.Color(124, 195, 223));
        buttonPreviousCT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPreviousCT2.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonPreviousCT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPreviousCT2MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("<-");
        jLabel22.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonPreviousCT2Layout = new javax.swing.GroupLayout(buttonPreviousCT2);
        buttonPreviousCT2.setLayout(buttonPreviousCT2Layout);
        buttonPreviousCT2Layout.setHorizontalGroup(
            buttonPreviousCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousCT2Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonPreviousCT2Layout.setVerticalGroup(
            buttonPreviousCT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousCT2Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideCatatanTransaksi2Layout = new javax.swing.GroupLayout(panelGuideCatatanTransaksi2);
        panelGuideCatatanTransaksi2.setLayout(panelGuideCatatanTransaksi2Layout);
        panelGuideCatatanTransaksi2Layout.setHorizontalGroup(
            panelGuideCatatanTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideCatatanTransaksi2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelGuideCatatanTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousCT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGuideCatatanTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideCatatanTransaksi2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextCT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideCatatanTransaksi2Layout.setVerticalGroup(
            panelGuideCatatanTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideCatatanTransaksi2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideCatatanTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(buttonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideCatatanTransaksi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextCT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousCT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideCatatanTransaksi2, "card3");

        panelGuideCatatanTransaksi3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>Menambah/mengedit Catatan Pembelian/Penjualan akan mengeluarkan jendela untuk mengisi data yang diperlukan.</html>");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideCatatanTransaksi3.png"))); // NOI18N
        jLabel9.setText("jLabel5");

        buttonBack2.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack2.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack2MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("<");
        jLabel25.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack2Layout = new javax.swing.GroupLayout(buttonBack2);
        buttonBack2.setLayout(buttonBack2Layout);
        buttonBack2Layout.setHorizontalGroup(
            buttonBack2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack2Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack2Layout.setVerticalGroup(
            buttonBack2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack2Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonPreviousCT3.setBackground(new java.awt.Color(124, 195, 223));
        buttonPreviousCT3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPreviousCT3.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonPreviousCT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPreviousCT3MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("<-");
        jLabel27.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonPreviousCT3Layout = new javax.swing.GroupLayout(buttonPreviousCT3);
        buttonPreviousCT3.setLayout(buttonPreviousCT3Layout);
        buttonPreviousCT3Layout.setHorizontalGroup(
            buttonPreviousCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousCT3Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonPreviousCT3Layout.setVerticalGroup(
            buttonPreviousCT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousCT3Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideCatatanTransaksi3Layout = new javax.swing.GroupLayout(panelGuideCatatanTransaksi3);
        panelGuideCatatanTransaksi3.setLayout(panelGuideCatatanTransaksi3Layout);
        panelGuideCatatanTransaksi3Layout.setHorizontalGroup(
            panelGuideCatatanTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideCatatanTransaksi3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelGuideCatatanTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBack2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousCT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGuideCatatanTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideCatatanTransaksi3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideCatatanTransaksi3Layout.setVerticalGroup(
            panelGuideCatatanTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideCatatanTransaksi3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideCatatanTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(buttonBack2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideCatatanTransaksi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousCT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideCatatanTransaksi3, "card3");

        panelGuideUtangPiutang1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("<html>Utang/Piutang menampilkan tabel yang berisi data Utang dan Piutang yang diurutkan berdasarkan tanggal terbaru. Menekan tombol Utang/Piutang akan menampilkan data Utang/Piutang secara spesifik.</html>");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideCatatanTransaksi2.png"))); // NOI18N
        jLabel32.setText("jLabel5");

        buttonBack3.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack3.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack3MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("<");
        jLabel33.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack3Layout = new javax.swing.GroupLayout(buttonBack3);
        buttonBack3.setLayout(buttonBack3Layout);
        buttonBack3Layout.setHorizontalGroup(
            buttonBack3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack3Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack3Layout.setVerticalGroup(
            buttonBack3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack3Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextUP1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextUP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextUP1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextUP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextUP1MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("->");
        jLabel34.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextUP1Layout = new javax.swing.GroupLayout(buttonNextUP1);
        buttonNextUP1.setLayout(buttonNextUP1Layout);
        buttonNextUP1Layout.setHorizontalGroup(
            buttonNextUP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextUP1Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextUP1Layout.setVerticalGroup(
            buttonNextUP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextUP1Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideUtangPiutang1Layout = new javax.swing.GroupLayout(panelGuideUtangPiutang1);
        panelGuideUtangPiutang1.setLayout(panelGuideUtangPiutang1Layout);
        panelGuideUtangPiutang1Layout.setHorizontalGroup(
            panelGuideUtangPiutang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideUtangPiutang1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideUtangPiutang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideUtangPiutang1Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextUP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideUtangPiutang1Layout.setVerticalGroup(
            panelGuideUtangPiutang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideUtangPiutang1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideUtangPiutang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(buttonBack3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideUtangPiutang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextUP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideUtangPiutang1, "card3");

        panelGuideUtangPiutang2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("<html>Setelah menekan tombol Utang/Piutang terdapat tombol untuk tambah, edit, dan hapus Utang/Piutang. Pilih data yang ingin dihapus/diedit pada tabel lalu tekan tombol Edit/Hapus.</html>");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideUtangPiutang2.png"))); // NOI18N
        jLabel26.setText("jLabel5");

        buttonBack4.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack4.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack4MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("<");
        jLabel28.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack4Layout = new javax.swing.GroupLayout(buttonBack4);
        buttonBack4.setLayout(buttonBack4Layout);
        buttonBack4Layout.setHorizontalGroup(
            buttonBack4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack4Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack4Layout.setVerticalGroup(
            buttonBack4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack4Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextUP2.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextUP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextUP2.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextUP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextUP2MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("->");
        jLabel29.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextUP2Layout = new javax.swing.GroupLayout(buttonNextUP2);
        buttonNextUP2.setLayout(buttonNextUP2Layout);
        buttonNextUP2Layout.setHorizontalGroup(
            buttonNextUP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextUP2Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextUP2Layout.setVerticalGroup(
            buttonNextUP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextUP2Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonPreviousUP2.setBackground(new java.awt.Color(124, 195, 223));
        buttonPreviousUP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPreviousUP2.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonPreviousUP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPreviousUP2MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("<-");
        jLabel30.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonPreviousUP2Layout = new javax.swing.GroupLayout(buttonPreviousUP2);
        buttonPreviousUP2.setLayout(buttonPreviousUP2Layout);
        buttonPreviousUP2Layout.setHorizontalGroup(
            buttonPreviousUP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousUP2Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonPreviousUP2Layout.setVerticalGroup(
            buttonPreviousUP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousUP2Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideUtangPiutang2Layout = new javax.swing.GroupLayout(panelGuideUtangPiutang2);
        panelGuideUtangPiutang2.setLayout(panelGuideUtangPiutang2Layout);
        panelGuideUtangPiutang2Layout.setHorizontalGroup(
            panelGuideUtangPiutang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideUtangPiutang2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelGuideUtangPiutang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBack4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousUP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGuideUtangPiutang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideUtangPiutang2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextUP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideUtangPiutang2Layout.setVerticalGroup(
            panelGuideUtangPiutang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideUtangPiutang2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideUtangPiutang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(buttonBack4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideUtangPiutang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextUP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousUP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideUtangPiutang2, "card3");

        panelGuideUtangPiutang3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("<html>Menambah atau Mengedit Utang/Piutang akan menampilkan jendela untuk mengisi data, masukkan data sesuai yang diinginkan.</html>");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideUtangPiutang3.png"))); // NOI18N
        jLabel37.setText("jLabel5");

        buttonBack5.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack5.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack5MouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("<");
        jLabel38.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack5Layout = new javax.swing.GroupLayout(buttonBack5);
        buttonBack5.setLayout(buttonBack5Layout);
        buttonBack5Layout.setHorizontalGroup(
            buttonBack5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack5Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack5Layout.setVerticalGroup(
            buttonBack5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack5Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonPreviousUP3.setBackground(new java.awt.Color(124, 195, 223));
        buttonPreviousUP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPreviousUP3.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonPreviousUP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPreviousUP3MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("<-");
        jLabel40.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonPreviousUP3Layout = new javax.swing.GroupLayout(buttonPreviousUP3);
        buttonPreviousUP3.setLayout(buttonPreviousUP3Layout);
        buttonPreviousUP3Layout.setHorizontalGroup(
            buttonPreviousUP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousUP3Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonPreviousUP3Layout.setVerticalGroup(
            buttonPreviousUP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPreviousUP3Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideUtangPiutang3Layout = new javax.swing.GroupLayout(panelGuideUtangPiutang3);
        panelGuideUtangPiutang3.setLayout(panelGuideUtangPiutang3Layout);
        panelGuideUtangPiutang3Layout.setHorizontalGroup(
            panelGuideUtangPiutang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideUtangPiutang3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelGuideUtangPiutang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBack5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousUP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGuideUtangPiutang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideUtangPiutang3Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideUtangPiutang3Layout.setVerticalGroup(
            panelGuideUtangPiutang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideUtangPiutang3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideUtangPiutang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(buttonBack5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideUtangPiutang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPreviousUP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideUtangPiutang3, "card3");

        panelGuideStok1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("<html>Stok barang menampilkan sebuah tabel yang berisi data Stok barang yang ditambahkan. Serta opsi untuk menambah, mengedit, dan menghapus Stok barang</html>");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideStok1.png"))); // NOI18N
        jLabel39.setText("jLabel5");

        buttonBack6.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack6.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack6MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("<");
        jLabel41.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack6Layout = new javax.swing.GroupLayout(buttonBack6);
        buttonBack6.setLayout(buttonBack6Layout);
        buttonBack6Layout.setHorizontalGroup(
            buttonBack6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack6Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack6Layout.setVerticalGroup(
            buttonBack6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack6Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextS1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextS1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextS1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextS1MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("->");
        jLabel42.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextS1Layout = new javax.swing.GroupLayout(buttonNextS1);
        buttonNextS1.setLayout(buttonNextS1Layout);
        buttonNextS1Layout.setHorizontalGroup(
            buttonNextS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextS1Layout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextS1Layout.setVerticalGroup(
            buttonNextS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextS1Layout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideStok1Layout = new javax.swing.GroupLayout(panelGuideStok1);
        panelGuideStok1.setLayout(panelGuideStok1Layout);
        panelGuideStok1Layout.setHorizontalGroup(
            panelGuideStok1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideStok1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideStok1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideStok1Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideStok1Layout.setVerticalGroup(
            panelGuideStok1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideStok1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideStok1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(buttonBack6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideStok1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideStok1, "card3");

        panelGuideLaporanKeuangan1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("<html>Laporan Keuangan akan menampilkan informasi seputar keuangan sesuai tanggal yang diinginkan. </html>");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideStok1.png"))); // NOI18N
        jLabel52.setText("jLabel5");

        buttonBack9.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack9.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack9MouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("<");
        jLabel53.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack9Layout = new javax.swing.GroupLayout(buttonBack9);
        buttonBack9.setLayout(buttonBack9Layout);
        buttonBack9Layout.setHorizontalGroup(
            buttonBack9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack9Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack9Layout.setVerticalGroup(
            buttonBack9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack9Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextLK1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextLK1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextLK1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextLK1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextLK1MouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("->");
        jLabel54.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextLK1Layout = new javax.swing.GroupLayout(buttonNextLK1);
        buttonNextLK1.setLayout(buttonNextLK1Layout);
        buttonNextLK1Layout.setHorizontalGroup(
            buttonNextLK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextLK1Layout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextLK1Layout.setVerticalGroup(
            buttonNextLK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextLK1Layout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideLaporanKeuangan1Layout = new javax.swing.GroupLayout(panelGuideLaporanKeuangan1);
        panelGuideLaporanKeuangan1.setLayout(panelGuideLaporanKeuangan1Layout);
        panelGuideLaporanKeuangan1Layout.setHorizontalGroup(
            panelGuideLaporanKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideLaporanKeuangan1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideLaporanKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideLaporanKeuangan1Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextLK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideLaporanKeuangan1Layout.setVerticalGroup(
            panelGuideLaporanKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideLaporanKeuangan1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideLaporanKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(buttonBack9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideLaporanKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextLK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideLaporanKeuangan1, "card3");

        panelGuideTargetKeuangan1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("<html>Target Keuangan melacak penghasilan/pengeluaran dalam bisnis pada periode yang diinginkan.</html>");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideStok1.png"))); // NOI18N
        jLabel56.setText("jLabel5");

        buttonBack10.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack10.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack10MouseClicked(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("<");
        jLabel57.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack10Layout = new javax.swing.GroupLayout(buttonBack10);
        buttonBack10.setLayout(buttonBack10Layout);
        buttonBack10Layout.setHorizontalGroup(
            buttonBack10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack10Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack10Layout.setVerticalGroup(
            buttonBack10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack10Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextTK1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextTK1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextTK1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextTK1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextTK1MouseClicked(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("->");
        jLabel58.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextTK1Layout = new javax.swing.GroupLayout(buttonNextTK1);
        buttonNextTK1.setLayout(buttonNextTK1Layout);
        buttonNextTK1Layout.setHorizontalGroup(
            buttonNextTK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextTK1Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextTK1Layout.setVerticalGroup(
            buttonNextTK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextTK1Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideTargetKeuangan1Layout = new javax.swing.GroupLayout(panelGuideTargetKeuangan1);
        panelGuideTargetKeuangan1.setLayout(panelGuideTargetKeuangan1Layout);
        panelGuideTargetKeuangan1Layout.setHorizontalGroup(
            panelGuideTargetKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideTargetKeuangan1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideTargetKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideTargetKeuangan1Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextTK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideTargetKeuangan1Layout.setVerticalGroup(
            panelGuideTargetKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideTargetKeuangan1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideTargetKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(buttonBack10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideTargetKeuangan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextTK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideTargetKeuangan1, "card3");

        panelGuideProfil1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("<html>Profil menampilkan informasi pengguna serta opsi untuk mengedit informasi tersebut.</html>");

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panduan/imageGuideStok1.png"))); // NOI18N
        jLabel60.setText("jLabel5");

        buttonBack11.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack11.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBack11MouseClicked(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("<");
        jLabel61.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonBack11Layout = new javax.swing.GroupLayout(buttonBack11);
        buttonBack11.setLayout(buttonBack11Layout);
        buttonBack11Layout.setHorizontalGroup(
            buttonBack11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack11Layout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonBack11Layout.setVerticalGroup(
            buttonBack11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBack11Layout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonNextP1.setBackground(new java.awt.Color(124, 195, 223));
        buttonNextP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNextP1.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonNextP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextP1MouseClicked(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("->");
        jLabel62.setAlignmentX(0.5F);

        javax.swing.GroupLayout buttonNextP1Layout = new javax.swing.GroupLayout(buttonNextP1);
        buttonNextP1.setLayout(buttonNextP1Layout);
        buttonNextP1Layout.setHorizontalGroup(
            buttonNextP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextP1Layout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        buttonNextP1Layout.setVerticalGroup(
            buttonNextP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonNextP1Layout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGuideProfil1Layout = new javax.swing.GroupLayout(panelGuideProfil1);
        panelGuideProfil1.setLayout(panelGuideProfil1Layout);
        panelGuideProfil1Layout.setHorizontalGroup(
            panelGuideProfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideProfil1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonBack11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuideProfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideProfil1Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNextP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelGuideProfil1Layout.setVerticalGroup(
            panelGuideProfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideProfil1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelGuideProfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(buttonBack11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelGuideProfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNextP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cardPanel.add(panelGuideProfil1, "card3");

        getContentPane().add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 600, 400));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setName(""); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGuideLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideLoginMouseClicked
        System.out.println("login");
    }//GEN-LAST:event_buttonGuideLoginMouseClicked

    private void buttonGuideCatatanTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideCatatanTransaksiMouseClicked
        cardLayout.show(cardPanel, "Catatan Transaksi 1");
    }//GEN-LAST:event_buttonGuideCatatanTransaksiMouseClicked

    private void buttonGuideDasborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideDasborMouseClicked
        cardLayout.show(cardPanel, "Dasbor 1");        
    }//GEN-LAST:event_buttonGuideDasborMouseClicked

    private void buttonGuideUtangPiutangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideUtangPiutangMouseClicked
        cardLayout.show(cardPanel, "Utang Piutang 1");
    }//GEN-LAST:event_buttonGuideUtangPiutangMouseClicked

    private void buttonGuideStokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideStokMouseClicked
        cardLayout.show(cardPanel, "Stok 1");        
    }//GEN-LAST:event_buttonGuideStokMouseClicked

    private void buttonGuideLaporanKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideLaporanKeuanganMouseClicked
        cardLayout.show(cardPanel, "Laporan Keuangan 1");        
    }//GEN-LAST:event_buttonGuideLaporanKeuanganMouseClicked

    private void buttonGuideTargetKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideTargetKeuanganMouseClicked
        cardLayout.show(cardPanel, "Target Keuangan 1");        
    }//GEN-LAST:event_buttonGuideTargetKeuanganMouseClicked

    private void buttonGuideProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuideProfilMouseClicked
        cardLayout.show(cardPanel, "Profil 1");        
    }//GEN-LAST:event_buttonGuideProfilMouseClicked

    private void buttonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBackMouseClicked
        cardLayout.show(cardPanel, "Main");                
    }//GEN-LAST:event_buttonBackMouseClicked

    private void buttonBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack1MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack1MouseClicked

    private void buttonNextCT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextCT2MouseClicked
        cardLayout.show(cardPanel, "Catatan Transaksi 3");        
        
    }//GEN-LAST:event_buttonNextCT2MouseClicked

    private void buttonPreviousCT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousCT2MouseClicked
        cardLayout.show(cardPanel, "Catatan Transaksi 1");                
    }//GEN-LAST:event_buttonPreviousCT2MouseClicked

    private void buttonBack0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack0MouseClicked
        cardLayout.show(cardPanel, "Main");
    }//GEN-LAST:event_buttonBack0MouseClicked

    private void buttonNextCT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextCT1MouseClicked
        cardLayout.show(cardPanel, "Catatan Transaksi 2");        
    }//GEN-LAST:event_buttonNextCT1MouseClicked

    private void buttonBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack2MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack2MouseClicked

    private void buttonPreviousCT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousCT3MouseClicked
        cardLayout.show(cardPanel, "Catatan Transaksi 2");        
    }//GEN-LAST:event_buttonPreviousCT3MouseClicked

    private void buttonBack4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack4MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack4MouseClicked

    private void buttonNextUP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextUP2MouseClicked
        cardLayout.show(cardPanel, "Utang Piutang 3");        
    }//GEN-LAST:event_buttonNextUP2MouseClicked

    private void buttonPreviousUP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousUP2MouseClicked
        cardLayout.show(cardPanel, "Utang Piutang 1");        
    }//GEN-LAST:event_buttonPreviousUP2MouseClicked

    private void buttonBack3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack3MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack3MouseClicked

    private void buttonNextUP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextUP1MouseClicked
        cardLayout.show(cardPanel, "Utang Piutang 2");        
    }//GEN-LAST:event_buttonNextUP1MouseClicked

    private void buttonBack5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack5MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack5MouseClicked

    private void buttonPreviousUP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousUP3MouseClicked
        cardLayout.show(cardPanel, "Utang Piutang 2");        
    }//GEN-LAST:event_buttonPreviousUP3MouseClicked

    private void buttonBack6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack6MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack6MouseClicked

    private void buttonNextS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextS1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNextS1MouseClicked

    private void buttonBack7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack7MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack7MouseClicked

    private void buttonNextL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextL1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNextL1MouseClicked

    private void buttonBack8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack8MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack8MouseClicked

    private void buttonNextD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextD1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNextD1MouseClicked

    private void buttonBack9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack9MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack9MouseClicked

    private void buttonNextLK1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextLK1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNextLK1MouseClicked

    private void buttonBack10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack10MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack10MouseClicked

    private void buttonNextTK1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextTK1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNextTK1MouseClicked

    private void buttonBack11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBack11MouseClicked
        cardLayout.show(cardPanel, "Main");        
    }//GEN-LAST:event_buttonBack11MouseClicked

    private void buttonNextP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonNextP1MouseClicked

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
            java.util.logging.Logger.getLogger(PanduanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanduanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanduanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanduanPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanduanPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel buttonBack;
    private javax.swing.JPanel buttonBack0;
    private javax.swing.JPanel buttonBack1;
    private javax.swing.JPanel buttonBack10;
    private javax.swing.JPanel buttonBack11;
    private javax.swing.JPanel buttonBack2;
    private javax.swing.JPanel buttonBack3;
    private javax.swing.JPanel buttonBack4;
    private javax.swing.JPanel buttonBack5;
    private javax.swing.JPanel buttonBack6;
    private javax.swing.JPanel buttonBack7;
    private javax.swing.JPanel buttonBack8;
    private javax.swing.JPanel buttonBack9;
    private javax.swing.JPanel buttonGuideCatatanTransaksi;
    private javax.swing.JPanel buttonGuideDasbor;
    private javax.swing.JPanel buttonGuideLaporanKeuangan;
    private javax.swing.JPanel buttonGuideLogin;
    private javax.swing.JPanel buttonGuideProfil;
    private javax.swing.JPanel buttonGuideStok;
    private javax.swing.JPanel buttonGuideTargetKeuangan;
    private javax.swing.JPanel buttonGuideUtangPiutang;
    private javax.swing.JPanel buttonNextCT1;
    private javax.swing.JPanel buttonNextCT2;
    private javax.swing.JPanel buttonNextD1;
    private javax.swing.JPanel buttonNextL1;
    private javax.swing.JPanel buttonNextLK1;
    private javax.swing.JPanel buttonNextP1;
    private javax.swing.JPanel buttonNextS1;
    private javax.swing.JPanel buttonNextTK1;
    private javax.swing.JPanel buttonNextUP1;
    private javax.swing.JPanel buttonNextUP2;
    private javax.swing.JPanel buttonPreviousCT2;
    private javax.swing.JPanel buttonPreviousCT3;
    private javax.swing.JPanel buttonPreviousUP2;
    private javax.swing.JPanel buttonPreviousUP3;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelGuideCatatanTransaksi1;
    private javax.swing.JPanel panelGuideCatatanTransaksi2;
    private javax.swing.JPanel panelGuideCatatanTransaksi3;
    private javax.swing.JPanel panelGuideDasbor1;
    private javax.swing.JPanel panelGuideLaporanKeuangan1;
    private javax.swing.JPanel panelGuideLogin1;
    private javax.swing.JPanel panelGuideMain;
    private javax.swing.JPanel panelGuideProfil1;
    private javax.swing.JPanel panelGuideStok1;
    private javax.swing.JPanel panelGuideTargetKeuangan1;
    private javax.swing.JPanel panelGuideUtangPiutang1;
    private javax.swing.JPanel panelGuideUtangPiutang2;
    private javax.swing.JPanel panelGuideUtangPiutang3;
    // End of variables declaration//GEN-END:variables
}
