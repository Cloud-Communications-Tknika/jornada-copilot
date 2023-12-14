package com.example.mywebapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Add other fields as per your requirements

    // Getters and setters for the fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Add other getters and setters as per your requirements
}