package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Cliente;
import io.github.fgabrielbraga.vendas.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        Optional<Cliente> cliente = this.clienteRepository.findById(id);
        if(cliente.isEmpty()) {
            throw new RuntimeException("O cliente não foi encontrado!");
        }
        else {
            return cliente.get();
        }
    }

    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
}
