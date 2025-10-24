package com.example.controller;

import com.example.dto.HelloResponse;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller
public class HelloWorldController {
    
    @Get("/hello")
    public HelloResponse hello() {
        final var helloResponse = new HelloResponse();
        helloResponse.setMessage("Hello World");
        
        return helloResponse;
    }
}
