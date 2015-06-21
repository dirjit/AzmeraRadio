package com.azmera.radio.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.azmera.radio.models.Song;
import com.azmera.radio.services.DirectoryParser;
import com.azmera.radio.services.SongMetadataParser;
import com.azmera.radio.services.SongService;

@RestController
@RequestMapping("/api")
public class SongsController {
	
	private List<Song> songs;

	@Autowired
	SongService songService;

	/*
	 * @Autowired SongParser songParser;
	 */
	@RequestMapping(value = "/test", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String test() {
		return "The web service is working";
	}

	
	 @RequestMapping(value="/parseSongs/{folder}", method=RequestMethod.POST) 
	 public void parseSongs(@PathVariable String folder) {
	 songService.addSongs(folder); 
	 }
	

	@RequestMapping(value = "/artists/{artistName}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getSongsByArtist(@PathVariable("artistName") String artistName) {
		songs = songService.getSongsByArtist(artistName);
		return songs;
	}

	@RequestMapping(value = "/albums/{albumName}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getSongsByAlbum(@PathVariable("albumName") String albumName) {
		songs = songService.getSongsByAlbum(albumName);
		return songs;
	}

	@RequestMapping(value = "/genres/{genre}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getSongsByGenre(@PathVariable("genre") String genre) {
		songs = songService.getSongsByGenre(genre);
		return songs;
	}

}
