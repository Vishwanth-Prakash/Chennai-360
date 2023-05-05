package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackage extends JFrame implements ActionListener {

    JButton backButton;

    ViewPackage(String username) {
        setBounds(300, 144, 406, 440);
        setLayout(null);
        getContentPane().setBackground(new Color(193, 203, 255));

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(20, 20, 350, 300);
        panelOne.setBackground(new Color(131, 143, 233));
        add(panelOne);


        JLabel jLabelHeading = new JLabel("VIEW PACKAGE DETAILS");
        jLabelHeading.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabelHeading.setBounds(55, 10, 300, 27);
        panelOne.add(jLabelHeading);

        JLabel labelUserName = new JLabel("Username: ");
        labelUserName.setBounds(20, 70, 150, 25);
        labelUserName.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(labelUserName);

        JLabel labelUserName1 = new JLabel();
        labelUserName1.setBounds(130, 70, 150, 25);
        labelUserName1.setFont(new Font("Thoma", Font.BOLD, 20));
        labelUserName1.setForeground(Color.WHITE);
        panelOne.add(labelUserName1);

        JLabel labelPackage = new JLabel("Package: ");
        labelPackage.setBounds(20, 100, 150, 25);
        labelPackage.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(labelPackage);

        JLabel labelPackage1 = new JLabel();
        labelPackage1.setBounds(116, 100, 200, 25);
        labelPackage1.setFont(new Font("Thoma", Font.BOLD, 20));
        labelPackage1.setForeground(Color.WHITE);
        panelOne.add(labelPackage1);

        JLabel jLabelTotalPerson = new JLabel("Total Person: ");
        jLabelTotalPerson.setBounds(20, 130, 150, 25);
        jLabelTotalPerson.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelTotalPerson);

        JLabel jLabelTotalPerson1 = new JLabel();
        jLabelTotalPerson1.setBounds(154, 130, 130, 25);
        jLabelTotalPerson1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelTotalPerson1.setForeground(Color.WHITE);
        panelOne.add(jLabelTotalPerson1);

        JLabel jLabelId = new JLabel("Id: ");
        jLabelId.setBounds(20, 160, 150, 25);
        jLabelId.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelId);

        JLabel jLabelId1 = new JLabel();
        jLabelId1.setBounds(48, 160, 300, 25);
        jLabelId1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelId1.setForeground(Color.WHITE);
        panelOne.add(jLabelId1);

        JLabel jLabelIdNumber = new JLabel("Id-Number: ");
        jLabelIdNumber.setBounds(20, 190, 150, 25);
        jLabelIdNumber.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelIdNumber);

        JLabel jLabelIdNumber1 = new JLabel();
        jLabelIdNumber1.setBounds(130, 190, 130, 25);
        jLabelIdNumber1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelIdNumber1.setForeground(Color.WHITE);
        panelOne.add(jLabelIdNumber1);

        JLabel jLabelPhone = new JLabel("Phone:");
        jLabelPhone.setBounds(20, 220, 150, 25);
        jLabelPhone.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelPhone);

        JLabel jLabelPhone1 = new JLabel();
        jLabelPhone1.setBounds(95, 220, 150, 25);
        jLabelPhone1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelPhone1.setForeground(Color.WHITE);
        panelOne.add(jLabelPhone1);

        JLabel jLabelPrice = new JLabel("Total Price: ");
        jLabelPrice.setBounds(20, 250, 150, 25);
        jLabelPrice.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelPrice);

        JLabel jLabelPrice1 = new JLabel();
        jLabelPrice1.setBounds(135, 250, 300, 25);
        jLabelPrice1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelPrice1.setForeground(Color.WHITE);
        panelOne.add(jLabelPrice1);

        backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(new Color(131, 143, 233));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        backButton.setBounds(121, 341, 120, 35);
        backButton.addActionListener(this);
        backButton.setBorder(BorderFactory.createLineBorder(new Color(131, 143, 233),1));
        add(backButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 400, 600, 200);
        add(image);

        try {
            Conn conn = new Conn();
            String query = "select * from bookpackage where username = '" + username + "'";
            ResultSet resultSet = conn.statement.executeQuery(query);
            while (resultSet.next()) {
                labelUserName1.setText(resultSet.getString("username"));
                labelPackage1.setText(resultSet.getString("package"));
                jLabelTotalPerson1.setText(resultSet.getString("persons"));
                jLabelId1.setText(resultSet.getString("id"));
                jLabelIdNumber1.setText(resultSet.getString("number"));
                jLabelPhone1.setText(resultSet.getString("phone"));
                jLabelPrice1.setText(resultSet.getString("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(true);

    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == backButton) {
            setVisible(false);
        }
    }
}