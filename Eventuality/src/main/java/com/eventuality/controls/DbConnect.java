package com.eventuality.controls;

import java.sql.*;

public class DbConnect {
    
    //please note the URL will change on windows so we need to remember
    private String dbURL = "jdbc:derby:/home/logan/Documents/GitHub/EVENTuality/Database/Eventuality";
    
    private Connection ConnectToDB() throws SQLException{
        return DriverManager.getConnection(dbURL, "Admin","Password");
    }
    
    public Statement StatementCreate(Connection c) throws SQLException{
        return c.createStatement();
    }
    
    public void CloseAll(Statement s, Connection c) throws SQLException{
        s.close();
        c.close();
    }
}
