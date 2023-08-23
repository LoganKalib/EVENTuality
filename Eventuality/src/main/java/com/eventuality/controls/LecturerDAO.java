package com.eventuality.controls;

import com.eventuality.objects.Lecturer;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LecturerDAO {

    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;

    public Lecturer SelectLogin(Connection c, String staffEmail, String password) throws SQLException {
        retrieve_Values_qry ="SELECT * FROM Lecturer WHERE Email=? AND Password =?";
        PreparedStatement ps = c.prepareStatement(retrieve_Values_qry);
        ps.setString(1, staffEmail);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        Lecturer lec=null;

        if (rs != null) {
            while (rs.next()){
                lec = new Lecturer();
                lec.setStaffNumber(rs.getInt("STAFF_NUMBER"));
                lec.setLectName(rs.getString("FIRST_NAME"));
                lec.setLectSurname("SURNAME");
                lec.setLectPassword(rs.getString("PASSWORD"));
                lec.setLectEmail(rs.getString("EMAIL"));

            }
            rs.close();
            ps.close();
        } else {
            rs.close();
            ps.close();
            return null;
        }
        return lec;
    }

    public void DeleteRecord(Connection c, int staffNum) throws SQLException {
        delete_Values_stmt = "DELETE FROM Lecturer WHERE STAFF_NUMBER=?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setInt(1,staffNum);
        int rows = ps.executeUpdate(delete_Values_stmt);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        ps.close();
    }

public void UpdateRecord(Connection c, String setField, String setValue, int staffNum) throws SQLException{
        update_Values_stmt = "UPDATE Lecturer SET ?=? WHERE STAFF_NUMBER = ?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setField);
        ps.setString(2, setValue);
        ps.setInt(3, staffNum);
        
        int rows = ps.executeUpdate(update_Values_stmt);
        String msg = String.format("Staff_Number: %d \n Successfully updated %s, with value: %s.",staffNum,setField,setValue);
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that Number...");
        }else{
            JOptionPane.showMessageDialog(null, msg);
        }
        ps.close();
    }
}
