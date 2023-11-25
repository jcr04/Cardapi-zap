package com.projetos.cardapizap.application.service;

import com.projetos.cardapizap.application.dtos.ClienteDTO;
import com.projetos.cardapizap.application.exception.clientes.ClienteInvalidoException;
import com.projetos.cardapizap.application.exception.clientes.ClienteNotFoundException;
import com.projetos.cardapizap.application.mapper.ClienteMapper;
import com.projetos.cardapizap.domain.model.Cliente;
import com.projetos.cardapizap.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> findAll() {
        return clienteRepository.findAll().stream()
                .map(ClienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO findById(UUID id) {
        return clienteRepository.findById(id)
                .map(ClienteMapper::toDTO)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }

    public ClienteDTO create(ClienteDTO clienteDTO) {
        Cliente cliente = ClienteMapper.toEntity(clienteDTO);
        cliente = clienteRepository.save(cliente);
        return ClienteMapper.toDTO(cliente);
    }

    public ClienteDTO update(UUID id, ClienteDTO clienteDTO) {
        if (clienteDTO.getNome() == null || clienteDTO.getTelefone() == null) {
            throw new ClienteInvalidoException("Nome e telefone são obrigatórios.");
        }
        Cliente cliente = ClienteMapper.toEntity(clienteDTO);
        cliente.setId(id);
        cliente = clienteRepository.save(cliente);
        return ClienteMapper.toDTO(cliente);
    }

    public void delete(UUID id) {
        clienteRepository.deleteById(id);
    }

    // Aqui, você pode adicionar mais métodos de negócios conforme necessário
}
