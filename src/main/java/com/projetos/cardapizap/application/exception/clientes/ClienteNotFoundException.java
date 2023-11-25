package com.projetos.cardapizap.application.exception.clientes;

import java.util.UUID;

public class ClienteNotFoundException extends RuntimeException {

    public ClienteNotFoundException(UUID id) {
        super("Cliente não encontrado com ID: " + id);
    }
}
