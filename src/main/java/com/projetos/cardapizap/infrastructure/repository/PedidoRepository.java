package com.projetos.cardapizap.infrastructure.repository;

import com.projetos.cardapizap.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

    List<Pedido> findByClienteNome(String nome);
}
