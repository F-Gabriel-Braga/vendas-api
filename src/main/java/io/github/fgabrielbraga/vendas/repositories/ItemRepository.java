package io.github.fgabrielbraga.vendas.repositories;

import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    public List<Item> findByVenda(Venda venda);
}
