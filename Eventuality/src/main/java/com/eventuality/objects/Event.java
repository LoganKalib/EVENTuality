package com.eventuality.objects;

import java.sql.*;

public class Event {
    private String eventID, eventType, title, description, location;
    private int eventLeader, approvedBy;
    private boolean approvalStatus = false;
    private Time time;
    private Date date;

    public String getEventID() {
        return eventID;
    }

    public String getEventType() {
        return eventType;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getEventLeader() {
        return eventLeader;
    }

    public int getApprovedBy() {
        return approvedBy;
    }

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public Time getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventLeader(int eventLeader) {
        this.eventLeader = eventLeader;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Event(String eventID, String eventType, String title, String description, String location, int eventLeader, int approvedBy, Time time, Date date) {
        this.eventID = eventID;
        this.eventType = eventType;
        this.title = title;
        this.description = description;
        this.location = location;
        this.eventLeader = eventLeader;
        this.approvedBy = approvedBy;
        this.time = time;
        this.date = date;
    }

    public Event() {
        this.eventID = "";
        this.eventType = "";
        this.title = "";
        this.description = "";
        this.location = "";
        this.eventLeader = 0;
        this.approvedBy = 0;
    }
    
    @Override
    public String toString(){
        return this.eventID +"\n"+ this.eventType + "\n" + this.eventLeader + "\n" +
                this.title +"\n" + this.description + "\n" + this.location + "\n"+
                this.approvedBy +"\n" + this.approvalStatus +"\n" + this.time +"\n" + this.date;
    }
}
