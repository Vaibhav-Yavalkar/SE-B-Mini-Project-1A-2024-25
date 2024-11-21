package AMS;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class canceldetails extends JFrame {

    JTable table;
    DefaultTableModel model;

    public canceldetails() {
        
        setTitle("Cancel Details");
        setSize(800, 400);
        setLocation(300, 150);
        
        
        String[] columnNames = {"PNR", "Name", "Cancel No", "Flight Code", "Departure Date"};
        
      
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
            
            
            String query = "SELECT pnr, name, cancelno, fcode, ddate FROM cancel";
            rs = stmt.executeQuery(query);
            
            
            while (rs.next()) {
                String pnr = rs.getString("pnr");
                String name = rs.getString("name");
                String cancelno = rs.getString("cancelno");
                String fcode = rs.getString("fcode");
                String ddate = rs.getString("ddate");
                
                
                model.addRow(new Object[]{pnr, name, cancelno, fcode, ddate});
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
        new canceldetails();
    }
}
