package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.invoke.StringConcatException;
import java.sql.ResultSet;

public class AddCustomer extends JFrame implements ActionListener {

    JLabel labelUserName, labelName;

    JComboBox comboBoxId;
    JTextField textFieldNumber, textFieldCountry, textFieldAddress, textFieldEmail, textFieldPhoneNumber;
    JRadioButton maleRadioButton, femaleRadioButton;
    JButton addButton;

    AddCustomer(String username) {
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(131,143,233));

        JPanel panelOne = new JPanel();
        panelOne.setBounds(20,20,400,470);
        panelOne.setLayout(null);
        panelOne.setBackground(new Color(193,203,255));
        add(panelOne);

        JPanel panelTwo = new JPanel();
        panelTwo.setBounds(420,20,430,10);
        panelTwo.setLayout(null);
        panelTwo.setBackground(new Color(193,203,255));
        add(panelTwo);

        JPanel panelThree = new JPanel();
        panelThree.setBounds(400,480,440,10);
        panelThree.setLayout(null);
        panelThree.setBackground(new Color(193,203,255));
        add(panelThree);

        JLabel jLabelHeading = new JLabel("ADD CUSTOMER DETAILS");
        jLabelHeading.setFont(new Font("Tahoma",Font.PLAIN,20));
        jLabelHeading.setBounds(85, 10, 300, 27);
        panelOne.add(jLabelHeading);

        JLabel jLabelUsername = new JLabel("Username");
        jLabelUsername.setFont(new Font("Tahoma",Font.BOLD,15));
        jLabelUsername.setBounds(30, 50, 150, 25);
        panelOne.add(jLabelUsername);

        labelUserName = new JLabel();
        labelUserName.setBounds(161, 51, 150, 25);
        labelUserName.setFont(new Font("Tahoma",Font.BOLD,15));
        labelUserName.setForeground(Color.BLACK);
        panelOne.add(labelUserName);

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
        //textFieldNumber.setBounds(220, 130, 150, 25);
        panelOne.add(textFieldNumber);

        JLabel jLabelName = new JLabel("Name");
        jLabelName.setBounds(30, 170, 150, 25);
        jLabelName.setFont(new Font("Tahoma",Font.BOLD,15));
        panelOne.add(jLabelName);

        labelName = new JLabel();
        labelName.setBounds(161, 170, 150, 25);
        labelName.setFont(new Font("Tahoma",Font.BOLD,15));
        labelName.setForeground(Color.BLACK);
        panelOne.add(labelName);

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

        addButton = new JButton("Add");
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.WHITE);
        addButton.addActionListener(this);
        addButton.setBounds(150, 430, 100, 25);
        panelOne.add(addButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Add-Details.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_AREA_AVERAGING);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(440, 25, 380, 460);
        add(image);

        try {
            Conn conn = new Conn();
            String query = "select * from account where username = '"+username+"'";
            ResultSet resultSet = conn.statement.executeQuery(query);
            while (resultSet.next()) {
                labelUserName.setText(resultSet.getString("username"));
                labelName.setText(resultSet.getString("name"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == addButton) {
            String username = labelUserName.getText();
            String id = (String) comboBoxId.getSelectedItem();
            String number = textFieldNumber.getText();
            String name = labelName.getText();
            String gender;
            if (maleRadioButton.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String number_id  = textFieldNumber.getText();
            String country = textFieldCountry.getText();
            String address = textFieldAddress.getText();
            String phone = textFieldPhoneNumber.getText();
            String email = textFieldEmail.getText();
            try {
                if(number_id.equals("")) {
                    JOptionPane.showMessageDialog(null, "fill the Id-number field please");
                } else if (country.equals("")) {
                    JOptionPane.showMessageDialog(null, "fill the country field please");
                } else if(address.equals("")) {
                    JOptionPane.showMessageDialog(null, "fill the address field please");
                } else if(phone.equals("")) {
                    JOptionPane.showMessageDialog(null, "please enter the phone number");
                } else if(email.equals("")) {
                    JOptionPane.showMessageDialog(null, "fill the email field please");
                }else {
                    Conn conn = new Conn();
                        String query = "insert into customer values('" + username + "','" + id + "','" + number + "','" + name + "','" + gender + "','" + country + "','" + address + "','" + phone + "','" + email + "')";
                        conn.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Customer Details Added Successfully! you can also update personal details later");
                        setVisible(false);
                        new Dashboard(username);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
