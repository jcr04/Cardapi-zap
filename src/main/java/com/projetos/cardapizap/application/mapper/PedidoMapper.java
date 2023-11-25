package com.projetos.cardapizap.application.mapper;

import com.projetos.cardapizap.application.dtos.PedidoDTO;
import com.projetos.cardapizap.domain.model.Pedido;

public class PedidoMapper {

    // Convert entity to DTO
    public static PedidoDTO toDTO(Pedido pedido) {
        if (pedido == null) {
            return null;
        }

        PedidoDTO dto = new PedidoDTO();
        dto.setId(pedido.getId());
        dto.setCliente(ClienteMapper.toDTO(pedido.getCliente()));
        dto.setEnderecoEntrega(EnderecoEntregaMapper.toDTO(pedido.getEnderecoEntrega()));
        dto.setMetodoPagamento(MetodoPagamentoMapper.toDTO(pedido.getMetodoPagamento()));
        dto.setProdutos(ProdutoMapper.toDTOList(pedido.getProdutos()));
        dto.setValorTotal(pedido.getValorTotal());

        return dto;
    }

    // Convert DTO to entity
    public static Pedido toEntity(PedidoDTO dto) {
        if (dto == null) {
            return null;
        }

        Pedido pedido = new Pedido();
        pedido.setId(dto.getId());
        pedido.setCliente(ClienteMapper.toEntity(dto.getCliente()));
        pedido.setEnderecoEntrega(EnderecoEntregaMapper.toEntity(dto.getEnderecoEntrega()));
        pedido.setMetodoPagamento(MetodoPagamentoMapper.toEntity(dto.getMetodoPagamento()));
        pedido.setProdutos(ProdutoMapper.toEntityList(dto.getProdutos()));
        pedido.setValorTotal(dto.getValorTotal());

        return pedido;
    }
}
