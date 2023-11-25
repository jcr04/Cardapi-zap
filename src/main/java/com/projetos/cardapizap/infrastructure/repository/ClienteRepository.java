package com.projetos.cardapizap.infrastructure.repository;

import com.projetos.cardapizap.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

    List<Cliente> findByNomeContaining(String nome);
}
