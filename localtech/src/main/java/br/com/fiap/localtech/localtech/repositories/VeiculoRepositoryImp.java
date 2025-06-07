package br.com.fiap.localtech.localtech.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import br.com.fiap.localtech.localtech.entites.Veiculos;

@Repository
public class VeiculoRepositoryImp implements VeiculoRepository{
	
	@Autowired
	private final JdbcClient jdbcClient = null;
	
	@Override
	public Optional<Veiculos> findById(Long id) {
		return jdbcClient.sql("Select * FROM veiculos WHERE id")
				.param("id", id)
				.query(Veiculos.class)
				.optional();
	}

	@Override
	public List<Veiculos> findAll(int size, int offset) {
		return jdbcClient.sql("Select * FROM veiculos LIMIT: size OFFSETE: offset")
				.param("size", size)
				.param("offset", offset)
				.query(Veiculos.class)
				.list();
	}

	@Override
	public Integer save(Veiculos veiculo) {
		
		return null;
	}

	@Override
	public Integer update(Veiculos veiculo, Long id) {
		
		return null;
	}

	@Override
	public Integer delete(Long id) {
		
		return null;
	}
	
	
	
}
