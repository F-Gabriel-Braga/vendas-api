package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.services.ProdutoService;
import io.github.fgabrielbraga.vendas.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> findAll() {
        return this.produtoService.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Produto findById(@PathVariable Long id) {
        return this.produtoService.findById(id);
    }

    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto) {
        return this.produtoService.save(produto);
    }
}
