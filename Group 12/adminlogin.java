package AMS;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class adminlogin extends JFrame {
    
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    
    public adminlogin() {
        
        setTitle("Admin Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 100, 30);
        add(usernameLabel);
        
        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 150, 30);
        add(usernameField);
        
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        add(passwordLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        add(passwordField);
        
       
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        add(loginButton);
        
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        
        
        setLocationRelativeTo(null);
        
        
        setVisible(true);
    }

    
    private void login() {
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        
        String url = "jdbc:mysql://localhost:3306/ams"; 
        String dbUsername = "root"; 
        String dbPassword = "PASSWORD"; 
        
        
        String query = "SELECT * FROM login WHERE username=? AND password=?";
        
        try {
           
            Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(this, "Login Successful!");
                new home1();  
                setVisible(false);
            } else {
                
                JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
            }
            
            
            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
        new adminlogin();
    }
}
