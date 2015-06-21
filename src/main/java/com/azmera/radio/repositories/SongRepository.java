package com.azmera.radio.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.azmera.radio.models.Song;

public interface SongRepository extends CrudRepository<Song, String>{
	
	@Query("{artist:?0}")
	List<Song> getSongsByArtist(String artistName);
	
	@Query("{album:?0}")
	List<Song> getSongsByAlbum(String albumName);
	
	List<Song> getSongsByGenre(String genre);
	
	<S extends Song> List<S> save(Iterable<S> song);

}
