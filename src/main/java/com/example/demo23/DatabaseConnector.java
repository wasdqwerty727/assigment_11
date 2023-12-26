package com.example.demo23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String JDBC_URL = "jdbc:postgresql://your_database_url:5432/testDB";
    private static final String DATABASE_USERNAME = "postgres";
    private static final String DATABASE_PASSWORD = "databasesql";

    // Method to establish a database connection
    public static Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(JDBC_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null; // Handle the exception according to your needs
        }
    }

    // Method to close the database connection
    public static void close(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }
    }
}
