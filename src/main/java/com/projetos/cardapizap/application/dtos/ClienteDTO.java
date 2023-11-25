package com.projetos.cardapizap.application.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class ClienteDTO {

    private UUID id;
    private String nome;
    private String telefone;

    // Construtores, se necessário
    public ClienteDTO() {
    }

    public ClienteDTO(UUID id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    private List<PedidoDTO> pedidos;
}
