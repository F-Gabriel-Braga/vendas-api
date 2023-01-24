package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.services.ClienteService;
import io.github.fgabrielbraga.vendas.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("clientes")
    public List<Cliente> findAll() {
        return this.clienteService.findAll();
    }

    @GetMapping("clientes/{id}")
    public Cliente findById(@PathVariable Long id) {
        return this.clienteService.findById(id);
    }

    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente) {
        return this.clienteService.save(cliente);
    }
}
