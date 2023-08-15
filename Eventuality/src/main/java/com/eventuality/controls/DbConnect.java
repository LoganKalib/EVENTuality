package com.eventuality.controls;

import java.sql.*;

public class DbConnect {
    
    //please note the URL will change on windows so we need to remember
    private String dbURL = "jdbc:derby:/home/logan/Documents/GitHub/EVENTuality/Database/Eventuality";
    private final Connection c;
    private final Statement s;

    public DbConnect() throws SQLException {
        this.s = StatementCreate();
        this.c = ConnectToDB();
    }
    
    private Connection ConnectToDB() throws SQLException{
        return DriverManager.getConnection(dbURL, "Admin","Password");
    }
    
    private Statement StatementCreate() throws SQLException{
        return c.createStatement();
    }
    
    public void CloseAll() throws SQLException{
        this.s.close();
        this.c.close();
    }
}
