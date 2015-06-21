package com.azmera.radio.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.azmera.radio.models.Song;
import com.azmera.radio.models.User;

public interface UserRepository extends MongoRepository<User, String>{

	List<User> getUserPlayListByEmail(String email);
	
	List<User> getUserPlayListByUserName(String userName);
	
	List<User> getUserPlayListByPhoneNumber(String phoneNumber);
	
	@Query("{playListName: ?0}")
	List<Song> getUserPlayListByPlayListName(String playlistName);
	
	<S extends User> List<S> save(Iterable<S> playList);
} 
