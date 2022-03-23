package com.edch.luxoftspringcourcefinal.repository;

import com.edch.luxoftspringcourcefinal.model.Bank;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends ReactiveMongoRepository<Bank, Integer> {
}
