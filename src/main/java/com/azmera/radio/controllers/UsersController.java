package com.azmera.radio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.azmera.radio.models.User;
import com.azmera.radio.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	UserService userService;

	@RequestMapping(value ="/{user}/addplaylist", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody User user) {
		userService.save(user);
	}

	@RequestMapping(value ="/adduser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createUser(@RequestBody User user) {
		userService.save(user);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserPlayListByEmail(
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "phone", required = false) String phoneNumber) {
		User user;
		if (email == null) {
			user = userService.getUserByPhoneNumber(phoneNumber);
		} else {
			user = userService.getUserByEmail(email);
		}
		return user;
	}

/*	@RequestMapping(value = "/{user}/playlist/album/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getSongsByAlbum(
			@PathVariable("name") String albumName) {
		return userService.getSongsByAlbum(albumName);
	}

	@RequestMapping(value = "/{user}/playlist/artist/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getSongsByArtist(
			@PathVariable("name") String artistName) {
		return userService.getSongsByArtist(artistName);
	}

	@RequestMapping(value = "/{user}/playlist/genre/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getSongsByGenre(
			@PathVariable("name") String genre) {
		return userService.getSongsByGenre(genre);
	}*/

}
