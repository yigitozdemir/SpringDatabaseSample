package com.yigitozdemir.DatabaseSample.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yigitozdemir.DatabaseSample.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);
	User findByUsername(String username);
	User findById(long id);
}
