package br.com.fiap.localtech.localtech.repositories;

import java.util.List;
import java.util.Optional;

import br.com.fiap.localtech.localtech.entites.Veiculos;

public interface VeiculoRepository {
	
	Optional<Veiculos> findById(Long id);
	List<Veiculos> findAll(int size, int offset);
	Integer save(Veiculos veiculo);
	Integer update(Veiculos veiculo, Long id);
	Integer delete(Long id);
}
