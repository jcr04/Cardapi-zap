package com.projetos.cardapizap.application.exception.produtos;

public class ProdutoNotFoundException extends RuntimeException {

    public ProdutoNotFoundException(Long id) {
        super("Produto não encontrado com ID: " + id);
    }
}
