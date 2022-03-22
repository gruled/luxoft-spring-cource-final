package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();

    void save(Client client);
}
