package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private static Connection connection = null;


    public static Connection getConnection(){

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(DB_URL,
                    DB_USER,DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }
}
