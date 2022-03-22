package com.edch.luxoftspringcourcefinal.controller;

import com.edch.luxoftspringcourcefinal.dto.CountryDto;
import com.edch.luxoftspringcourcefinal.model.Country;
import com.edch.luxoftspringcourcefinal.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/country")
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    @ResponseBody
    public List<Country> get() {
        return countryService.findAll();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam(name = "id") Integer id) {
        if (countryService.existsById(id)) {
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
