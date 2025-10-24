package com.example.hellospring.repository;

import java.util.List;

import com.example.hellospring.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * A simple CRUD repository
 *
 * @author vladimir.nikolov
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {


}
