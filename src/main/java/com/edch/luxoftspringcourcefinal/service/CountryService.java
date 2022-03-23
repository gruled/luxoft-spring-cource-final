package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.CountryDto;
import com.edch.luxoftspringcourcefinal.model.Country;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CountryService {
    Flux<Country> findAll();

    void save(Country country);

    void save(CountryDto countryDto);

    void delete(Integer id);

    Mono<Boolean> existsById(Integer id);

    Country convert(CountryDto countryDto);

    Mono<Country> getById(Integer id);
}
