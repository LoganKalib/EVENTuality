package com.eventuality;

import com.eventuality.controls.DbConnect;
import com.eventuality.pages.Login;
import com.eventuality.pages.setSlashScreen;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class Eventuality {

    public static void main(String[] args) {
        setSlashScreen splash = new setSlashScreen();
        splash.setVisible(true);
        try {
            Thread.sleep(5000); //  5 seconds of loading
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the splash screen when dones
        splash.dispose();

        // Create and show your main application window
        SwingUtilities.invokeLater(() -> {
            try {
                Login obj;
                obj = new Login(DbConnect.getInstance());
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
