package com.projetos.cardapizap.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue
    private UUID id; // Agora o ID é um UUID

    @NotBlank(message = "O nome não pode estar vazio.")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "O telefone não pode estar vazio.")
    @Column(nullable = false, unique = true)
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    // Métodos de negócios específicos podem ser adicionados aqui
}
