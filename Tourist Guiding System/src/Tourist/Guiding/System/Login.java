package Tourist.Guiding.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton loginButton, signupButton, forgotPasswordButton;
    JTextField textFieldUsername, textFieldPassword;
    Login() {

        setBounds(350,250,900,400);
        setLayout(null);

        getContentPane().setBackground(new Color(131,143,233));

        JPanel panelOne = new JPanel();
        panelOne.setBackground(new Color(131,143,233));
        panelOne.setBounds(0,0,400,400);
        panelOne.setLayout(null);
        add(panelOne);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,30,300,300);
        panelOne.add(image);

        JPanel panelTwo = new JPanel();
        panelTwo.setLayout(null);
        panelTwo.setBounds(400,30,450,300);
        panelTwo.setBackground(new Color(193,203,255));
        panelTwo.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        add(panelTwo);

        JLabel jLabelUserName = new JLabel("Username");
        jLabelUserName.setBounds(60,20,100,25);
        jLabelUserName.setFont(new Font("SAN SK RIF",Font.PLAIN,20));
        panelTwo.add(jLabelUserName);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(60, 60, 301, 30);
        textFieldUsername.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelTwo.add(textFieldUsername);


        JLabel jLabelPassword = new JLabel("Password");
        jLabelPassword.setBounds(61,110,100,25);
        jLabelPassword.setFont(new Font("SAN SK RIF",Font.PLAIN,20));
        panelTwo.add(jLabelPassword);

        textFieldPassword = new JTextField();
        textFieldPassword.setBounds(61, 151, 300, 30);
        textFieldPassword.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelTwo.add(textFieldPassword);

        loginButton = new JButton("Login");
        loginButton.setSize(80,80);
        loginButton.setBounds(60, 200, 130, 30);
        loginButton.setBackground(new Color(131,143,233));
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        panelTwo.add(loginButton);

        signupButton = new JButton("Signup");
        signupButton.setSize(80,80);
        signupButton.setBounds(230, 200, 130, 30);
        signupButton.setBackground(new Color(131,143,233));
        signupButton.setForeground(Color.WHITE);
        signupButton.addActionListener(this);
        panelTwo.add(signupButton);

        forgotPasswordButton = new JButton("Forgot Password");
        forgotPasswordButton.setSize(80,80);
        forgotPasswordButton.setBounds(145, 250, 130, 30);
        forgotPasswordButton.setBackground(new Color(131,143,233));
        forgotPasswordButton.setForeground(Color.WHITE);
        forgotPasswordButton.addActionListener(this);
        panelTwo.add(forgotPasswordButton);

        JLabel jLabelText = new JLabel("Trouble in Login...");
        jLabelText.setBounds(290, 250, 150, 20);
        jLabelText.setForeground(Color.RED);
        panelTwo.add(jLabelText);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent  actionEvent) {
        if(actionEvent.getSource() == loginButton) {
            try {
                String username = textFieldUsername.getText();
                String password = textFieldPassword.getText();

                String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
                Conn connect = new Conn();
                ResultSet rs= connect.statement.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    String name = rs.getString("name");
                    String userName = rs.getString("username");
                    new Loading(name, userName);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else if (actionEvent.getSource() == signupButton) {
            setVisible(false);
            new SingUp();
        } else {
            setVisible(false);
            new ForgetPassword();
        }
    }

}
