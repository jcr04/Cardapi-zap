package com.projetos.cardapizap.domain.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "metodos_pagamento")
public class MetodoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String descricao;

    @Column
    private Boolean precisaDeTroco;

    @Column
    private Double valorTroco;

    @ElementCollection
    @CollectionTable(name = "bandeiras_cartao", joinColumns = @JoinColumn(name = "metodo_pagamento_id"))
    @Column(name = "bandeira")
    private Set<String> bandeirasCartao;

    @Column
    private String tipoChavePix;

    @Column
    private String chavePix;

    // Construtor padrão exigido pelo JPA
    public MetodoPagamento() {
    }

    // Construtor com parâmetros
    public MetodoPagamento(String descricao, Boolean precisaDeTroco, Double valorTroco, Set<String> bandeirasCartao, String tipoChavePix, String chavePix) {
        this.descricao = descricao;
        this.precisaDeTroco = precisaDeTroco;
        this.valorTroco = valorTroco;
        this.bandeirasCartao = bandeirasCartao;
        this.tipoChavePix = tipoChavePix;
        this.chavePix = chavePix;
    }

    // ... aqui você pode adicionar qualquer lógica de negócios relacionada aos métodos de pagamento.
}
