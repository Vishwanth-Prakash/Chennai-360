package Tourist.Guiding.System;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/touristguidingsystem","root","vishwa123");
            statement = connection.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
