package com.edch.luxoftspringcourcefinal.specification.base;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndSpecification<T> extends CompositeSpecification<T> {
    private Specification left;
    private Specification right;

    @Override
    public boolean test(T object) {
        return left.test(object) && right.test(object);
    }
}
