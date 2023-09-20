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
        ResultSet rs = ps.executeQuery();
        Student stu = null;

        if (rs != null) {
            while (rs.next()){
                stu = new Student();
                stu.setStudNum(rs.getInt("STUDENT_NUMBER"));
                stu.setStudName(rs.getString("FIRST_NAME"));
                stu.setStudSurname(rs.getString("SURNAME"));
                stu.setStudPassword(rs.getString("PASSWORD"));
                stu.setStudEmail(rs.getString("EMAIL"));

            }
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

    public void UpdateRecord(Connection c, String setField, String setValue, String Email) throws SQLException {
        update_Values_stmt = "UPDATE Student SET ?=? WHERE email= ?";
        PreparedStatement ps = c.prepareStatement(update_Values_stmt);
        ps.setString(1, setField);
        ps.setString(2, setValue);
        ps.setString(3, Email);

        int rows = ps.executeUpdate(update_Values_stmt);
        String msg = String.format("Student_Number: %s \n Successfully updated %s, with value: %s.", Email, setField, setValue);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that Number...");
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        ps.close();
    }
    
    
    public void InsertRecord(Connection c, Student stud) throws SQLException{
        insert_Values_stmt = "INSERT INTO Student VALUES(?,?,?,?,?)";
        PreparedStatement ps = c.prepareStatement(insert_Values_stmt);
        ps.setInt(1, stud.getStudNum());
        ps.setString(2, stud.getStudName());
        ps.setString(3, stud.getStudSurname());
        ps.setString(4, stud.getStudPassword());
        ps.setString(5, stud.getStudEmail());
        int rows = ps.executeUpdate();
        
        if(rows!=0){
            JOptionPane.showMessageDialog(null, "Row added successfully.");
        }
        ps.close();
    }
    
    public void Checkuser(Connection c, String email) throws SQLException{
        String checkif = "SELECT FROM Student WHERE email=?";
        PreparedStatement ps = c.prepareStatement(checkif);
        ps.setString(1, email);
        ResultSet rows = ps.executeQuery();
        
        if(rows == null){
            JOptionPane.showMessageDialog(null, "this user does not exsist, please sign up.");
        }else{
            String newPass = JOptionPane.showInputDialog(null, "please enter a new password");
            UpdateRecord(c,"Password",newPass,email);
        }
    }
    
}
