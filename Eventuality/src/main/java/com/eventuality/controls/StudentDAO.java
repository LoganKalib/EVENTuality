package com.eventuality.controls;

import com.eventuality.objects.Student;
import java.sql.*;


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
                stu.

            }
            while (rs.next());
        } else {
            return null;
        }
        return stu;
    }
    
}
