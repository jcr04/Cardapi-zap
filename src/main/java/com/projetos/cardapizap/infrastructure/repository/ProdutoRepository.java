package com.projetos.cardapizap.infrastructure.repository;

import com.projetos.cardapizap.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário
}
