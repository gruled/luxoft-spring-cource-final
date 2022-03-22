package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();

    void save(Country country);
}
