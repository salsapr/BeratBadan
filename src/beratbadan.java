
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salsabila Putri Ray
 */
public class beratbadan extends javax.swing.JFrame {
        String temp="";
        Double ti,bb,hs;
    /**
     * Creates new form beratbadan
     */
    public beratbadan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        Hitung = new javax.swing.JButton();
        Coba = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Ideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hasil1 = new javax.swing.JTextField();
        hasil2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 140, 20);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 57, 41, 20);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 101, 45, 20);

        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 145, 90, 20);
        getContentPane().add(Nama);
        Nama.setBounds(193, 54, 204, 26);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(193, 98, 50, 26);

        Berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeratActionPerformed(evt);
            }
        });
        getContentPane().add(Berat);
        Berat.setBounds(193, 142, 50, 26);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 190, 100, 20);

        buttonGroup1.add(rb1);
        rb1.setText("Perempuan");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(193, 186, 129, 29);

        buttonGroup1.add(rb2);
        rb2.setText("Laki-laki");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2);
        rb2.setBounds(323, 186, 91, 29);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(60, 233, 79, 29);

        Coba.setText("Coba Lagi");
        Coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobaActionPerformed(evt);
            }
        });
        getContentPane().add(Coba);
        Coba.setBounds(175, 233, 103, 29);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(307, 233, 77, 29);

        jLabel6.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 301, 212, 20);
        getContentPane().add(Ideal);
        Ideal.setBounds(287, 298, 50, 26);

        jLabel7.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(131, 342, 180, 20);
        getContentPane().add(hasil1);
        hasil1.setBounds(60, 371, 311, 26);
        getContentPane().add(hasil2);
        hasil2.setBounds(51, 406, 330, 26);

        jLabel8.setText("cm");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 100, 21, 20);

        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 150, 17, 20);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 300, 17, 20);

        setBounds(0, 0, 483, 517);
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
        rb2.setSelected(false);
    }//GEN-LAST:event_rb2ActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        if (Nama.getText().equals("")||Berat.getText().equals("")
                ||Tinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak Isian harus diisi semua!");
        }else if(rb1.isSelected()||rb2.isSelected()){
            try{
            Proses();    
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ada yang salah");
            }
        }else{
        JOptionPane.showMessageDialog(null, "Radio Button Harus Dipilih");
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        rb1.setSelected(false);
    }//GEN-LAST:event_rb1ActionPerformed

    private void BeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeratActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void CobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobaActionPerformed
        // TODO add your handling code here:
         Nama.setText("");
        Tinggi.setText("");
        Berat.setText("");
        buttonGroup1.clearSelection();
        rb1.setSelected(false);
        rb2.setSelected(false);
        Ideal.setText("");
        hasil1.setText("");
        hasil2.setText("");
    }//GEN-LAST:event_CobaActionPerformed

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
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beratbadan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton Coba;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil1;
    private javax.swing.JTextField hasil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        ti = Double.parseDouble(Tinggi.getText());
        bb = Double.parseDouble(Berat.getText());
        
        if(rb1.isSelected()){
            hs = (ti - 100)*1;
        }else if(rb2.isSelected()){
            hs = (ti - 104)*1;        }
    temp = Double.toString(hs.intValue());
    if (hs < bb){
        Ideal.setText(temp);
        hasil1.setText("Maaf "+Nama.getText()+" , Sepertinya anda Overweight");
        hasil2.setText("Banyaklah olahraga dan hindari makanan berkolesterol");
    }else if (hs > bb){
        Ideal.setText(temp);
        hasil1.setText("Maaf "+Nama.getText()+" , Sepertinya anda Underweight");
        hasil2.setText("Banyaklah konsumsi makanan berkarbohidrat");
    }else {
        Ideal.setText(temp);
        hasil1.setText("Halo "+Nama.getText()+" , Berat badan anda ideal");
        hasil2.setText("Harus dipertahankan! Sehat selalu");
    }
    }
}
