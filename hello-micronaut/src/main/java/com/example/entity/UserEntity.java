package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import io.micronaut.configuration.hibernate.jpa.proxy.GenerateProxy;

/**
 * A simple entity for demonstration purposes
 *
 * @author vladimir.nikolov
 */
@Entity
@GenerateProxy
public class UserEntity {
    
    @Id
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "age", nullable = false)
    private Integer age;
    
    public Long getId() {
        return id;
    }
    
    public UserEntity setId(final Long id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public UserEntity setName(final String name) {
        this.name = name;
        return this;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public UserEntity setAge(final Integer age) {
        this.age = age;
        return this;
    }
}
