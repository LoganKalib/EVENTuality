package com.eventuality;

import com.eventuality.controls.DbConnect;
import com.eventuality.pages.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eventuality {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login(DbConnect.getInstance()).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
