package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.ClientDto;
import com.edch.luxoftspringcourcefinal.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Flux<Client> findAll();

    void save(Client client);

    void save(ClientDto clientDto);

    void delete(Integer id);

    Mono<Boolean> existsById(Integer id);

    Client convert(ClientDto clientDto);
}
