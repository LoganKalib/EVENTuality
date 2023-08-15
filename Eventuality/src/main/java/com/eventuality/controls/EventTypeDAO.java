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
        retrieve_Values_qry = "SELECT * FROM Event ";
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
        ArrayList<Event_Category> arr = new <Event_Category> ArrayList();

        if (rs != null) {
            while (rs.next()) {
                Event_Category evc = new Event_Category();

                evc.setEventTypeId(rs.getString("EVENT_TYPE_ID"));
                evc.setDescription(rs.getString("DESCRIPTION"));
                evc.setEventKeyword(rs.getString("KEYWORDS"));
                arr.add(evc);
            }
            rs.close();
        }
        return arr;
    }

    public void DeleteRecord(Statement s, String EventTypeID) throws SQLException {
        delete_Values_stmt = String.format("DELETE FROM Event_Category WHERE EVENT_TYPE_ID = %s", EventTypeID);
        int rows = s.executeUpdate(delete_Values_stmt);

        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
    }

    public void UpdateRecord(Statement s, String setField, String setValue, String eventTypeID) throws SQLException {
        update_Values_stmt = String.format("UPDATE Event_Category SET %s=%s WHERE Event_Type_Id = %s", setField, setValue, eventTypeID);
        int rows = s.executeUpdate(update_Values_stmt);
        String msg = String.format("EventTypeID: %s \n Successfully updated %s, with value: %s.", eventTypeID, setField, setValue);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
