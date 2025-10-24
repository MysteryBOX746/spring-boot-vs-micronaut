package com.example.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.validation.Valid;

import com.example.dto.UserDto;
import com.example.service.UserService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

/**
 * @author vladimir.nikolov
 */
@Controller("/users")
public class UserController {
    
    @Inject
    UserService userService;
    
    @Get
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }
    
    @Get("/{id}")
    public UserDto getUserById(@PathVariable final Long id) {
        return userService.getUserById(id);
    }
    
    @Put
    public UserDto updateUser(@Valid final UserDto userDto) {
        return userService.updateUser(userDto);
    }
    
    @Post
    public UserDto createUser(@Valid @Body final UserDto userDto) {
        return userService.createUser(userDto);
    }
    
    @Delete
    public void deleteUser(@Valid final UserDto userDto) {
        userService.deleteUser(userDto.getId());
    }
}
