package com.projetos.cardapizap.application.exception.pedidos;

import java.util.UUID;

public class PedidoNotFoundException extends RuntimeException {

    public PedidoNotFoundException(UUID id) {
        super("Pedido não encontrado com ID: " + id);
    }
}
