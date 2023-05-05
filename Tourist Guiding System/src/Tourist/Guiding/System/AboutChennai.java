package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutChennai extends JFrame implements ActionListener {
    AboutChennai() {
        setBounds(600, 200,560,450);
        setLayout(null);
        getContentPane().setBackground(new Color(131, 143, 233));

        JLabel i1 = new JLabel("Want to know more about chennai?");
        i1.setForeground(Color.BLACK);
        i1.setBounds(84, 10, 400, 40 );
        i1.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(i1);
        String name = """
                
                    Chennai, formerly known as Madras (the official name until 1996),
                    is the capital city of the Indian state of Tamil Nadu. The state's
                    largest city in area and population as well, Chennai is located on
                    the Coromandel Coast of the Bay of Bengal. It is the most prominent
                    cultural, economic and educational centre of South India According
                    to the 2011 Indian census, Chennai is the sixth-most populous city
                    in the country and forms the fourth-most populous urban 
                    agglomeration. The Greater Chennai Corporation is the civic body 
                    responsible for the city. It is the oldest city corporation of 
                    India, established in 1688—the second oldest in the world after 
                    London. The city of Chennai is coterminous with Chennai district,
                    which together with the adjoining suburbs constitutes the Chennai
                    Metropolitan Area, The 36th-largest urban area in the world by 
                    population and one of the largest metropolitan economies of India.
                                   
                    The traditional and de facto gateway of South India, Chennai is 
                    among the most-visited Indian cities by foreign tourists. It was 
                    ranked the 43rd-most visited city in the world for the year 2015
                    and was ranked the 36th-most visited city in the world for the 
                    year 2019. The Quality of Living Survey rated Chennai as the 
                    safest city in India.Chennai attracts 45 percent of health tourists
                    visiting India, and 30 to 40 percent of domestic health tourists. 
                    As such, it is termed "India's health capital". An established port 
                    of trade of British India since the 1600s. Chennai has the fifth-largest
                    urban economy, and had the third-largest expatriate population in 
                    India, at 35,000 in 2009, 82,790 in 2011 and estimated at over 
                    100,000 by 2016. Tourism-guide publisher Lonely Planet named 
                    Chennai as one of the top ten cities in the world to visit in 2015.
                    
                    Chennai is ranked as a beta-level city in the Global Cities Index,
                    and was ranked the best city in India by India Today in the 2014 
                    annual Indian city survey. In 2015 Chennai was named the "hottest"
                    city (city worth visiting and worth living in for long term) by 
                    the BBC, citing the mixture of both modern and traditional values.
                    National Geographic mentioned Chennai as the only South Asian city 
                    to feature in its 2015 "Top 10 food cities" list. Chennai was also 
                    named the ninth-best cosmopolitan city in the world by Lonely Planet.
                    
                    In October 2017, Chennai was added to the UNESCO Creative 
                    Cities Network (UCCN) list for its rich musical tradition. 
                    More than one-third of India's automobile industry is based
                    in the city. Home to the Tamil film industry, Chennai is 
                    also known as a major film production centre. It is one of
                    the 100 Indian cities to be developed as a smart city under
                    the Smart Cities Mission.
                    
                """;
        TextArea area = new TextArea(name,40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBackground(new Color(193, 203, 255));
        area.setBounds(10, 60, 530,300);
        area.setFont(new Font("Tahoma", Font.ITALIC, 15));
        add(area);

        JButton backButton = new JButton("Back");
        backButton.setBounds(230, 380, 100, 25);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.BLACK);
        backButton.addActionListener(this);
        add(backButton);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        setVisible(false);
    }
}