package io.discordia.msscbeerservice.service;



import io.discordia.msscbeerservice.domain.Beer;
import io.discordia.msscbeerservice.repository.BeerRepository;
import io.discordia.msscbeerservice.web.mappers.BeerMapper;
import io.discordia.msscbeerservice.web.model.BeerDto;
import io.discordia.msscbeerservice.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import java.util.UUID;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService{

	private final BeerMapper beerMapper;
	private final BeerRepository beerRepository;


	public void updateBeer(UUID beerId, BeerDto beerDto) {
		  Beer beer = beerRepository.findById(beerId).orElseThrow(
					NotFoundException::new);

			beer.setBeerName(beerDto.getBeerName());
			beer.setBeerStyle(beerDto.getBeerStyle());
			beer.setPrice(beerDto.getPrice());
			beer.setUpc(beerDto.getUpc());
	}

	public BeerDto saveNewBeer(BeerDto beerDto) {
	       return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
	}




	public BeerDto getBeerById(UUID beerId) {
		return beerMapper.beerToBeerDto(beerRepository.findById(beerId).orElseThrow(
				NotFoundException::new));
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
