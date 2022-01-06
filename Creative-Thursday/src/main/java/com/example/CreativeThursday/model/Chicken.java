package com.example.CreativeThursday.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chicken {

    @Id
    private int id;
    private String name;

    public Chicken(){}

    public Chicken(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
