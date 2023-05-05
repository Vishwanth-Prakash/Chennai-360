package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener {
    JButton backButton;
    ViewBookedHotel(String username) {
        setBounds(420, 144, 926, 600);
        setLayout(null);
        getContentPane().setBackground(new Color(193, 203, 255));

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(20, 19, 350, 520);
        panelOne.setBackground(new Color(131, 143, 233));
        panelOne.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        add(panelOne);


        JLabel jLabelHeading = new JLabel("VIEW BOOKED HOTEL DETAILS");
        jLabelHeading.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jLabelHeading.setBounds(20, 10, 300, 27);
        panelOne.add(jLabelHeading);

        JLabel labelUserName = new JLabel("Username: ");
        labelUserName.setBounds(20, 70, 150, 25);
        labelUserName.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(labelUserName);

        JLabel labelUserName1 = new JLabel();
        labelUserName1.setBounds(134, 70, 150, 25);
        labelUserName1.setFont(new Font("Thoma", Font.BOLD, 20));
        labelUserName1.setForeground(Color.WHITE);
        panelOne.add(labelUserName1);

        JLabel labelHotelName = new JLabel("Hotel name: ");
        labelHotelName.setBounds(20, 110, 150, 25);
        labelHotelName.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(labelHotelName);

        JLabel labelHotelName1 = new JLabel();
        labelHotelName1.setBounds(143, 110, 300, 25);
        labelHotelName1.setFont(new Font("Thoma", Font.BOLD, 20));
        labelHotelName1.setForeground(Color.WHITE);
        panelOne.add(labelHotelName1);

        JLabel jLabelTotalPerson = new JLabel("Total Person: ");
        jLabelTotalPerson.setBounds(20, 150, 150, 25);
        jLabelTotalPerson.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelTotalPerson);

        JLabel jLabelTotalPerson1 = new JLabel();
        jLabelTotalPerson1.setBounds(158, 150, 130, 25);
        jLabelTotalPerson1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelTotalPerson1.setForeground(Color.WHITE);
        panelOne.add(jLabelTotalPerson1);

        JLabel jLabelTotalDays = new JLabel("Total days: ");
        jLabelTotalDays.setBounds(20, 190, 150, 25);
        jLabelTotalDays.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelTotalDays);

        JLabel jLabelTotalDays1 = new JLabel();
        jLabelTotalDays1.setBounds(133, 190, 130, 25);
        jLabelTotalDays1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelTotalDays1.setForeground(Color.WHITE);
        panelOne.add(jLabelTotalDays1);

        JLabel jLabelAC = new JLabel("AC/Non-AC: ");
        jLabelAC.setBounds(20, 230, 150, 25);
        jLabelAC.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelAC);

        JLabel jLabelAC1 = new JLabel();
        jLabelAC1.setBounds(140, 230, 130, 25);
        jLabelAC1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelAC1.setForeground(Color.WHITE);
        panelOne.add(jLabelAC1);

        JLabel jLabelFood= new JLabel("Food included: ");
        jLabelFood.setBounds(20, 270, 150, 25);
        jLabelFood.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelFood);

        JLabel jLabelFood1 = new JLabel();
        jLabelFood1.setBounds(170, 270, 130, 25);
        jLabelFood1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelFood1.setForeground(Color.WHITE);
        panelOne.add(jLabelFood1);

         JLabel jLabelId = new JLabel("Id: ");
        jLabelId.setBounds(20, 310, 150, 25);
        jLabelId.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelId);

        JLabel jLabelId1 = new JLabel();
        jLabelId1.setBounds(55, 310, 300, 25);
        jLabelId1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelId1.setForeground(Color.WHITE);
        panelOne.add(jLabelId1);

        JLabel jLabelIdNumber = new JLabel("Id-Number: ");
        jLabelIdNumber.setBounds(20, 350, 150, 25);
        jLabelIdNumber.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelIdNumber);

        JLabel jLabelIdNumber1 = new JLabel();
        jLabelIdNumber1.setBounds(135, 350, 130, 25);
        jLabelIdNumber1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelIdNumber1.setForeground(Color.WHITE);
        panelOne.add(jLabelIdNumber1);

        JLabel jLabelPhone = new JLabel("Phone:");
        jLabelPhone.setBounds(20, 390, 150, 25);
        jLabelPhone.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelPhone);

        JLabel jLabelPhone1 = new JLabel();
        jLabelPhone1.setBounds(97, 390, 150, 25);
        jLabelPhone1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelPhone1.setForeground(Color.WHITE);
        panelOne.add(jLabelPhone1);

        JLabel jLabelPrice = new JLabel("Total Price: ");
        jLabelPrice.setBounds(20, 430, 150, 25);
        jLabelPrice.setFont(new Font("Thoma", Font.BOLD, 20));
        panelOne.add(jLabelPrice);

        JLabel jLabelPrice1 = new JLabel();
        jLabelPrice1.setBounds(135, 430, 300, 25);
        jLabelPrice1.setFont(new Font("Thoma", Font.BOLD, 20));
        jLabelPrice1.setForeground(Color.WHITE);
        panelOne.add(jLabelPrice1);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        backButton.setBounds(121, 493, 120, 35);
        backButton.addActionListener(this);
        backButton.setBorder(BorderFactory.createLineBorder(new Color(131, 143, 233),1));
        add(backButton);

        try {
            Conn conn = new Conn();
            String query = "select * from bookhotel where username = '" + username + "'";
            ResultSet resultSet = conn.statement.executeQuery(query);
            while (resultSet.next()) {
                labelUserName1.setText(resultSet.getString("username"));
                labelHotelName1.setText(resultSet.getString("name"));
                jLabelTotalPerson1.setText(resultSet.getString("persons"));
                jLabelTotalDays1.setText(resultSet.getString("days"));
                jLabelAC1.setText(resultSet.getString("ac"));
                jLabelFood1.setText(resultSet.getString("food"));
                jLabelId1.setText(resultSet.getString("id"));
                jLabelIdNumber1.setText(resultSet.getString("number"));
                jLabelPhone1.setText(resultSet.getString("phone"));
                jLabelPrice1.setText(resultSet.getString("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Booked-Hotel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(390, 19, 500, 520);
        add(image);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == backButton) {
            setVisible(false);
        }
    }
}