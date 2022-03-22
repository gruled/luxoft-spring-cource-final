package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.CountryDto;
import com.edch.luxoftspringcourcefinal.model.Country;
import com.edch.luxoftspringcourcefinal.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void save(CountryDto countryDto) {
        save(convert(countryDto));
    }

    @Override
    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return countryRepository.existsById(id);
    }

    @Override
    public Country convert(CountryDto countryDto) {
        Country country = new Country();
        country.setName(countryDto.getName());
        country.setCodeName(countryDto.getCodeName());
        return country;
    }

    @Override
    public Country getById(Integer id) {
        return countryRepository.getById(id);
    }
}
