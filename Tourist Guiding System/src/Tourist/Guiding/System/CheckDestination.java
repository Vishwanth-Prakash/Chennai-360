package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckDestination extends JFrame implements ActionListener {
    JButton view1, view2,view3,view4,view5,view6, view7,view8, view9,view10,view11;
    JButton[] viewButton = new JButton[]{view1,view2,view3,view4,view5,view6, view7,view8, view9,view10,view11};

    JButton next1, next2, next3, next4, next5,next6, next7,next8, next9,next10,next11;
    JButton[] nextButton = new JButton[]{next1, next2, next3, next4, next5, next6, next7,next8, next9,next10,next11};

    JButton back1, back2,back3,back4,back5,back6,back7,back8,back9,back10,back11;
    JButton[] backButton = new JButton[]{back1, back2,back3,back4,back5,back6,back7,back8,back9,back10,back11};

    String[] locationName = {"1. Marundeeswarar Temple","2. Valluvar Kottam",
            "3. Thousand Lights Mosque","4. Dakshinachitra",
            "5. Ashtalakshmi Temple","6. Mylapore","7. Sri Parthasarathy Temple","8. Kapaleeswarar Temple","9. Semmozhi Poonga","10. MGR Film City",
            "11. National Art Gallery"};
    public void CheckDestination(int backOrNext, int i) {
        setBounds(300, 144, 800, 600);
        getContentPane().setBackground(new Color(193,203,255));
        setLayout(null);

        JPanel panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(15,500,760,50);
        panelOne.setBackground(new Color(131,143,233));
        //panelOne.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        add(panelOne);

        JLabel jLabelName = new JLabel(locationName[i]);
        jLabelName.setBounds(20,-20,700,100);
        jLabelName.setFont(new Font("Tahoma",Font.BOLD, 25));
        jLabelName.setForeground(Color.DARK_GRAY);
        add(jLabelName);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("visitingPlaces/location"+(i+1)+".jpg"));
        Image i2 = i1.getImage().getScaledInstance(680,430, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(15,60,780,430);
        add(image);



        viewButton[backOrNext] = new JButton("Check location");
        viewButton[backOrNext].setLayout(null);
        viewButton[backOrNext].setBounds(280, 10, 200, 30);
        viewButton[backOrNext].setBackground(new Color(193,203,255));
        viewButton[backOrNext].addActionListener(this);
        viewButton[backOrNext].setForeground(Color.BLACK);
        panelOne.add(viewButton[backOrNext]);

        if(backOrNext == 10) {
            nextButton[backOrNext] = new JButton("Exit");
        } else {
            nextButton[backOrNext] = new JButton("Next location");
        }
        nextButton[backOrNext].setLayout(null);
        nextButton[backOrNext].setBounds(550, 10, 200, 30);
        nextButton[backOrNext].setBackground(new Color(193, 203, 255));
        nextButton[backOrNext].setForeground(Color.BLACK);
        nextButton[backOrNext].addActionListener(this);
        panelOne.add(nextButton[backOrNext]);

        backButton[backOrNext] = new JButton("Previous location");
        backButton[backOrNext].setLayout(null);
        backButton[backOrNext].setBounds(10, 10, 200, 30);
        backButton[backOrNext].setBackground(new Color(193,203,255));
        backButton[backOrNext].addActionListener(this);
        backButton[backOrNext].setForeground(Color.BLACK);
        panelOne.add(backButton[backOrNext]);
        setVisible(true);
    }

    CheckDestination(int backOrNext, int i) {
        CheckDestination(backOrNext,i);
    }

    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == backButton[0]) {
            setVisible(false);
            new CheckDestination( 0,0);
        } else if(actionEvent.getSource() == backButton[1]) {
            setVisible(false);
            new CheckDestination( 0,0);
        } else if(actionEvent.getSource() == backButton[2]) {
            setVisible(false);
            new CheckDestination(1,1);
        } else if(actionEvent.getSource() == backButton[3]) {
            setVisible(false);
            new CheckDestination(2,2);
        } else if(actionEvent.getSource() == backButton[4]) {
            setVisible(false);
            new CheckDestination(3,3 );
        } else if(actionEvent.getSource() == backButton[5]) {
            setVisible(false);
            new CheckDestination(4,4);
        }  else if(actionEvent.getSource() == backButton[6]) {
            setVisible(false);
            new CheckDestination(5,5);
        } else if(actionEvent.getSource() == backButton[7]) {
            setVisible(false);
            new CheckDestination(6,6);
        } else if(actionEvent.getSource() == backButton[8]) {
            setVisible(false);
            new CheckDestination(7,7);
        } else if(actionEvent.getSource() == backButton[9]) {
            setVisible(false);
            new CheckDestination(8,8);
        } else if(actionEvent.getSource() == backButton[10]) {
            setVisible(false);
            new CheckDestination(9,9);
        }

        else if(actionEvent.getSource() == nextButton[0]) {
            setVisible(false);
            new CheckDestination(1,1);
        }  else if(actionEvent.getSource() == nextButton[1]) {
            setVisible(false);
            new CheckDestination(2,2);
        }  else if(actionEvent.getSource() == nextButton[2]) {
            setVisible(false);
            new CheckDestination( 3,3);
        } else if(actionEvent.getSource() == nextButton[3]) {
            setVisible(false);
            new CheckDestination( 4,4);
        }else if(actionEvent.getSource() == nextButton[4]) {
            setVisible(false);
            new CheckDestination( 5,5);
        } else if(actionEvent.getSource() == nextButton[5]) {
            setVisible(false);
            new CheckDestination( 6,6);
        } else if(actionEvent.getSource() == nextButton[6]) {
            setVisible(false);
            new CheckDestination( 7,7);
        } else if(actionEvent.getSource() == nextButton[7]) {
            setVisible(false);
            new CheckDestination( 8,8);
        } else if(actionEvent.getSource() == nextButton[8]) {
            setVisible(false);
            new CheckDestination( 9,9);
        } else if(actionEvent.getSource() == nextButton[9]) {
            setVisible(false);
            new CheckDestination( 10,10);
        } else if(actionEvent.getSource() == nextButton[10]) {
            setVisible(false);
        }

        else if(actionEvent.getSource() == viewButton[0]) {
            new Map("https://www.google.com/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Arulmigu+Marundheeshvarar+Temple,+8,+W+Tank+St,+Ambedkar+Nagar,+Lalitha+Nagar,+Thiruvanmiyur,+Chennai,+Tamil+Nadu+600041/@12.9075241,80.0444358,10.74z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a525d61ce09dd77:0x8e4490964f490bad!2m2!1d80.2602188!2d12.9848787");
        } else if(actionEvent.getSource() == viewButton[1]) {
            new Map("https://www.google.com/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Valluvar+Kottam,+Valluvar+Kottam+High+Rd,+Tirumurthy+Nagar,+Nungambakkam,+Chennai,+Tamil+Nadu+600034/@12.9478738,79.9521046,10.24z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a52665cb92f6f63:0x74f3fe0c9b20d68!2m2!1d80.2422913!2d13.0538053!5m1!1e1");
        } else if(actionEvent.getSource() == viewButton[2]) {
            new Map("https://www.google.com/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Thousand+Lights+Shia+Mosque,+Peter's+Road,+Peters+Colony,+Thousand+Lights,+Chennai,+Tamil+Nadu/@12.9277875,79.948442,10.44z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a52663f641c6e2b:0xbb6388f738a254d7!2m2!1d80.2550343!2d13.0549155!5m1!1e1");
        } else if(actionEvent.getSource() == viewButton[3]) {
            new Map("https://www.google.com/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/DakshinaChitra+Museum+-+City+Office,+Madhuram+Flats,+G-3,+6,+Urur+Olcott+Kuppam+Rd,+Besant+Nagar,+Chennai,+Tamil+Nadu+600090/@12.8857975,79.9629929,10.12z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a5267e49801e77d:0x8e71b1294cd0560f!2m2!1d80.2704928!2d13.0039086!5m1!1e1");
        } else if(actionEvent.getSource() == viewButton[4]) {
            new Map("https://www.google.com/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Shri+Ashtalakshmi+Temple,+X7VC%2B25R,+Beach+Rd,+Kalakshetra+Colony,+Besant+Nagar,+Chennai,+Tamil+Nadu+600090/@12.8598484,79.9211469,10z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a5267f8c7c73f73:0x7acee9c16c9d6b57!2m2!1d80.2703902!2d12.9926039!5m1!1e1");
        } else if(actionEvent.getSource() == viewButton[5]) {
            new Map("https://www.google.com/maps/dir/VIT+Chennai,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Arulmigu+Sri+Parthasarathy+Perumal+Temple+Tiruvallikeni,+Car+St,+Narayana+Krishnaraja+Puram,+Triplicane,+Chennai,+Tamil+Nadu+600005/@12.8915856,79.9024088,9.67z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a52689dfe1e93a1:0xaa50bb6e69dbeb20!2m2!1d80.2769561!2d13.0538068!5m1!1e1");
        } else if(actionEvent.getSource() == viewButton[6]) {
            new Map("https://www.google.co.in/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Arulmigu+Sri+Parthasarathy+Perumal+Temple+Tiruvallikeni,+Car+St,+Narayana+Krishnaraja+Puram,+Triplicane,+Chennai,+Tamil+Nadu+600005/@12.9263185,79.96986,10.21z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a52689dfe1e93a1:0xaa50bb6e69dbeb20!2m2!1d80.2769561!2d13.0538068");
        } else if(actionEvent.getSource() == viewButton[7]) {
            new Map("https://www.google.co.in/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Kapaleeshwarar+Temple+(Lord+Shiva+),+234,+Ramakrishna+Mutt+Rd,+Vinayaka+Nagar+Colony,+Mylapore,+Chennai,+Tamil+Nadu+600004/@12.921018,79.9547337,10.16z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a5267d254b2e533:0xcb27d974b0bcdb89!2m2!1d80.2700038!2d13.0335973");
        } else if(actionEvent.getSource() == viewButton[8]) {
            new Map("https://www.google.co.in/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/Semmozhi+Poonga+Cafeteria,+Anna+Salai,+Thiru+Vi+Ka+Kudiyiruppu,+Teynampet,+Chennai,+Tamil+Nadu/@12.9641462,79.9435311,10.17z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a5267682fe853b3:0xfafbd25825131bc!2m2!1d80.2510696!2d13.0500731");
        } else if(actionEvent.getSource() == viewButton[9]) {
            new Map("https://www.google.co.in/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/MGR+Film+City,+Tharamani,+Chennai,+Tamil+Nadu+600113/@12.9193085,80.0551341,11z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a52671622e003ab:0x2494be319cc9ccff!2m2!1d80.246047!2d12.9932126");
        } else if(actionEvent.getSource() == viewButton[10]) {
            new Map("https://www.google.co.in/maps/dir/VIT+Chennai,+VIT+UNIVERSITY,+Kelambakkam+-+Vandalur+Road,+Rajan+Nagar,+Chennai,+Tamil+Nadu/National+Art+Gallery+Chennai,+Egmore,+Chennai,+Tamil+Nadu/@12.9544433,79.9522443,10.22z/data=!4m13!4m12!1m5!1m1!1s0x3a5259af8e491f67:0x944b42131b757d2d!2m2!1d80.1534283!2d12.840641!1m5!1m1!1s0x3a5267f32ca472d3:0x68c004715682ee00!2m2!1d80.2561848!2d13.0695158");
        }

    }
}

