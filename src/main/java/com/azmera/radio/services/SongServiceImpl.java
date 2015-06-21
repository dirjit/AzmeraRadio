package com.azmera.radio.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azmera.radio.models.Song;
import com.azmera.radio.repositories.SongRepository;

@Service
public class SongServiceImpl implements SongService{
	
	
	@Autowired
	SongRepository songRepository;
	
	@Autowired
	SongMetadataParser parser;
	
	@Autowired
	DirectoryParser dirParser;

	@Override
	public void addSongs(String folder) {		 
	 	try {
			List<Song> songs = parser.parseMetadata(dirParser.walk(folder));
			for(Song song: songs) {
			songRepository.save(song);
			System.out.println(song);
			}
		} catch (IOException e) {
			System.out.println("Error when parsing");
		}
	 }

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
