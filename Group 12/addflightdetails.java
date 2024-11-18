package AMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class addflightdetails extends JFrame implements ActionListener {

    private JTextField fCodeField, fNameField, sourceField, destinationField, timeField;
    private JButton insertButton;

    public addflightdetails() {
        setTitle("Add Flight Details");
        setLayout(null); 
        
        // Flight Code Label and Text Field
        JLabel fCodeLabel = new JLabel("Flight Code:");
        fCodeLabel.setBounds(50, 50, 150, 30);
        add(fCodeLabel);
        
        fCodeField = new JTextField();
        fCodeField.setBounds(200, 50, 150, 30);
        add(fCodeField);
        
        // Flight Name Label and Text Field
        JLabel fNameLabel = new JLabel("Flight Name:");
        fNameLabel.setBounds(50, 100, 150, 30);
        add(fNameLabel);
        
        fNameField = new JTextField();
        fNameField.setBounds(200, 100, 150, 30);
        add(fNameField);
        
        // Source Label and Text Field
        JLabel sourceLabel = new JLabel("Source:");
        sourceLabel.setBounds(50, 150, 150, 30);
        add(sourceLabel);
        
        sourceField = new JTextField();
        sourceField.setBounds(200, 150, 150, 30);
        add(sourceField);
        
        // Destination Label and Text Field
        JLabel destinationLabel = new JLabel("Destination:");
        destinationLabel.setBounds(50, 200, 150, 30);
        add(destinationLabel);
        
        destinationField = new JTextField();
        destinationField.setBounds(200, 200, 150, 30);
        add(destinationField);

        // Time Label and Text Field
        JLabel timeLabel = new JLabel("Time:");
        timeLabel.setBounds(50, 250, 150, 30);
        add(timeLabel);
        
        timeField = new JTextField();
        timeField.setBounds(200, 250, 150, 30);
        add(timeField);
        
        // Insert Button
        insertButton = new JButton("Insert");
        insertButton.setBounds(150, 300, 100, 30);
        insertButton.addActionListener(this); 
        add(insertButton);
        
        // Frame settings
        setSize(450, 400);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle button click event
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == insertButton) {
            String fCode = fCodeField.getText();
            String fName = fNameField.getText();
            String source = sourceField.getText();
            String destination = destinationField.getText();
            String time = timeField.getText(); // Get the time value
            
            insertData(fCode, fName, source, destination, time); // Pass the time value
        }
    }

    // Method to insert data into the database
    private void insertData(String fCode, String fName, String source, String destination, String time) {
        String url = "jdbc:mysql://localhost:3306/ams"; // Replace with your DB details
        String dbUsername = "root"; 
        String dbPassword = "PASSWORD"; 
        
        // SQL insert query with time column
        String query = "INSERT INTO flight (f_code, f_name, source, destination, time) VALUES (?, ?, ?, ?, ?)";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection to the database
            Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
            
            // Prepare statement
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, fCode);
            pstmt.setString(2, fName);
            pstmt.setString(3, source);
            pstmt.setString(4, destination);
            pstmt.setString(5, time); // Add time value to the prepared statement
            
            // Execute the insert query
            int rowsAffected = pstmt.executeUpdate();
            
            // Show success or failure message
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Flight details inserted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to insert flight details.");
            }
            
            // Close resources
            pstmt.close();
            conn.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new addflightdetails();
    }
}
