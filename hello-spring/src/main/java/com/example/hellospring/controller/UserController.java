package com.example.hellospring.controller;

import java.util.List;


import com.example.hellospring.dto.UserDto;
import com.example.hellospring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vladimir.nikolov
 */
@RestController("/users")
public class UserController {
    
    private final UserService userService;
    
    public UserController(final UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }
    
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable final Long id) {
        return userService.getUserById(id);
    }
    
    @PutMapping
    public UserDto updateUser(final UserDto userDto) {
        return userService.updateUser(userDto);
    }
    
    @PostMapping
    public UserDto createUser(final UserDto userDto) {
        return userService.createUser(userDto);
    }
    
    @DeleteMapping
    public void deleteUser(final UserDto userDto) {
        userService.deleteUser(userDto.getId());
    }
}
