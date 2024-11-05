/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package surplus;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Riddhi
 */
public class SellMed extends javax.swing.JFrame {

    public SellMed() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        fcompanyid = new javax.swing.JTextField();
        fquantity = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        fadd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("SELL MEDICINE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 6, 252, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 700, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 6, 42, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 89, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("COMPANY ID :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 99, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 90, 44));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PRICE PER UNIT :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, 39));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 256, 49));

        fcompanyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcompanyidActionPerformed(evt);
            }
        });
        getContentPane().add(fcompanyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 256, 49));

        fquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fquantityActionPerformed(evt);
            }
        });
        getContentPane().add(fquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 256, 49));

        fprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpriceActionPerformed(evt);
            }
        });
        getContentPane().add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 256, 49));

        fadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addmed2-.png"))); // NOI18N
        fadd.setText("ADD");
        fadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faddActionPerformed(evt);
            }
        });
        getContentPane().add(fadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 150, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xyz.LARGE2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void fcompanyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcompanyidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcompanyidActionPerformed

    private void fquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fquantityActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void fpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserDashboard o = new UserDashboard();
        o.setVisible(true);                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void faddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faddActionPerformed

        if (fname.getText().isEmpty() || fcompanyid.getText().isEmpty() || fquantity.getText().isEmpty()
                || fprice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
            return;
        }

        String name = fname.getText();
        String companyid = fcompanyid.getText();
        String quantity = fquantity.getText();
        String price = fprice.getText();
        
        int a = JOptionPane.showConfirmDialog(null, "Selling Successfull !", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            String query = "insert into med values('" + name + "','" + companyid + "','" + quantity + "','" + price + "')";
            try {
                ConnectionProvider c = new ConnectionProvider();
                c.s.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ViewMed vm = new ViewMed();
            vm.setVisible(true);

            this.setVisible(false);

        } else {
            return;
        }
    }//GEN-LAST:event_faddActionPerformed

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
            java.util.logging.Logger.getLogger(SellMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fadd;
    private javax.swing.JTextField fcompanyid;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fprice;
    private javax.swing.JTextField fquantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
