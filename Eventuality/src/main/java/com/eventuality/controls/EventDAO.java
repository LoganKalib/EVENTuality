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

    public ArrayList SelectTable(Statement s) throws SQLException {
        retrieve_Values_qry = "SELECT * FROM Event ";
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
        ArrayList<Event> arr = new <Event>ArrayList();

        if (rs != null) {
            while (rs.next()) {
                Event ev = new Event();
                
                ev.setEventId(rs.getString(1));
                ev.setEventType(rs.getString(2));
                ev.setLeader(rs.getInt(3));
                ev.setTitle(rs.getString(4));
                ev.setDescription(rs.getString(5));
                ev.setLocation(rs.getString(6));
                ev.setIsApprovedBy(rs.getInt(7));
                ev.setApprovalStatus(rs.getBoolean(8));
                ev.setTime(rs.getTime(9));
                ev.setDate(rs.getDate(10));
                arr.add(ev);
            }
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
    
    public void InsertRecord(Statement s, Event obj){
        insert_Values_stmt = String.format("INSERT INTO Event() Values (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)",obj);
    }
}
