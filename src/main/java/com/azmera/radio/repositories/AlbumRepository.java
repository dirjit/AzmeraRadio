package com.azmera.radio.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.azmera.radio.models.Album;


public interface AlbumRepository extends MongoRepository<Album, Long>{

	//@Query(value="{$limit: 10, $group:{ count: {$sum: 1}:}", fields= "{id, albumName}")
	//List<Album> getTop10Albums();
	
}
