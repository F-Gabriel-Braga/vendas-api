package io.github.fgabrielbraga.vendas.models.dto;

import io.github.fgabrielbraga.vendas.models.Item;
import jakarta.validation.constraints.NotNull;

public class ItemDTO {

    private Long id;

    private Float valorParcial;

    @NotNull(message = "A quantidade do item é obrigatória")
    private Integer quantidade;

    @NotNull(message = "O código da venda é obrigatório no item")
    private Long idVenda;

    @NotNull(message = "O código da venda é obrigatório no item")
    private Long idProduto;

    public ItemDTO() {
    }

    public ItemDTO(Item item) {
        this.id = item.getId();
        this.valorParcial = item.getValorParcial();
        this.quantidade = item.getQuantidade();
        this.idVenda = item.getVenda().getId();
        this.idProduto = item.getProduto().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(Float valorParcial) {
        this.valorParcial = valorParcial;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }
}
