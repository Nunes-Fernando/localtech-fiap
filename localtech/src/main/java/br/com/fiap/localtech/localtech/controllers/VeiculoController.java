package br.com.fiap.localtech.localtech.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.localtech.localtech.entites.Veiculos;
import br.com.fiap.localtech.localtech.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	
	private final VeiculoService service;
	
	public VeiculoController(VeiculoService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Veiculos>> findAllVeiculos(
	        @RequestParam("page") int page,
	        @RequestParam("size") int size) {

		var veiculos = this.service.findAllVeiculos(page, size);
	    
	    return ResponseEntity.ok(veiculos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Veiculos>> findVeiculo(@PathVariable("id") Long id) {
		var veiculo = this.service.findById(id);
		return ResponseEntity.ok(veiculo);
	}
	
}
