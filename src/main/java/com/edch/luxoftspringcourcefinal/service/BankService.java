package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.dto.BankDto;
import com.edch.luxoftspringcourcefinal.model.Bank;

import java.util.List;

public interface BankService {
    List<Bank> findAll();

    void save(Bank bank);

    void save(BankDto bankDto);

    void delete(Integer id);

    boolean existsById(Integer id);

    Bank convert(BankDto bankDto);

    Bank getById(Integer id);
}
