package com.eventuality.objects;

import java.sql.*;
import java.time.LocalTime;

public class Booking {
    private int ticketNumber, attdNumberStud, attdNumberLec;
    private String eventId;
    private LocalTime time;
    private Date date;
    private char attdType;

    public Booking(int ticketNumber, int attdNumberStud, String eventId, LocalTime time, Date date, char attdType) {
        this.ticketNumber = ticketNumber;
        this.attdNumberStud = attdNumberStud;
        this.eventId = eventId;
        this.time = time;
        this.date = date;
        this.attdType = attdType;
        
    }

    public Booking() {
        this.ticketNumber = 0;
        this.attdNumberStud = 0;
        this.eventId = "";
        this.time = null;
        this.date = null;
        this.attdType = '\0';
        this.attdNumberLec = 0;
    } 

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getAttdNumberStud() {
        return attdNumberStud;
    }

    public String getEventId() {
        return eventId;
    }

    public LocalTime getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    public char getAttdType() {
        return attdType;
    }

    public int getAttdNumberLec() {
        return attdNumberLec;
    }
    
    

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAttdType(char attdType) {
        this.attdType = attdType;
    }

    public void setAttdNumberStud(int attdNumberStud) {
        this.attdNumberStud = attdNumberStud;
    }

    public void setAttdNumberLec(int attdNumberLec) {
        this.attdNumberLec = attdNumberLec;
    }
    
    

    @Override
    public String toString() {
        return this.ticketNumber + "\n" + this.attdNumberStud + "\n" + this.eventId +
                "\n" + this.time + "\n" + this.date + "\n" + this.attdType;
    }  
}

