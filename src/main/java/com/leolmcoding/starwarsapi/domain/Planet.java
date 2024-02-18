package com.leolmcoding.starwarsapi.domain;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.EqualsBuilder;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String climate;
    private String terrarian;

    public Planet(String name, String climate, String terrarian) {
        this.name = name;
        this.climate = climate;
        this.terrarian = terrarian;
    }

    public Planet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrarian() {
        return terrarian;
    }

    public void setTerrarian(String terrarian) {
        this.terrarian = terrarian;
    }

    @Override
    public boolean equals(Object object){
        return EqualsBuilder.reflectionEquals(object,this);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", climate='" + climate + '\'' +
                ", terrarian='" + terrarian + '\'' +
                '}';
    }
}
