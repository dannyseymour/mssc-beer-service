package io.discordia.msscbeerservice.service;

import io.discordia.msscbeerservice.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {


    void updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto getBeerById(UUID beerId);

    void deleteById(UUID beerId);
}
