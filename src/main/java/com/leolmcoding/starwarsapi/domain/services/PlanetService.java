package com.leolmcoding.starwarsapi.domain.services;

import com.leolmcoding.starwarsapi.domain.Planet;
import com.leolmcoding.starwarsapi.domain.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;
    @Autowired
    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet create(Planet planet){
    return  planetRepository.save(planet);
    }
}
