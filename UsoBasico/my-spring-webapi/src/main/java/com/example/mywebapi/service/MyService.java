package com.example.mywebapi.service;

import com.example.mywebapi.model.MyModel;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public MyModel getMyModel() {
        // Here you can implement your logic to retrieve or create a MyModel object
        return new MyModel();
    }
}