package io.github.fgabrielbraga.vendas.controllers;

import io.github.fgabrielbraga.vendas.models.dto.VendaDTO;
import io.github.fgabrielbraga.vendas.services.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping("/vendas")
    public List<VendaDTO> findAll() {
        return this.vendaService.findAll();
    }

    @GetMapping("/vendas/{id}")
    public VendaDTO findById(@PathVariable Long id) {
        return this.vendaService.findById(id);
    }

    @PostMapping("/vendas")
    public VendaDTO save(@RequestBody @Valid VendaDTO dto) {
        return this.vendaService.save(dto);
    }
}
