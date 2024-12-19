package org.lexicon.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {


    Connection connection;

    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "2121");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
