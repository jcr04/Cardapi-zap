package com.projetos.cardapizap.application.mapper;

import com.projetos.cardapizap.application.dtos.EnderecoEntregaDTO;
import com.projetos.cardapizap.domain.model.EnderecoEntrega;

public class EnderecoEntregaMapper {

    // Convert entity to DTO
    public static EnderecoEntregaDTO toDTO(EnderecoEntrega enderecoEntrega) {
        if (enderecoEntrega == null) {
            return null;
        }

        EnderecoEntregaDTO dto = new EnderecoEntregaDTO();
        dto.setId(enderecoEntrega.getId());
        dto.setRua(enderecoEntrega.getRua());
        dto.setNumero(enderecoEntrega.getNumero());
        dto.setComplemento(enderecoEntrega.getComplemento());
        dto.setBairro(enderecoEntrega.getBairro());
        dto.setCidade(enderecoEntrega.getCidade());
        dto.setEstado(enderecoEntrega.getEstado());

        return dto;
    }

    // Convert DTO to entity
    public static EnderecoEntrega toEntity(EnderecoEntregaDTO dto) {
        if (dto == null) {
            return null;
        }

        EnderecoEntrega enderecoEntrega = new EnderecoEntrega();
        enderecoEntrega.setId(dto.getId());
        enderecoEntrega.setRua(dto.getRua());
        enderecoEntrega.setNumero(dto.getNumero());
        enderecoEntrega.setComplemento(dto.getComplemento());
        enderecoEntrega.setBairro(dto.getBairro());
        enderecoEntrega.setCidade(dto.getCidade());
        enderecoEntrega.setEstado(dto.getEstado());

        return enderecoEntrega;
    }
}
