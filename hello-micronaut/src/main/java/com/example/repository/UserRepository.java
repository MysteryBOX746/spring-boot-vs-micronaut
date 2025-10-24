package com.example.repository;

import com.example.entity.UserEntity;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * A simple CRUD repository
 *
 * @author vladimir.nikolov
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
