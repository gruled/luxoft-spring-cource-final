package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.ClientDto;
import com.edch.luxoftspringcourcefinal.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();

    void save(Client client);

    void save(ClientDto clientDto);

    void delete(Integer id);

    boolean existsById(Integer id);

    Client convert(ClientDto clientDto);
}
