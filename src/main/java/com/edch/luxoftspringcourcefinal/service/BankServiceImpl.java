package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.BankDto;
import com.edch.luxoftspringcourcefinal.model.Bank;
import com.edch.luxoftspringcourcefinal.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;
    private final CountryService countryService;

    @Override
    public Flux<Bank> findAll() {
        return bankRepository.findAll();
    }

    @Override
    public void save(Bank bank) {
        bankRepository.save(bank);
    }

    @Override
    public void save(BankDto bankDto) {
        save(convert(bankDto));
    }

    @Override
    public void delete(Integer id) {
        bankRepository.deleteById(id);
    }

    @Override
    public Mono<Boolean> existsById(Integer id) {
        return bankRepository.existsById(id);
    }

    @Override
    public Bank convert(BankDto bankDto) {
        Bank bank = new Bank();
        bank.setName(bankDto.getName());
        if (Boolean.TRUE.equals((countryService.existsById(bankDto.getCountry())).block())) {
            bank.setCountry(countryService.getById(bankDto.getCountry()).block());
        }
        return bank;
    }

    @Override
    public Mono<Bank> getById(Integer id) {
        return bankRepository.findById(id);
    }
}
