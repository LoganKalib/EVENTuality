package com.eventuality.objects;

public class Event_Category {
    private String eventTypeId, description, eventKeyword, eventType;

    public Event_Category(String eventTypeId, String description, String eventKeyword, String eventType) {
        this.eventTypeId = eventTypeId;
        this.description = description;
        this.eventKeyword = eventKeyword;
        this.eventType = eventType;
    }

    public Event_Category() {
        this.eventTypeId = "";
        this.description = "";
        this.eventKeyword = "";
        this.eventType = "";
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

    public String getEventType() {
        return eventType;
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

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return this.eventTypeId + "\n" + this.description + "\n" + this.eventKeyword + "\n" + this.eventType;
    }
}
