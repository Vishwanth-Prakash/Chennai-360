package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails, updatePersonalDetails, viewPersonalDetails,
            checkPackages, bookPackages, viewPackages, viewBookedHotel,
            viewHotels, destinations, bookHotel, payments, calculator,
            aboutUs, deletePersonalDetails, logOutButton, aboutChennai;

    Dashboard(String username) {
        this.username = username;
        setBounds(0,0,1600,1000);
        setLayout(null);

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBackground(Color.BLACK);
        panelOne.setBounds(0,0,1600,115);
        add(panelOne);

        JPanel panelThree = new JPanel();
        panelThree.setLayout(null);
        panelThree.setBackground(Color.BLACK);
        panelThree.setBounds(1500,0,30,1600);
        add(panelThree);

        JPanel panelFour = new JPanel();
        panelFour.setLayout(null);
        panelFour.setBackground(Color.BLACK);
        panelFour.setBounds(0,766,1500,30);
        add(panelFour);

        JPanel panelFive = new JPanel();
        panelFive.setLayout(null);
        panelFive.setBackground(Color.WHITE);
        panelFive.setBounds(113,55,223,10);
        panelOne.add(panelFive);

        JPanel panelSix = new JPanel();
        panelSix.setLayout(null);
        panelSix.setBackground(Color.WHITE);
        panelSix.setBounds(113,72,187,10);
        panelOne.add(panelSix);

        JPanel panelSeven = new JPanel();
        panelSeven.setLayout(null);
        panelSeven.setBackground(Color.WHITE);
        panelSeven.setBounds(113,89,151,10);
        panelOne.add(panelSeven);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("visitingPlaces/location12.jpg"));
        Image I2 = I1.getImage().getScaledInstance(1200,1000,Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Icon = new JLabel(I3);
        Icon.setBounds(280, 65, 1240, 1100);
        add(Icon);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/dashboard-icon.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(-11, -8, 140, 130);
        panelOne.add(icon);



        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(110, -20, 350, 100);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,42));
        panelOne.add(heading);

        JLabel title = new JLabel("TOURIST GUIDING SYSTEM");
        title.setBounds(500, 10, 900, 100);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Tahoma",Font.PLAIN,60));
        panelOne.add(title);

        JPanel panelTwo = new JPanel();
        panelTwo.setLayout(null);
        panelTwo.setBackground(Color.BLACK);
        panelTwo.setBounds(0,65,300,900);
        add(panelTwo);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(131,143,233));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0, 0,0,30));
        updatePersonalDetails.addActionListener(this);
        panelTwo.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(131,143,233));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0, 0,0,50));
        viewPersonalDetails.addActionListener(this);
        panelTwo.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(131,143,233));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0, 0,0,40));
        deletePersonalDetails.addActionListener(this);
        panelTwo.add(deletePersonalDetails);

        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(131,143,233));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Thoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0, 0,0,110));
        checkPackages.addActionListener(this);
        panelTwo.add(checkPackages);

        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(131,143,233));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Thoma",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0, 0,0,120));
        bookPackages.addActionListener(this);
        panelTwo.add(bookPackages);

        viewPackages = new JButton("View Packages");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(131,143,233));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Thoma",Font.PLAIN,20));
        viewPackages.setMargin(new Insets(0, 0,0,120));
        viewPackages.addActionListener(this);
        panelTwo.add(viewPackages);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(131,143,233));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Thoma",Font.PLAIN,20));
        viewHotels.setMargin(new Insets(0, 0,0,140));
        viewHotels.addActionListener(this);
        panelTwo.add(viewHotels);

        bookHotel = new JButton("Book Hotels");
        bookHotel.setBounds(0,400,300,50);
        bookHotel.setBackground(new Color(131,143,233));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Thoma",Font.PLAIN,20));
        bookHotel.setMargin(new Insets(0, 0,0,140));
        bookHotel.addActionListener(this);
        panelTwo.add(bookHotel);

        viewBookedHotel = new JButton("View Booked Hotels");
        viewBookedHotel.setBounds(0,450,300,50);
        viewBookedHotel.setBackground(new Color(131,143,233));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Thoma",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0, 0,0,70));
        viewBookedHotel.addActionListener(this);
        panelTwo.add(viewBookedHotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(131,143,233));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Thoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0, 0,0,125));
        destinations.addActionListener(this);
        panelTwo.add(destinations);

        payments = new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(131,143,233));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Thoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0, 0,0,155));
        payments.addActionListener(this);
        panelTwo.add(payments);

        logOutButton = new JButton("Logout");
        logOutButton.setBounds(0,600,300,50);
        logOutButton.setBackground(new Color(131,143,233));
        logOutButton.setForeground(Color.WHITE);
        logOutButton.setFont(new Font("Thoma",Font.PLAIN,20));
        logOutButton.setMargin(new Insets(0, 0,0,180));
        logOutButton.addActionListener(this);
        panelTwo.add(logOutButton);

        calculator = new JButton("Calculator");
        calculator.setBounds(0,650,300,50);
        calculator.setBackground(new Color(131,143,233));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Thoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0, 0,0,145));
        calculator.addActionListener(this);
        panelTwo.add(calculator);

        aboutUs = new JButton("About Project");
        aboutUs.setBounds(1370,6,150,30);
        aboutUs.setBackground(new Color(131,143,233));
        aboutUs.setForeground(Color.BLACK);
        aboutUs.setFont(new Font("Thoma",Font.BOLD,15));
        aboutUs.addActionListener(this);
        add(aboutUs);

        aboutChennai = new JButton("About Chennai");
        aboutChennai.setBounds(1370,40,150,30);
        aboutChennai.setBackground(new Color(131,143,233));
        aboutChennai.setForeground(Color.BLACK);
        aboutChennai.setFont(new Font("Thoma",Font.BOLD,15));
        aboutChennai.addActionListener(this);
        add(aboutChennai);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if(actionEvent.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if(actionEvent.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if(actionEvent.getSource() == checkPackages) {
            new CheckPackage();
        } else if(actionEvent.getSource() == bookPackages) {
            new BookPackage(username);
        } else if(actionEvent.getSource() == viewPackages) {
            new ViewPackage(username);
        } else if(actionEvent.getSource() == viewHotels) {
            new CheckHotels( 0,0);
        } else if(actionEvent.getSource() == destinations) {
            new CheckDestination(0,0);
        } else if(actionEvent.getSource() == bookHotel) {
            new BookHotel(username);
        } else if(actionEvent.getSource() == payments) {
            new Payment();
        } else if(actionEvent.getSource() == calculator) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(actionEvent.getSource() == aboutUs) {
            new AboutUs();
        } else if(actionEvent.getSource() == deletePersonalDetails) {
            new DeleteDetails(username);
        } else if(actionEvent.getSource() == viewBookedHotel) {
            new ViewBookedHotel(username);
        } else if(actionEvent.getSource() == logOutButton) {
            new LogOut();
        } else if(actionEvent.getSource() == aboutChennai) {
            new AboutChennai();
        }
    }
}
