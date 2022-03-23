package com.edch.luxoftspringcourcefinal.repository;

import com.edch.luxoftspringcourcefinal.model.Country;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CountryRepository extends ReactiveMongoRepository<Country, Integer> {

    Mono<Country> getCountryByCodeName(String codeName);

    Mono<Country> getCountryByName(String name);
}
