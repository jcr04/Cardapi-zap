package com.projetos.cardapizap.application.service;

import com.projetos.cardapizap.application.dtos.MetodoPagamentoDTO;
import com.projetos.cardapizap.application.exception.metodopagamentos.MetodoPagamentoInvalidoException;
import com.projetos.cardapizap.application.exception.metodopagamentos.MetodoPagamentoNotFoundException;
import com.projetos.cardapizap.application.mapper.MetodoPagamentoMapper;
import com.projetos.cardapizap.domain.model.MetodoPagamento;
import com.projetos.cardapizap.infrastructure.repository.MetodoPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MetodoPagamentoService {

    private final MetodoPagamentoRepository metodoPagamentoRepository;

    @Autowired
    public MetodoPagamentoService(MetodoPagamentoRepository metodoPagamentoRepository) {
        this.metodoPagamentoRepository = metodoPagamentoRepository;
    }

    public List<MetodoPagamentoDTO> findAll() {
        return metodoPagamentoRepository.findAll().stream()
                .map(MetodoPagamentoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MetodoPagamentoDTO findById(Long id) {
        return metodoPagamentoRepository.findById(id)
                .map(MetodoPagamentoMapper::toDTO)
                .orElseThrow(() -> new MetodoPagamentoNotFoundException(id));
    }

    public MetodoPagamentoDTO create(MetodoPagamentoDTO metodoPagamentoDTO) {
        if (metodoPagamentoDTO.getDescricao() == null) {
            throw new MetodoPagamentoInvalidoException("Descrição é obrigatória.");
        }
        MetodoPagamento metodoPagamento = MetodoPagamentoMapper.toEntity(metodoPagamentoDTO);
        metodoPagamento = metodoPagamentoRepository.save(metodoPagamento);
        return MetodoPagamentoMapper.toDTO(metodoPagamento);
    }

    public MetodoPagamentoDTO update(Long id, MetodoPagamentoDTO metodoPagamentoDTO) {
        MetodoPagamento metodoPagamento = MetodoPagamentoMapper.toEntity(metodoPagamentoDTO);
        metodoPagamento.setId(id);
        metodoPagamento = metodoPagamentoRepository.save(metodoPagamento);
        return MetodoPagamentoMapper.toDTO(metodoPagamento);
    }

    public void delete(Long id) {
        metodoPagamentoRepository.deleteById(id);
    }

    // Outros métodos de negócios conforme necessário
}
