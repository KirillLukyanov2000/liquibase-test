package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/liqui_test";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DB_URL,
                DB_LOGIN,
                DB_PASSWORD
        );
    }

}