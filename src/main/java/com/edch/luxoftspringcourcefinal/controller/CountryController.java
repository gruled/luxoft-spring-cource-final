package com.edch.luxoftspringcourcefinal.controller;

import com.edch.luxoftspringcourcefinal.dto.CountryDto;
import com.edch.luxoftspringcourcefinal.model.Country;
import com.edch.luxoftspringcourcefinal.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/service/country")
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    @ResponseBody
    public Flux<Country> get() {
        return countryService.findAll();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam(name = "id") Integer id) {
        if (Boolean.TRUE.equals((countryService.existsById(id)).block())) {
            countryService.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity create(@RequestBody CountryDto country) {
        countryService.save(country);
        return ResponseEntity.ok().build();
    }
}
