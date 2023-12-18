package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public MyModel() {
    }

    public MyModel(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isPrime(int i)
    {
        if (i <= 1)
            return false;
        else if (i == 2)
            return true;
        else if (i % 2 == 0)
            return false;
        for (int j = 3; j <= Math.sqrt(i); j += 2)
        {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}