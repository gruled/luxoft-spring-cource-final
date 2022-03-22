package com.edch.luxoftspringcourcefinal.service;

import com.edch.luxoftspringcourcefinal.model.Bank;

import java.util.List;

public interface BankService {
    List<Bank> findAll();

    void save(Bank bank);
}
