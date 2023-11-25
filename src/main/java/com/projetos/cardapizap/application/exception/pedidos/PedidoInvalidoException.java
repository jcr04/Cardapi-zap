package com.projetos.cardapizap.application.exception.pedidos;

public class PedidoInvalidoException extends RuntimeException {

    public PedidoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
