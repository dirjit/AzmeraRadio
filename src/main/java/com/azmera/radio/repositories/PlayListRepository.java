package com.azmera.radio.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.azmera.radio.models.PlayList;


public interface PlayListRepository extends MongoRepository<PlayList, Long>{

	//PlayList getUserPlayList(long playListId);
}
