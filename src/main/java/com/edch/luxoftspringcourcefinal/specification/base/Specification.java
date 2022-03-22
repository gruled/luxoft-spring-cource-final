package com.edch.luxoftspringcourcefinal.specification.base;

public interface Specification<T> {
    boolean test(T object);

    Specification<T> and(Specification<T> other);

    Specification<T> or(Specification<T> other);
}
