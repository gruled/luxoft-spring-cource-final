package com.edch.luxoftspringcourcefinal.repository;

import com.edch.luxoftspringcourcefinal.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, Integer> {
}
