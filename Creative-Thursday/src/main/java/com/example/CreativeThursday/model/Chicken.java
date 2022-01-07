package com.example.CreativeThursday.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chicken")
public class Chicken {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String breed;
    private String imageUrl;

    public Chicken(){}

    public Chicken(int id, String name, String breed, String imageUrl) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.imageUrl = imageUrl;
    }

    public Chicken(String name, String breed, String imageUrl) {
        this.name = name;
        this.breed = breed;
        this.imageUrl = imageUrl;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
