package com.eventuality.objects;

public class Location {
    private String eventLocation, campus, department, building, room;
    private int capacity;
    
    public Location(String eventLocation, String campus, String department, String building, String room, int capacity) {
        this.eventLocation = eventLocation;
        this.campus = campus;
        this.department = department;
        this.building = building;
        this.room = room;
        this.capacity = capacity;
    }
    
    public Location() {
        this.eventLocation = "";
        this.campus = "";
        this.department = "";
        this.building = "";
        this.room = "";
        this.capacity = 0;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getCampus() {
        return campus;
    }

    public String getDepartment() {
        return department;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.eventLocation + "\n" + this.campus + "\n" + this.department +
                this.building + "\n" + this.room + "\n" + this.capacity;
    }

    
}
