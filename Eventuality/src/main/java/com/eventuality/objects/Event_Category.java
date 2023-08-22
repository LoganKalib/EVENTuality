package com.eventuality.objects;

public class Event_Category {
    private String eventTypeId, description, eventKeyword;

    public Event_Category(String eventTypeId, String description, String eventKeyword) {
        this.eventTypeId = eventTypeId;
        this.description = description;
        this.eventKeyword = eventKeyword;
    }

    public Event_Category() {
        this.eventTypeId = "";
        this.description = "";
        this.eventKeyword = "";
    }

    public String getEventTypeId() {
        return eventTypeId;
    }

    public String getDescription() {
        return description;
    }

    public String getEventKeyword() {
        return eventKeyword;
    }

    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventKeyword(String eventKeyword) {
        this.eventKeyword = eventKeyword;
    }

    @Override
    public String toString() {
        return this.eventTypeId + "\n" + this.description + "\n" + this.eventKeyword + "\n";
    }
}
