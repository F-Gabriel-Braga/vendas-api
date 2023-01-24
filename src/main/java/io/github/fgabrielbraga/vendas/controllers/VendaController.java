package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.services.VendaService;
import io.github.fgabrielbraga.vendas.models.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping("/vendas")
    public List<Venda> findAll() {
        return this.vendaService.findAll();
    }

    @GetMapping("/vendas/{id}")
    public Venda findById(@PathVariable Long id) {
        return this.vendaService.findById(id);
    }

    @PostMapping("/vendas")
    public Venda save(@RequestBody Venda venda) {
        return this.vendaService.save(venda);
    }
}
