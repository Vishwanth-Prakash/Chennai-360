package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteDetails extends JFrame implements ActionListener {
    JButton deleteButton, backButton;
    String username;
    DeleteDetails(String username) {
        this.username = username;

        setBounds(630, 300, 650, 200);
        setLayout(null);
        getContentPane().setBackground(Color.lightGray);

        JLabel text = new JLabel("Are you sure to delete your account?");
        text.setBounds(190, 30,500,40);
        text.setFont(new Font("Tahoma",Font.BOLD, 16));
        text.setForeground(Color.red);
        add(text);

        JLabel text1 = new JLabel("You no longer able to access our application after deleting your account!!");
        text1.setBounds(30, 50,700,40);
        text1.setFont(new Font("Tahoma",Font.BOLD, 16));
        text1.setForeground(Color.red);
        add(text1);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(210, 100, 80, 30);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBackground(Color.BLACK);
        deleteButton.addActionListener(this);
        add(deleteButton);

        backButton = new JButton("Back");
        backButton.setBounds(330, 100, 80, 30);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.BLACK);
        backButton.addActionListener(this);
        add(backButton);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == deleteButton ) {
            try {
                Conn conn = new Conn();
                conn.statement.executeUpdate("delete from account where username = '"+username+"'");
                conn.statement.executeUpdate("delete from customer where username = '"+username+"'");
                conn.statement.executeUpdate("delete from bookhotel where username = '"+username+"'");
                conn.statement.executeUpdate("delete from bookpackage where username = '"+username+"'");

                JOptionPane.showMessageDialog(null,"Your account deleted successfully");

                setVisible(false);
                System.exit(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

}