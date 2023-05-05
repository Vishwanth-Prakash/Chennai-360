package Tourist.Guiding.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash() {
        setBounds(180,100,1200,600);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Wallpaper/2273827 - Copy.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBorder(BorderFactory.createLineBorder(new Color(193,203,255),5));
        add(image);

        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            Thread.sleep(7000);
            new Login();
            setVisible(false);
        } catch (Exception e) {
            System.err.println("Thread got interrupted");
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
