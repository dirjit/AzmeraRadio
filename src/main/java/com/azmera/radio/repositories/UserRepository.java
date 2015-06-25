package com.azmera.radio.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.azmera.radio.models.User;

public interface UserRepository extends MongoRepository<User, String>{

	User getUserByEmail(String email);
	
	User getUserByUserName(String userName);
	
	User getUserByPhoneNumber(String phoneNumber);
	
	<S extends User> List<S> save(Iterable<S> user);
} 
