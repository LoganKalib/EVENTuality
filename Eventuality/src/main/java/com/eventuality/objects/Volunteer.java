package com.eventuality.objects;

public class Volunteer {
    private String eventId, role;
    private int studentNumber;

    public Volunteer(String eventId, String role, int studentNumber) {
        this.eventId = eventId;
        this.role = role;
        this.studentNumber = studentNumber;
    }
    
    public Volunteer() {
        this.eventId = "";
        this.role = "";
        this.studentNumber = 0;
    }

    public String getEventId() {
        return eventId;
    }

    public String getRole() {
        return role;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return this.role + "\n" + this.studentNumber + "\n" + this.eventId;
    }
}
