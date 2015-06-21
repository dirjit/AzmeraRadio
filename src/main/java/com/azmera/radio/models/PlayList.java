package com.azmera.radio.models;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class PlayList {
	
	@Id
	@GeneratedValue
	private long playListId;
	private String type;
	private String playListName;
	private List<Song> songs;
	public long getPlayListId() {
		return playListId;
	}
	public void setPlayListId(long playListId) {
		this.playListId = playListId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlayListName() {
		return playListName;
	}
	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "PlayList [type=" + type + ", playListName=" + playListName
				+ ", songs=" + songs + "]";
	} 
	
	
}
