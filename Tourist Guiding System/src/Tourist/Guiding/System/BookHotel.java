package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotel extends JFrame implements ActionListener {
    Choice choiceHotel, ChoiceAcOrNonAc, ChoiceFood;
    JTextField textFieldPersons, textFieldNumberOfDays;
    String username;

    JLabel labelUserName1, labelId1, jLabelNumber1, jLabelPhone1, jLabelPrice;

    JButton checkPriceButton, backButton, bookHotelButton;
    BookHotel(String username) {
        this.username = username;
        setBounds(380, 144, 1100, 570);
        getContentPane().setBackground(new Color(131,143,233));
        setLayout(null);

        JLabel text = new JLabel("BOOK HOTELS");
        text.setBounds(175, 11, 300, 53);
        text.setFont(new Font("Tahoma",Font.PLAIN,23));
        add(text);

        JLabel labelUserName = new JLabel("Username: ");
        labelUserName.setBounds(60, 70, 200, 20);
        labelUserName.setFont(new Font("Thoma",Font.BOLD,18));
        add(labelUserName);

        labelUserName1 = new JLabel();
        labelUserName1.setBounds(250, 70, 200, 20);
        labelUserName1.setFont(new Font("Thoma",Font.BOLD,18));
        labelUserName1.setForeground(Color.DARK_GRAY);
        add(labelUserName1);

        JLabel labelSelectPackage = new JLabel("Select Hotel");
        labelSelectPackage.setBounds(60, 110, 180, 20);
        labelSelectPackage.setFont(new Font("Thoma",Font.BOLD,18));
        add(labelSelectPackage);

        choiceHotel = new Choice();
        choiceHotel.setBounds(250, 110, 190, 30);
        add(choiceHotel);

        try {
            Conn conn = new Conn();
            ResultSet resultSet = conn.statement.executeQuery("select * from hotel");
            while(resultSet.next()) {
                choiceHotel.add(resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel LabelTotalPersons  = new JLabel("Total Persons");
        LabelTotalPersons.setBounds(60, 150, 150, 20);
        LabelTotalPersons.setFont(new Font("Thoma",Font.BOLD,18));
        add(LabelTotalPersons);

        textFieldPersons = new JTextField("1");
        textFieldPersons.setBounds(250, 150, 100,25);
        add(textFieldPersons);

        JLabel LabelNumberOfDays  = new JLabel("No of Days");
        LabelNumberOfDays.setBounds(60, 190, 150, 25);
        LabelNumberOfDays.setFont(new Font("Thoma",Font.BOLD,18));
        add(LabelNumberOfDays);

        textFieldNumberOfDays = new JTextField("1");
        textFieldNumberOfDays.setBounds(250, 190, 100,25);
        add(textFieldNumberOfDays);

        JLabel LabelAC  = new JLabel("Ac/Non-Ac");
        LabelAC.setBounds(60, 230, 150, 25);
        LabelAC.setFont(new Font("Thoma",Font.BOLD,18));
        add(LabelAC);

        ChoiceAcOrNonAc = new Choice();
        ChoiceAcOrNonAc.add("AC");
        ChoiceAcOrNonAc.add("Non-AC");
        ChoiceAcOrNonAc.setBounds(250, 230, 100, 25);
        add(ChoiceAcOrNonAc);

        JLabel LabelFood  = new JLabel("Food Included");
        LabelFood.setBounds(60, 270, 150, 25);
        LabelFood.setFont(new Font("Thoma",Font.BOLD,18));
        add(LabelFood);

        ChoiceFood = new Choice();
        ChoiceFood.add("Yes");
        ChoiceFood.add("No");
        ChoiceFood.setBounds(250,270,100,20);
        add(ChoiceFood);


        JLabel jLabelId  = new JLabel("Id: ");
        jLabelId.setBounds(60, 310, 150, 20);
        jLabelId.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelId);

        labelId1 = new JLabel();
        labelId1.setBounds(250, 310, 150, 25);
        labelId1.setFont(new Font("Thoma",Font.BOLD,18));
        labelId1.setForeground(Color.DARK_GRAY);
        add(labelId1);


        JLabel jLabelNumber = new JLabel("Number");
        jLabelNumber.setBounds(60, 350, 150, 25);
        jLabelNumber.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelNumber);

        jLabelNumber1 = new JLabel();
        jLabelNumber1.setBounds(250, 350, 150, 25);
        jLabelNumber1.setFont(new Font("Thoma",Font.BOLD,18));
        jLabelNumber1.setForeground(Color.DARK_GRAY);
        add(jLabelNumber1);

        JLabel jLabelPhone = new JLabel("Phone");
        jLabelPhone.setBounds(60, 390, 150, 20);
        jLabelPhone.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelPhone);

        jLabelPhone1 = new JLabel();
        jLabelPhone1.setBounds(250, 390, 200, 25);
        jLabelPhone1.setFont(new Font("Thoma",Font.BOLD,18));
        jLabelPhone1.setForeground(Color.DARK_GRAY);
        add(jLabelPhone1);

        JLabel jLabelTotalPrice = new JLabel("Total Price");
        jLabelTotalPrice.setBounds(60, 430, 150, 25);
        jLabelTotalPrice.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelTotalPrice);

        jLabelPrice = new JLabel();
        jLabelPrice.setBounds(250, 430, 150, 25);
        jLabelPrice.setFont(new Font("Thoma",Font.BOLD,18));
        jLabelPrice.setForeground(Color.DARK_GRAY);
        add(jLabelPrice);

        try {
            Conn conn1 = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet resultSet = conn1.statement.executeQuery(query);
            while(resultSet.next()) {
                labelUserName1.setText(resultSet.getString("username"));
                labelId1.setText(resultSet.getString("id"));
                jLabelNumber1.setText(resultSet.getString("number"));
                jLabelPhone1.setText(resultSet.getString("phone"));

            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        checkPriceButton = new JButton("Check Price");
        checkPriceButton.setBackground(Color.BLACK);
        checkPriceButton.setForeground(Color.WHITE);
        checkPriceButton.setBounds(60,470, 120, 25);
        checkPriceButton.addActionListener(this);
        add(checkPriceButton);

        bookHotelButton = new JButton("Book Hotel");
        bookHotelButton.setBackground(Color.BLACK);
        bookHotelButton.setForeground(Color.WHITE);
        bookHotelButton.setBounds(200,470, 120, 25);
        bookHotelButton.addActionListener(this);
        add(bookHotelButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(340,470, 120, 25);
        backButton.addActionListener(this);
        add(backButton);

        JPanel panelOne = new JPanel();
        panelOne.setBounds(13,15,500,500);
        panelOne.setBackground(new Color(193, 203, 255));
        panelOne.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        add(panelOne);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Book-Hotel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(523, 16, 553, 500);
        add(image);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == checkPriceButton) {

            try {
                Conn conn = new Conn();
                ResultSet resultSet = conn.statement.executeQuery("select * from hotel where name ='"+choiceHotel.getSelectedItem()+"'");
                while(resultSet.next()) {
                    double cost = Double.parseDouble(resultSet.getString("costperperson"));
                    double ac = Double.parseDouble(resultSet.getString("acroom"));
                    double food = Double.parseDouble(resultSet.getString("foodincluded"));

                    int person = Integer.parseInt(textFieldPersons.getText());
                    int days = Integer.parseInt(textFieldNumberOfDays.getText());

                    String acSelected = ChoiceAcOrNonAc.getSelectedItem();
                    String foodSelected = ChoiceFood.getSelectedItem();

                    if(person * days > 0) {
                        double totalPrice = 0;
                        totalPrice += acSelected.equals("AC") ? ac : 0;
                        totalPrice += foodSelected.equals("Yes") ? food :0;
                        totalPrice += cost;
                        totalPrice = totalPrice * person * days;
                        jLabelPrice.setText("Rs: " + totalPrice);
                    } else {
                        JOptionPane.showMessageDialog(null,"please enter a valid number");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (actionEvent.getSource() == bookHotelButton) {
            try {
                Conn conn = new Conn();
                String query = "insert into bookhotel values('"+labelUserName1.getText()+"','"+choiceHotel.getSelectedItem()+"', '"+textFieldPersons.getText()+"','"+textFieldNumberOfDays.getText()+"', '"+ChoiceAcOrNonAc.getSelectedItem()+"','"+ChoiceFood.getSelectedItem()+"', '"+labelId1.getText()+"','"+jLabelNumber1.getText()+"','"+jLabelPhone1.getText()+"','"+jLabelPrice.getText()+"')";
                conn.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
}
