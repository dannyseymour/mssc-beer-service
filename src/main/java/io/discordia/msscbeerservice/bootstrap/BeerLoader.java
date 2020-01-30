package io.discordia.msscbeerservice.bootstrap;

import io.discordia.msscbeerservice.domain.Beer;
import io.discordia.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("PBR")
                    .beerStyle("Best")
                    .quantityToBrew(100)
                    .upc(3300L)
                    .price(new BigDecimal("12.95"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Santa fe pale ale")
                    .beerStyle("pale ale")
                    .quantityToBrew(10)
                    .upc(330657L)
                    .price(new BigDecimal("6.05"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Natty")
                    .beerStyle("Lager?")
                    .quantityToBrew(1000)
                    .upc(33005467575L)
                    .price(new BigDecimal("1.99"))
                    .build());
        }
        System.out.println("Loaded beers"+beerRepository.count());
    }
}