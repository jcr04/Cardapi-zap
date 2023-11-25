package com.projetos.cardapizap.application.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoEntregaDTO {

    private Long id;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    // Construtor padrão
    public EnderecoEntregaDTO() {
    }

    // Construtor com parâmetros
    public EnderecoEntregaDTO(Long id, String rua, String numero, String complemento, String bairro, String cidade, String estado) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Métodos utilitários podem ser adicionados aqui, como conversões de/para a entidade EnderecoEntrega
}
