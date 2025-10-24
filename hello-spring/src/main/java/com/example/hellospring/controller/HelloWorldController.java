package com.example.hellospring.controller;

import com.example.hellospring.dto.HelloResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    public HelloResponse hello() {
        final var helloResponse = new HelloResponse();
        helloResponse.setMessage("Hello World");
        
        return helloResponse;
    }
}
