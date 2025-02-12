package com.ieee.ieee_yesist.model;

import java.util.Date;
import java.util.List;

public class Event {
    private String eventName, aboutEvent, eventUrl, registerUrl;
    private Date date, endDate;

    public Event(String eventName, String aboutEvent, String eventUrl, String registerUrl, Date date, Date endDate) {
        this.eventName = eventName;
        this.aboutEvent = aboutEvent.replace("\\n", "\n");
        this.eventUrl = eventUrl;
        this.registerUrl = registerUrl;
        this.date = date;
        this.endDate = endDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getAboutEvent() {
        return aboutEvent;
    }

    public void setAboutEvent(String aboutEvent) {
        this.aboutEvent = aboutEvent;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public String getRegisterUrl() {
        return registerUrl;
    }

    public void setRegisterUrl(String registerUrl) {
        this.registerUrl = registerUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
