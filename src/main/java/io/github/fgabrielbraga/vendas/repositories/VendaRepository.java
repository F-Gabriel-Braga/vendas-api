package io.github.fgabrielbraga.vendas.repositories;

import io.github.fgabrielbraga.vendas.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
