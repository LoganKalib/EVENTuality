package com.eventuality.controls;

import com.eventuality.objects.Student;
import java.sql.*;
import javax.swing.JOptionPane;


public class StudentDAO {
    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;
    
    public Student SelectLogin(Statement s, int studentNum, String password) throws SQLException {
        retrieve_Values_qry = String.format("SELECT * FROM Student WHERE Student_Number= %d AND Password =%s", studentNum, password);
        ResultSet rs = s.executeQuery(retrieve_Values_qry);
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
            return null;
        }
        return stu;
    }
    
    public void DeleteRecord(Statement s, int stuNum) throws SQLException {
        delete_Values_stmt = String.format("DELETE FROM STUDENT WHERE STUDENT_NUMBER =%d", stuNum);
        int rows = s.executeUpdate(delete_Values_stmt);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
    }
    
    public void UpdateRecord(Statement s, String setField, String setValue, int stuNum) throws SQLException{
        update_Values_stmt = String.format("UPDATE STUDENT SET %s=%s WHERE STUDENT_NUMBER = %d",setField,setValue,stuNum);
        int rows = s.executeUpdate(update_Values_stmt);
        String msg = String.format("Student_Number: %d \n Successfully updated %s, with value: %s.",stuNum,setField,setValue);
        if (rows == 0){
            JOptionPane.showMessageDialog(null, "No record with that Number...");
        }else{
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    
}
