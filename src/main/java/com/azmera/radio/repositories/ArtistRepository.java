package com.azmera.radio.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.azmera.radio.models.Artist;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, String>{

}
