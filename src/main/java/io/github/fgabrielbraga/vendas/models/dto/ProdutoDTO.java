package io.github.fgabrielbraga.vendas.models.dto;

import io.github.fgabrielbraga.vendas.models.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoDTO {

    private Long id;

    @NotBlank(message = "O código do produto é obrigatório")
    private String codigo;

    @NotBlank(message = "A descrição do produto é obrigatória")
    private String descricao;

    @NotNull(message = "O preço do produto é obrigatório")
    private Float preco;

    @NotBlank(message = "A unidade de medida do produto é obrigatória")
    private String unidadeMedida;

    @NotBlank(message = "O grupo do produto é obrigatório")
    private String grupo;

    private String urlFoto;

    public ProdutoDTO() {
    }

    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.codigo = produto.getCodigo();
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
        this.unidadeMedida = produto.getUnidadeMedida();
        this.grupo = produto.getGrupo();
        this.urlFoto = produto.getUrlFoto();
    }

    public static Produto convert(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setId(produtoDTO.getId());
        produto.setCodigo(produtoDTO.getCodigo());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setPreco(produtoDTO.getPreco());
        produto.setUnidadeMedida(produtoDTO.getUnidadeMedida());
        produto.setUrlFoto(produtoDTO.getUrlFoto());
        return produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
