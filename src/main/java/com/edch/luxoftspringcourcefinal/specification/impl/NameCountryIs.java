package com.edch.luxoftspringcourcefinal.specification.impl;

import com.edch.luxoftspringcourcefinal.specification.base.CompositeSpecification;
import lombok.AllArgsConstructor;
import com.edch.luxoftspringcourcefinal.model.Country;

import java.util.Objects;

@AllArgsConstructor
public class NameCountryIs extends CompositeSpecification<Country> {
    private String testName;

    @Override
    public boolean test(Country object) {
        return Objects.equals(testName, object.getName());
    }
}
