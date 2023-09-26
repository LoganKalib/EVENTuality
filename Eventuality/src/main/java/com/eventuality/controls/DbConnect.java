package com.eventuality.controls;

import java.sql.*;

public class DbConnect {
    
    private static final String DB_URL = "jdbc:derby://localhost:1527/Eventuality2.0";
    private static final String DB_USER = "APP";
    private static final String DB_PASSWORD = "Password";
    
    private static DbConnect instance;
    private Connection connection;
    private Statement statement;

    private DbConnect() throws SQLException {
        connection = connectToDB();
        statement = createStatement();
    }

    public static DbConnect getInstance() throws SQLException {
        if (instance == null) {
            instance = new DbConnect();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void closeAll() throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    private Connection connectToDB() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    private Statement createStatement() throws SQLException {
        return connection.createStatement();
    }
}
