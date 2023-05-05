package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener {

    JButton backButton;
    ViewCustomer(String username) {
        setBounds(500, 144, 796, 500);
        setLayout(null);
        getContentPane().setBackground(new Color(131,143,233));

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(10, 10,350,430);
        panelOne.setBackground(new Color(193,203,255));
        add(panelOne);

        JLabel jLabelHeading = new JLabel("VIEW CUSTOMER DETAILS");
        jLabelHeading.setFont(new Font("Tahoma",Font.PLAIN,20));
        jLabelHeading.setBounds(55, 10, 300, 27);
        panelOne.add(jLabelHeading);

        JLabel labelUserName = new JLabel("Username: ");
        labelUserName.setBounds(20, 50, 150, 25);
        labelUserName.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(labelUserName);

        JLabel labelUserName1 = new JLabel();
        labelUserName1.setBounds(130, 50, 150, 25);
        labelUserName1.setFont(new Font("Thoma",Font.BOLD,20));
        labelUserName1.setForeground(Color.GRAY);
        panelOne.add(labelUserName1);

        JLabel labelId = new JLabel("Id: ");
        labelId.setBounds(20, 90, 150, 25);
        labelId.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(labelId);

        JLabel labelId1 = new JLabel();
        labelId1.setBounds(50, 90, 150, 25);
        labelId1.setFont(new Font("Thoma",Font.BOLD,20));
        labelId1.setForeground(Color.GRAY);
        panelOne.add(labelId1);

        JLabel jLabelNumber  = new JLabel("Id-Number: ");
        jLabelNumber.setBounds(20, 130, 150, 25);
        jLabelNumber.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelNumber);

        JLabel jLabelNumber1 = new JLabel();
        jLabelNumber1.setBounds(130, 130, 130, 25);
        jLabelNumber1.setFont(new Font("Thoma",Font.BOLD,20));
        jLabelNumber1.setForeground(Color.GRAY);
        panelOne.add(jLabelNumber1);

        JLabel jLabelName  = new JLabel("Name: ");
        jLabelName.setBounds(20, 170, 150, 25);
        jLabelName.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelName);

        JLabel jLabelName1 = new JLabel();
        jLabelName1.setBounds(85, 170, 300, 25);
        jLabelName1.setFont(new Font("Thoma",Font.BOLD,20));
        jLabelName1.setForeground(Color.GRAY);
        panelOne.add(jLabelName1);

        JLabel jLabelGender = new JLabel("Gender: ");
        jLabelGender.setBounds(20, 210, 150, 25);
        jLabelGender.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelGender);

        JLabel jLabelGender1 = new JLabel();
        jLabelGender1.setBounds(100, 210, 110, 25);
        jLabelGender1.setFont(new Font("Thoma",Font.BOLD,20));
        jLabelGender1.setForeground(Color.GRAY);
        panelOne.add(jLabelGender1);

        JLabel jLabelCountry = new JLabel("Country:");
        jLabelCountry.setBounds(20, 250, 150, 25);
        jLabelCountry.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelCountry);

        JLabel jLabelCountry1 = new JLabel();
        jLabelCountry1.setBounds(107, 250, 150, 25);
        jLabelCountry1.setFont(new Font("Thoma",Font.BOLD,20));
        jLabelCountry1.setForeground(Color.GRAY);
        panelOne.add(jLabelCountry1);

        JLabel jLabelAddress = new JLabel("Address: ");
        jLabelAddress.setBounds(20, 290, 150, 25);
        jLabelAddress.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelAddress);

        JLabel jLabelAddress1 = new JLabel();
        jLabelAddress1.setBounds(110, 290, 300, 25);
        jLabelAddress1.setFont(new Font("Thoma",Font.BOLD,20));
        jLabelAddress1.setForeground(Color.GRAY);
        panelOne.add(jLabelAddress1);

        JLabel jLabelPhone  = new JLabel("Phone: ");
        jLabelPhone.setBounds(20, 330, 150, 25);
        jLabelPhone.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelPhone);

        JLabel jLabelPhone1 = new JLabel();
        jLabelPhone1.setBounds(95, 330, 130, 25);
        jLabelPhone1.setFont(new Font("Thoma",Font.BOLD,20));
        jLabelPhone1.setForeground(Color.GRAY);
        panelOne.add(jLabelPhone1);

        JLabel jLabelEmail  = new JLabel("Email: ");
        jLabelEmail.setBounds(20, 370, 300, 25);
        jLabelEmail.setFont(new Font("Thoma",Font.BOLD,20));
        panelOne.add(jLabelEmail);

        JLabel jLabelEmail1 = new JLabel();
        jLabelEmail1.setBounds(85, 370, 400, 25);
        jLabelEmail1.setFont(new Font("Thoma",Font.BOLD,17));
        jLabelEmail1.setForeground(Color.GRAY);
        panelOne.add(jLabelEmail1);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("Tahoma", Font.BOLD, 17));
        backButton.setBounds(670, 20, 90, 25);
        backButton.addActionListener(this);
        backButton.setBorder(null);
        add(backButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Check-Image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,430,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(270, -100, 600, 650);
        add(image);

        try {
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet resultSet = conn.statement.executeQuery(query);
            while(resultSet.next()) {
                labelUserName1.setText(resultSet.getString("username"));
                labelId1.setText(resultSet.getString("id"));
                jLabelNumber1.setText(resultSet.getString("number"));
                jLabelName1.setText(resultSet.getString("name"));
                jLabelGender1.setText(resultSet.getString("gender"));
                jLabelCountry1.setText(resultSet.getString("country"));
                jLabelAddress1.setText(resultSet.getString("address"));
                jLabelPhone1.setText(resultSet.getString("phone"));
                jLabelEmail1.setText(resultSet.getString("email"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        setVisible(true);

    }
    public void actionPerformed(ActionEvent actionEvent) {
        setVisible(false);
    }
}
