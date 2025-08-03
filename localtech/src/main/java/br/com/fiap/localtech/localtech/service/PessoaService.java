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

    public List<Pessoa> findAllVeiculos(int page, int size) {
        int offset = (page - 1) * size;
        return repository.findAll(size, offset);
    }

    public Optional<Pessoa> findById(Long id) {
        return repository.findById(id);
    }

    public void saveVeiculo(Pessoa pessoa) {
        int resultado = repository.save(pessoa);
        Assert.state(resultado == 1, "Erro ao salvar veículo: " + pessoa.getNome());
    }

    public void updateVeiculo(Pessoa pessoa, Long id) {
        int resultado = repository.update(pessoa, id);
        if (resultado == 0) {
            throw new RuntimeException("Veículo não encontrado para atualização");
        }
    }

    public void delete(Long id) {
        int resultado = repository.delete(id);
        if (resultado == 0) {
            throw new RuntimeException("Veículo não encontrado para exclusão");
        }
    }
}
