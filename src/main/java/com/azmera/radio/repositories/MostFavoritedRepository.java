package com.azmera.radio.repositories;

import java.util.List;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.azmera.radio.models.User;


public interface MostFavoritedRepository extends MongoRepository<User, Long>{


	/*@Query(value="{\"$group\": {_id: \"$favoriteAlbums\", count: { \"$sum\": 1}}},{\"$sort\": {count: -1}}{\"$limit\": 2}")
	List<String> getTop10Albums();
	
	@Query(value="{\"$group\": {_id: \"$favoriteArtists\", count: { \"$sum\": 1}}},{\"$sort\": {count: -1}}{\"$limit\": 2}")
	List<String> getTop10Artists();*/
}
