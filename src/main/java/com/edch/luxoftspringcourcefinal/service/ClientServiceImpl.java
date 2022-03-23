package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.ClientDto;
import com.edch.luxoftspringcourcefinal.model.Client;
import com.edch.luxoftspringcourcefinal.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final BankService bankService;

    @Override
    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void save(ClientDto clientDto) {
        save(convert(clientDto));
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Mono<Boolean> existsById(Integer id) {
        return clientRepository.existsById(id);
    }

    @Override
    public Client convert(ClientDto clientDto) {
        Client client = new Client();
        client.setName(clientDto.getName());
        if (Boolean.TRUE.equals((bankService.existsById(clientDto.getBank())).block())) {
            client.setBank(bankService.getById(clientDto.getBank()).block());
        }
        return client;
    }
}
