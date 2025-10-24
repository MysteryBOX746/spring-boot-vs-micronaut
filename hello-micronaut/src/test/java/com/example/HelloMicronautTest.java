package com.example;

import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class HelloMicronautTest {
    
    @Inject
    HttpClient httpClient;
    
    @Test
    void testHelloWorld() {
        final var response = httpClient.toBlocking()
            .retrieve("http://localhost:8081/hello");
        System.out.println(response);
        Assertions.assertEquals("{\"message\":\"Hello World\"}", response);
        
    }

}
