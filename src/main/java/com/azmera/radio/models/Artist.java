package com.azmera.radio.models;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Artist")
public class Artist {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String stageName;
	private String sex;
	private String profile;
	
	/*private Set<Album> albums;
	private Set<Song> singles;*/
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStageName() {
		return stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
/*	public Set<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}
	public Set<Song> getSingles() {
		return singles;
	}
	public void setSingles(Set<Song> singles) {
		this.singles = singles;
	}*/
	@Override
	public String toString() {
		return "Artist [name=" + name + ", stageName=" + stageName + ", sex="
				+ sex + "]";
	}
	
	
}
