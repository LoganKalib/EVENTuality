package com.eventuality.controls;

import com.eventuality.objects.Student;
import java.sql.*;
import javax.swing.JOptionPane;


public class StudentDAO {
    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;
    
    public Student SelectLogin(Connection c, String studentEmail, String password) throws SQLException {
        retrieve_Values_qry = "SELECT * FROM Student WHERE EMAIL=? AND Password =?";
        PreparedStatement ps = c.prepareStatement(retrieve_Values_qry);
        ps.setString(1, studentEmail);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery(retrieve_Values_qry);
        Student stu;

        if (rs != null) {
            {
                stu = new Student();
                stu.setStudNum(rs.getInt("STUDENT_NUMBER"));
                stu.setStudName(rs.getString("FIRST_NAME"));
                stu.setStudSurname(rs.getString("SURNAME"));
                stu.setStudPassword(rs.getString("PASSWORD"));
                stu.setStudEmail(rs.getString("EMAIL"));

            }
            while (rs.next());
        } else {
            rs.close();
            ps.close();
            return null;
        }
        rs.close();
        ps.close();
        return stu;
    }
    
    public void DeleteRecord(Connection c, int studNum) throws SQLException {
        delete_Values_stmt = "DELETE FROM STUDENT WHERE STUDENT_NUMBER=?";
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

    public void UpdateRecord(Connection c, String setField, String setValue, int staffNum) throws SQLException {
        update_Values_stmt = "UPDATE Student SET ?=? WHERE STUDENT_NUMBER = ?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setField);
        ps.setString(2, setValue);
        ps.setInt(3, staffNum);

        int rows = ps.executeUpdate(update_Values_stmt);
        String msg = String.format("Student_Number: %d \n Successfully updated %s, with value: %s.", staffNum, setField, setValue);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that Number...");
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        ps.close();
    }
    
}
