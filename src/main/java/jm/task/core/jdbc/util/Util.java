package jm.task.core.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";


    public static Connection getConnection(){

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL,
                    DB_USER,DB_PASSWORD);
            System.out.println("conection OK");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("conection Error");
        }
        return connection;

    }
}
