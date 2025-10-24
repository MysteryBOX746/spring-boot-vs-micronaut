package com.example.hellospring.service;

import java.util.List;
import java.util.stream.StreamSupport;

import jakarta.transaction.Transactional;

import com.example.hellospring.dto.UserDto;
import com.example.hellospring.entity.UserEntity;
import com.example.hellospring.repository.UserRepository;

import org.springframework.stereotype.Service;

/**
 * @author vladimir.nikolov
 */
@Service
@Transactional
public class UserService {
    
    UserRepository userRepository;
    
    public UserDto getUserById(final Long id) {
        return toUserDto(userRepository.findById(id).orElseThrow());
    }
    
    public List<UserDto> getUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false).map(this::toUserDto).toList();
    }
    
    public UserDto createUser(final UserDto userDto) {
        return toUserDto(userRepository.save(toUserEntity(userDto)));
    }
    
    public UserDto updateUser(final UserDto userDto) {
        final var userEntity = userRepository.findById(userDto.getId()).orElseThrow();
        userEntity.setName(userDto.getName());
        userEntity.setAge(userDto.getAge());
        userRepository.save(userEntity);
        return toUserDto(userEntity);
    }
    
    public void deleteUser(final Long id) {
        userRepository.deleteById(id);
    }
    
    private UserDto toUserDto(final UserEntity user) {
        return new UserDto().setId(user.getId())
            .setName(user.getName())
            .setAge(user.getAge());
    }
    
    private UserEntity toUserEntity(final UserDto userDto) {
        return new UserEntity().setId(userDto.getId()).setName(userDto.getName()).setAge(userDto.getAge());
    }
    
}
