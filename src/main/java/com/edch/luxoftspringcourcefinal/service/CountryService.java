package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.CountryDto;
import com.edch.luxoftspringcourcefinal.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();

    void save(Country country);

    void save(CountryDto countryDto);

    void delete(Integer id);

    boolean existsById(Integer id);

    Country convert(CountryDto countryDto);

    Country getById(Integer id);
}
