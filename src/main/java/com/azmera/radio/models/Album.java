package com.azmera.radio.models;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Albums")
public class Album {
	
	@Id 
	@GeneratedValue
	private long id;
	private String title;
	private String year;
	private String publisher;
	//private Image coverArt;
	
	/*private Artist artist;
	private Set<Song> list;*/
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
/*	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Set<Song> getList() {
		return list;
	}
	public void setList(Set<Song> list) {
		this.list = list;
	}*/
	@Override
	public String toString() {
		return "Album [title=" + title + ", year=" + year + "]";
	}
	
	
}
