/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Inezita
 */
public class CashierForm extends javax.swing.JFrame {

    /**
     * Creates new form CashierForm
     */
    
    // Membuat sebuah format mata uang (separator / titik)
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public CashierForm() {
        initComponents();
        KodeBarang();
        TotalHarga();
        Diskon();
    }
    
    private void Diskon(){
        txtDiskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               int diskon, hasilDiskon;
                diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText()) / 100;
        
                hasilDiskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) - diskon;
    
                
                txtHasilDiskon.setText(nf.format(diskon));
                // PPn
                int hasilPPN = 0;
                if(chkPPN.isSelected()){
                    hasilPPN = hasilDiskon * 10 /  100;
                    txtHasilPPN.setText(nf.format(hasilPPN));
                }else{
                    hasilPPN = hasilDiskon * 0 / 100;
                    txtHasilPPN.setText(nf.format(hasilPPN));
                }
        
                // Total Semua Harga
                int totalBersih;
                totalBersih = hasilPPN + hasilDiskon;
                lblJmlHarga.setText("Rp. " + nf.format(totalBersih));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
//    private void Total(){
//        lblJmlHarga.getDo
//    }
    
    
    private void TotalHarga(){
        txtQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener () {

            @Override
            // Digunakan untuk menampilkan total harga ketika QTY dimasukkan
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                
                try{
                    int hasil = 0;
                    if(txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * 0;
                        
                    }else {
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * Integer.parseInt(txtQTY.getText());
                        
                    }
                    txtTotalHarga.setText(nf.format(hasil));
                } catch (NumberFormatException arg0){ 
                }
            
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               try{
                    int hasil = 0;
                    if(txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * 0;
                        
                    }else {
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * Integer.parseInt(txtQTY.getText());
                        
                    }
                    txtTotalHarga.setText(nf.format(hasil));
                } catch (NumberFormatException arg0){ 
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            });
    }
           
    private void KodeBarang(){
        txtKodeBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String kodeBarang;
                kodeBarang = (String) txtKodeBarang.getText();
                
                switch(kodeBarang){
                    case "A001" :
                        txtNamaBarang.setText("Beras");
                        txtHargaBarang.setText(nf.format(30000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A002" :
                        txtNamaBarang.setText("Minyak Goreng");
                        txtHargaBarang.setText(nf.format(15000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A003" :
                        txtNamaBarang.setText("Gula");
                        txtHargaBarang.setText(nf.format(12000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A004" :
                        txtNamaBarang.setText("Garam");
                        txtHargaBarang.setText(nf.format(3000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A005" :
                        txtNamaBarang.setText("Daging Sapi");
                        txtHargaBarang.setText(nf.format(25000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A006" :
                        txtNamaBarang.setText("Daging Ayam");
                        txtHargaBarang.setText(nf.format(20000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A007" :
                        txtNamaBarang.setText("Telur");
                        txtHargaBarang.setText(nf.format(18000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A008" :
                        txtNamaBarang.setText("Gas Elpiji");
                        txtHargaBarang.setText(nf.format(17000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A009" :
                        txtNamaBarang.setText("Air Mineral");
                        txtHargaBarang.setText(nf.format(5000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A010" :
                        txtNamaBarang.setText("Susu");
                        txtHargaBarang.setText(nf.format(6000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    default :
                        txtNamaBarang.setText("");
                        txtHargaBarang.setText("");
                        
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String kodeBarang;
                kodeBarang = (String) txtKodeBarang.getText();
                
                switch(kodeBarang){
                    case "A001" :
                        txtNamaBarang.setText("Beras");
                        txtHargaBarang.setText(nf.format(30000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A002" :
                        txtNamaBarang.setText("Minyak Goreng");
                        txtHargaBarang.setText(nf.format(15000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A003" :
                        txtNamaBarang.setText("Gula");
                        txtHargaBarang.setText(nf.format(12000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A004" :
                        txtNamaBarang.setText("Garam");
                        txtHargaBarang.setText(nf.format(3000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A005" :
                        txtNamaBarang.setText("Daging Sapi");
                        txtHargaBarang.setText(nf.format(25000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A006" :
                        txtNamaBarang.setText("Daging Ayam");
                        txtHargaBarang.setText(nf.format(20000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A007" :
                        txtNamaBarang.setText("Telur");
                        txtHargaBarang.setText(nf.format(18000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A008" :
                        txtNamaBarang.setText("Gas Elpiji");
                        txtHargaBarang.setText(nf.format(17000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A009" :
                        txtNamaBarang.setText("Air Mineral");
                        txtHargaBarang.setText(nf.format(5000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    case "A010" :
                        txtNamaBarang.setText("Susu");
                        txtHargaBarang.setText(nf.format(6000));
                        // Kursor akan fokus ke QTY
                        txtQTY.grabFocus();
                        break;
                    default :
                        txtNamaBarang.setText("");
                        txtHargaBarang.setText("");
                        
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJmlHarga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHargaBarang = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtJumlahHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        txtHasilDiskon = new javax.swing.JTextField();
        chkPPN = new javax.swing.JCheckBox();
        txtHasilPPN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblJmlQTY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJmlHarga.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblJmlHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJmlHarga.setText("Rp");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kode Barang");

        txtKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBarangActionPerformed(evt);
            }
        });

        txtHargaBarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalHarga)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKodeBarang)
                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga Barang", "QTY", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jumlah Harga");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Diskon %");

        chkPPN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkPPN.setText("PPN 10%");
        chkPPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPPNActionPerformed(evt);
            }
        });

        jLabel6.setText("Item Yang Dibeli :");

        lblJmlQTY.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addGap(216, 216, 216))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkPPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHasilPPN, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblJmlQTY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblJmlHarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblJmlHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtJumlahHarga)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblJmlQTY)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasilPPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(964, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeBarangActionPerformed

    private void chkPPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPPNActionPerformed
        // TODO add your handling code here:
        jmlTotalHarga();
        
        
    }//GEN-LAST:event_chkPPNActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
        // Digunakan untuk menambahkan data pada tabel
        if (txtQTY.getText().equals("")){
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            
            Object obj [] = new Object[6];
            obj[1] = txtKodeBarang.getText();
            obj[2] = txtNamaBarang.getText();
            obj[3] = txtHargaBarang.getText();
            obj[4] = txtQTY.getText();
            obj[5] = txtTotalHarga.getText();
            
            model.addRow(obj);
            
            int baris = model.getRowCount();
            for(int i = 0; i < baris; i++){
                String no = String.valueOf(i + 1);
                model.setValueAt(no + ".", i, 0);
            }
            // Digunakan untuk mengatur tinggi baris
            tblList.setRowHeight(30);
            
            // Digunakan untuk menambahkan jumlah item yang dibeli
            lblJmlQTY.setText(String.valueOf(baris));
            
            jmlTotalHarga();
            bersih();
        }
    }//GEN-LAST:event_txtQTYActionPerformed

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
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPPN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJmlHarga;
    private javax.swing.JLabel lblJmlQTY;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHargaBarang;
    private javax.swing.JTextField txtHasilDiskon;
    private javax.swing.JTextField txtHasilPPN;
    private javax.swing.JTextField txtJumlahHarga;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables

    // Menambahkan Jumlah Harga
    private void jmlTotalHarga() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        int subTotal = 0;
        for(int i=0; i < tblList.getRowCount(); i++){
            subTotal += Integer.parseInt((String) tblList.getValueAt(i, 5).toString().replace(".", ""));
        }
    
        txtJumlahHarga.setText(nf.format(subTotal));
        
        // Diskon
        int diskon, hasilDiskon;
        diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText()) / 100;
        
        hasilDiskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) - diskon;
    
        // PPn
        int hasilPPN = 0;
        if(chkPPN.isSelected()){
            hasilPPN = hasilDiskon * 10 /  100;
            txtHasilPPN.setText(nf.format(hasilPPN));
        }else{
            hasilPPN = hasilDiskon * 0 / 100;
            txtHasilPPN.setText(nf.format(hasilPPN));
        }
        
        // Total Semua Harga
        int totalBersih;
        totalBersih = hasilPPN + hasilDiskon;
        lblJmlHarga.setText("Rp. " + nf.format(totalBersih));
    }

    // Membersihkan data saat menambahkan pada tabel
    private void bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        txtKodeBarang.setText("");
        txtKodeBarang.grabFocus();
        txtQTY.setText("");
        txtTotalHarga.setText("");
    }
}
