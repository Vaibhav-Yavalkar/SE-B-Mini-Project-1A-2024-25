package AMS;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class bookflightdetails extends JFrame {

    JTable table;
    DefaultTableModel model;

    public bookflightdetails() {
        
        setTitle("Booked Flight Details");
        setSize(1000, 400);
        setLocation(300, 150);
        
        
        String[] columnNames = {"PNR", "TICKET", "Aadhar", "Name", "Nationality", "Flight Name", "Flight Code", "Source", "Destination", "Departure Date"};
        
        
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
            
            
            String query = "SELECT PNR, TICKET, aadhar, name, nationality, flightname, flightcode, src, des, ddate FROM reservation";
            rs = stmt.executeQuery(query);
            
            // Step 4: Iterate through the ResultSet and add data to the table model
            while (rs.next()) {
                String pnr = rs.getString("PNR");
                String ticket = rs.getString("TICKET");
                String aadhar = rs.getString("aadhar");
                String name = rs.getString("name");
                String nationality = rs.getString("nationality");
                String flightName = rs.getString("flightname");
                String flightCode = rs.getString("flightcode");
                String src = rs.getString("src");
                String des = rs.getString("des");
                String ddate = rs.getString("ddate");
                
                
                model.addRow(new Object[]{pnr, ticket, aadhar, name, nationality, flightName, flightCode, src, des, ddate});
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
        new bookflightdetails();
    }
}
