package com.projetos.cardapizap.infrastructure.repository;

import com.projetos.cardapizap.domain.model.EnderecoEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoEntregaRepository extends JpaRepository<EnderecoEntrega, Long> {
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário
}
