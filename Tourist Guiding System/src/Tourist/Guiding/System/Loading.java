package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar progressBar;
    String name, username;

    public void run() {
        try {
            for(int i = 1; i <= 101; i++) {
                int max = progressBar.getMaximum(); //100
                int value = progressBar.getValue();

                if(value < max) {
                    progressBar.setValue(progressBar.getValue() + 1);
                } else {
                    Conn conn = new Conn();
                    String query = "select * from customer where username = '"+username+"'";
                    ResultSet resultSet = conn.statement.executeQuery(query);
                    if(resultSet.next()) {
                        setVisible(false);
                        new Dashboard(username);
                    } else {
                        setVisible(false);
                        new AddCustomer(username);
                    }
                }
                Thread.sleep(20);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    Loading(String name, String username) {
        this.name = name;
        this.username = username;
        t = new Thread(this);
        setBounds(500, 200, 650, 250);
        getContentPane().setBackground(new Color(131,143,233));
        setLayout(null);

        JLabel jLabelTitle = new JLabel(("Travel Guiding System"));
        jLabelTitle.setBounds(130,20,600,45);
        jLabelTitle.setForeground(Color.WHITE);
        jLabelTitle.setFont(new Font("Raleway",Font.BOLD,35));
        add(jLabelTitle);

        progressBar = new JProgressBar();
        progressBar.setBounds(170, 80, 300, 20); //actual height is 35
        progressBar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.white);
        progressBar.setBorderPainted(false); // will choose whether to fix border or not
        add(progressBar);

        JLabel jLabelLoading = new JLabel(("Loading, Please Wait..."));
        jLabelLoading.setBounds(230,110,200,30);
        jLabelLoading.setForeground(Color.BLACK);
        jLabelLoading.setFont(new Font("Raleway",Font.BOLD,16));
        add(jLabelLoading);

        JLabel jLabelUserName = new JLabel(("Welcome " + this.name));
        jLabelUserName.setBounds(20,165,400,40); // original lb1username.setBounds(20,310,400,40);
        jLabelUserName.setForeground(Color.BLACK);
        jLabelUserName.setFont(new Font("Raleway",Font.BOLD,16));
        add(jLabelUserName);

        t.start();
        setVisible(true);
    }
}
