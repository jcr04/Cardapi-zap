package com.projetos.cardapizap.application.exception.produtos;

public class ProdutoInvalidoException extends RuntimeException {

    public ProdutoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
