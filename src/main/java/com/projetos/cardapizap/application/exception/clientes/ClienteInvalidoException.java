package com.projetos.cardapizap.application.exception.clientes;

public class ClienteInvalidoException extends RuntimeException {

    public ClienteInvalidoException(String mensagem) {
        super(mensagem);
    }
}
