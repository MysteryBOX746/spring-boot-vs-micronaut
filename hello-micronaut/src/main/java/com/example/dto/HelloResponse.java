package com.example.dto;

import io.micronaut.serde.annotation.Serdeable;

/**
 * A simple response
 *
 * @author vladimir.nikolov
 */
@Serdeable
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
