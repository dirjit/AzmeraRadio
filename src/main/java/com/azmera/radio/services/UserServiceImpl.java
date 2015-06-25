package com.azmera.radio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azmera.radio.models.Song;
import com.azmera.radio.models.User;
import com.azmera.radio.repositories.SongRepository;
import com.azmera.radio.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	SongRepository songRepository;

	@Override
	public User getUserByEmail(String email) {
		return userRepository.getUserByEmail(email);
	}

	@Override
	public User getUserByUserName(String userName) {
		return userRepository.getUserByUserName(userName);
	}

	@Override
	public User getUserByPhoneNumber(String phoneNumber) {
		return userRepository.getUserByPhoneNumber(phoneNumber);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}
	
	/*@Override
	public List<Song> getSongsFromPlayList(String playlistName, String playListType){
		List<Song> songs;	
		if(playListType == "Album") {
				songs = songRepository.getSongsByAlbum(playlistName);
			} else if(playListType == "Artist"){
				songs = songRepository.getSongsByArtist(playlistName);
			} else {
				songs = songRepository.getSongsByGenre(playlistName);
			}
		return songs;
	}*/

	@Override
	public List<Song> getSongsByArtist(String artistName) {
		return songRepository.getSongsByArtist(artistName);
	}

	@Override
	public List<Song> getSongsByAlbum(String albumName) {
		return songRepository.getSongsByAlbum(albumName);
	}

	@Override
	public List<Song> getSongsByGenre(String genre) {
		return songRepository.getSongsByGenre(genre);
	}

}
