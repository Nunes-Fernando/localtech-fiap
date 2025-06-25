package br.com.fiap.localtech.localtech.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.localtech.localtech.entites.Pessoa;
import br.com.fiap.localtech.localtech.entites.Veiculos;
import br.com.fiap.localtech.localtech.service.PessoaService;
import br.com.fiap.localtech.localtech.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class PessoaController {

	private static final Logger log = LoggerFactory.getLogger(PessoaController.class);

	private final PessoaService service;

	public PessoaController(PessoaService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Pessoa>> findAllVeiculos(@RequestParam("page") int page,
			@RequestParam("size") int size) {

		var pessoa = this.service.findAllVeiculos(page, size);
		return ResponseEntity.ok(pessoa);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Pessoa>> findPessoa(@PathVariable("id") Long id) {
		var pessoa = this.service.findById(id);
		return ResponseEntity.ok(pessoa);
	}

	@PostMapping
	public ResponseEntity<Void> savePessoa(@RequestBody Pessoa pessoa) {
		log.info("POST -> /veiculos");
		service.saveVeiculo(pessoa);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> updatePessoa(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) {

		log.info("PUT -> /veiculos/{}", id);
		this.service.updateVeiculo(pessoa, id);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePessoa(@PathVariable("id") Long id) {
	    
	    log.info("DELETE -> /veiculos/{}", id);
	    this.service.delete(id);
	    return ResponseEntity.ok().build();
	    
	}
}