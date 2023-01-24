package io.github.fgabrielbraga.vendas.services;

import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.Venda;
import io.github.fgabrielbraga.vendas.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item save(Item item) {
        return this.itemRepository.save(item);
    }

    public List<Item> findByVenda(Venda venda) {
        return this.itemRepository.findByVenda(venda);
    }
}
