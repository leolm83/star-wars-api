package com.leolmcoding.starwarsapi.domain.repositories;

import com.leolmcoding.starwarsapi.domain.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<Planet,Long> {
}
