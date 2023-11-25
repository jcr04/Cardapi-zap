package com.projetos.cardapizap.application.exception.metodopagamentos;

public class MetodoPagamentoNotFoundException extends RuntimeException {

    public MetodoPagamentoNotFoundException(Long id) {
        super("Método de pagamento não encontrado com ID: " + id);
    }
}
