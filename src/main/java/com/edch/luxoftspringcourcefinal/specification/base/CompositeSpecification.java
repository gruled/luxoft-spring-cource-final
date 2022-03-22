package com.edch.luxoftspringcourcefinal.specification.base;

public abstract class CompositeSpecification<T> implements Specification<T> {

    @Override
    public abstract boolean test(T object);

    @Override
    public Specification<T> and(Specification<T> other) {
        return new AndSpecification(this, other);
    }

    @Override
    public Specification<T> or(Specification<T> other) {
        return new OrSpecification<>(this, other);
    }
}
