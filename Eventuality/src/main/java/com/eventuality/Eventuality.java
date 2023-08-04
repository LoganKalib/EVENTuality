package com.eventuality;

import com.eventuality.pages.Home;
import java.sql.*;

public class Eventuality {

    public static void main(String[] args) {
        //display homepage
       Home firstPage = new Home();
       firstPage.setVisible(true);
    }
}
