package com.eventuality.controls;

import com.eventuality.objects.Volunteer;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class VolunteerDAO {

    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;

    public ArrayList<Volunteer> SelectVols(Statement s, int studNum, String EventID) throws SQLException {
        retrieve_Values_qry = String.format("SELECT * FROM VOLUNTEERS WHERE STUDENT_NUMBER = %d, EVENT_ID= %s", studNum, EventID);
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
        ArrayList<Volunteer> arr = new ArrayList();
        
        if(rs != null){
            while(rs.next()){
                Volunteer vol = new Volunteer();
                vol.setStudentNumber(rs.getInt("STUDENT_NUMBER"));
                vol.setEventId(rs.getString("EVENT_ID"));
                vol.setRole(rs.getString("ROLE"));
                arr.add(vol);
            }
        }
        rs.close();
        return arr;
    }
    
    public void DeleteRecord(Connection c, int studNum) throws SQLException {
        delete_Values_stmt = "DELETE FROM VOLUNTEERS WHERE STUDENT_NUMBER=?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setInt(1, studNum);
        int rows = ps.executeUpdate(delete_Values_stmt);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        ps.close();
    }

    public void UpdateRecord(Connection c, String setField, String setValue, int studNum, String email) throws SQLException {
        update_Values_stmt = "UPDATE VOLUNTEERS SET ?=? WHERE STUDENT_NUMBER = ? , EMAIL=?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setField);
        ps.setString(2, setValue);
        ps.setInt(3, studNum);
        ps.setString(4, email);

        int rows = ps.executeUpdate(update_Values_stmt);
        String msg = String.format("Student_Number: %d \n Successfully updated %s, with value: %s.", studNum, setField, setValue);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that Number...");
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        ps.close();
    }
}