package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Venda;
import io.github.fgabrielbraga.vendas.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> findAll() {
        return this.vendaRepository.findAll();
    }

    public Venda findById(Long id) {
        Optional<Venda> venda = this.vendaRepository.findById(id);
        if(venda.isEmpty()) {
            throw new RuntimeException("A venda não foi encontrada!");
        }
        else {
            return venda.get();
        }
    }

    public Venda save(Venda venda) {
        return this.vendaRepository.save(venda);
    }
}
