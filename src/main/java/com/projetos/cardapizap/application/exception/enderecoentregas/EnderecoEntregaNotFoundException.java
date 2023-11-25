package com.projetos.cardapizap.application.exception.enderecoentregas;

public class EnderecoEntregaNotFoundException extends RuntimeException {

    public EnderecoEntregaNotFoundException(Long id) {
        super("Endereço de entrega não encontrado com ID: " + id);
    }
}
