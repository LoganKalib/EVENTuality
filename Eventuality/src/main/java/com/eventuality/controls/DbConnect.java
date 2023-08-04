package com.eventuality.controls;

import java.sql.*;

public class DbConnect {
    
    //please note the URL will change on windows so we need to remember
    private String dbURL = "/home/logan/Documents/GitHub/EVENTuality/Database/Eventuality";
    
    private Connection ConnectToDB() throws SQLException{
        return DriverManager.getConnection(dbURL);
    }
    
    public Statement StatementCreate() throws SQLException{
        return ConnectToDB().createStatement();
    }
    
    public void CloseAll(Statement s) throws SQLException{
        s.close();
        ConnectToDB().close();
    }
}
