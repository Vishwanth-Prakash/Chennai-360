package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {
    JButton payButton, backButton;
    Payment() {
        setBounds(500, 200, 800,600);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/paytm-image.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);

        payButton = new JButton("pay");
        payButton.setBounds(420, 0, 80, 40);
        payButton.addActionListener(this);
        image.add(payButton);

        backButton = new JButton("Back");
        backButton.setBounds(520, 0 ,80, 40);
        backButton.addActionListener(this);
        image.add(backButton);

        setVisible(true);



    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == payButton) {
            setVisible(false);
            new Paytm("https://paytm.com/login");
        } else {
            setVisible(false);
        }
    }
}
