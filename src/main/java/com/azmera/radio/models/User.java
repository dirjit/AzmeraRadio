package com.azmera.radio.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UsersPlayLists")
public class User {

	@Id
	private Long userId;
	private String email;
	private String userName;
	private String phoneNumber;
	private List<PlayList> playLists;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<PlayList> getPlayLists() {
		return playLists;
	}
	public void setPlayLists(List<PlayList> playLists) {
		this.playLists = playLists;
	}
	@Override
	public String toString() {
		return "UserPlayList [email=" + email + ", userName=" + userName
				+ ", phoneNumber=" + phoneNumber + ", playLists=" + playLists
				+ "]";
	} 
	
	
}
