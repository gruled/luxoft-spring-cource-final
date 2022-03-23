package com.edch.luxoftspringcourcefinal.controller;

import com.edch.luxoftspringcourcefinal.dto.BankDto;
import com.edch.luxoftspringcourcefinal.model.Bank;
import com.edch.luxoftspringcourcefinal.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/service/bank")
@AllArgsConstructor
public class BankController {
    private final BankService bankService;

    @GetMapping
    @ResponseBody
    public Flux<Bank> get() {
        return bankService.findAll();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam(name = "id") Integer id) {
        if (Boolean.TRUE.equals((bankService.existsById(id)).block())) {
            bankService.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity create(@RequestBody BankDto bankDto) {
        bankService.save(bankDto);
        return ResponseEntity.ok().build();
    }
}
