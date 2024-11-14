/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book.rental.system;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaily Gupta
 */
public class home_cart extends javax.swing.JFrame {

    /**
     * Creates new form home_cart
     */
    public home_cart() {
        initComponents();
        table_update();
    }
    
    Connection con;
   PreparedStatement insert;
   int c;
   
    private void table_update() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_rental_system", "root", "123456");
            insert = con.prepareStatement("SELECT * FROM cart");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) carttable.getModel();
            df.setRowCount((0));
            
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1;a<=c;a++){
                   v2.add(rs.getString("sr"));
//                   v2.add(rs.getBlob("image"));
                   v2.add(rs.getString("name"));
                   v2.add(rs.getString("genres"));
                   v2.add(rs.getString("authour"));
                   v2.add(rs.getString("rent_amt"));
                   
                }
                
                df.addRow(v2);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home_cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home_cart.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carttable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsr = new javax.swing.JTextField();
        txtauthor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtgenres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txttot = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("MY CART");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("   X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 812, -1));

        carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR NO.", "BOOK NAME", "GENRES", "AUTHOR", "PRICE"
            }
        ));
        carttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carttable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("GENRES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        txtname.setBackground(new java.awt.Color(234, 234, 252));
        txtname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 150, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("BOOK NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 30));

        txtsr.setBackground(new java.awt.Color(234, 234, 252));
        txtsr.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrActionPerformed(evt);
            }
        });
        getContentPane().add(txtsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 100, 140, 30));

        txtauthor.setBackground(new java.awt.Color(234, 234, 252));
        txtauthor.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 150, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("AUTHOR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        txtgenres.setBackground(new java.awt.Color(234, 234, 252));
        txtgenres.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtgenres, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 150, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("PRICE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        txtprice.setBackground(new java.awt.Color(234, 234, 252));
        txtprice.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 150, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("PROCEED TO PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 190, 40));

        btnremove.setBackground(new java.awt.Color(235, 73, 73));
        btnremove.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("REMOVE");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 160, 40));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("SR NO. :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(234, 245, 234));

        txttot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txttot.setForeground(new java.awt.Color(102, 0, 0));
        txttot.setText("0.0");

        jButton2.setBackground(new java.awt.Color(208, 221, 221));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("TOTAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txttot))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 810, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        user_home obj = new user_home();
        obj.show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        payment pay = new payment();
        pay.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)carttable.getModel();
        int selectedIndex = carttable.getSelectedRow();
        
        txtsr.setText(df.getValueAt(selectedIndex, 0).toString());
        txtname.setText(df.getValueAt(selectedIndex, 1).toString());
        txtgenres.setText(df.getValueAt(selectedIndex, 2).toString());
        txtauthor.setText(df.getValueAt(selectedIndex, 3).toString());
        txtprice.setText(df.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_carttableMouseClicked

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        // TODO add your handling code here:
         DefaultTableModel df = (DefaultTableModel)carttable.getModel();
         int selectedIndex = carttable.getSelectedRow();
         
        try {
            int sr = Integer.parseInt(df.getValueAt(selectedIndex,0).toString());
            int resDel = JOptionPane.showConfirmDialog(null, "Do you want to delete ths book","warning",JOptionPane.YES_NO_OPTION);
            if(resDel == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_rental_system", "root", "123456");
                insert = con.prepareStatement("DELETE FROM cart where sr = ?");

                insert.setInt(1, sr);
                insert.executeUpdate();
                
                 JOptionPane.showMessageDialog(this, "Removed From cart!");
                    table_update();
            
                    txtsr.setText("");
                    txtname.setText("");
                    txtgenres.setText("");
                    txtauthor.setText("");
                    txtprice.setText("");
                                       
                    txtsr.requestFocus();

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home_cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home_cart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnremoveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int numrow = carttable.getRowCount();     
       double tot= 0;
        for(int i=0;i<numrow;i++){
            double val= Double.valueOf(carttable.getValueAt(i, 4).toString());
            tot +=val;
        }
         txttot.setText(Double.toString(tot));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrActionPerformed

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
            java.util.logging.Logger.getLogger(home_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnremove;
    private javax.swing.JTable carttable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtgenres;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsr;
    private javax.swing.JLabel txttot;
    // End of variables declaration//GEN-END:variables
}