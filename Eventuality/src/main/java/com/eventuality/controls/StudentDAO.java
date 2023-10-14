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
            while (rs.next()) {
                stu = new Student(rs.getInt("STUDENT_NUMBER"), rs.getString("FIRST_NAME"), rs.getString("SURNAME"), rs.getString("PASSWORD"), rs.getString("EMAIL"));
            }
            rs.close();
            ps.close();
            return stu;
        } else {
            rs.close();
            ps.close();
            return null;
        }
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

    private void UpdateRecord(Connection c, String setValue, String Email) {
        update_Values_stmt = "UPDATE Lecturer SET Password = ? WHERE EMAIL = ?";

        try {
            PreparedStatement ps = c.prepareStatement(update_Values_stmt);
            ps.setString(1, setValue);
            ps.setString(2, Email);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                String msg = String.format("Email: %s\nSuccessfully updated Password, with value: %s.", Email, setValue);
                System.out.println(msg);
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "No record with that Email...");
            }

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately, log it, or display an error message.
        }
    }

    public void InsertRecord(Connection c, Student stud) throws SQLException {
        insert_Values_stmt = "INSERT INTO Student VALUES(?,?,?,?,?)";
        PreparedStatement ps = c.prepareStatement(insert_Values_stmt);
        ps.setInt(1, stud.getStudNum());
        ps.setString(2, stud.getStudName());
        ps.setString(3, stud.getStudSurname());
        ps.setString(4, stud.getStudPassword());
        ps.setString(5, stud.getStudEmail());
        int rows = ps.executeUpdate();

        if (rows != 0) {
            JOptionPane.showMessageDialog(null, "Student added successfully.");
        }
        ps.close();
    }

    public int checkVol(Connection c, int Studnum) throws SQLException {
        String checkVol = "SELECT * from Student WHERE Student_Number=?";
        PreparedStatement ps = c.prepareStatement(checkVol);
        ps.setInt(1, Studnum);
        ResultSet rows = ps.executeQuery();
        if (!rows.next()) {
            return -1;
        } else {
            return 1;
        }
    }

    public void Checkuser(Connection c, String email, String studNum) throws SQLException {
        String checkif = "SELECT * FROM Student WHERE email=? AND student_Number=?";
        PreparedStatement ps = c.prepareStatement(checkif);
        ps.setString(1, email);
        ps.setInt(2, Integer.parseInt(studNum));
        ResultSet rows = ps.executeQuery();

        if (!rows.next()) {
            JOptionPane.showMessageDialog(null, "this user does not exsist, please sign up.");
        } else {
            String newPass = JOptionPane.showInputDialog(null, "please enter a new password");
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset your password?");

            if (confirm == 0) {
                ps.close();
                rows.close();
                UpdateRecord(c, newPass, email);
            }

        }

        ps.close();
        rows.close();

    }

}
