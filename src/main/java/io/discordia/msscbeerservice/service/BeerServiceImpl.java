package io.discordia.msscbeerservice.service;

import io.discordia.msscbeerservice.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

	public void updateBeer(UUID beerId, BeerDto beerDto) {
		  log.debug("updating");
		
	}

	public BeerDto saveNewBeer(BeerDto beerDto) {
	       return BeerDto.builder()
	               .id(UUID.randomUUID())
	               .build();
	}

	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		
	}

/*
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("PBR")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("updating");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");

    }*/


}
