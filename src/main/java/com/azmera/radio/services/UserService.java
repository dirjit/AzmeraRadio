package com.azmera.radio.services;

import java.util.List;

import com.azmera.radio.models.Song;
import com.azmera.radio.models.User;

public interface UserService {
	
	List<User> getUserPlayListByEmail(String email);
	
	List<User> getUserPlayListByUserName(String userName);
	
	List<User> getUserPlayListByPhoneNumber(String phoneNumber);
	
	List<Song> getUserPlayListByPlayListName(String playlistName);
	
	void save(Iterable<User> playList);

}
