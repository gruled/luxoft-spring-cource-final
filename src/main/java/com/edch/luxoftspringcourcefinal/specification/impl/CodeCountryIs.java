package com.edch.luxoftspringcourcefinal.specification.impl;

import com.edch.luxoftspringcourcefinal.model.Country;
import com.edch.luxoftspringcourcefinal.specification.base.CompositeSpecification;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class CodeCountryIs extends CompositeSpecification<Country> {
    private String codeName;

    @Override
    public boolean test(Country object) {
        return Objects.equals(codeName, object.getCodeName());
    }
}
