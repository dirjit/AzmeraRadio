package com.azmera.radio.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.azmera.radio.models.Song;

public interface SongRepository extends CrudRepository<Song, String>{
	
	List<Song> getSongsByArtist(String artistName);
	
	List<Song> getSongsByAlbum(String albumName);
	
	List<Song> getSongsByGenre(String genre);
	
	<S extends Song> List<S> save(Iterable<S> song);
	
	List<Song> findAll();
}
