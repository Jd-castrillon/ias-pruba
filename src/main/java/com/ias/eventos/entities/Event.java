package com.ias.eventos.entities;

import jakarta.persistence.Entity;

@Entity
public class Event {

    private String id;

    private String date;

    private String name;

    private String location;

    public Event(String id, String date, String name, String location) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
