package com.example.hellospring.dto;

/**
 * A simple response
 *
 * @author vladimir.nikolov
 */
public class HelloResponse {
    
    private String message;
    
    public String getMessage() {
        return message;
    }
    
    public HelloResponse setMessage(final String message) {
        this.message = message;
        return this;
    }
}
