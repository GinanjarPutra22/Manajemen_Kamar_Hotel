/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_Kamar_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ginanjar Putra
 */
public class F_Cek_Out_Pelanggan extends javax.swing.JFrame {

    
    int lamatinggal;
    int harga;
    int totaltagihan;
    
    /**
     * Creates new form Detail_Pelanggan
     */
    public F_Cek_Out_Pelanggan() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tabel2();
        tabel3();
    }
    
    void hapus(){
        txt_nama.setText("");
        txt_nomortelepon.setText("");
        txt_alamat.setText("");
        txt_kelamin.setText("");
        txt_email.setText("");
        txt_id.setText("");
        txt_checkin.setText("");
        txt_checkout.setText("");
        txt_tipekamar.setText("");
        txt_nomorkamar.setText("");
        txt_harga.setText("");
        txt_lamatinggal.setText("");
        txt_tagihan.setText("");
        txt_cari.setText("");
       
        
    }

    
     void cari(){
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
//        tbl.addColumn("Total Tagihan");
        
        try {
            String sql = "SELECT * FROM tb_chekin2 WHERE nomorkamar like '%" + txt_cari.getText() + "%'";
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
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
                rs.getInt("lamatinggal"),
                rs.getString("nomorkamar"),
                rs.getString("tipekamar"),
                rs.getString("harga"),
//                rs.getInt("tagihan"),
         
            });
             tabel2.setModel(tbl); 
        }
            
        } catch (Exception e) {
        }
        
    }
//     Batas bawah method cari

     public void  tabel2() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("E-Mail");
        tbl.addColumn("No Id");
        tbl.addColumn("Check In");
        tbl.addColumn("Check Out");
        tbl.addColumn("Lama Tinggal");
        tbl.addColumn("No Kamar");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("Harga");
//        tbl.addColumn("Total Tagihan");
        
        
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
                rs.getInt("lamatinggal"),
                rs.getString("nomorkamar"),
                rs.getString("tipekamar"),
                rs.getString("harga"),
//                    rs.getInt("tagihan")
         
            });
             tabel2.setModel(tbl); 
        }
//             JOptionPane.showMessageDialog(null, "Koneksi Database  Berhasil");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
        
    }
     
     public void  tabel3() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("Telepon");
        tbl.addColumn("Alamat");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("E-Mail");
        tbl.addColumn("No Id");
        tbl.addColumn("Check In");
        tbl.addColumn("Check Out");
        tbl.addColumn("Tipe Kamar");
        tbl.addColumn("No Kamar");
        tbl.addColumn("Harga");
        tbl.addColumn("Lama Tinggal");
        tbl.addColumn("Tagihan");
        
        try {
            Statement st = (Statement)  Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_data");
            
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
                rs.getString("harga"),
                rs.getInt("tagihan")
         
            });
             
        }
//            JOptionPane.showMessageDialog(null, "Koneksi Database  Berhasil");
            
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

        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel_nama = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel_nomor = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        txt_lamatinggal = new javax.swing.JTextField();
        Cekout = new javax.swing.JButton();
        cek_tagihan = new javax.swing.JButton();
        txt_nomortelepon = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel_nama1 = new javax.swing.JLabel();
        txt_checkout = new javax.swing.JTextField();
        txt_checkin = new javax.swing.JTextField();
        jLabel_nomor1 = new javax.swing.JLabel();
        jLabel_nama2 = new javax.swing.JLabel();
        jLabel_nomor2 = new javax.swing.JLabel();
        txt_tagihan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jLabel_nama3 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton_CekOut = new javax.swing.JButton();
        Data_Pengunjung = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_kelamin = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_tipekamar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_nomorkamar = new javax.swing.JTextField();
        jLabel_nomor4 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel_nama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama.setText("Nama ");
        getContentPane().add(jLabel_nama);
        jLabel_nama.setBounds(40, 180, 260, 28);

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama);
        txt_nama.setBounds(40, 210, 260, 28);

        jLabel_nomor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor.setText("Harga/hari");
        getContentPane().add(jLabel_nomor);
        jLabel_nomor.setBounds(960, 240, 260, 28);

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga);
        txt_harga.setBounds(960, 270, 260, 28);

        txt_lamatinggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lamatinggalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_lamatinggal);
        txt_lamatinggal.setBounds(960, 330, 260, 28);

        Cekout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cekout.setLabel("Cek Out");
        Cekout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekoutActionPerformed(evt);
            }
        });
        getContentPane().add(Cekout);
        Cekout.setBounds(660, 390, 110, 28);

        cek_tagihan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cek_tagihan.setText("Cek Tagihan");
        cek_tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cek_tagihanActionPerformed(evt);
            }
        });
        getContentPane().add(cek_tagihan);
        cek_tagihan.setBounds(800, 390, 110, 28);

        txt_nomortelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomorteleponActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nomortelepon);
        txt_nomortelepon.setBounds(40, 270, 260, 28);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("No. Telepon");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 240, 260, 28);

        jLabel_nama1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama1.setText("Waktu Cek In");
        getContentPane().add(jLabel_nama1);
        jLabel_nama1.setBounds(650, 180, 260, 28);

        txt_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_checkoutActionPerformed(evt);
            }
        });
        getContentPane().add(txt_checkout);
        txt_checkout.setBounds(650, 270, 260, 28);

        txt_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_checkinActionPerformed(evt);
            }
        });
        getContentPane().add(txt_checkin);
        txt_checkin.setBounds(650, 210, 260, 28);

        jLabel_nomor1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor1.setText("Lama Tinggal");
        getContentPane().add(jLabel_nomor1);
        jLabel_nomor1.setBounds(960, 300, 260, 28);

        jLabel_nama2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama2.setText("Waktu Cek Out");
        getContentPane().add(jLabel_nama2);
        jLabel_nama2.setBounds(650, 240, 260, 28);

        jLabel_nomor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor2.setText("Total Tagihan");
        getContentPane().add(jLabel_nomor2);
        jLabel_nomor2.setBounds(960, 360, 260, 28);

        txt_tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tagihanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tagihan);
        txt_tagihan.setBounds(960, 390, 260, 28);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("E-mail");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(350, 240, 260, 28);

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(350, 270, 260, 28);

        btn_cari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cari);
        btn_cari.setBounds(830, 110, 72, 28);

        jLabel_nama3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nama3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nama3.setText("Nomor Kamar");
        getContentPane().add(jLabel_nama3);
        jLabel_nama3.setBounds(450, 110, 100, 28);

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cari);
        txt_cari.setBounds(550, 110, 260, 28);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "No. Telepon", "Alamat", "Jenis Kelamin", "E-mail", "No. ID", "Waktu Check In", "Waktu Check Out", "Tipe Kamar", "No. Kamar", "Harga Per Hari"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 440, 1180, 200);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton3.setText("  Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1120, 30, 140, 40);

        jButton_CekOut.setBackground(new java.awt.Color(255, 204, 0));
        jButton_CekOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CekOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/002-overbooked.png"))); // NOI18N
        jButton_CekOut.setText("   Cek Out                  ");
        jButton_CekOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CekOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_CekOut);
        jButton_CekOut.setBounds(40, 40, 220, 50);

        Data_Pengunjung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Data_Pengunjung.setForeground(new java.awt.Color(255, 255, 255));
        Data_Pengunjung.setText("Data Pengunjung Aktif");
        getContentPane().add(Data_Pengunjung);
        Data_Pengunjung.setBounds(40, 400, 260, 28);

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alamat);
        txt_alamat.setBounds(40, 330, 260, 28);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("No. Id");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(350, 300, 260, 28);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(350, 330, 260, 28);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Jenis Kelamin");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(350, 180, 260, 28);

        txt_kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelaminActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kelamin);
        txt_kelamin.setBounds(350, 210, 260, 28);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tipe Kamar");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(650, 300, 260, 28);

        txt_tipekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipekamarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tipekamar);
        txt_tipekamar.setBounds(650, 330, 260, 28);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("No. Kamar");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(960, 180, 260, 28);

        txt_nomorkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomorkamarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nomorkamar);
        txt_nomorkamar.setBounds(960, 210, 260, 28);

        jLabel_nomor4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nomor4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomor4.setText("Alamat");
        getContentPane().add(jLabel_nomor4);
        jLabel_nomor4.setBounds(40, 300, 260, 28);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ISI.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1284, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cek_tagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cek_tagihanActionPerformed
        // TODO add your handling code here:
//        
        
//        PENJUMLAHAN TOTAL TAGIHAN
        harga=Integer.parseInt(txt_harga.getText());
        lamatinggal=Integer.parseInt(txt_lamatinggal.getText());
        totaltagihan=harga*lamatinggal;
        txt_tagihan.setText(String.valueOf(totaltagihan));
        
        
               
    }//GEN-LAST:event_cek_tagihanActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_lamatinggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lamatinggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lamatinggalActionPerformed

    private void txt_nomorteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomorteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomorteleponActionPerformed

    private void txt_tagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tagihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tagihanActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        cari();
        hapus();
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        C_Menu menu = new C_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_CekOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CekOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        F_Cek_Out_Pelanggan a = new F_Cek_Out_Pelanggan();
        a.setVisible(true);

    }//GEN-LAST:event_jButton_CekOutActionPerformed

    private void txt_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_checkinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_checkinActionPerformed

    private void tabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel2MouseClicked
        // TODO add your handling code here:
        
        int baris = tabel2.rowAtPoint(evt.getPoint());
        
        String Nama = tabel2.getValueAt(baris, 0).toString();
        this.txt_nama.setText(Nama);
        
        String telepon = tabel2.getValueAt(baris, 1).toString();
        this.txt_nomortelepon.setText(telepon);
        
        String alamat = tabel2.getValueAt(baris, 2).toString();
        this.txt_alamat.setText(alamat);
        
        String jeniskelamin = tabel2.getValueAt(baris, 3).toString();
        this.txt_kelamin.setText(jeniskelamin);
        
        String email = tabel2.getValueAt(baris, 4).toString();
        this.txt_email.setText(email);
        
        String noid = tabel2.getValueAt(baris, 5).toString();
        this.txt_id.setText(noid);
        
        String checkin = tabel2.getValueAt(baris, 6).toString();
        this.txt_checkin.setText(checkin);
        
        String checout = tabel2.getValueAt(baris, 7).toString();
        this.txt_checkout.setText(checout);
        
        String tipekamar = tabel2.getValueAt(baris, 10).toString();
        this.txt_tipekamar.setText(tipekamar);
        
        String nomorkamar = tabel2.getValueAt(baris, 9).toString();
        this.txt_nomorkamar.setText(nomorkamar);
        
        String harga = tabel2.getValueAt(baris, 11).toString();
        this.txt_harga.setText(harga);
        
        String lamatinggal = tabel2.getValueAt(baris, 8).toString();
        this.txt_lamatinggal.setText(lamatinggal);
        
        
        
       
    }//GEN-LAST:event_tabel2MouseClicked

    private void txt_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_checkoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_checkoutActionPerformed

    private void CekoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekoutActionPerformed
        // TODO add your handling code here:
        try {
            String sql =  "insert INTO tb_data (nama, telepon, alamat, jeniskelamin, email, noid, checkin, checkout, tipekamar, nomorkamar, harga, lamatinggal, tagihan) values (" + " '" +txt_nama.getText() +"','" +txt_nomortelepon.getText()+"','" +txt_alamat.getText() +"','" +txt_kelamin.getText()+"', '" +txt_email.getText() +"','" +txt_id.getText() +"','" +txt_checkin.getText() +"','" +txt_checkout.getText()+"','" +txt_tipekamar.getText() +"','" +txt_nomorkamar.getText() +"','" +txt_harga.getText() +"', '" +txt_lamatinggal.getText()+"','" +txt_tagihan.getText() +"')";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Check Out");
            
            String sql2 = "delete from tb_chekin2 where nama='"+txt_nama.getText()+"'";
            Connection con2 = (Connection) Koneksi.getConnection();
            PreparedStatement pst2 = con2.prepareStatement(sql2);
            pst2.execute();
//            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
            tabel2();
            hapus();
                    
         
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ada Data Yang Salah, Gagal Disimpan");
             System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_CekoutActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_kelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kelaminActionPerformed

    private void txt_tipekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipekamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipekamarActionPerformed

    private void txt_nomorkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomorkamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomorkamarActionPerformed

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
            java.util.logging.Logger.getLogger(F_Cek_Out_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Cek_Out_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Cek_Out_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Cek_Out_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            @Override
            public void run() {
                new F_Cek_Out_Pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Cekout;
    private javax.swing.JLabel Data_Pengunjung;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton cek_tagihan;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_CekOut;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel_nama;
    private javax.swing.JLabel jLabel_nama1;
    private javax.swing.JLabel jLabel_nama2;
    private javax.swing.JLabel jLabel_nama3;
    private javax.swing.JLabel jLabel_nomor;
    private javax.swing.JLabel jLabel_nomor1;
    private javax.swing.JLabel jLabel_nomor2;
    private javax.swing.JLabel jLabel_nomor4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tabel2;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_checkin;
    private javax.swing.JTextField txt_checkout;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_kelamin;
    private javax.swing.JTextField txt_lamatinggal;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nomorkamar;
    private javax.swing.JTextField txt_nomortelepon;
    private javax.swing.JTextField txt_tagihan;
    private javax.swing.JTextField txt_tipekamar;
    // End of variables declaration//GEN-END:variables
}
