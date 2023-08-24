package com.eventuality.controls;

import com.eventuality.objects.Booking;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BookingDAO {
    
    private String insert_Values_stmt;
    private String update_Values_stmt;
    private String delete_Values_stmt;
    private String retrieve_Values_qry;
    
    
    public ArrayList<Booking>SelectStudRecords(Connection c,int studNum) throws SQLException{
        ArrayList<Booking> arr = new ArrayList();
        retrieve_Values_qry = "SELECT * FROM BOOKING WHERE Student_number=?";
        PreparedStatement ps = c.prepareStatement(retrieve_Values_qry);
        ps.setInt(1, studNum);
        ResultSet rs = ps.executeQuery();
        
        if(rs !=null){
            while(rs.next()){
                Booking book = new Booking();
                book.setAttdNumberStud(rs.getInt("STUDENT_NUMBER"));
                book.setTicketNumber(rs.getInt("TICKET_NUMBER"));
                book.setEventId(rs.getString("EVENT_ID"));
                book.setAttdType(rs.getString("ATT_TYPE").charAt(0));
                book.setDate(rs.getDate("DATE"));
                book.setTime(rs.getTime("TIME"));
                arr.add(book);
            }
        }
        rs.close();
        ps.close();
        return arr;
    }
    
    public ArrayList<Booking>SelectLectRecords(Connection c,int staffNum) throws SQLException{
        ArrayList<Booking> arr = new ArrayList();
        retrieve_Values_qry = "SELECT * FROM BOOKING WHERE Staff_number=?";
        PreparedStatement ps = c.prepareStatement(retrieve_Values_qry);
        ResultSet rs = ps.executeQuery();
        
        if(rs !=null){
            while(rs.next()){
                Booking book = new Booking();
                book.setAttdNumberLec(rs.getInt("STAFF_NUMBER"));
                book.setTicketNumber(rs.getInt("TICKET_NUMBER"));
                book.setEventId(rs.getString("EVENT_ID"));
                book.setAttdType(rs.getString("ATT_TYPE").charAt(0));
                book.setDate(rs.getDate("DATE"));
                book.setTime(rs.getTime("TIME"));
                arr.add(book);
            }
        }
        rs.close();
        ps.close();
        return arr;
    }
    
    public ArrayList<Booking>SelectEventRecords(Connection c,String eventId) throws SQLException{
        ArrayList<Booking> arr = new ArrayList();
        retrieve_Values_qry = "SELECT * FROM BOOKING WHERE Event_Id=?";
        PreparedStatement ps = c.prepareStatement(eventId);
        ResultSet rs = ps.executeQuery();
        
        if(rs !=null){
            while(rs.next()){
                Booking book = new Booking();
                book.setAttdNumberStud(rs.getInt("STUDENT_NUMBER"));
                book.setTicketNumber(rs.getInt("TICKET_NUMBER"));
                book.setEventId(rs.getString("EVENT_ID"));
                book.setAttdType(rs.getString("ATT_TYPE").charAt(0));
                book.setDate(rs.getDate("DATE"));
                book.setTime(rs.getTime("TIME"));
                book.setAttdNumberLec(rs.getInt("STAFF_NUMBER"));
                arr.add(book);
            }
        }
        rs.close();
        ps.close();
        return arr;
    }
    
    public void DeleteRecordStud(Connection c, int studNum,String eventId) throws SQLException{
        delete_Values_stmt = "DELETE FROM BOOKING WHERE Student_Number=?,Event_id=?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setInt(1, studNum);
        ps.setString(2, eventId);
        int rows = ps.executeUpdate(delete_Values_stmt);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        
    }
   
    public void DeleteRecordLec(Connection c, int staffNum,String eventId) throws SQLException{
        delete_Values_stmt = "DELETE FROM BOOKING WHERE Staff_Number=?,Event_id=?";
        PreparedStatement ps = c.prepareStatement(delete_Values_stmt);
        ps.setInt(1, staffNum);
        ps.setString(2, eventId);
        int rows = ps.executeUpdate(delete_Values_stmt);
        if (rows == 0) {
            JOptionPane.showMessageDialog(null, "No record with that ID...");
        } else {
            JOptionPane.showMessageDialog(null, "Record(s) successfully deleted.");
        }
        
    }
    
  
   
}
