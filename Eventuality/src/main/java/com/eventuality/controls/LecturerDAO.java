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
        retrieve_Values_qry = "SELECT * FROM Lecturer WHERE Email=? AND Password =?";
        PreparedStatement ps = c.prepareStatement(retrieve_Values_qry);
        ps.setString(1, staffEmail);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        Lecturer lec = null;

        if (rs != null) {
            while (rs.next()) {
                lec = new Lecturer(rs.getString("FIRST_NAME"),
                        rs.getString("SURNAME"),rs.getString("PASSWORD"),
                        rs.getString("EMAIL"),rs.getInt("STAFF_NUMBER"));
            }
            rs.close();
            ps.close();
            return lec;
        } else {
            rs.close();
            ps.close();
            return null;
        }
    }

    public void DeleteRecord(Connection c, int staffNum) throws SQLException {
        delete_Values_stmt = "DELETE FROM Lecturer WHERE STAFF_NUMBER=?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setInt(1, staffNum);
        int rows = ps.executeUpdate(delete_Values_stmt);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        ps.close();
    }

    private void UpdateRecord(Connection c, String setField, String setValue, String email) throws SQLException {
        update_Values_stmt = "UPDATE Lecturer SET Password=? WHERE Email =?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setValue);
        ps.setString(2, email);

        int rows = ps.executeUpdate();
        String msg = String.format("Staff_Number: %s \n Successfully updated %s, with value: %s.", email, setField, setValue);
        if (rows > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            JOptionPane.showMessageDialog(null, "No record with that Number...");
        }
        ps.close();
    }

    public void InsertRecord(Connection c, Lecturer obj) throws SQLException {
        insert_Values_stmt = "INSERT INTO LECTURER VALUES(?,?,?,?,?)";
        PreparedStatement ps = c.prepareStatement(insert_Values_stmt);
        ps.setInt(1, obj.getStaffNumber());
        ps.setString(2, obj.getLectName());
        ps.setString(3, obj.getLectSurname());
        ps.setString(4, obj.getLectPassword());
        ps.setString(5, obj.getLectEmail());
        int rows = ps.executeUpdate();

        if (rows != 0) {
            JOptionPane.showMessageDialog(null, "Lecturer added successfully.");
        }
        ps.close();
    }

    public void Checkuser(Connection c, String email, int staffNum) throws SQLException {
        String checkif = "SELECT * FROM Lecturer WHERE email=? AND Staff_number=?";
        PreparedStatement ps = c.prepareStatement(checkif);
        ps.setString(1, email);
        ps.setInt(2, staffNum);
        ResultSet rows = ps.executeQuery();

        if (!rows.next()) {
            JOptionPane.showMessageDialog(null, "this user does not exsist, please sign up.");
        } else {
            String newPass = JOptionPane.showInputDialog(null, "please enter a new password");
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset your password?");
            if (confirm == 0) {
                UpdateRecord(c, "Password", newPass, email);
            }
        }
        ps.close();
        rows.close();
    }
}
