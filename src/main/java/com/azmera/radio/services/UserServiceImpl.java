package com.azmera.radio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azmera.radio.models.Song;
import com.azmera.radio.models.User;
import com.azmera.radio.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getUserPlayListByEmail(String email) {
		return userRepository.getUserPlayListByEmail(email);
	}

	@Override
	public List<User> getUserPlayListByUserName(String userName) {
		return userRepository.getUserPlayListByUserName(userName);
	}

	@Override
	public List<User> getUserPlayListByPhoneNumber(String phoneNumber) {
		return userRepository.getUserPlayListByPhoneNumber(phoneNumber);
	}

	@Override
	public List<Song> getUserPlayListByPlayListName(String playlistName) {
		return userRepository.getUserPlayListByPlayListName(playlistName);
	}

	@Override
	public void save(Iterable<User> playList) {
		userRepository.save(playList);
	}

}
