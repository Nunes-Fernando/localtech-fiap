package br.com.fiap.localtech.localtech.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import br.com.fiap.localtech.localtech.entites.Pessoa;
import br.com.fiap.localtech.localtech.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	private final PessoaRepository repository;
	
	public PessoaService(PessoaRepository repository) {
		this.repository = repository;
	}
	
	public List<Pessoa> findAllVeiculos(int page, int size){
		int offset = (page - 1) * size;
		return this.repository.findAll(size, offset);
	}
	
	public Optional<Pessoa> findById(Long id){
		return this.repository.findById(id);
	}
	
	public void saveVeiculo (Pessoa pessoa) {
		var save = this.repository.save(pessoa);
		Assert.state(save == 1, "Erro ao salvar veiculos" + pessoa.getNome());
	}
	
	public void updateVeiculo (Pessoa pessoa, Long id) {
		var update = this.repository.update(pessoa, id);
		
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
