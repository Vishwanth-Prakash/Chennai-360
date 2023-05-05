package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class SingUp extends JFrame implements ActionListener {
    JButton createButton, backButton;
    JTextField textFieldName, textFieldUsername, textFieldPassword, textFieldAnswer;
    Choice security;

    SingUp() {
        setBounds(350, 200, 865, 360);
        getContentPane().setBackground(new Color(193, 203, 255));
        setLayout(null);

        JPanel panelOne = new JPanel();
        panelOne.setBackground(new Color(131, 143, 233));
        panelOne.setBounds(10, 10, 500, 300);
        panelOne.setLayout(null);
        add(panelOne);

        JLabel jLabelUserName = new JLabel("Username");
        jLabelUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabelUserName.setBounds(50, 20, 125, 25);
        panelOne.add(jLabelUserName);


        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(191, 20, 180, 25);
        textFieldUsername.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        panelOne.add(textFieldUsername);

        JLabel jLabelName = new JLabel("Name");
        jLabelName.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabelName.setBounds(50, 60, 125, 25);
        panelOne.add(jLabelName);


        textFieldName = new JTextField();
        textFieldName.setBounds(191, 60, 180, 25);
        textFieldName.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        panelOne.add(textFieldName);

        JLabel jLabelPassword = new JLabel("Password");
        jLabelPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabelPassword.setBounds(50, 100, 125, 25);
        panelOne.add(jLabelPassword);

        textFieldPassword = new JTextField();
        textFieldPassword.setBounds(191, 100, 180, 25);
        textFieldPassword.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        panelOne.add(textFieldPassword);

        JLabel jLabelSecurityQuestion = new JLabel("Security Question");
        jLabelSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabelSecurityQuestion.setBounds(50, 140, 125, 25);
        panelOne.add(jLabelSecurityQuestion);

        security = new Choice();
        security.add("What is the name of your favorite faculty in VIT?");
        security.add("What is the name of your favorite pet?");
        security.add("What is the name of your favorite book?");
        security.add("When is your birthday?");
        security.add("Which color you like most");
        security.setBounds(190, 140, 300, 25);
        security.setFont(new Font("Tahoma", Font.ITALIC, 13));
        panelOne.add(security);

        JLabel jLabelAnswer = new JLabel("Answer");
        jLabelAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabelAnswer.setBounds(50, 180, 125, 25);
        panelOne.add(jLabelAnswer);

        textFieldAnswer = new JTextField();
        textFieldAnswer.setBounds(191, 180, 180, 25);
        textFieldAnswer.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
        panelOne.add(textFieldAnswer);

        createButton = new JButton("Create");
        createButton.setBackground(Color.WHITE);
        createButton.setForeground(new Color(131, 143, 233));
        createButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        createButton.setBounds(80, 250, 100, 30);
        createButton.addActionListener(this);
        createButton.setBorder(null);
        panelOne.add(createButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(new Color(131, 143, 233));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        backButton.setBounds(250, 250, 100, 30);
        backButton.addActionListener(this);
        backButton.setBorder(null);
        panelOne.add(backButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/sign-in-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(520, 10, 320, 300);
        add(image);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == createButton) {
            String username = textFieldUsername.getText();
            String name = textFieldName.getText();
            String password = textFieldPassword.getText();
            String question = security.getSelectedItem();
            String answer = textFieldAnswer.getText();
            String query1 = "select * from account where username = '" + username + "'";
            try {
                Conn connect = new Conn();
                ResultSet rs = connect.statement.executeQuery(query1);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Username is already exist");
                } else if (username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Kindly fill username field");
                } else if(name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Kindly fill name field");
                } else if(password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Kindly fill password field");
                } else if(answer.equals("")) {
                    JOptionPane.showMessageDialog(null, "Kindly fill answer field");
                } else {
                    String query = "insert into account values('" + username + "','" + name + "','" + password + "','" + question + "','" + answer + "')";
                    try {
                        Conn connect1 = new Conn();
                        connect1.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Account Created Successfully");
                        setVisible(false);
                        new Login();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Account was not Created, please try again!!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (actionEvent.getSource() == backButton) {
            setVisible(false);
            new Login();
        }
    }
}
