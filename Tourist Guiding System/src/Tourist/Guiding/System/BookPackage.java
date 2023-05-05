package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {
    Choice choicePackage;
    JTextField textFieldPersons;
    String username;

    JLabel labelUserName1, labelId1, jLabelNumber1, jLabelPhone1, jLabelPrice;

    JButton checkPriceButton, backButton, bookPackageButton;
    BookPackage(String username) {
        this.username = username;

        setBounds(380, 144, 1117, 480);
        getContentPane().setBackground(new Color(131, 143, 233));
        setLayout(null);

        JLabel text = new JLabel("BOOK PACKAGES");
        text.setBounds(150, 20 , 400, 30);
        text.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(text);

        JLabel labelUserName = new JLabel("Username: ");
        labelUserName.setBounds(40, 70, 100, 20);
        labelUserName.setFont(new Font("Thoma",Font.BOLD,18));
        add(labelUserName);

        labelUserName1 = new JLabel();
        labelUserName1.setBounds(250, 70, 190, 20);
        labelUserName1.setFont(new Font("Thoma",Font.BOLD,18));
        labelUserName1.setForeground(Color.DARK_GRAY);
        add(labelUserName1);

        JLabel labelSelectPackage = new JLabel("Select Package");
        labelSelectPackage.setBounds(40, 110, 150, 20);
        labelSelectPackage.setFont(new Font("Thoma",Font.BOLD,18));
        add(labelSelectPackage);

        choicePackage = new Choice();
        choicePackage.add("Gold Package");
        choicePackage.add("Silver Package");
        choicePackage.add("Bronze Package");
        choicePackage.setBounds(250, 110, 150, 20);
        add(choicePackage);



        JLabel LabelTotalPersons  = new JLabel("Total Persons");
        LabelTotalPersons.setBounds(40, 150, 150, 25);
        LabelTotalPersons.setFont(new Font("Thoma",Font.BOLD,18));
        add(LabelTotalPersons);

        textFieldPersons = new JTextField("1");
        textFieldPersons.setBounds(250, 150, 149,25);
        textFieldPersons.setBorder(BorderFactory.createLineBorder(new Color(131, 143, 233),1));
        add(textFieldPersons);

        JLabel jLabelId  = new JLabel("Id: ");
        jLabelId.setBounds(40, 190, 150, 20);
        jLabelId.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelId);

        labelId1 = new JLabel();
        labelId1.setBounds(250, 190, 150, 25);
        labelId1.setFont(new Font("Thoma",Font.BOLD,18));
        labelId1.setForeground(Color.DARK_GRAY);
        add(labelId1);


        JLabel jLabelNumber = new JLabel("Id-Number");
        jLabelNumber.setBounds(40, 230, 150, 25);
        jLabelNumber.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelNumber);

        jLabelNumber1 = new JLabel();
        jLabelNumber1.setBounds(250, 230, 150, 25);
        jLabelNumber1.setFont(new Font("Thoma",Font.BOLD,18));
        jLabelNumber1.setForeground(Color.DARK_GRAY);
        add(jLabelNumber1);

        JLabel jLabelPhone = new JLabel("Phone");
        jLabelPhone.setBounds(40, 270, 150, 20);
        jLabelPhone.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelPhone);

        jLabelPhone1 = new JLabel();
        jLabelPhone1.setBounds(250, 270, 200, 25);
        jLabelPhone1.setFont(new Font("Thoma",Font.BOLD,18));
        jLabelPhone1.setForeground(Color.DARK_GRAY);
        add(jLabelPhone1);

        JLabel jLabelTotalPrice = new JLabel("Total Price");
        jLabelTotalPrice.setBounds(40, 310, 150, 25);
        jLabelTotalPrice.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelTotalPrice);

        jLabelPrice = new JLabel();
        jLabelPrice.setBounds(250, 310, 150, 25);
        jLabelPrice.setFont(new Font("Thoma",Font.BOLD,18));
        add(jLabelPrice);

        try {
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet resultSet = conn.statement.executeQuery(query);
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
        checkPriceButton.setBounds(60,380, 120, 25);
        checkPriceButton.addActionListener(this);
        add(checkPriceButton);

        bookPackageButton = new JButton("Book Package");
        bookPackageButton.setBackground(Color.BLACK);
        bookPackageButton.setForeground(Color.WHITE);
        bookPackageButton.setBounds(200,380, 120, 25);
        bookPackageButton.addActionListener(this);
        add(bookPackageButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(340,380, 120, 25);
        backButton.addActionListener(this);
        add(backButton);

        JPanel panelOne = new JPanel();
        panelOne.setBounds(21,10,500,420);
        panelOne.setBackground(new Color(193, 203, 255));
        panelOne.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        add(panelOne);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Book-package.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(533, 10, 553, 420);
        add(image);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == checkPriceButton) {
            String packageName = choicePackage.getSelectedItem();
            double cost = 0;
            if(packageName.equals("Gold Package")) {
                cost += 32000;
            } else if(packageName.equals("Silver Package")) {
                cost += 25000;
            } else {
                cost += 12000;
            }

            double personsCount = Double.parseDouble(textFieldPersons.getText());
            cost *= personsCount;
            jLabelPrice.setText("Rs " + cost);


        } else if (actionEvent.getSource() == bookPackageButton) {
            try {
                Conn conn = new Conn();
                String query = "insert into bookPackage values('"+labelUserName1.getText()+"', '"+choicePackage.getSelectedItem()+"', '"+textFieldPersons.getText()+"','"+labelId1.getText()+"', '"+jLabelNumber1.getText()+"','"+jLabelPhone1.getText()+"', '"+jLabelPrice.getText()+"')";
                conn.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
}
