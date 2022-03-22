package com.edch.luxoftspringcourcefinal.repository;

import com.edch.luxoftspringcourcefinal.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country getCountryByCodeName(String codeName);

    Country getCountryByName(String name);
}
