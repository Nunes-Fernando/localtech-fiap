package br.com.fiap.localtech.localtech.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.fiap.localtech.localtech.entites.Pessoa;

@Repository
public class PessoaRepositoryImp implements PessoaRepository {

   
    private final List<Pessoa> bancoFake = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public Optional<Pessoa> findById(Long id) {
        return bancoFake.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public List<Pessoa> findAll(int size, int offset) {
        int end = Math.min(offset + size, bancoFake.size());
        if (offset >= bancoFake.size()) return List.of();
        return bancoFake.subList(offset, end);
    }

    @Override
    public Integer save(Pessoa pessoa) {
        pessoa.setId(nextId++);
        bancoFake.add(pessoa);
        return 1;
    }

    @Override
    public Integer update(Pessoa pessoa, Long id) {
        Optional<Pessoa> existente = findById(id);
        if (existente.isPresent()) {
            bancoFake.remove(existente.get());
            pessoa.setId(id);
            bancoFake.add(pessoa);
            return 1;
        }
        return 0;
    }

    @Override
    public Integer delete(Long id) {
        Optional<Pessoa> existente = findById(id);
        if (existente.isPresent()) {
            bancoFake.remove(existente.get());
            return 1;
        }
        return 0;
    }
}
