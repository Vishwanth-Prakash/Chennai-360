package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    CheckPackage() {
        setBounds(470, 144, 900, 560);
        getContentPane().setBackground(Color.WHITE);

        JTabbedPane tab = new JTabbedPane();
        tab.setBackground(Color.WHITE);
        String[] packageOne = {"GOLD PACKAGE","1. Trip around Coast",
                "2. Airport Assistance","3. Half Day City Tour",
                "4. unlimited buffet","5. Welcome Drink on Arrival",
                "6. 5-star hotel stay", "7. Transportation facility",
                "8. English Speaking Guide","Price: Rs 32000/-", "Marina beach+MGR memorial+Anna memorial+Jayalalitha memorial",
                "images/Gold-Package-Image.jpg"};
        String[] packageTwo = {"SILVER PACKAGE","1. 4 Days",
                "2. 30% discount-Zomato","3. Half Day City Tour",
                "4. Daily Buffet","5. 3 star hotel stay",
                "6. 1-day chennai tour", "7. Transportation facility",
                "8. Tourist Guide","Price: Rs 25000/-","Valluvar Kottam+Chennai Rail Museum+VGP Marine Kingdom", "images/Silver-Package-Image.jpg"};
        String[] packageThree = {"BRONZE PACKAGE","1. 3 Days",
                "2. travel Assistance","3. Half Day City Tour",
                "4. First day Buffet","5. Welcome Drink on Arrival",
                "6. 50% discount-new customer", "7. Full Day 3 Island Cruise",
                "8. No Guide is provided","Price: Rs 12000/-","Chennai Government museum+National Art Gallery+Connemara Public Library" ,"images/Bronze-Package-Image.jpg"};

        JPanel panelOne = createPackage(packageOne, new Color(255,255,150),50);
        panelOne.setBackground(new Color(255,255,150));
        tab.addTab("package 1",null,panelOne);

        JPanel panelOne1 = new JPanel();
        panelOne1.setBounds(23,20,300,450);
        panelOne1.setBackground(new Color(255,215,0));
        panelOne1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        panelOne.add(panelOne1);

        JPanel panelTwo = createPackage(packageTwo,new Color(250,250,250),41);
        panelTwo.setBackground(new Color(250,250,250));
        tab.addTab("package 2",null,panelTwo);

        JPanel panelTwo1 = new JPanel();
        panelTwo1.setBounds(23,20,300,450);
        panelTwo1.setBackground(new Color(192,192,192));
        panelTwo1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        panelTwo.add(panelTwo1);

        JPanel panelThree = createPackage(packageThree,new Color(196, 164, 132),35);
        panelThree.setBackground(new Color(196, 164, 132));
        tab.addTab("package 3",null,panelThree);

        JPanel panelThree1 = new JPanel();
        panelThree1.setBounds(23,20,300,450);
        panelThree1.setBackground(new Color(160,82,45));
        panelThree1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        panelThree.add(panelThree1);

        add(tab);
        setVisible(true);
    }
    public JPanel createPackage(String[] data, Color color,int x) {

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBackground(Color.WHITE);

        JLabel jLabelOne = new JLabel(data[0]);
        jLabelOne.setBounds(x, 30 , 300, 30);
        jLabelOne.setForeground(color);
        jLabelOne.setFont(new Font("Tahoma",Font.BOLD,30));
        panelOne.add(jLabelOne);

        JLabel jLabelTwo = new JLabel(data[1]);
        jLabelTwo.setBounds(30, 70, 300, 30);
        jLabelTwo.setForeground(Color.BLACK);
        jLabelTwo.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(jLabelTwo);

        JLabel jLabelThree = new JLabel(data[2]);
        jLabelThree.setBounds(30, 110, 300, 30);
        jLabelThree.setForeground(Color.BLACK);
        jLabelThree.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(jLabelThree);

        JLabel jLabelFour = new JLabel(data[3]);
        jLabelFour.setBounds(30, 160, 300, 30);
        jLabelFour.setForeground(Color.BLACK);
        jLabelFour.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(jLabelFour);

        JLabel LabelFive = new JLabel(data[4]);
        LabelFive.setBounds(30, 210, 300, 30);
        LabelFive.setForeground(Color.BLACK);
        LabelFive.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(LabelFive);

        JLabel LabelSix = new JLabel(data[5]);
        LabelSix.setBounds(30, 260, 300, 30);
        LabelSix.setForeground(Color.BLACK);
        LabelSix.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(LabelSix);

        JLabel LabelSeven = new JLabel(data[6]);
        LabelSeven.setBounds(30, 310, 300, 30);
        LabelSeven.setForeground(Color.BLACK);
        LabelSeven.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(LabelSeven);

        JLabel LabelEight = new JLabel(data[7]);
        LabelEight.setBounds(30, 360, 300, 30);
        LabelEight.setForeground(Color.BLACK);
        LabelEight.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(LabelEight);

        JLabel LabelNine = new JLabel(data[8]);
        LabelNine.setBounds(30, 410, 300, 30);
        LabelNine.setForeground(Color.BLACK);
        LabelNine.setFont(new Font("Tahoma",Font.BOLD, 20));
        panelOne.add(LabelNine);

        JLabel LabelPrice = new JLabel(data[9]);
        LabelPrice.setBounds(360, 330, 300, 30);
        LabelPrice.setForeground(Color.RED);
        LabelPrice.setFont(new Font("Tahoma",Font.BOLD, 25));
        panelOne.add(LabelPrice);

        JLabel labelLocation = new JLabel(data[10]);
        labelLocation.setBounds(360,359,600,30);
        labelLocation.setBackground(Color.BLACK);
        labelLocation.setFont(new Font("Tahoma",Font.BOLD, 13));
        panelOne.add(labelLocation);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(data[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(351, 21,500,300);
        image.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panelOne.add(image);

        return panelOne;
    }
}
