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

    public ArrayList<Booking> SelectRecords(Connection c, int Num) throws SQLException {
        ArrayList<Booking> arr = new ArrayList();
        retrieve_Values_qry = "SELECT * FROM BOOKING WHERE Att_number=?";
        PreparedStatement ps = c.prepareStatement(retrieve_Values_qry);
        ps.setInt(1, Num);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            do {
                Booking book = new Booking();
                book.setAttdNumber(rs.getInt("ATT_NUMBER"));
                book.setTicketNumber(rs.getInt("TICKET_NUMBER"));
                book.setEventId(rs.getString("EVENT_ID"));
                book.setAttdType(rs.getString("ATT_TYPE").charAt(0));
                book.setDate(rs.getDate("DATE"));
                book.setTime(rs.getTime("TIME").toLocalTime());
                arr.add(book);
            } while (rs.next());
            rs.close();
            ps.close();
            return arr;
        } else {
            rs.close();
            ps.close();
            return null;
        }
    }

    public int SelectEventRecords(Connection c, String eventId) throws SQLException {
        ArrayList<Booking> arr = new ArrayList();
        retrieve_Values_qry = "SELECT * FROM BOOKING WHERE Event_Id=?";
        PreparedStatement ps = c.prepareStatement(eventId);
        ResultSet rs = ps.executeQuery();
        int i =0;

        if (rs != null) {
            while (rs.next()) {
                Booking book = new Booking();
                book.setAttdNumber(rs.getInt("ATT_NUMBER"));
                book.setTicketNumber(rs.getInt("TICKET_NUMBER"));
                book.setEventId(rs.getString("EVENT_ID"));
                book.setAttdType(rs.getString("ATT_TYPE").charAt(0));
                book.setDate(rs.getDate("DATE"));
                book.setTime(rs.getTime("TIME").toLocalTime());
                arr.add(book);
                i++;
            }
        }
        rs.close();
        ps.close();
        return i;
    }

    public void InsertRecord(Connection c, Booking obj) throws SQLException {
        insert_Values_stmt = "INSERT INTO BOOKING VALUES(?,?,?,?,?,?)";

        PreparedStatement ps = c.prepareStatement(insert_Values_stmt);
        ps.setInt(1, obj.getTicketNumber());
        ps.setTime(2, Time.valueOf(obj.getTime()));
        ps.setString(3, obj.getEventId());
        ps.setString(4, String.valueOf(obj.getAttdType()));
        ps.setDate(5, obj.getDate());
        ps.setInt(6, obj.getAttdNumber());

        int rows = ps.executeUpdate();
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");

        if (confirm == 0) {
            if (rows == 0) {
                JOptionPane.showMessageDialog(null, "Record not added.");
            } else {
                JOptionPane.showMessageDialog(null, "Record(s) successfully added.");
            }
        }

    }

}
