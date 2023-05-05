package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUs extends JFrame implements ActionListener {
    AboutUs() {
        setBounds(600, 200,485,510);
        setLayout(null);
        getContentPane().setBackground(new Color(131, 143, 233));

        JLabel i1 = new JLabel("About Project");
        i1.setForeground(Color.BLACK);
        i1.setBounds(145, 10, 200, 40 );
        i1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(i1);
        String name = """
                
                 The main objective of the Tourist Guiding System to manage
                 the details of Customers, Hotel Booking, Cancellations, and 
                 Tourism places. It manages all the information about Users, 
                 hotels, Packages, etc. The project is built at the 
                 administrative end and thus only the administrator is 
                 guaranteed access to the backend database. The purpose of
                 this project is to build an application program to reduce
                 the manual  work of managing Tourists, bookings, Places, 
                 etc.\s
                 
                  • This application will help in accessing the information
                   related to the travel to a particular destination with 
                   great ease. The users can track the information related
                   to their tours with great ease through this application. 
                   The travel agency information can also be obtained 
                   through this application. 
                 
                  • Through this system, the proposed system is highly
                   automated and makes traveling activities much easier
                   and more flexible. The user can get the very right 
                   information at the very right time. This system will
                   include all the necessary fields which are required 
                   during the online reservation time. This system will 
                   be easy to use and can be used by any person. The 
                   basic idea behind this project is to save data in a 
                   central database that can be accessed by any 
                   authorized person to get information and saves time
                   and burden which are being faced by their customers.\s
                 
                  • The administrator can access and modify the 
                  information stored in the database of this system, 
                  this includes adding and updating details, and it 
                  will give accurate information and simplify manual
                  work and also it minimizes documentation-related
                  work. Provides up-to-date information.\s
         
                """;
        TextArea area = new TextArea(name,40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBackground(new Color(193, 203, 255));
        area.setBounds(10, 55, 450,400);
        area.setFont(new Font("Tahoma", Font.ITALIC, 15));
        add(area);

        JButton backButton = new JButton("Back");
        backButton.setBounds(200, 420, 100, 25);
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
