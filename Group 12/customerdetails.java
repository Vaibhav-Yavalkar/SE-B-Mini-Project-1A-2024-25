package AMS;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class customerdetails extends JFrame {

    JTable table;
    DefaultTableModel model;

    public customerdetails() {
        
        setTitle("Customer Details");
        setSize(800, 400);
        setLocation(300, 150);
        
        
        String[] columnNames = {"Name", "Nationality", "Phone", "Address", "Aadhar", "Gender"};
        
        
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        
        
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        
        
        fetchData();
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    
    public void fetchData() {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "PASSWORD"); // Update with your DB credentials
            
            
            stmt = conn.createStatement();
            
            
            String query = "SELECT name, nationality, phone, address, aadhar, gender FROM passenger";
            rs = stmt.executeQuery(query);
            
            
            while (rs.next()) {
                String name = rs.getString("name");
                String nationality = rs.getString("nationality");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String aadhar = rs.getString("aadhar");
                String gender = rs.getString("gender");
                
                
                model.addRow(new Object[]{name, nationality, phone, address, aadhar, gender});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching data from the database", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
    public static void main(String[] args) {
        new customerdetails();
    }
}
