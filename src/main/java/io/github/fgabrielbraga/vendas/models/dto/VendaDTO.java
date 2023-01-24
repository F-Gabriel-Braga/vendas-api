package io.github.fgabrielbraga.vendas.models.dto;

import io.github.fgabrielbraga.vendas.models.Venda;
import jakarta.validation.constraints.NotBlank;

public class VendaDTO {

    private Long id;

    @NotBlank(message = "A data de registro da venda é obrigatória")
    private String dataRegistro;

    @NotBlank(message = "O código do cliente é obrigatório na venda")
    private Long idCliente;

    public VendaDTO() {
    }

    public VendaDTO(Venda venda) {
        this.id = venda.getId();
        this.dataRegistro = venda.getDataRegistro();
        this.idCliente = venda.getCliente().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
