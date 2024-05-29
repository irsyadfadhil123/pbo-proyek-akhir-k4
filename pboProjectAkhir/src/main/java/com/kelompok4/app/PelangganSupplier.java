/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok4.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import com.kelompok4.pboprojectakhir.Database;
/**
 *
 * @author Ari Family
 */
public class PelangganSupplier extends javax.swing.JFrame {
    private JTabbedPane tabbedPane;
    private JPanel panelPelanggan;
    private JPanel panelSupplier;
    private JTable tabelPelanggan;
    private JTable tabelSupplier;

    /**
     * Creates new form PelangganSupplier
     */
    public PelangganSupplier() {
        setTitle("Artha - Pengatur Keuangan Toko");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        panelPelanggan = new JPanel();
        panelPelanggan.setLayout(new BorderLayout());
        panelPelanggan.add(createPanelPelanggan(), BorderLayout.CENTER);

        panelSupplier = new JPanel();
        panelSupplier.setLayout(new BorderLayout());
        panelSupplier.add(createPanelSupplier(), BorderLayout.CENTER);

        tabbedPane.addTab("Pelanggan", panelPelanggan);
        tabbedPane.addTab("Supplier", panelSupplier);

        add(tabbedPane);

        setVisible(true);
    }

    private JPanel createPanelPelanggan() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] namaKolom = {"ID Pelanggan", "Nama Pelanggan", "Kontak Pelanggan"};
        Object[][] data = fetchDataPelanggan();

        tabelPelanggan = new JTable(data, namaKolom);
        JScrollPane scrollPane = new JScrollPane(tabelPelanggan);

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());

        JButton tombolTambah = new JButton("Tambah Pelanggan");
        JButton tombolEdit = new JButton("Edit Pelanggan");
        JButton tombolHapus = new JButton("Hapus Pelanggan");

        tombolTambah.addActionListener(e -> showFormTambahPelanggan());
        tombolEdit.addActionListener(e -> showFormEditPelanggan());
        tombolHapus.addActionListener(e -> showFormHapusPelanggan());

        panelTombol.add(tombolTambah);
        panelTombol.add(tombolEdit);
        panelTombol.add(tombolHapus);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(panelTombol, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createPanelSupplier() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] namaKolom = {"ID Supplier", "Nama Supplier", "Kontak Supplier"};
        Object[][] data = fetchDataSupplier();

        tabelSupplier = new JTable(data, namaKolom);
        JScrollPane scrollPane = new JScrollPane(tabelSupplier);

        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());

        JButton tombolTambah = new JButton("Tambah Supplier");
        JButton tombolEdit = new JButton("Edit Supplier");
        JButton tombolHapus = new JButton("Hapus Supplier");

        tombolTambah.addActionListener(e -> showFormTambahSupplier());
        tombolEdit.addActionListener(e -> showFormEditSupplier());
        tombolHapus.addActionListener(e -> showFormHapusSupplier());

        panelTombol.add(tombolTambah);
        panelTombol.add(tombolEdit);
        panelTombol.add(tombolHapus);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(panelTombol, BorderLayout.SOUTH);

        return panel;
    }

    private Object[][] fetchDataPelanggan() {
        Vector<Vector<Object>> data = new Vector<>();
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pelanggan");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id_pelanggan"));
                row.add(rs.getString("nama_pelanggan"));
                row.add(rs.getString("kontak_pelanggan"));
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data.stream().map(Vector::toArray).toArray(Object[][]::new);
    }

    private Object[][] fetchDataSupplier() {
        Vector<Vector<Object>> data = new Vector<>();
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM supplier");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id_supplier"));
                row.add(rs.getString("nama_supplier"));
                row.add(rs.getString("kontak_supplier"));
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data.stream().map(Vector::toArray).toArray(Object[][]::new);
    }

    private void showFormTambahPelanggan() {
        JTextField idField = new JTextField(5);
        JTextField namaField = new JTextField(15);
        JTextField kontakField = new JTextField(15);

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("ID Pelanggan:"));
        form.add(idField);
        form.add(new JLabel("Nama Pelanggan:"));
        form.add(namaField);
        form.add(new JLabel("Kontak Pelanggan:"));
        form.add(kontakField);

        int result = JOptionPane.showConfirmDialog(null, form,
                "Tambah Pelanggan", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO pelanggan (id_pelanggan, nama_pelanggan, kontak_pelanggan) VALUES (?, ?, ?)")) {
                stmt.setInt(1, Integer.parseInt(idField.getText()));
                stmt.setString(2, namaField.getText());
                stmt.setString(3, kontakField.getText());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            refreshTablePelanggan();
        }
    }

    private void showFormEditPelanggan() {
        JTextField idField = new JTextField(5);
        JTextField namaField = new JTextField(15);
        JTextField kontakField = new JTextField(15);

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("ID Pelanggan:"));
        form.add(idField);
        form.add(new JLabel("Nama Pelanggan:"));
        form.add(namaField);
        form.add(new JLabel("Kontak Pelanggan:"));
        form.add(kontakField);

        int result = JOptionPane.showConfirmDialog(null, form,
                "Edit Pelanggan", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("UPDATE pelanggan SET nama_pelanggan = ?, kontak_pelanggan = ? WHERE id_pelanggan = ?")) {
                stmt.setString(1, namaField.getText());
                stmt.setString(2, kontakField.getText());
                stmt.setInt(3, Integer.parseInt(idField.getText()));
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            refreshTablePelanggan();
        }
    }

    private void showFormHapusPelanggan() {
        JTextField idField = new JTextField(5);

        JPanel form = new JPanel(new GridLayout(1, 2));
        form.add(new JLabel("ID Pelanggan:"));
        form.add(idField);

        int result = JOptionPane.showConfirmDialog(null, form,
                "Hapus Pelanggan", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM pelanggan WHERE id_pelanggan = ?")) {
                stmt.setInt(1, Integer.parseInt(idField.getText()));
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            refreshTablePelanggan();
        }
    }

    private void showFormTambahSupplier() {
        JTextField idField = new JTextField(5);
        JTextField namaField = new JTextField(15);
        JTextField kontakField = new JTextField(15);

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("ID Supplier:"));
        form.add(idField);
        form.add(new JLabel("Nama Supplier:"));
        form.add(namaField);
        form.add(new JLabel("Kontak Supplier:"));
        form.add(kontakField);

        int result = JOptionPane.showConfirmDialog(null, form,
                "Tambah Supplier", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("INSERT INTO supplier (id_supplier, nama_supplier, kontak_supplier) VALUES (?, ?, ?)")) {
                stmt.setInt(1, Integer.parseInt(idField.getText()));
                stmt.setString(2, namaField.getText());
                stmt.setString(3, kontakField.getText());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            refreshTableSupplier();
        }
    }

    private void showFormEditSupplier() {
        JTextField idField = new JTextField(5);
        JTextField namaField = new JTextField(15);
        JTextField kontakField = new JTextField(15);

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("ID Supplier:"));
        form.add(idField);
        form.add(new JLabel("Nama Supplier:"));
        form.add(namaField);
        form.add(new JLabel("Kontak Supplier:"));
        form.add(kontakField);

        int result = JOptionPane.showConfirmDialog(null, form,
                "Edit Supplier", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("UPDATE supplier SET nama_supplier = ?, kontak_supplier = ? WHERE id_supplier = ?")) {
                stmt.setString(1, namaField.getText());
                stmt.setString(2, kontakField.getText());
                stmt.setInt(3, Integer.parseInt(idField.getText()));
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            refreshTableSupplier();
        }
    }

    private void showFormHapusSupplier() {
        JTextField idField = new JTextField(5);

        JPanel form = new JPanel(new GridLayout(1, 2));
        form.add(new JLabel("ID Supplier:"));
        form.add(idField);

        int result = JOptionPane.showConfirmDialog(null, form,
                "Hapus Supplier", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try (Connection conn = Database.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM supplier WHERE id_supplier = ?")) {
                stmt.setInt(1, Integer.parseInt(idField.getText()));
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            refreshTableSupplier();
        }
    }

    private void refreshTablePelanggan() {
        Object[][] data = fetchDataPelanggan();
        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{"ID Pelanggan", "Nama Pelanggan", "Kontak Pelanggan"}
        ));
    }

    private void refreshTableSupplier() {
        Object[][] data = fetchDataSupplier();
        tabelSupplier.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{"ID Supplier", "Nama Supplier", "Kontak Supplier"}
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(PelangganSupplier::new);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
