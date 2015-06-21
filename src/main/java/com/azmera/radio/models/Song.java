package com.azmera.radio.models;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Songs")
public class Song {

	@Id
	/*@GeneratedValue
	private long songId;*/
	private String url;
	private String title;
	private long lenth;
	private String genre;
	private String language;
	private String country;
	
	private String artist;
	private String album;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getLenth() {
		return lenth;
	}
	public void setLenth(long lenth) {
		this.lenth = lenth;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "Song [url=" + url + ", title=" + title + ", genre=" + genre
				+ ", artist=" + artist + ", album=" + album + "]";
	}
	
	
	
	
}
