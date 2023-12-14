package com.example.mywebapi.controller;

import com.example.mywebapi.model.MyModel;
import com.example.mywebapi.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/items")
    public List<MyModel> getAllItems() {
        return myService.getAllItems();
    }
}