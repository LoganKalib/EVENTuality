package com.eventuality;


import com.eventuality.controls.DbConnect;
import com.eventuality.pages.Home;
import java.sql.*;

public class Eventuality {

    public static void main(String[] args) {
        //display homepage
       //Home firstPage = new Home();
       //firstPage.setVisible(true);
     
       try{
           DbConnect db = new DbConnect();
           System.out.println("making Connection");
           Statement s = db.StatementCreate();
           System.out.println("Connection made.. Statement made...");
           db.CloseAll(s);
           System.out.println("terminated...");
           
       }catch(Exception e){
           System.out.println("Err: " + e.getMessage());
       }
    }
}
