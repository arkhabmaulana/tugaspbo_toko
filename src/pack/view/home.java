/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko;

/**
 *
 * @author ALAN
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko> listdata = new ArrayList<>();
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        getCbKategori().setSelectedItem(null);
        getCbJenis().setSelectedItem(null);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        admin_toko = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtkode = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Admin Toko : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 90, 30);
        getContentPane().add(admin_toko);
        admin_toko.setBounds(90, 10, 120, 40);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Data Barang di Toko");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 750, 100);

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setLayout(null);
        jPanel2.add(txtkode);
        txtkode.setBounds(210, 20, 270, 40);

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        jPanel2.add(txtharga);
        txtharga.setBounds(210, 180, 270, 40);
        jPanel2.add(txtnama);
        txtnama.setBounds(210, 60, 270, 40);

        jTextField8.setText("jTextField1");
        jPanel2.add(jTextField8);
        jTextField8.setBounds(210, 60, 270, 40);

        jTextField9.setText("jTextField1");
        jPanel2.add(jTextField9);
        jTextField9.setBounds(210, 60, 270, 40);

        jTextField10.setText("jTextField1");
        jPanel2.add(jTextField10);
        jTextField10.setBounds(210, 60, 270, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kode Barang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 20, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama Barang");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 60, 140, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kategori Barang");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 100, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Packaging");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 140, 140, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 180, 140, 40);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buah", "Pack", "Sak", " " }));
        jPanel2.add(cbjenis);
        cbjenis.setBounds(210, 140, 270, 40);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Sembako", "Peralatan Rumah Tangga", "Alat Tulis/Kantor" }));
        jPanel2.add(cbKategoriBrg);
        cbKategoriBrg.setBounds(210, 100, 270, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 560, 260);

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));
        jPanel3.setLayout(null);

        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Keluar);
        Btn_Keluar.setBounds(20, 190, 110, 30);

        Btn_Simpan.setText("SIMPAN");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Simpan);
        Btn_Simpan.setBounds(20, 30, 110, 30);

        Btn_Ubah.setText("UBAH");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Ubah);
        Btn_Ubah.setBounds(20, 70, 110, 30);

        Btn_Bersih.setText("BERSIHKAN");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Bersih);
        Btn_Bersih.setBounds(20, 110, 110, 30);

        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Hapus);
        Btn_Hapus.setBounds(20, 150, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(560, 90, 170, 260);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Pencarian Berdasarkan Kategori Makanan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 330, 300, 80);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Sembako", "Peralatan Rumah Tangga", "Alat Tulis/Kantor" }));
        getContentPane().add(CbCariKategori);
        CbCariKategori.setBounds(340, 360, 180, 30);

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(530, 360, 80, 30);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);
        if (Tabel1.getColumnModel().getColumnCount() > 0) {
            Tabel1.getColumnModel().getColumn(0).setResizable(false);
            Tabel1.getColumnModel().getColumn(1).setResizable(false);
            Tabel1.getColumnModel().getColumn(2).setResizable(false);
            Tabel1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 400, 610, 280);

        setSize(new java.awt.Dimension(741, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_cariActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        // TODO add your handling code here:
        int baris = Tabel1.getSelectedRow();
        if (baris != -1)
        {
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String) Tabel1.getValueAt(baris, 1));
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_Tabel1MouseClicked

    public JTextField getTxtKode(){
        return txtkode;     }     
    public JTextField getTxtNama(){         
        return txtnama;     }     
    public JTextField getTxtHarga(){         
        return txtharga;     }     
    public JComboBox getCbKategori(){         
        return cbKategoriBrg;     }     
    public JComboBox getCbJenis(){         
        return cbjenis;     }     
    public JComboBox getCbCariKategori(){         
        return CbCariKategori;     }     
    public JButton getButtonHapus(){         
        return Btn_Hapus;     }          
    public JButton getButtonBersih(){         
        return Btn_Bersih;     }     
    public JButton getButtonSimpan(){         
        return Btn_Simpan;     }     
    public JButton getButtonUbah(){         
        return Btn_Ubah;     }     
    public JButton getButtonKeluar(){         
        return Btn_Keluar;     }     
    public JTable getTableData(){         
        return Tabel1;     }
    
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JLabel admin_toko;
    private javax.swing.JButton cari;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
