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
                ev.setTime(rs.getTime("TIME").toLocalTime());
                ev.setDate(rs.getDate("DATE"));
                arr.add(ev);
            }
            rs.close();
        }
        return arr;
    }
    
    public void DeleteRecord(Connection c, String eventId) throws SQLException{
        delete_Values_stmt ="DELETE FROM Event WHERE Event_Id= ?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setString(1, eventId);
        int rows = ps.executeUpdate();
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        }else{
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        ps.close();
    }
    
    public void UpdateRecord(Connection c,String setValue, String eventID) throws SQLException{
        update_Values_stmt = "UPDATE Event SET APPROVAL_STATUS=? WHERE Event_Id = ?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setValue);
        ps.setString(2,eventID);
        int rows = ps.executeUpdate();
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        }else{
            JOptionPane.showMessageDialog(null, "Update successful.");
        }
        ps.close();
    }
    
    public void InsertRecord(Connection c, Event obj) throws SQLException{
        insert_Values_stmt = "INSERT INTO EVENT VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps =c.prepareStatement(insert_Values_stmt);
        ps.setString(1, obj.getEventId());
        ps.setString(2, obj.getEventType());
        ps.setInt(3, obj.getLeader());
        ps.setString(4, obj.getTitle());
        ps.setString(5, obj.getDescription());
        ps.setTime(6, Time.valueOf(obj.getTime()));
        ps.setString(7, obj.getLocation());
        ps.setInt(8, obj.getIsApprovedBy());
        ps.setBoolean(9, obj.isApprovalStatus());
        ps.setDate(10, obj.getDate());
        int rows = ps.executeUpdate();
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record added");
        }else{
            JOptionPane.showMessageDialog(null, "Record(s) successfully added.");
        }
        ps.close();
    }
}
