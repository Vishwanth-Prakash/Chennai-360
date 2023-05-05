package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {
    JComboBox comboBoxId;
    JTextField textFieldNumber, textFieldCountry, textFieldAddress, textFieldEmail, textFieldPhoneNumber, textFieldUsername, textFieldName;
    JRadioButton maleRadioButton, femaleRadioButton;
    JButton UpdateButton, backButton;
    String username;

    UpdateCustomer(String username) {
        this.username = username;

        setBounds(500, 144, 866, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(131,143,233));

        JPanel panelOne = new JPanel();
        panelOne.setBounds(21,18,400,470);
        panelOne.setLayout(null);
        panelOne.setBackground(new Color(193,203,255));
        panelOne.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        add(panelOne);

        JLabel jLabelHeading = new JLabel("UPDATE CUSTOMER DETAILS");
        jLabelHeading.setFont(new Font("Tahoma",Font.PLAIN,20));
        jLabelHeading.setBounds(62, 10, 300, 27);
        panelOne.add(jLabelHeading);

        JLabel jLabelUsername = new JLabel("Username");
        jLabelUsername.setFont(new Font("Tahoma",Font.BOLD,15));
        jLabelUsername.setBounds(30, 50, 150, 25);
        panelOne.add(jLabelUsername);

        JLabel jLabelUsername1 = new JLabel(username);
        jLabelUsername1.setBounds(161, 51, 220, 25);
        jLabelUsername1.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelUsername1);

        JLabel jLabelId = new JLabel("Id");
        jLabelId.setBounds(30, 90, 150, 25);
        jLabelId.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelId);

        comboBoxId = new JComboBox(new String[]{"Passport", "Adhar Card", "Pan Card", "Ration Card"});
        comboBoxId.setBounds(161, 90, 220, 25);
        comboBoxId.setBackground(Color.WHITE);
        panelOne.add(comboBoxId);

        JLabel jLabelNumber = new JLabel("Id-Number");
        jLabelNumber.setBounds(30, 130, 150, 25);
        jLabelNumber.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(161, 130, 220, 25);
        textFieldNumber.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldNumber);

        JLabel jLabelName = new JLabel("Name");
        jLabelName.setBounds(30, 170, 150, 25);
        jLabelName.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(161, 170, 220, 25);
        textFieldName.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldName);

        JLabel jLabelGender = new JLabel("Gender");
        jLabelGender.setBounds(30, 210, 150, 25);
        jLabelGender.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelGender);

        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(160, 210, 70, 25);
        maleRadioButton.setBackground(Color.WHITE);
        panelOne.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(250, 210, 70, 25);
        femaleRadioButton.setBackground(Color.WHITE);
        panelOne.add(femaleRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);

        JLabel jLabelCountry = new JLabel("Country");
        jLabelCountry.setBounds(30, 250, 150, 25);
        jLabelCountry.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelCountry);

        textFieldCountry = new JTextField();
        textFieldCountry.setBounds(161, 250, 220, 25);
        textFieldCountry.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldCountry);

        JLabel jLabelAddress = new JLabel("Address");
        jLabelAddress.setBounds(30, 290, 150, 25);
        jLabelAddress.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelAddress);

        textFieldAddress = new JTextField();
        textFieldAddress.setBounds(161, 290, 220, 25);
        textFieldAddress.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldAddress);


        JLabel jLabelPhoneNumber = new JLabel("Phone Number");
        jLabelPhoneNumber.setBounds(30, 330, 150, 25);
        jLabelPhoneNumber.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelPhoneNumber);

        textFieldPhoneNumber = new JTextField();
        textFieldPhoneNumber.setBounds(161, 330, 220, 25);
        textFieldPhoneNumber.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldPhoneNumber);

        JLabel jLabelEmail = new JLabel("Email");
        jLabelEmail.setBounds(30, 370, 150, 25);
        jLabelEmail.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(161, 370, 220, 25);
        textFieldEmail.setBorder(BorderFactory.createLineBorder(new Color(131,143,233),1));
        panelOne.add(textFieldEmail);

        UpdateButton = new JButton("Update");
        UpdateButton.setBackground(Color.BLACK);
        UpdateButton.setForeground(Color.WHITE);
        UpdateButton.addActionListener(this);
        UpdateButton.setBounds(70, 430, 100, 25);
        panelOne.add(UpdateButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        backButton.setBounds(220, 430, 100, 25);
        panelOne.add(backButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Update-Image.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(435, 19, 400, 470);
        add(image);

        try {
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet resultSet = conn.statement.executeQuery(query);
            while (resultSet.next()) {
                textFieldName.setText(resultSet.getString("name"));
                comboBoxId.setToolTipText(resultSet.getString("id"));
                textFieldNumber.setText(resultSet.getString("number"));
                textFieldCountry.setText(resultSet.getString("country"));
                textFieldAddress.setText(resultSet.getString("address"));
                textFieldPhoneNumber.setText(resultSet.getString("phone"));
                textFieldEmail.setText(resultSet.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == UpdateButton) {
            String id = (String) comboBoxId.getSelectedItem();
            String number = textFieldNumber.getText();
            String name = textFieldName.getText();
            String gender;
            if (maleRadioButton.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String country = textFieldCountry.getText();
            String address = textFieldAddress.getText();
            String phone = textFieldPhoneNumber.getText();
            String email = textFieldEmail.getText();

            try {
                if (country.equals("")) {
                    JOptionPane.showMessageDialog(null, "fill the country field please");
                    //add similar condition for rest of the fields,
                } else {
                    Conn conn = new Conn();
                    String query1 = "update customer set id = '" + id + "',number = '" + number + "',name = '" + name + "',gender = '" + gender + "',country = '" + country + "',address = '" + address + "',phone ='" + phone + "',email = '" + email + "' where username = '"+username+"'";
                    String query2 = "update account set name = '" + name + "' where username = '"+username+"'";
                    conn.statement.executeUpdate(query1);
                    conn.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Customer Details updated Successfully");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }
}
