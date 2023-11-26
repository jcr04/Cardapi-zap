package com.projetos.cardapizap.application.mapper;

import com.projetos.cardapizap.application.dtos.ClienteDTO;
import com.projetos.cardapizap.domain.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setTelefone(cliente.getTelefone());

        return clienteDTO;
    }

    public static Cliente toEntity(ClienteDTO clienteDTO) {
        if (clienteDTO == null) {
            return null;
        }

        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        cliente.setTelefone(clienteDTO.getTelefone());

        // Tratamento para lista de pedidos nula
        if (clienteDTO.getPedidos() != null) {
            cliente.setPedidos(clienteDTO.getPedidos().stream().map(PedidoMapper::toEntity).collect(Collectors.toList()));
        } else {
            cliente.setPedidos(new ArrayList<>()); // Inicializa com uma lista vazia
        }

        return cliente;
    }

    // Métodos para listas
    public static List<ClienteDTO> toDTOList(List<Cliente> clientes) {
        return clientes.stream().map(ClienteMapper::toDTO).collect(Collectors.toList());
    }

    public static List<Cliente> toEntityList(List<ClienteDTO> clienteDTOs) {
        return clienteDTOs.stream().map(ClienteMapper::toEntity).collect(Collectors.toList());
    }
}
