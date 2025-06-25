package br.com.fiap.localtech.localtech.repositories;

import java.util.List;
import java.util.Optional;

import br.com.fiap.localtech.localtech.entites.Pessoa;

public interface PessoaRepository {
	
	Optional<Pessoa> findById(Long id);
	List<Pessoa> findAll(int size, int offset);
	Integer save(Pessoa pessoa);
	Integer update(Pessoa pessoa, Long id);
	Integer delete(Long id);
}
