package com.eventuality.objects;

import java.sql.*;
import java.time.LocalTime;

public class Event {
    private String eventId, eventType, title, description, location;
    private int leader, isApprovedBy, ticketPrice;
    private Date date;
    private LocalTime time; 
    private boolean approvalStatus;

    public Event(String eventId, String eventType, String title, String description, String location, int leader, int isApprovedBy, int ticketPrice, Date date, LocalTime time, boolean approvalStatus) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.title = title;
        this.description = description;
        this.location = location;
        this.leader = leader;
        this.isApprovedBy = isApprovedBy;
        this.ticketPrice = ticketPrice;
        this.date = date;
        this.time = time;
        this.approvalStatus = approvalStatus;
    }

    public Event() {
        this.eventId = "";
        this.eventType = "";
        this.title = "";
        this.description = "";
        this.location = "";
        this.leader = 0;
        this.isApprovedBy = 0;
        this.ticketPrice = 0;
        this.time = null;
        this.date = null;
        this.approvalStatus = false; 
    }

    public String getEventId() {
        return eventId;
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

    public int getLeader() {
        return leader;
    }

    public int getIsApprovedBy() {
        return isApprovedBy;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public Date getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
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

    public void setLeader(int leader) {
        this.leader = leader;
    }

    public void setIsApprovedBy(int isApprovedBy) {
        this.isApprovedBy = isApprovedBy;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return this.eventId  + "\n" + this.eventType + "\n" + this.title + "\n" + this.description + "\n" + 
                this.location + "\n" + this.leader + "\n" + this.date + "\n" + this.time + "\n" + this.approvalStatus + "\n"+"\n";
    }
}
