package com.projetos.cardapizap.infrastructure.repository;

import com.projetos.cardapizap.domain.model.MetodoPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagamentoRepository extends JpaRepository<MetodoPagamento, Long> {
    // Métodos de consulta personalizados podem ser adicionados aqui, se necessário
}
