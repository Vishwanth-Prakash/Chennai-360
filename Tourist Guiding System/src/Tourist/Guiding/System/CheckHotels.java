package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CheckHotels extends JFrame implements ActionListener {
    JButton view1, view2,view3,view4,view5,view6, view7,view8, view9,view10,view11;
    JButton[] viewButton = new JButton[]{view1,view2,view3,view4,view5,view6, view7,view8, view9,view10,view11};

    JButton next1, next2, next3, next4, next5,next6, next7,next8, next9,next10,next11;
    JButton[] nextButton = new JButton[]{next1, next2, next3, next4, next5, next6, next7,next8, next9,next10,next11};

    JButton back1, back2,back3,back4,back5,back6,back7,back8,back9,back10,back11;
    JButton[] backButton = new JButton[]{back1, back2,back3,back4,back5,back6,back7,back8,back9,back10,back11};

    JButton price1, price2,price3,price4,price5,price6,price7,price8,price9,price10,price11;
    JButton[] priceButton = new JButton[]{price1, price2,price3,price4,price5,price6,price7,price8,price9,price10,price11};

    String[] hotelNames = {"1. Radisson Blu Resort Temple, Bay Mamallapuram ","2. Taj Connemara, Chennai",
            "3. The Leela Palace, Chennai","4. ITC Grand Chola A Luxury Collection Hotel",
            "5. Trident Chennai","6. The park chennai","7. The Westin","8. Accord metropolitan","9. Hilton chennai","10. The Raintree annasalai",
            "11. Hyatt regency chennai"};
    public void CheckHotels(int backOrNext, int i) {
        setBounds(300, 144, 800, 600);
        getContentPane().setBackground(new Color(193,203,255));
        setLayout(null);

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(15,500,760,50);
        panelOne.setBackground(new Color(131,143,233));
        add(panelOne);

        JLabel jLabelName = new JLabel(hotelNames[i]);
        jLabelName.setBounds(20,-20,700,100);
        jLabelName.setFont(new Font("Tahoma",Font.BOLD, 25));
        jLabelName.setForeground(Color.DARK_GRAY);
        add(jLabelName);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Hotels/Hotel-"+i+".jpeg"));
        Image i2 = i1.getImage().getScaledInstance(750,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(15,60,760,430);
        add(image);



        viewButton[backOrNext] = new JButton("Check location");
        viewButton[backOrNext].setLayout(null);
        viewButton[backOrNext].setBounds(197, 10, 180, 30);
        viewButton[backOrNext].setBackground(new Color(193,203,255));
        viewButton[backOrNext].addActionListener(this);
        viewButton[backOrNext].setForeground(Color.BLACK);
        panelOne.add(viewButton[backOrNext]);

        if(backOrNext == 10) {
            nextButton[backOrNext] = new JButton("Exit");
        } else {
            nextButton[backOrNext] = new JButton("Next hotel");
        }
        nextButton[backOrNext].setLayout(null);
        nextButton[backOrNext].setBounds(570, 10, 180, 30);
        nextButton[backOrNext].setBackground(new Color(193, 203, 255));
        nextButton[backOrNext].setForeground(Color.BLACK);
        nextButton[backOrNext].addActionListener(this);
        panelOne.add(nextButton[backOrNext]);

        backButton[backOrNext] = new JButton("Previous Hotel");
        backButton[backOrNext].setLayout(null);
        backButton[backOrNext].setBounds(10, 10, 180, 30);
        backButton[backOrNext].setBackground(new Color(193,203,255));
        backButton[backOrNext].addActionListener(this);
        backButton[backOrNext].setForeground(Color.BLACK);
        panelOne.add(backButton[backOrNext]);

        priceButton[backOrNext] = new JButton("Check price");
        priceButton[backOrNext].setLayout(null);
        priceButton[backOrNext].setBounds(383, 10, 180, 30);
        priceButton[backOrNext].setBackground(new Color(193,203,255));
        priceButton[backOrNext].addActionListener(this);
        priceButton[backOrNext].setForeground(Color.BLACK);
        panelOne.add(priceButton[backOrNext]);

        setVisible(true);
    }

    CheckHotels(int backOrNext, int i) {
        CheckHotels(backOrNext,i);
    }

    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == backButton[0]) {
            setVisible(false);
            new CheckHotels( 0,0);
        } else if(actionEvent.getSource() == backButton[1]) {
            setVisible(false);
            new CheckHotels( 0,0);
        } else if(actionEvent.getSource() == backButton[2]) {
            setVisible(false);
            new CheckHotels(1,1);
        } else if(actionEvent.getSource() == backButton[3]) {
            setVisible(false);
            new CheckHotels(2,2);
        } else if(actionEvent.getSource() == backButton[4]) {
            setVisible(false);
            new CheckHotels(3,3 );
        } else if(actionEvent.getSource() == backButton[5]) {
            setVisible(false);
            new CheckHotels(4,4);
        }  else if(actionEvent.getSource() == backButton[6]) {
            setVisible(false);
            new CheckHotels(5,5);
        } else if(actionEvent.getSource() == backButton[7]) {
            setVisible(false);
            new CheckHotels(6,6);
        } else if(actionEvent.getSource() == backButton[8]) {
            setVisible(false);
            new CheckHotels(7,7);
        } else if(actionEvent.getSource() == backButton[9]) {
            setVisible(false);
            new CheckHotels(8,8);
        } else if(actionEvent.getSource() == backButton[10]) {
            setVisible(false);
            new CheckHotels(9,9);
        }

        else if(actionEvent.getSource() == nextButton[0]) {
            setVisible(false);
            new CheckHotels(1,1);
        }  else if(actionEvent.getSource() == nextButton[1]) {
            setVisible(false);
            new CheckHotels(2,2);
        }  else if(actionEvent.getSource() == nextButton[2]) {
            setVisible(false);
            new CheckHotels( 3,3);
        } else if(actionEvent.getSource() == nextButton[3]) {
            setVisible(false);
            new CheckHotels( 4,4);
        }else if(actionEvent.getSource() == nextButton[4]) {
            setVisible(false);
            new CheckHotels( 5,5);
        } else if(actionEvent.getSource() == nextButton[5]) {
            setVisible(false);
            new CheckHotels( 6,6);
        } else if(actionEvent.getSource() == nextButton[6]) {
            setVisible(false);
            new CheckHotels( 7,7);
        } else if(actionEvent.getSource() == nextButton[7]) {
            setVisible(false);
            new CheckHotels( 8,8);
        } else if(actionEvent.getSource() == nextButton[8]) {
            setVisible(false);
            new CheckHotels( 9,9);
        } else if(actionEvent.getSource() == nextButton[9]) {
            setVisible(false);
            new CheckHotels( 10,10);
        } else if(actionEvent.getSource() == nextButton[10]) {
            setVisible(false);
        }

        else if(actionEvent.getSource() == viewButton[0]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/Radisson+Blu+Resort+Temple+Bay+Mamallapuram,+57+Covelong,+East+Coast+Rd,+Mahabalipuram,+Tamil+Nadu+603104/@12.6832193,79.8611554,9.89z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a53acad5161ab5b:0xa8a774922c84934b!2m2!1d80.1947665!2d12.6238102");
        } else if(actionEvent.getSource() == viewButton[1]) {
            new Map("https://www.google.co.in/maps/place/Taj+Connemara,+Chennai/@12.9484259,79.8918764,10z/data=!4m22!1m13!4m12!1m4!2m2!1d80.1577189!2d12.842694!4e1!1m6!1m2!1s0x3a52661692cb0d4d:0x79ec584310ee6069!2sTaj+Connemara,+Chennai,+MAIN+BUILDING,+TAJ+CONNEMARA,+Binny+Road,+Anna+Salai,+Chennai,+Tamil+Nadu!2m2!1d80.2616886!2d13.0629727!3m7!1s0x3a52661692cb0d4d:0x79ec584310ee6069!5m2!4m1!1i2!8m2!3d13.0629727!4d80.2616886");
        } else if(actionEvent.getSource() == viewButton[2]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/The+Leela+Palace+Chennai+-+Seaside+Modern+Palace+Hotel,+Adyar+Sea+Face,+Leela+Palace+Rd,+MRC+Nagar,+Raja+Annamalai+Puram,+Chennai,+Tamil+Nadu+600028/@12.8932568,79.9880506,10.39z/data=!4m19!1m9!3m8!1s0x3a5267defbcfe68f:0x6658913274a5658f!2sThe+Leela+Palace+Chennai+-+Seaside+Modern+Palace+Hotel!5m2!4m1!1i2!8m2!3d13.0172288!4d80.2737977!4m8!1m1!4e1!1m5!1m1!1s0x3a5267defbcfe68f:0x6658913274a5658f!2m2!1d80.2737977!2d13.0172288");
        } else if(actionEvent.getSource() == viewButton[3]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/ITC+Grand+Chola,+Chennai-+LEED+Zero+Carbon+certified+luxury+hotel+%7C+City+center,+63,+Anna+Salai,+Little+Mount,+Guindy,+Chennai,+Tamil+Nadu+600032/@12.9199456,80.0117505,11z/data=!3m1!4b1!4m19!1m9!3m8!1s0x3a52676d5bb54be1:0xf2c9c9c91db16643!2sITC+Grand+Chola,+Chennai-+LEED+Zero+Carbon+certified+luxury+hotel+%7C+City+center!5m2!4m1!1i2!8m2!3d13.0105203!4d80.2205914!4m8!1m1!4e1!1m5!1m1!1s0x3a52676d5bb54be1:0xf2c9c9c91db16643!2m2!1d80.2205914!2d13.0105203");
        } else if(actionEvent.getSource() == viewButton[4]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/Trident+Hotel+Chennai,+Grand+Southern+Trunk+Road,+Kannan+Colony,+Pazavanthangal,+Chennai,+Tamil+Nadu/@12.8939037,80.0014268,10.92z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a525e17f908c5a5:0xeef04ea3bd8ff245!2m2!1d80.1861962!2d12.9940827");
        } else if(actionEvent.getSource() == viewButton[5]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/The+Park+Chennai,+601,+Anna+Salai,+near+US+Embassy,+Gangai+Karai+Puram,+Nungambakkam,+Chennai,+Tamil+Nadu+600006/@12.9354597,79.8984108,10.12z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a526750254dc027:0xc23f757c839f6fed!2m2!1d80.2499482!2d13.0527571");
        } else if(actionEvent.getSource() == viewButton[6]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/The+Westin+Chennai+Velachery,+Velachery+Road,+TN+Police+Housing+Colony,+Velachery,+Chennai,+Tamil+Nadu/@12.9017396,80.057693,11z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a526762ab4529a3:0x43df2420d668eb5b!2m2!1d80.2208854!2d12.9893786");
        } else if(actionEvent.getSource() == viewButton[7]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/Accord+Metropolitan,+Gopathi+Narayanaswami+Chetty+Road,+Lakshimi+Colony,+T.+Nagar,+Chennai,+Tamil+Nadu/@12.9379214,79.988979,10.59z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a526650107654f3:0x1ed95fdfa3ff6f37!2m2!1d80.242577!2d13.046074");
        } else if(actionEvent.getSource() == viewButton[8]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/Hilton+Chennai,+100+Feet+Road,+Poomagal+Nagar,+Guindy,+Chennai,+Tamil+Nadu/@12.9263723,79.9901968,10.7z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a52673eaffd5755:0x72733ac5fb135bad!2m2!1d80.2049517!2d13.0166092");
        } else if(actionEvent.getSource() == viewButton[9]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/The+Raintree,+Anna+Salai,+Anna+Salai,+Satya+Murthy+Nagar,+Teynampet,+Chennai,+Tamil+Nadu/@12.9176413,79.9754401,10.5z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a5266468d563567:0x9abd9a2b3ecb7aea!2m2!1d80.2439189!2d13.0340298");
        } else if(actionEvent.getSource() == viewButton[10]) {
            new Map("https://www.google.co.in/maps/dir/12.842694,80.1577189/Hyatt+Regency+Chennai,+Anna+Salai,+Sadras,+Teynampet,+Chennai,+Tamil+Nadu/@12.9243999,80.0339659,10.85z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a5266466c3b5a81:0xfe35b8153aea85fd!2m2!1d80.2486854!2d13.0430452");
        }
        else if(actionEvent.getSource() == priceButton[0]) {
            new CheckPrice("Radisson Blu Resort Temple",4.5);
        } else if(actionEvent.getSource() == priceButton[1]) {
            new CheckPrice("Taj Connemara",4.3);
        } else if(actionEvent.getSource() == priceButton[2]) {
            new CheckPrice("The Leela Palace",2.12);
        } else if(actionEvent.getSource() == priceButton[3]) {
            new CheckPrice("ITC Grand Chola",5);
        } else if(actionEvent.getSource() == priceButton[4]) {
            new CheckPrice("Trident Chennai",4.9);
        } else if(actionEvent.getSource() == priceButton[5]) {
            new CheckPrice("The park chennai",3.7);
        } else if(actionEvent.getSource() == priceButton[6]) {
            new CheckPrice("The Westin",4.7);
        } else if(actionEvent.getSource() == priceButton[7]) {
            new CheckPrice("Accord metropolita",1.2);
        } else if(actionEvent.getSource() == priceButton[8]) {
            new CheckPrice("Hilton chennai",3.8);
        } else if(actionEvent.getSource() == priceButton[9]) {
            new CheckPrice("The Raintree annasalai",2.1);
        } else if(actionEvent.getSource() == priceButton[10]) {
            new CheckPrice("Hyatt regency chennai",4.2);
        }
    }
}

class CheckPrice extends JFrame implements  ActionListener{

    JLabel hotelName1, costPerPerson1, costAc1, costFood1, rating1;

    JButton backButton;

    CheckPrice(String name, double rate) {
        setBounds(1087,144,400,600);
        getContentPane().setBackground(new Color(242, 210, 130));
        setLayout(null);

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(10,10,365,275);
        panelOne.setBackground(new Color(242, 210, 189));
        add(panelOne);

        JLabel hotelName = new JLabel("Hotel: ");
        hotelName.setBounds(10,10, 200, 25);
        hotelName.setFont(new Font("Thoma", Font.BOLD, 20));
        hotelName.setForeground(Color.BLACK);
        panelOne.add(hotelName);

        hotelName1 = new JLabel();
        hotelName1.setBounds(70,10, 400, 25);
        hotelName1.setFont(new Font("Thoma", Font.BOLD, 20));
        hotelName1.setForeground(Color.DARK_GRAY);
        panelOne.add(hotelName1);

        JLabel costPerPerson = new JLabel("Cost per person: ");
        costPerPerson.setBounds(10,50, 200, 25);
        costPerPerson.setFont(new Font("Thoma", Font.BOLD, 20));
        costPerPerson.setForeground(Color.BLACK);
        panelOne.add(costPerPerson);

        costPerPerson1 = new JLabel();
        costPerPerson1.setBounds(175,50, 200, 25);
        costPerPerson1.setFont(new Font("Thoma", Font.BOLD, 20));
        costPerPerson1.setForeground(Color.red);
        panelOne.add(costPerPerson1);

        JLabel costAc = new JLabel("Ac cost (if included):  ");
        costAc.setBounds(10,90, 260, 25);
        costAc.setFont(new Font("Thoma", Font.BOLD, 20));
        costAc.setForeground(Color.BLACK);
        panelOne.add(costAc);

        costAc1 = new JLabel();
        costAc1.setBounds(209,90, 260, 25);
        costAc1.setFont(new Font("Thoma", Font.BOLD, 20));
        costAc1.setForeground(Color.red);
        panelOne.add(costAc1);

        JLabel costFood = new JLabel("Food cost (if included):  ");
        costFood.setBounds(10,130, 260, 25);
        costFood.setFont(new Font("Thoma", Font.BOLD, 20));
        costFood.setForeground(Color.BLACK);
        panelOne.add(costFood);

        costFood1 = new JLabel();
        costFood1.setBounds(235,130, 260, 25);
        costFood1.setFont(new Font("Thoma", Font.BOLD, 20));
        costFood1.setForeground(Color.red);
        panelOne.add(costFood1);

        JLabel rating = new JLabel("Rating: ");
        rating.setBounds(10,170, 260, 25);
        rating.setFont(new Font("Thoma", Font.BOLD, 20));
        rating.setForeground(Color.BLACK);
        panelOne.add(rating);

        rating1 = new JLabel();
        rating1.setBounds(89,170, 260, 25);
        rating1.setFont(new Font("Thoma", Font.BOLD, 20));
        rating1.setForeground(Color.red);
        panelOne.add(rating1);

        JLabel GstPrice = new JLabel("The above mentioned prices includes GST");
        GstPrice.setBounds(10,200, 400, 25);
        GstPrice.setFont(new Font("Thoma", Font.BOLD, 15));
        GstPrice.setForeground(Color.DARK_GRAY);
        panelOne.add(GstPrice);

        backButton = new JButton("Back");
        backButton.setLayout(null);
        backButton.setBounds(140, 230, 80, 30);
        backButton.setBackground(Color.BLACK);
        backButton.addActionListener(this);
        backButton.setForeground(Color.WHITE);
        panelOne.add(backButton);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Price.jpg"));
        Image i2 = i1.getImage().getScaledInstance(270,270,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(45,300,300,250);
        add(image);


        String query = "select * from hotel where name = '"+name+"'";
        try {
            Conn conn = new Conn();
            ResultSet resultSet = conn.statement.executeQuery(query);
            while(resultSet.next()) {
                hotelName1.setText(resultSet.getString("name"));
                costAc1.setText(" \u20B9 " + resultSet.getString("acroom")+ "/-");
                costFood1.setText(" \u20B9 " + resultSet.getString("foodincluded")+ "/-");
                costPerPerson1.setText(" \u20B9 " + resultSet.getString("costperperson")+ "/-");
                rating1.setText(rate+" **STAR**");
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