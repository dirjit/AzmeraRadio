package com.azmera.radio.models;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UsersPlayLists")
public class User {

	@Id
	@GeneratedValue
	private String userId;
	private String email;
	private String userName;
	private String phoneNumber;
	String[] favoriteArtists;
	String[] favoriteAlbums;
	String[] favoriteGenres;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	public String[] getFavoriteArtists() {
		return favoriteArtists;
	}
	public void setFavoriteArtists(String[] favoriteArtists) {
		this.favoriteArtists = favoriteArtists;
	}
	public String[] getFavoriteAlbums() {
		return favoriteAlbums;
	}
	public void setFavoriteAlbums(String[] favoriteAlbums) {
		this.favoriteAlbums = favoriteAlbums;
	}
	public String[] getFavoriteGenres() {
		return favoriteGenres;
	}
	public void setFavoriteGenres(String[] favoriteGenres) {
		this.favoriteGenres = favoriteGenres;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName
				+ ", phoneNumber=" + phoneNumber + ", favoriteArtists="
				+ favoriteArtists + ", favoriteAlbums=" + favoriteAlbums
				+ ", favoriteGenres=" + favoriteGenres + "]";
	}
	
		
}
