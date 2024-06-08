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
public class EditCatatanPembelian extends javax.swing.JFrame {
    private int id_pembelian;

    /**
     * Creates new form landingPage
     */
    public EditCatatanPembelian() {
        setTitle("Artha: Aplikasi Keuangan Bisnis");
        String jumlah_barang = "1";
        initComponents();
        dataNamaBarang();
        setImageToLabel();
        inputJumlahBarang.setText(jumlah_barang);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public EditCatatanPembelian(int id_pembelian) {
        this.id_pembelian = id_pembelian;
        setTitle("Artha: Aplikasi Keuangan Bisnis");
        initComponents();
        dataNamaBarang();
        dataPenjualan(id_pembelian);
        setImageToLabel();
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

    }
    
    private void dataNamaBarang () {
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT nama_barang FROM stokbarang";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet resultSet = stm.executeQuery();
            
            ArrayList<String> data = new ArrayList<>();
            while (resultSet.next()) {
                String namaBarang = resultSet.getString("nama_barang");
                data.add(namaBarang);
            }
            
            String[] dataArray = data.toArray(new String[0]);
            
            for (String item : dataArray) {
                inputNamaBarang.addItem(item);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }        
    }
    
    private void dataPenjualan(int id_pembelian) {
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM pembelian WHERE id_pembelian = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id_pembelian);
            
            ResultSet rs = stm.executeQuery();
            
            if (rs.next()) {
                Date tanggal = rs.getDate("tanggal");
                int id_barang = rs.getInt("id_barang");
                String jumlah_barang = Integer.toString(rs.getInt("jumlah_barang"));
                String uang_keluar = Integer.toString(rs.getInt("uang_keluar"));
                String catatan = rs.getString("catatan");
                
                String sql2 = "SELECT nama_barang FROM stokbarang WHERE id_barang = ?";
                PreparedStatement stm2 = conn.prepareStatement(sql2);
                stm2.setInt(1, id_barang);
                
                ResultSet rs2 = stm2.executeQuery();
                
                if (rs2.next()) {
                    String nama_barang = rs2.getString("nama_barang");
                    inputNamaBarang.setSelectedItem(nama_barang);
                }
                
                inputTanggal.setDate(tanggal);
                inputJumlahBarang.setText(jumlah_barang);
                inputUangKeluar.setText(uang_keluar);
                inputCatatan.setText(catatan);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());            
        }
    }
    
    private void setImageToLabel() {
        String imagePath = "/back_icon.png";
        
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(imagePath));
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        
        jLabel8.setIcon(resizedIcon);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputJumlahBarang = new javax.swing.JTextField();
        inputUangKeluar = new javax.swing.JTextField();
        inputCatatan = new javax.swing.JTextField();
        inputNamaBarang = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        buttonEdit = new com.kelompok4.design.PanelRound();
        jLabel9 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Barang:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setLabelFor(inputTanggal);
        jLabel3.setText("Tanggal:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jumlah Barang:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Uang Keluar:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Catatan:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edit Catatan Pembelian");

        inputJumlahBarang.setBackground(new java.awt.Color(255, 255, 255));
        inputJumlahBarang.setForeground(new java.awt.Color(0, 0, 0));
        inputJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJumlahBarangActionPerformed(evt);
            }
        });

        inputUangKeluar.setBackground(new java.awt.Color(255, 255, 255));
        inputUangKeluar.setForeground(new java.awt.Color(0, 0, 0));

        inputCatatan.setBackground(new java.awt.Color(255, 255, 255));
        inputCatatan.setForeground(new java.awt.Color(0, 0, 0));

        inputNamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        inputNamaBarang.setForeground(new java.awt.Color(0, 0, 0));
        inputNamaBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        inputNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaBarangActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        inputTanggal.setBackground(new java.awt.Color(255, 255, 255));

        buttonEdit.setBackground(new java.awt.Color(124, 195, 223));
        buttonEdit.setMaximumSize(new java.awt.Dimension(500, 500));
        buttonEdit.setMinimumSize(new java.awt.Dimension(0, 0));
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
                .addGap(87, 87, 87)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        buttonEditLayout.setVerticalGroup(
            buttonEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonEditLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputJumlahBarang)
                                    .addComponent(inputUangKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                    .addComponent(inputCatatan, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                                    .addComponent(inputNamaBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputNamaBarang)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(inputUangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(inputCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

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
        toCatatanTransaksiButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        toUtangPiutangButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
                .addGap(0, 449, Short.MAX_VALUE))
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

    }//GEN-LAST:event_toDasborButtonActionPerformed

    private void toCatatanTransaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCatatanTransaksiButtonActionPerformed
        dispose();
        CatatanTransaksi catatanTransaksiFrame = new CatatanTransaksi();
        catatanTransaksiFrame.setVisible(true);
    }//GEN-LAST:event_toCatatanTransaksiButtonActionPerformed

    private void toUtangPiutangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUtangPiutangButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toUtangPiutangButtonActionPerformed

    private void toStokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStokButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toStokButtonActionPerformed

    private void toProfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toProfilButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toProfilButtonActionPerformed

    private void inputJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJumlahBarangActionPerformed

    private void inputNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaBarangActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void buttonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditMouseClicked
                String tanggal = null;
        if (inputTanggal.getDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tanggal = sdf.format(inputTanggal.getDate());
        }
        
        String nama_barang = null;
        if ((String) inputNamaBarang.getSelectedItem() != null) {
            nama_barang = (String) inputNamaBarang.getSelectedItem();
        }
        
        String uang_keluar_str = inputUangKeluar.getText();
        
        String catatan = null;
        if (inputCatatan.getText() != null) {
            catatan = inputCatatan.getText();            
        }
        
        try {
            String jumlah_str = inputJumlahBarang.getText();
            Integer jumlah = null;
            if (jumlah_str != null && !jumlah_str.isEmpty()) {
                try {
                    jumlah = Integer.parseInt(jumlah_str);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
            
            int uang_keluar = Integer.parseInt(uang_keluar_str);
            
            try (Connection conn = Database.getConnection()) {
                String sql1 = "SELECT id_barang FROM stokbarang WHERE nama_barang = ?";
                PreparedStatement stm1 = conn.prepareStatement(sql1);
                stm1.setString(1, nama_barang);
                ResultSet idBarangResult = stm1.executeQuery();

                if (idBarangResult.next()) {
                    int id_barang = idBarangResult.getInt("id_barang");
                    
                    if (tanggal == null) {
                        String sql2 = "UPDATE pembelian SET id_barang = ?, jumlah_barang = ?, uang_keluar = ?, catatan = ? WHERE id_pembelian = ?";
                        PreparedStatement stm2 = conn.prepareStatement(sql2);
                        
                        if (nama_barang == null || nama_barang.isEmpty()) {
                            stm2.setNull(1, java.sql.Types.INTEGER);
                        } else {
                            stm2.setInt(1, id_barang);
                        }                    

                        if (jumlah_str == null || jumlah_str.isEmpty()) {
                            stm2.setInt(2, 0);
                        } else {
                            stm2.setInt(2, jumlah);
                        }

                        stm2.setInt(3, uang_keluar);

                        if (catatan == null || catatan.isEmpty()) {
                            stm2.setNull(4, java.sql.Types.VARCHAR);
                        } else {
                            stm2.setString(4, catatan);
                        }
                        
                        stm2.setInt(5, id_pembelian);

                        int rowsInserted = stm2.executeUpdate();
                        if (rowsInserted > 0) {
                            JOptionPane.showMessageDialog(null, "Berhasil Memperbarui Catatan Pembelian");
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Memperbarui Catatan Pembelian");
                        }
                    } else {
                        String sql2 = "UPDATE pembelian SET tanggal = ?, id_barang = ?, jumlah_barang = ?, uang_keluar = ?, catatan = ? WHERE id_pembelian = ?";
                        PreparedStatement stm2 = conn.prepareStatement(sql2);
                        
                        stm2.setString(1, tanggal);
                        
                        if (nama_barang == null || nama_barang.isEmpty()) {
                            stm2.setNull(2, java.sql.Types.INTEGER);
                        } else {
                            stm2.setInt(2, id_barang);
                        }                    

                        if (jumlah_str == null || jumlah_str.isEmpty()) {
                            stm2.setInt(3, 0);
                        } else {
                            stm2.setInt(3, jumlah);
                        }

                        stm2.setInt(4, uang_keluar);

                        if (catatan == null || catatan.isEmpty()) {
                            stm2.setNull(5, java.sql.Types.VARCHAR);
                        } else {
                            stm2.setString(5, catatan);
                        }
                        
                        stm2.setInt(6, id_pembelian);                        

                        int rowsInserted = stm2.executeUpdate();
                        if (rowsInserted > 0) {
                            JOptionPane.showMessageDialog(null, "Berhasil Memperbarui Catatan Pembelian");
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Memperbarui Catatan Pembelian");
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Nama Barang Tidak Ditemukan");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }

        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());            
        }        

    }//GEN-LAST:event_buttonEditMouseClicked

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
            java.util.logging.Logger.getLogger(EditCatatanPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCatatanPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCatatanPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCatatanPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCatatanPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel buttonEdit;
    private javax.swing.JTextField inputCatatan;
    private javax.swing.JTextField inputJumlahBarang;
    private javax.swing.JComboBox<String> inputNamaBarang;
    private com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JTextField inputUangKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
