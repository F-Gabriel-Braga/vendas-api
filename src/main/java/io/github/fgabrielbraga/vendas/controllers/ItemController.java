package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.services.ItemService;
import io.github.fgabrielbraga.vendas.services.VendaService;
import io.github.fgabrielbraga.vendas.models.Item;
import io.github.fgabrielbraga.vendas.models.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private VendaService vendaService;

    @GetMapping("/itens/venda/{idVenda}")
    public List<Item> findByVenda(@PathVariable Long idVenda) {
        Venda venda = this.vendaService.findById(idVenda);
        return this.itemService.findByVenda(venda);
    }

    @PostMapping("/itens")
    public Item save(@RequestBody Item item) {
        return this.itemService.save(item);
    }
}
