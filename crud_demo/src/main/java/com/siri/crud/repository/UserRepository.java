package com.siri.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siri.crud.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
