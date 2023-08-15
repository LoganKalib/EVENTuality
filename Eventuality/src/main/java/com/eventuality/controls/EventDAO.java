package com.eventuality.controls;

import com.eventuality.objects.Event;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EventDAO {
    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;

    public ArrayList<Event> SelectTable(Statement s) throws SQLException {
        retrieve_Values_qry = "SELECT * FROM Event";
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
        ArrayList<Event> arr = new <Event>ArrayList();

        if (rs != null) {
            while (rs.next()) {
                Event ev = new Event();
                
                ev.setEventId(rs.getString("EVENT_ID"));
                ev.setEventType(rs.getString("EVENT_TYPE"));
                ev.setLeader(rs.getInt("LEADER"));
                ev.setTitle(rs.getString("TITLE"));
                ev.setDescription(rs.getString("DESCRIPTION"));
                ev.setLocation(rs.getString("LOCATION"));
                ev.setIsApprovedBy(rs.getInt("APPROVED_BY"));
                ev.setApprovalStatus(rs.getBoolean("APPROVAL_STATUS"));
                ev.setTime(rs.getTime("TIME"));
                ev.setDate(rs.getDate("DATE"));
                arr.add(ev);
            }
            rs.close();
        }
        return arr;
    }
    
    public void DeleteRecord(Statement s, String eventId) throws SQLException{
        delete_Values_stmt =String.format("DELETE FROM Event WHERE Event_Id= %s", eventId);
        int rows = s.executeUpdate(delete_Values_stmt);
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        }else{
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
    }
    
    public void UpdateRecord(Statement s, String setField,String setValue, String eventID) throws SQLException{
        update_Values_stmt = String.format("UPDATE Event SET %s=%s WHERE Event_Id = %s",setField,setValue,eventID);
        int rows = s.executeUpdate(update_Values_stmt);
        String msg = String.format("EventID: %s \n Successfully updated %s, with value: %s.",eventID,setField,setValue);
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        }else{
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    
    public void InsertRecord(Statement s, Event obj) throws SQLException{
        insert_Values_stmt = String.format("INSERT INTO Event Values (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)",
                obj.getEventId(),obj.getEventType(),obj.getLeader(),obj.getTitle(),obj.getDescription(),
                obj.getTime(),obj.getLocation(),obj.getIsApprovedBy(),obj.isApprovalStatus(),obj.getDate());
        
        s.executeUpdate(insert_Values_stmt);
        JOptionPane.showMessageDialog(null, "New Event Added.");
    }
}
