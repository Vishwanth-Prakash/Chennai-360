package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class LogOut extends JFrame implements ActionListener {

    JButton backButton, logOutButton;
    LogOut() {
        setBounds(600, 260, 450, 220);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        JLabel text = new JLabel("Are you sure to logout?");
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Tahoma",Font.PLAIN,30));
        text.setBounds(58,40,400,35);
        add(text);

        logOutButton = new JButton("Logout");
        logOutButton.setBackground(new Color(131,143,233));
        logOutButton.setForeground(Color.WHITE);
        logOutButton.addActionListener(this);
        logOutButton.setBounds(240, 115, 100, 28);
        add(logOutButton);

        backButton = new JButton("Back");
        backButton.setBackground(new Color(131,143,233));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        backButton.setBounds(80, 115, 100, 28);
        add(backButton);

        JPanel panel = new JPanel();
        panel.setBounds(10,10,417,165);
        panel.setBackground(new Color(193,203,255));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        add(panel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == backButton) {
            setVisible(false);
        } else {
            setVisible(false);
            exit(0);
        }
    }
}
