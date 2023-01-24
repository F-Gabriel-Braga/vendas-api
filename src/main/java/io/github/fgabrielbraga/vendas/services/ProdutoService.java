package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Produto;
import io.github.fgabrielbraga.vendas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return this.produtoRepository.findAll();
    }

    public Produto findById(Long id) {
        Optional<Produto> produto = this.produtoRepository.findById(id);
        if (produto.isEmpty()) {
            throw new RuntimeException("O produto não foi encontrado!");
        } else {
            return produto.get();
        }
    }

    public Produto save(Produto produto) {
        produto = this.produtoRepository.save(produto);
        return produto;
    }
}
