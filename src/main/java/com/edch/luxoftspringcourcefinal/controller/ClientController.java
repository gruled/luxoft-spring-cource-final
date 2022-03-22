package com.edch.luxoftspringcourcefinal.controller;

import com.edch.luxoftspringcourcefinal.dto.ClientDto;
import com.edch.luxoftspringcourcefinal.model.Client;
import com.edch.luxoftspringcourcefinal.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    @ResponseBody
    public List<Client> get() {
        return clientService.findAll();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam(name = "id") Integer id) {
        if (clientService.existsById(id)) {
            clientService.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity create(@RequestBody ClientDto clientDto) {
        clientService.save(clientDto);
        return ResponseEntity.ok().build();
    }
}
