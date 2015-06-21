package com.azmera.radio.controllers;

import java.util.List;

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
	
	@RequestMapping(value="/addplayList", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody List<User> playList) {
		userService.save(playList);
	}
	
	@RequestMapping(value="/playlists/{playlist}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserPlayListByEmail(@RequestParam("email") String email){
		return userService.getUserPlayListByEmail(email);
	}
	
	/*@RequestMapping(value="/playlist", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserPlayList> getUserPlayListByUserName(@RequestParam("userName") String userName){
		return userService.getUserPlayListByUserName(userName);
	}
	
	@RequestMapping(value="/playlist", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserPlayList> getUserPlayListByPhoneNumber(@RequestParam("phoneNumber") String phoneNumber){
		return userService.getUserPlayListByPhoneNumber(phoneNumber);
	}
	@RequestMapping(value="/playlist", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Song> getUserPlayListByPlayListName(@RequestParam("playListName") String playlistName){
		return userService.getUserPlayListByPlayListName(playlistName);
	}*/
	
	

}
