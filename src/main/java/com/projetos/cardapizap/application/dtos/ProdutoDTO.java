package com.projetos.cardapizap.application.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoDTO {

    private Long id;
    private String nome;
    private BigDecimal preco;

    // Construtor padrão
    public ProdutoDTO() {
    }

    // Construtor com parâmetros
    public ProdutoDTO(Long id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos utilitários podem ser adicionados aqui, como conversões de/para a entidade Produto
}
