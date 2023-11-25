package com.projetos.cardapizap.application.mapper;

import com.projetos.cardapizap.application.dtos.MetodoPagamentoDTO;
import com.projetos.cardapizap.domain.model.MetodoPagamento;

public class MetodoPagamentoMapper {

    // Convert entity to DTO
    public static MetodoPagamentoDTO toDTO(MetodoPagamento metodoPagamento) {
        if (metodoPagamento == null) {
            return null;
        }

        MetodoPagamentoDTO dto = new MetodoPagamentoDTO();
        dto.setId(metodoPagamento.getId());
        dto.setDescricao(metodoPagamento.getDescricao());
        dto.setPrecisaDeTroco(metodoPagamento.getPrecisaDeTroco());
        dto.setValorTroco(metodoPagamento.getValorTroco());
        dto.setBandeirasCartao(metodoPagamento.getBandeirasCartao());
        dto.setTipoChavePix(metodoPagamento.getTipoChavePix());
        dto.setChavePix(metodoPagamento.getChavePix());

        return dto;
    }

    // Convert DTO to entity
    public static MetodoPagamento toEntity(MetodoPagamentoDTO dto) {
        if (dto == null) {
            return null;
        }

        MetodoPagamento metodoPagamento = new MetodoPagamento();
        metodoPagamento.setId(dto.getId());
        metodoPagamento.setDescricao(dto.getDescricao());
        metodoPagamento.setPrecisaDeTroco(dto.getPrecisaDeTroco());
        metodoPagamento.setValorTroco(dto.getValorTroco());
        metodoPagamento.setBandeirasCartao(dto.getBandeirasCartao());
        metodoPagamento.setTipoChavePix(dto.getTipoChavePix());
        metodoPagamento.setChavePix(dto.getChavePix());

        return metodoPagamento;
    }
}
