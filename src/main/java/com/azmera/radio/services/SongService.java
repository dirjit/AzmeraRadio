package com.azmera.radio.services;

import java.util.List;

import com.azmera.radio.models.Song;

public interface SongService {

	public void addSongs(String folder);
	
	public List<Song> getSongsByArtist(String artistName);
	
	public List<Song> getSongsByAlbum(String albumName);
	
	public List<Song> getSongsByGenre(String genre);
	
}
