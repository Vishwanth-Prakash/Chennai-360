package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgetPassword extends JFrame implements ActionListener {
    JTextField textFieldUsername, textFieldName, textFieldQuestion, textFieldAnswer, textFieldPassword;
    JButton searchButton, retrieveButton, backButton;
    ForgetPassword() {
        setBounds(350, 200, 817, 337);
        getContentPane().setBackground(new Color(131,143,233));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/forgot-password-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(520,10,270,280);
        add(image);

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(11,10,500,280);
        panelOne.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        panelOne.setBackground(new Color(193,203,255)); //new color added
        add(panelOne);

        JLabel jLabelUsername = new JLabel("Username");
        jLabelUsername.setBounds(40, 20 ,100, 25);
        jLabelUsername.setFont(new Font("Tahoma",Font.BOLD,16));
        panelOne.add(jLabelUsername);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(220, 20, 150 , 25);
        textFieldUsername.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldUsername);

        searchButton = new JButton("Search");
        searchButton.setBackground(new Color(131,143,233));
        searchButton.setForeground(Color.WHITE);
        searchButton.setBounds(380, 20, 100 , 25);
        searchButton.addActionListener(this);
        panelOne.add(searchButton);

        JLabel jLabelName = new JLabel("Name");
        jLabelName.setBounds(40, 60 ,100, 25);
        jLabelName.setFont(new Font("Tahoma",Font.BOLD,16));
        panelOne.add(jLabelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(220, 60, 150 , 25);
        textFieldName.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldName);

        JLabel jLabelQuestion = new JLabel("Security Question");
        jLabelQuestion.setBounds(40, 100 ,150, 25);
        jLabelQuestion.setFont(new Font("Tahoma",Font.BOLD,16));
        panelOne.add(jLabelQuestion);

        textFieldQuestion = new JTextField();
        textFieldQuestion.setBounds(220, 100, 260 , 25);
        textFieldQuestion.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldQuestion);

        JLabel jLabelAnswer = new JLabel("Answer");
        jLabelAnswer.setBounds(40, 140 ,150, 25);
        jLabelAnswer.setFont(new Font("Tahoma",Font.BOLD,16));
        panelOne.add(jLabelAnswer);

        textFieldAnswer = new JTextField();
        textFieldAnswer.setBounds(220, 140, 150 , 25);
        textFieldAnswer.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldAnswer);

        retrieveButton = new JButton("Retrieve");
        retrieveButton.setBackground(new Color(131,143,233));
        retrieveButton.setForeground(Color.WHITE);
        retrieveButton.setBounds(380, 140, 100 , 25);
        retrieveButton.addActionListener(this);
        panelOne.add(retrieveButton);

        JLabel jLabelPassword= new JLabel("Password");
        jLabelPassword.setBounds(40, 180 ,150, 25);
        jLabelPassword.setFont(new Font("Tahoma",Font.BOLD,16));
        panelOne.add(jLabelPassword);

        textFieldPassword = new JTextField();
        textFieldPassword.setBounds(220, 180, 150 , 25);
        textFieldPassword.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldPassword);

        backButton = new JButton("Back");
        backButton.setBackground(new Color(131,143,233));
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(150, 230, 100 , 25);
        backButton.addActionListener(this);
        panelOne.add(backButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == searchButton) {
            try {
                String username = textFieldUsername.getText();
                String query = "select * from account where username = '" +username+"'";
                Conn connect = new Conn();

                ResultSet resultSet =  connect.statement.executeQuery(query);
                if(resultSet.next()) {
                    textFieldName.setText(resultSet.getString("name"));
                    textFieldQuestion.setText(resultSet.getString("security"));
                } else {
                    JOptionPane.showMessageDialog(null, "There is no matching username found!");
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else if (actionEvent.getSource() == retrieveButton) {
            try {
                String answer = textFieldAnswer.getText();
                String query = "select * from account where answer = '" +answer+"' AND  username = '"+textFieldUsername.getText()+"'";
                Conn connect = new Conn();

                ResultSet resultSet =  connect.statement.executeQuery(query);
                if(resultSet.next()) {
                    textFieldPassword.setText(resultSet.getString("password"));
                } else {
                    JOptionPane.showMessageDialog(null, "Answer doesn't match, please try again");
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Login();
        }
    }
}
