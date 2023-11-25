package com.projetos.cardapizap.application.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class MetodoPagamentoDTO {

    private Long id;
    private String descricao;
    private Boolean precisaDeTroco;
    private Double valorTroco;
    private Set<String> bandeirasCartao;
    private String tipoChavePix;
    private String chavePix;

    // Construtor padrão
    public MetodoPagamentoDTO() {
    }

    // Construtor com parâmetros
    public MetodoPagamentoDTO(Long id, String descricao, Boolean precisaDeTroco, Double valorTroco, Set<String> bandeirasCartao, String tipoChavePix, String chavePix) {
        this.id = id;
        this.descricao = descricao;
        this.precisaDeTroco = precisaDeTroco;
        this.valorTroco = valorTroco;
        this.bandeirasCartao = bandeirasCartao;
        this.tipoChavePix = tipoChavePix;
        this.chavePix = chavePix;
    }

    // Métodos utilitários, como conversões de/para a entidade MetodoPagamento, podem ser adicionados aqui
}
