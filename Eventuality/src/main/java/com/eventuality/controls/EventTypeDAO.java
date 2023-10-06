package com.eventuality.controls;

import com.eventuality.objects.Event_Category;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EventTypeDAO {

    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;

    public ArrayList<Event_Category> SelectTable(Statement s) throws SQLException {
        retrieve_Values_qry = "SELECT * FROM Event_Category ";
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
        ArrayList<Event_Category> arr = new <Event_Category> ArrayList();

        if (rs != null) {
            while (rs.next()) {
                Event_Category evc = new Event_Category();

                evc.setEventTypeId(rs.getString("EVENT_TYPE_ID"));
                evc.setDescription(rs.getString("DESCRIPTION"));
                evc.setEventKeyword(rs.getString("KEYWORD"));
                arr.add(evc);
            }
            rs.close();
        }
        return arr;
    }

    public void DeleteRecord(Connection c, String EventTypeID) throws SQLException {
        delete_Values_stmt = "DELETE FROM Event_Category WHERE EVENT_TYPE_ID = ?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setString(1, EventTypeID);
        int rows = ps.executeUpdate(delete_Values_stmt);

        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        ps.close();
    }

    public void UpdateRecord(Connection c, String setField, String setValue, String eventTypeID) throws SQLException {
        update_Values_stmt = "UPDATE Event_Category SET ?=? WHERE Event_Type_Id = ?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setField);
        ps.setString(2, setValue);
        ps.setString(3, eventTypeID);
        
        int rows = ps.executeUpdate(update_Values_stmt);
        String msg = String.format("EventTypeID: %s \n Successfully updated %s, with value: %s.", eventTypeID, setField, setValue);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        ps.close();
    }
}
