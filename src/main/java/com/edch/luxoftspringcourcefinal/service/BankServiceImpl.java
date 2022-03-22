package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.BankDto;
import com.edch.luxoftspringcourcefinal.model.Bank;
import com.edch.luxoftspringcourcefinal.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;
    private final CountryService countryService;

    @Override
    public List<Bank> findAll() {
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
    public boolean existsById(Integer id) {
        return bankRepository.existsById(id);
    }

    @Override
    public Bank convert(BankDto bankDto) {
        Bank bank = new Bank();
        bank.setName(bankDto.getName());
        if (countryService.existsById(bankDto.getCountry())) {
            bank.setCountry(countryService.getById(bankDto.getCountry()));
        }
        return bank;
    }

    @Override
    public Bank getById(Integer id) {
        return bankRepository.getById(id);
    }
}
