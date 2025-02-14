package com.practice.deploy.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PracticeController {

    @GetMapping("/hello")
    public HashMap<String, String> sayHello() {

        var response = new HashMap<String, String>();
        response.put("message", "Hello, Kubernetes!");
        
        return response;
    }
}
