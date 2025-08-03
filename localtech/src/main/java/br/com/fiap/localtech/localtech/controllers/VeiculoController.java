package br.com.fiap.localtech.localtech.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.localtech.localtech.entites.Veiculos;
import br.com.fiap.localtech.localtech.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private static final Logger log = LoggerFactory.getLogger(VeiculoController.class);

    private final VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Veiculos>> findAllVeiculos(@RequestParam("page") int page,
                                                         @RequestParam("size") int size) {
        var veiculos = this.service.findAllVeiculos(page, size);
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Veiculos>> findVeiculo(@PathVariable("id") Long id) {
        var veiculo = this.service.findById(id);
        return ResponseEntity.ok(veiculo);
    }

    @PostMapping
    public ResponseEntity<Void> saveVeiculo(@RequestBody Veiculos veiculo) {
        log.info("POST -> /veiculos");
        service.saveVeiculo(veiculo);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateVeiculo(@PathVariable("id") Long id, @RequestBody Veiculos veiculo) {
        log.info("PUT -> /veiculos/{}", id);
        this.service.updateVeiculo(veiculo, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable("id") Long id) {
        log.info("DELETE -> /veiculos/{}", id);
        this.service.delete(id);
        return ResponseEntity.ok().build();
    }
}

