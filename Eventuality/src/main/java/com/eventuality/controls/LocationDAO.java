package com.eventuality.controls;

import com.eventuality.objects.Location;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LocationDAO {

    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;

    public ArrayList<Location> SeleteAll(Statement s) throws SQLException {
        retrieve_Values_qry = "SELECT * From Location";
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
        ArrayList<Location> arr = new ArrayList();

        if (rs != null) {
            while (rs.next()) {
                Location loc = new Location();
                loc.setEventLocation(rs.getString("EVENT_LOCATION"));
                loc.setCampus(rs.getString("CAMPUS"));
                loc.setDepartment(rs.getString("DEPARTMENT"));
                loc.setCapacity(rs.getInt("CAPACITY"));
                loc.setBuilding(rs.getString("BUILDING"));
                loc.setRoom(rs.getString("ROOM"));
                arr.add(loc);
            }
        }
        rs.close();
        return arr;
    }
    
    public void DeleteRecord(Connection c, String eventLoc) throws SQLException{
        delete_Values_stmt ="DELETE FROM Location WHERE Event_Location= ?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setString(1, eventLoc);
        int rows = ps.executeUpdate();
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        }else{
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        ps.close();
    }
    
    public void UpdateRecord(Connection c, String setField,String setValue, String eventLoc) throws SQLException{
        update_Values_stmt = "UPDATE Location SET ?=? WHERE Event_Location = ?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setField);
        ps.setString(2, setValue);
        ps.setString(3,eventLoc);
        int rows = ps.executeUpdate(update_Values_stmt);
        String msg = String.format("Event Location: %s \n Successfully updated %s, with value: %s.",eventLoc,setField,setValue);
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        }else{
            JOptionPane.showMessageDialog(null, msg);
        }
        ps.close();
    }
}
