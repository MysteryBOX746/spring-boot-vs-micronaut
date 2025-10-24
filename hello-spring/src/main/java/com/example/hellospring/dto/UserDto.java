package com.example.hellospring.dto;

import jakarta.validation.constraints.NotNull;

/**
 * Basic User DTO
 *
 * @author vladimir.nikolov
 */
public class UserDto {
    
    @NotNull
    private Long id;
    
    @NotNull
    private String name;
    
    @NotNull
    private Integer age;
    
    public Long getId() {
        return id;
    }
    
    public UserDto setId(final Long id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public UserDto setName(final String name) {
        this.name = name;
        return this;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public UserDto setAge(final Integer age) {
        this.age = age;
        return this;
    }
    
}
