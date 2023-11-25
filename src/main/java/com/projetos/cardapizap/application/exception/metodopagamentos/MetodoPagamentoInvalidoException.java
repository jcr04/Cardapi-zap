package com.projetos.cardapizap.application.exception.metodopagamentos;

public class MetodoPagamentoInvalidoException extends RuntimeException {

    public MetodoPagamentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
