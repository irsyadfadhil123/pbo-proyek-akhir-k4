/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;

import com.kelompok4.design.PanelRound;
import com.kelompok4.pboprojectakhir.Database;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Irsyad Fadhil
 */
public class EditPiutang extends javax.swing.JFrame {
    private int id_piutang;

    /**
     * Creates new form landingPage
     */
    public EditPiutang() {
        setTitle("Artha: Aplikasi Keuangan Bisnis");
        initComponents();
        dataSupplier();
        setLocationRelativeTo(null);
        setResizable(false);
        
        ((PanelRound) panelContent).setOpacity(0.7f);
        ((PanelRound) panelContent).setRoundTopLeft(40);
        ((PanelRound) panelContent).setRoundTopRight(40);
        ((PanelRound) panelContent).setRoundBottomLeft(40);
        ((PanelRound) panelContent).setRoundBottomRight(40);
        
        ((PanelRound) buttonEdit).setRoundTopLeft(40);
        ((PanelRound) buttonEdit).setRoundTopRight(40);
        ((PanelRound) buttonEdit).setRoundBottomLeft(40);
        ((PanelRound) buttonEdit).setRoundBottomRight(40);
        
        ((PanelRound) buttonBack).setRoundTopLeft(40);
        ((PanelRound) buttonBack).setRoundTopRight(40);
        ((PanelRound) buttonBack).setRoundBottomLeft(40);
        ((PanelRound) buttonBack).setRoundBottomRight(40);
    }
    
        public EditPiutang(int id_piutang) {
        this.id_piutang = id_piutang;
        setTitle("Artha: Aplikasi Keuangan Bisnis");
        initComponents();
        dataSupplier();
        dataUtang(id_piutang);
        setLocationRelativeTo(null);
        setResizable(false);
        
        ((PanelRound) panelContent).setOpacity(0.7f);
        ((PanelRound) panelContent).setRoundTopLeft(40);
        ((PanelRound) panelContent).setRoundTopRight(40);
        ((PanelRound) panelContent).setRoundBottomLeft(40);
        ((PanelRound) panelContent).setRoundBottomRight(40);
        
        ((PanelRound) buttonEdit).setRoundTopLeft(40);
        ((PanelRound) buttonEdit).setRoundTopRight(40);
        ((PanelRound) buttonEdit).setRoundBottomLeft(40);
        ((PanelRound) buttonEdit).setRoundBottomRight(40);
        
        ((PanelRound) buttonBack).setRoundTopLeft(40);
        ((PanelRound) buttonBack).setRoundTopRight(40);
        ((PanelRound) buttonBack).setRoundBottomLeft(40);
        ((PanelRound) buttonBack).setRoundBottomRight(40);

    }
    
        private void dataUtang(int id_piutang) {
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM piutang WHERE id_piutang = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id_piutang);
            
            ResultSet rs = stm.executeQuery();
            
            if (rs.next()) {
                Date tanggal = rs.getDate("tanggal");
                int id_pelanggan = rs.getInt("id_pelanggan");
                String jumlah_piutang = Integer.toString(rs.getInt("jumlah"));
                String catatan = rs.getString("catatan");
                
                String sql2 = "SELECT nama_pelanggan FROM pelanggan WHERE id_pelanggan = ?";
                PreparedStatement stm2 = conn.prepareStatement(sql2);
                stm2.setInt(1, id_pelanggan);
                
                ResultSet rs2 = stm2.executeQuery();
                
                if (rs2.next()) {
                    String nama_pelanggan = rs2.getString("nama_pelanggan");
                    inputNamaPelanggan.setSelectedItem(nama_pelanggan);
                }
                
                inputTanggal.setDate(tanggal);
                inputJumlahPiutang.setText(jumlah_piutang);
                inputCatatan.setText(catatan);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());            
        }
    }

    
    private void dataSupplier () {
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT nama_pelanggan FROM pelanggan";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet resultSet = stm.executeQuery();
            
            ArrayList<String> data = new ArrayList<>();
            while (resultSet.next()) {
                String namaPelanggan = resultSet.getString("nama_pelanggan");
                data.add(namaPelanggan);
            }
            
            String[] dataArray = data.toArray(new String[0]);
            
            for (String item : dataArray) {
                inputNamaPelanggan.addItem(item);
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

        panelContent = new com.kelompok4.design.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputJumlahPiutang = new javax.swing.JTextField();
        inputCatatan = new javax.swing.JTextField();
        inputNamaPelanggan = new javax.swing.JComboBox<>();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        buttonEdit = new com.kelompok4.design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        backbutton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        buttonBack = new com.kelompok4.design.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        toDasborButton = new javax.swing.JButton();
        toCatatanTransaksiButton = new javax.swing.JButton();
        toUtangPiutangButton = new javax.swing.JButton();
        toStokButton = new javax.swing.JButton();
        toProfilButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(854, 480));
        setSize(new java.awt.Dimension(854, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Pelanggan:");
        panelContent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 113, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setLabelFor(inputTanggal);
        jLabel3.setText("Tanggal:");
        panelContent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 70, 75, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Jumlah Piutang:");
        panelContent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 156, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Catatan:");
        panelContent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 199, 129, -1));

        inputJumlahPiutang.setBackground(new java.awt.Color(255, 255, 255));
        inputJumlahPiutang.setForeground(new java.awt.Color(0, 0, 0));
        panelContent.add(inputJumlahPiutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 156, 447, 25));

        inputCatatan.setBackground(new java.awt.Color(255, 255, 255));
        inputCatatan.setForeground(new java.awt.Color(0, 0, 0));
        panelContent.add(inputCatatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 199, 447, 25));

        inputNamaPelanggan.setBackground(new java.awt.Color(255, 255, 255));
        inputNamaPelanggan.setForeground(new java.awt.Color(0, 0, 0));
        inputNamaPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        inputNamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaPelangganActionPerformed(evt);
            }
        });
        panelContent.add(inputNamaPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 113, 447, 25));

        inputTanggal.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.add(inputTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 70, 447, -1));

        buttonEdit.setBackground(new java.awt.Color(124, 195, 223));
        buttonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEdit.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonEdit.setPreferredSize(new java.awt.Dimension(210, 38));
        buttonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Edit");

        javax.swing.GroupLayout buttonEditLayout = new javax.swing.GroupLayout(buttonEdit);
        buttonEdit.setLayout(buttonEditLayout);
        buttonEditLayout.setHorizontalGroup(
            buttonEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonEditLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel9)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        buttonEditLayout.setVerticalGroup(
            buttonEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonEditLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        panelContent.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 311, -1, -1));

        backbutton.setBackground(new java.awt.Color(255, 255, 255));
        backbutton.setOpaque(false);
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });
        backbutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Edit Piutang");
        backbutton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, 20));

        buttonBack.setBackground(new java.awt.Color(124, 195, 223));
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBackMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("<");
        jLabel19.setAlignmentX(0.5F);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

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

        backbutton.add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelContent.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 50));

        getContentPane().add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 740, 380));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Artha");

        toDasborButton.setBackground(new java.awt.Color(255, 255, 255));
        toDasborButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toDasborButton.setForeground(new java.awt.Color(0, 0, 0));
        toDasborButton.setText("Dasbor");
        toDasborButton.setBorder(null);
        toDasborButton.setBorderPainted(false);

        toDasborButton.setContentAreaFilled(false);

        toDasborButton.setFocusPainted(false);

        toDasborButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toDasborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDasborButtonActionPerformed(evt);
            }
        });

        toCatatanTransaksiButton.setBackground(new java.awt.Color(255, 255, 255));
        toCatatanTransaksiButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toCatatanTransaksiButton.setForeground(new java.awt.Color(0, 0, 0));
        toCatatanTransaksiButton.setText("Catatan Transaksi");
        toCatatanTransaksiButton.setBorder(null);
        toCatatanTransaksiButton.setBorderPainted(false);

        toCatatanTransaksiButton.setContentAreaFilled(false);

        toCatatanTransaksiButton.setFocusPainted(false);

        toCatatanTransaksiButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toCatatanTransaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCatatanTransaksiButtonActionPerformed(evt);
            }
        });

        toUtangPiutangButton.setBackground(new java.awt.Color(255, 255, 255));
        toUtangPiutangButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toUtangPiutangButton.setForeground(new java.awt.Color(0, 0, 0));
        toUtangPiutangButton.setText("Utang/Piutang");
        toUtangPiutangButton.setBorder(null);
        toUtangPiutangButton.setBorderPainted(false);

        toUtangPiutangButton.setContentAreaFilled(false);

        toUtangPiutangButton.setFocusPainted(false);

        toUtangPiutangButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toUtangPiutangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUtangPiutangButtonActionPerformed(evt);
            }
        });

        toStokButton.setBackground(new java.awt.Color(255, 255, 255));
        toStokButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toStokButton.setForeground(new java.awt.Color(0, 0, 0));
        toStokButton.setText("Stok");
        toStokButton.setBorder(null);
        toStokButton.setBorderPainted(false);

        toStokButton.setContentAreaFilled(false);

        toStokButton.setFocusPainted(false);

        toStokButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toStokButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStokButtonActionPerformed(evt);
            }
        });

        toProfilButton.setBackground(new java.awt.Color(255, 255, 255));
        toProfilButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toProfilButton.setForeground(new java.awt.Color(0, 0, 0));
        toProfilButton.setText("Profil");
        toProfilButton.setBorder(null);
        toProfilButton.setBorderPainted(false);

        toProfilButton.setContentAreaFilled(false);

        toProfilButton.setFocusPainted(false);

        toProfilButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toProfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toProfilButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(toDasborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(toCatatanTransaksiButton)
                .addGap(36, 36, 36)
                .addComponent(toUtangPiutangButton)
                .addGap(36, 36, 36)
                .addComponent(toStokButton)
                .addGap(36, 36, 36)
                .addComponent(toProfilButton)
                .addGap(0, 451, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toDasborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toCatatanTransaksiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toUtangPiutangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toStokButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toProfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(681, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 854, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Background.setName(""); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toDasborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDasborButtonActionPerformed
        dispose();
        Dasbor dasborFrame = new Dasbor();
        dasborFrame.setVisible(true);
    }//GEN-LAST:event_toDasborButtonActionPerformed

    private void toCatatanTransaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCatatanTransaksiButtonActionPerformed
        dispose();
        CatatanTransaksi catatanTransaksiFrame = new CatatanTransaksi();
        catatanTransaksiFrame.setVisible(true);
    }//GEN-LAST:event_toCatatanTransaksiButtonActionPerformed

    private void toUtangPiutangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUtangPiutangButtonActionPerformed
        dispose();
        UtangPiutang utangpiutangFrame = new UtangPiutang();
        utangpiutangFrame.setVisible(true);
    }//GEN-LAST:event_toUtangPiutangButtonActionPerformed

    private void toStokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStokButtonActionPerformed
        dispose();
        Stok stokFrame = new Stok();
        stokFrame.setVisible(true);
    }//GEN-LAST:event_toStokButtonActionPerformed

    private void toProfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toProfilButtonActionPerformed
        dispose();
        Profil stokFrame = new Profil();
        stokFrame.setVisible(true);
    }//GEN-LAST:event_toProfilButtonActionPerformed

    private void inputNamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaPelangganActionPerformed
    }//GEN-LAST:event_inputNamaPelangganActionPerformed

    private void buttonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseClicked
        String tanggal = null;
        if (inputTanggal.getDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tanggal = sdf.format(inputTanggal.getDate());
        }
        
        String nama_pelanggan = null;
        if ((String) inputNamaPelanggan.getSelectedItem() != null) {
            nama_pelanggan = (String) inputNamaPelanggan.getSelectedItem();
        }
        
        String jumlah_piutang_str = inputJumlahPiutang.getText();
        
        String catatan = null;
        if (inputCatatan.getText() != null) {
            catatan = inputCatatan.getText();            
        }
        
        try {            
            int jumlah_piutang = Integer.parseInt(jumlah_piutang_str);
            
            try (Connection conn = Database.getConnection()) {
                String sql1 = "SELECT id_pelanggan FROM pelanggan WHERE nama_pelanggan = ?";
                PreparedStatement stm1 = conn.prepareStatement(sql1);
                stm1.setString(1, nama_pelanggan);
                ResultSet idPelanggan = stm1.executeQuery();

                if (idPelanggan.next()) {
                    int id_pelanggan = idPelanggan.getInt("id_pelanggan");
                    
                    if (tanggal == null) {
                        String sql2 = "UPDATE piutang SET id_pelanggan = ?, jumlah = ?, catatan = ? WHERE id_piutang = ?";
                        PreparedStatement stm2 = conn.prepareStatement(sql2);
                        
                        if (nama_pelanggan == null || nama_pelanggan.isEmpty()) {
                            stm2.setNull(1, java.sql.Types.INTEGER);
                        } else {
                            stm2.setInt(1, id_pelanggan);
                        }                    

                        stm2.setInt(2, jumlah_piutang);

                        if (catatan == null || catatan.isEmpty()) {
                            stm2.setNull(3, java.sql.Types.VARCHAR);
                        } else {
                            stm2.setString(3, catatan);
                        }
                        
                        stm2.setInt(4, id_piutang);

                        int rowsInserted = stm2.executeUpdate();
                        if (rowsInserted > 0) {
                            JOptionPane.showMessageDialog(null, "Berhasil Memperbarui Piutang");
                            dispose();
                            Piutang piutangFrame = new Piutang();
                            piutangFrame.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Memperbarui Piutang");
                        }
                    } else {
                        String sql2 = "UPDATE piutang SET tanggal = ?, id_pelanggan = ?, jumlah = ?, catatan = ? WHERE id_piutang = ?";
                        PreparedStatement stm2 = conn.prepareStatement(sql2);
                        
                        stm2.setString(1, tanggal);
                        
                        if (nama_pelanggan == null || nama_pelanggan.isEmpty()) {
                            stm2.setNull(2, java.sql.Types.INTEGER);
                        } else {
                            stm2.setInt(2, id_pelanggan);
                        }                    

                        stm2.setInt(3, jumlah_piutang);

                        if (catatan == null || catatan.isEmpty()) {
                            stm2.setNull(4, java.sql.Types.VARCHAR);
                        } else {
                            stm2.setString(4, catatan);
                        }
                        
                        stm2.setInt(5, id_piutang);                        

                        int rowsInserted = stm2.executeUpdate();
                        if (rowsInserted > 0) {
                            JOptionPane.showMessageDialog(null, "Berhasil Memperbarui Piutang");
                            dispose();
                            Piutang piutangFrame = new Piutang();
                            piutangFrame.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Memperbarui Piutang");
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Pelanggan Tidak Ditemukan");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }

        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());            
        }
    }//GEN-LAST:event_buttonEditMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        dispose();
        Piutang piutangFrame = new Piutang();
        piutangFrame.setVisible(true);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void buttonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBackMouseClicked
        dispose();
        Piutang piutangFrame = new Piutang();
        piutangFrame.setVisible(true);
    }//GEN-LAST:event_buttonBackMouseClicked

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked

    }//GEN-LAST:event_backbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(EditPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPiutang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EditPiutang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel backbutton;
    private javax.swing.JPanel buttonBack;
    private javax.swing.JPanel buttonEdit;
    private javax.swing.JTextField inputCatatan;
    private javax.swing.JTextField inputJumlahPiutang;
    private javax.swing.JComboBox<String> inputNamaPelanggan;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelContent;
    private javax.swing.JButton toCatatanTransaksiButton;
    private javax.swing.JButton toDasborButton;
    private javax.swing.JButton toProfilButton;
    private javax.swing.JButton toStokButton;
    private javax.swing.JButton toUtangPiutangButton;
    // End of variables declaration//GEN-END:variables
}
