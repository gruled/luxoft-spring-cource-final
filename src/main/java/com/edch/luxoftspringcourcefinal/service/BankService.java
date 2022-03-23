package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.BankDto;
import com.edch.luxoftspringcourcefinal.model.Bank;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BankService {
    Flux<Bank> findAll();

    void save(Bank bank);

    void save(BankDto bankDto);

    void delete(Integer id);

    Mono<Boolean> existsById(Integer id);

    Bank convert(BankDto bankDto);

    Mono<Bank> getById(Integer id);
}
