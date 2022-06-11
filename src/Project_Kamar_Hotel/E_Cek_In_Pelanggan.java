/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_Kamar_Hotel;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ginanjar Putra
 */
public class E_Cek_In_Pelanggan extends javax.swing.JFrame {

    /**
     * Creates new form Detail_Pelanggan
     */
    DefaultTableModel model;
    public E_Cek_In_Pelanggan() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tabel ();
        tabel2();   
    }
    
    void hapus(){
        txt_nama.setText("");
        txt_telepon.setText("");
        txt_alamat.setText("");
        txt_jeniskelamin.setSelectedItem("");
        txt_email.setText("");
        txt_noid.setText("");
        txt_checkin.setDate(null);
        txt_checkout.setDate(null);
        txt_tipekamar.setText("");
        txt_nomorkamar.setText("");
        txt_harga.setText("");
        txt_lamatinggal.setText("");   
    }
      
      
    void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Kamar");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("Harga (Rp)");
        tbl.addColumn("Status Kamar");
        
        try {
            String sql = "SELECT * FROM tb_kamar WHERE StatusKamar like '%" + txt_cari.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                tbl.addRow(new Object[]{
                rs.getString("NoKamar"),
                rs.getString("TipeKamar"),
                rs.getInt("HargaKamar"),
                rs.getString("StatusKamar"),
         
                });
                tabel.setModel(tbl); 
            }   
        } catch (Exception e) {
        }
    }
    
     public void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No. Kamar");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("Harga (Rp)");
        tbl.addColumn("Status Kamar");
        
        
        try {
             Statement st = (Statement)  Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_kamar");
            
            while (rs.next()){
             tbl.addRow(new Object[]{
                rs.getString("NoKamar"),
                rs.getString("TipeKamar"),
                rs.getInt("HargaKamar"),
                rs.getString("StatusKamar"),
         
            });
             tabel.setModel(tbl); 
        }
//            JOptionPane.showMessageDialog(null, "Koneksi Database  Berhasil");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
        

    }
    
    public void  tabel2() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("E-mail");
        tbl.addColumn("No Id");
        tbl.addColumn("Check In");
        tbl.addColumn("Check Out");
        tbl.addColumn("Lama Tinggal");
        tbl.addColumn("No Kamar");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("Harga");
        
//        Cari data kamar
         String cari = txt_cari.getText();
         
        
        try {
            Statement st = (Statement)  Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_chekin2");
            
            
            while (rs.next()){
             tbl.addRow(new Object[]{
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("alamat"),
                rs.getString("jeniskelamin"),
                rs.getString("email"),
                rs.getString("noid"),
                rs.getString("checkin"),
                rs.getString("checkout"),
                rs.getString("lamatinggal"),
                rs.getString("nomorkamar"),
                rs.getString("tipekamar"),
                rs.getInt("harga"),
         
                
            });
//             tabel2.setModel(tbl); 
        }
//             JOptionPane.showMessageDialog(null, "Koneksi Database  Berhasil");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel_nama = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel_nomor = new javax.swing.JLabel();
        txt_telepon = new javax.swing.JTextField();
        jLabel_alamat = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_jeniskelamin = new javax.swing.JComboBox<>();
        txt_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel_nama1 = new javax.swing.JLabel();
        jLabel_nomor1 = new javax.swing.JLabel();
        txt_tipekamar = new javax.swing.JTextField();
        jLabel_alamat1 = new javax.swing.JLabel();
        jLabel_alamat2 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel_nama2 = new javax.swing.JLabel();
        btn_pesankamar = new javax.swing.JButton();
        txt_nomorkamar = new javax.swing.JTextField();
        btn_hapus = new javax.swing.JButton();
        txt_checkin = new com.toedter.calendar.JDateChooser();
        jButton_CekIn = new javax.swing.JButton();
        jLabel_nama3 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        txt_noid = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel_nama4 = new javax.swing.JLabel();
        txt_checkout = new com.toedter.calendar.JDateChooser();
        txt_lamatinggal = new javax.swing.JTextField();
        jLabel_nomor2 = new javax.swing.JLabel();
        jLabel_nama5 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField6.setText("jTextField6");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel_nama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama.setText("Nama ");
        getContentPane().add(jLabel_nama);
        jLabel_nama.setBounds(50, 160, 260, 28);

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama);
        txt_nama.setBounds(50, 190, 260, 28);

        jLabel_nomor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor.setText("No. Telepon");
        getContentPane().add(jLabel_nomor);
        jLabel_nomor.setBounds(50, 220, 260, 28);

        txt_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_teleponActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telepon);
        txt_telepon.setBounds(50, 250, 260, 28);

        jLabel_alamat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_alamat.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_alamat.setText("Alamat");
        getContentPane().add(jLabel_alamat);
        jLabel_alamat.setBounds(50, 280, 260, 28);

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alamat);
        txt_alamat.setBounds(50, 310, 260, 28);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Jenis Kelamin");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 340, 260, 28);

        txt_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        getContentPane().add(txt_jeniskelamin);
        txt_jeniskelamin.setBounds(50, 370, 260, 28);

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(50, 430, 260, 28);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E-mail");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 400, 260, 28);

        jLabel_nama1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama1.setText("Informasi Kamar");
        getContentPane().add(jLabel_nama1);
        jLabel_nama1.setBounds(810, 220, 130, 28);

        jLabel_nomor1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor1.setText("Nomor Kamar");
        getContentPane().add(jLabel_nomor1);
        jLabel_nomor1.setBounds(430, 340, 260, 28);

        txt_tipekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipekamarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tipekamar);
        txt_tipekamar.setBounds(430, 430, 260, 28);

        jLabel_alamat1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_alamat1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_alamat1.setText("Tipe Kamar");
        getContentPane().add(jLabel_alamat1);
        jLabel_alamat1.setBounds(430, 400, 260, 28);

        jLabel_alamat2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_alamat2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_alamat2.setText("Harga/hari");
        getContentPane().add(jLabel_alamat2);
        jLabel_alamat2.setBounds(430, 460, 260, 28);

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga);
        txt_harga.setBounds(430, 490, 260, 28);

        jLabel_nama2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama2.setText("No. ID");
        getContentPane().add(jLabel_nama2);
        jLabel_nama2.setBounds(50, 460, 260, 28);

        btn_pesankamar.setBackground(new java.awt.Color(255, 204, 0));
        btn_pesankamar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_pesankamar.setText("Pesan Kamar");
        btn_pesankamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesankamarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesankamar);
        btn_pesankamar.setBounds(810, 480, 120, 35);

        txt_nomorkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomorkamarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nomorkamar);
        txt_nomorkamar.setBounds(430, 370, 260, 28);

        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_hapus.setText("Reset");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(940, 480, 120, 35);

        txt_checkin.setDateFormatString("d MMM y");
        txt_checkin.setMinSelectableDate(new java.util.Date(-62135791132000L));
        getContentPane().add(txt_checkin);
        txt_checkin.setBounds(430, 190, 260, 28);

        jButton_CekIn.setBackground(new java.awt.Color(255, 204, 0));
        jButton_CekIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CekIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/001-availability.png"))); // NOI18N
        jButton_CekIn.setText("  Cek In                     ");
        jButton_CekIn.setMaximumSize(new java.awt.Dimension(217, 56));
        jButton_CekIn.setMinimumSize(new java.awt.Dimension(217, 56));
        jButton_CekIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CekInActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_CekIn);
        jButton_CekIn.setBounds(50, 90, 220, 50);

        jLabel_nama3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama3.setText("Waktu Check In");
        getContentPane().add(jLabel_nama3);
        jLabel_nama3.setBounds(430, 160, 260, 28);

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cari);
        txt_cari.setBounds(810, 190, 230, 28);

        txt_noid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noidActionPerformed(evt);
            }
        });
        getContentPane().add(txt_noid);
        txt_noid.setBounds(50, 490, 260, 28);

        btn_cari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cari);
        btn_cari.setBounds(1050, 190, 72, 30);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. Kamar", "Tipe Kamar", "Harga (Rp)", "Status Kamar"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabel);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(810, 250, 430, 210);

        jLabel_nama4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama4.setText("Waktu Check Out");
        getContentPane().add(jLabel_nama4);
        jLabel_nama4.setBounds(430, 220, 260, 28);

        txt_checkout.setDateFormatString("d MMM y");
        txt_checkout.setMinSelectableDate(new java.util.Date(-62135791132000L));
        getContentPane().add(txt_checkout);
        txt_checkout.setBounds(430, 250, 260, 28);

        txt_lamatinggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lamatinggalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_lamatinggal);
        txt_lamatinggal.setBounds(430, 310, 260, 28);

        jLabel_nomor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor2.setText("Lama Tinggal");
        getContentPane().add(jLabel_nomor2);
        jLabel_nomor2.setBounds(430, 280, 260, 28);

        jLabel_nama5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama5.setText("Cari Status Kamar");
        getContentPane().add(jLabel_nama5);
        jLabel_nama5.setBounds(810, 160, 130, 28);

        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        Kembali.setText("  Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali);
        Kembali.setBounds(1110, 20, 140, 40);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ISI.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1284, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_teleponActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_tipekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipekamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipekamarActionPerformed

    private void jButton_CekInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CekInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CekInActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
         this.dispose();
        C_Menu menu = new C_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_KembaliActionPerformed

    private void txt_noidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noidActionPerformed

    private void txt_nomorkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomorkamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomorkamarActionPerformed

    private void btn_pesankamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesankamarActionPerformed
        // TODO add your handling code here:
  
      if (txt_nama.getText().equals("") || txt_telepon.getText().equals("") || txt_jeniskelamin.getSelectedItem().equals("") || txt_email.getText().equals("") || txt_noid.getText().equals("") || txt_nomorkamar.getText().equals("") || txt_tipekamar.getText().equals("") || txt_harga.getText().equals("") || txt_checkin.getDate().equals("") ){
//          
            JOptionPane.showMessageDialog(rootPane, "Harap Lengkapi Data");
        }
      
        else{
          
          
            try {
                String sql = "insert INTO tb_chekin2 (nama, telepon, alamat, jeniskelamin, email, noid, checkin, checkout, lamatinggal, nomorkamar, tipekamar, harga) values (" + " '" +txt_nama.getText() +"','" +txt_telepon.getText()+"','" +txt_alamat.getText() +"','" +txt_jeniskelamin.getSelectedItem() +"', '" +txt_email.getText() +"','" +txt_noid.getText() +"','" +txt_checkin.getDate() +"','" +txt_checkout.getDate() +"','" +txt_lamatinggal.getText() +"','" +txt_nomorkamar.getText() +"','" +txt_tipekamar.getText() +"','" +txt_harga.getText() +"')";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan");


            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Kamar Sudah Terisi, Data Gagal Disimpan");
                 System.out.println(e.getMessage());
            }
            tabel2();
            
        
        
         }
        
        
    }//GEN-LAST:event_btn_pesankamarActionPerformed

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
         // TODO add your handling code here:
         cari();

    }//GEN-LAST:event_btn_cariActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:

        int baris = tabel.rowAtPoint(evt.getPoint());
        String NoKamar = tabel.getValueAt(baris, 0).toString();
        this.txt_nomorkamar.setText(NoKamar);

        String TipeKamar = tabel.getValueAt(baris, 1).toString();
        this.txt_tipekamar.setText(TipeKamar);

        String HargaKamar = tabel.getValueAt(baris, 2).toString();
        this.txt_harga.setText(HargaKamar);


    }//GEN-LAST:event_tabelMouseClicked

    private void txt_lamatinggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lamatinggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lamatinggalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        hapus();
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(E_Cek_In_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_Cek_In_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_Cek_In_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_Cek_In_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_Cek_In_Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_pesankamar;
    private javax.swing.JButton jButton_CekIn;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel_alamat;
    private javax.swing.JLabel jLabel_alamat1;
    private javax.swing.JLabel jLabel_alamat2;
    private javax.swing.JLabel jLabel_nama;
    private javax.swing.JLabel jLabel_nama1;
    private javax.swing.JLabel jLabel_nama2;
    private javax.swing.JLabel jLabel_nama3;
    private javax.swing.JLabel jLabel_nama4;
    private javax.swing.JLabel jLabel_nama5;
    private javax.swing.JLabel jLabel_nomor;
    private javax.swing.JLabel jLabel_nomor1;
    private javax.swing.JLabel jLabel_nomor2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private com.toedter.calendar.JDateChooser txt_checkin;
    private com.toedter.calendar.JDateChooser txt_checkout;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JComboBox<String> txt_jeniskelamin;
    private javax.swing.JTextField txt_lamatinggal;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_noid;
    private javax.swing.JTextField txt_nomorkamar;
    private javax.swing.JTextField txt_telepon;
    private javax.swing.JTextField txt_tipekamar;
    // End of variables declaration//GEN-END:variables


}




