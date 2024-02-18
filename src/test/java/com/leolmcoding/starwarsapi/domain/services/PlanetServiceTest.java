package com.leolmcoding.starwarsapi.domain.services;

import com.leolmcoding.starwarsapi.domain.Planet;
import com.leolmcoding.starwarsapi.domain.repositories.PlanetRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static com.leolmcoding.starwarsapi.commons.PlanetConstants.PLANET;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = PlanetService.class)
@Slf4j
public class PlanetServiceTest {
    @Autowired
    private PlanetService planetService;

    @MockBean
    private PlanetRepository planetRepository;

    // operacao_estado_retorno
    // metodo_input_saida
    @Test
    public void createPlanet_WithValidData_ReturnsCreatedPlanet(){
        PLANET.setId(123L);
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        Planet planet = planetService.create(PLANET);
        log.info("PLANET {} ",PLANET);
        log.info("planet {}",planet);
        Assertions.assertThat(planet).isEqualTo(PLANET);
    }
}
