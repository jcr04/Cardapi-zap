package com.projetos.cardapizap.application.service;

import com.projetos.cardapizap.application.dtos.PedidoDTO;
import com.projetos.cardapizap.application.exception.pedidos.PedidoInvalidoException;
import com.projetos.cardapizap.application.exception.pedidos.PedidoNotFoundException;
import com.projetos.cardapizap.application.mapper.PedidoMapper;
import com.projetos.cardapizap.domain.model.Pedido;
import com.projetos.cardapizap.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoDTO> findAll() {
        return pedidoRepository.findAll().stream()
                .map(PedidoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PedidoDTO findById(UUID id) {
        return pedidoRepository.findById(id)
                .map(PedidoMapper::toDTO)
                .orElseThrow(() -> new PedidoNotFoundException(id));
    }

    public PedidoDTO create(PedidoDTO pedidoDTO) {
        if (pedidoDTO.getCliente() == null || pedidoDTO.getProdutos().isEmpty()) {
            throw new PedidoInvalidoException("Dados do cliente e produtos são obrigatórios.");
        }
        Pedido pedido = PedidoMapper.toEntity(pedidoDTO);
        pedido = pedidoRepository.save(pedido);
        return PedidoMapper.toDTO(pedido);
    }

    public PedidoDTO update(UUID id, PedidoDTO pedidoDTO) {
        Pedido pedido = PedidoMapper.toEntity(pedidoDTO);
        pedido.setId(id); // Garantir que o pedido atualizado tem o ID correto
        pedido = pedidoRepository.save(pedido);
        return PedidoMapper.toDTO(pedido);
    }

    public void delete(UUID id) {
        pedidoRepository.deleteById(id);
    }

    // Outros métodos de negócios conforme necessário
}
