package br.com.fiap.localtech.localtech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import br.com.fiap.localtech.localtech.entites.Veiculos;
import br.com.fiap.localtech.localtech.repositories.VeiculoRepository;

@Service
public class VeiculoService {
	
	private final VeiculoRepository repository;
	
	public VeiculoService(VeiculoRepository repository) {
		this.repository = repository;
	}
	
	public List<Veiculos> findAllVeiculos(int page, int size){
		int offset = (page - 1) * size;
		return this.repository.findAll(size, offset);
	}
	
	public Optional<Veiculos> findById(Long id){
		return this.repository.findById(id);
	}
	
	public void saveVeiculo (Veiculos veiculo) {
		var save = this.repository.save(veiculo);
		Assert.state(save == 1, "Erro ao salvar veiculos" + veiculo.getModelo());
	}
	
	public void updateVeiculo (Veiculos veiculo, Long id) {
		var update = this.repository.update(veiculo, id);
		
		if(update == 0) {
			throw new RuntimeException("Veiculo não encontrado");
		}
	}
	
	public void delete (Long id) {
		var delete = this.repository.delete(id);
		
		if(delete == 0) {
			throw new RuntimeException("Veiculo não encontrado");
		}
		
	}
}
