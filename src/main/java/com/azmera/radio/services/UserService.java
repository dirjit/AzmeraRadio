package com.azmera.radio.services;

import java.util.List;

import com.azmera.radio.models.Song;
import com.azmera.radio.models.User;

public interface UserService {
	
	User getUserByEmail(String email);
	
	User getUserByUserName(String userName);
	
	User getUserByPhoneNumber(String phoneNumber);
	
	List<Song> getSongsByArtist(String artistName);
	
	List<Song> getSongsByAlbum(String albumName);
	
	List<Song> getSongsByGenre(String genre);
	
	void save(User playList);

	//List<Song> getSongsFromPlayList(String playlistName, String playListType);

}
