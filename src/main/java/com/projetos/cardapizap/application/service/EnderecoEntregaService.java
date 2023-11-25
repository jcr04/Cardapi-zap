package com.projetos.cardapizap.application.service;

import com.projetos.cardapizap.application.dtos.EnderecoEntregaDTO;
import com.projetos.cardapizap.application.exception.enderecoentregas.EnderecoEntregaInvalidoException;
import com.projetos.cardapizap.application.exception.enderecoentregas.EnderecoEntregaNotFoundException;
import com.projetos.cardapizap.application.mapper.EnderecoEntregaMapper;
import com.projetos.cardapizap.domain.model.EnderecoEntrega;
import com.projetos.cardapizap.infrastructure.repository.EnderecoEntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoEntregaService {

    private final EnderecoEntregaRepository enderecoEntregaRepository;

    @Autowired
    public EnderecoEntregaService(EnderecoEntregaRepository enderecoEntregaRepository) {
        this.enderecoEntregaRepository = enderecoEntregaRepository;
    }

    public List<EnderecoEntregaDTO> findAll() {
        return enderecoEntregaRepository.findAll().stream()
                .map(EnderecoEntregaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public EnderecoEntregaDTO findById(Long id) {
        return enderecoEntregaRepository.findById(id)
                .map(EnderecoEntregaMapper::toDTO)
                .orElseThrow(() -> new EnderecoEntregaNotFoundException(id));
    }

    public EnderecoEntregaDTO create(EnderecoEntregaDTO enderecoEntregaDTO) {
        if (enderecoEntregaDTO.getRua() == null || enderecoEntregaDTO.getCidade() == null) {
            throw new EnderecoEntregaInvalidoException("Rua e cidade são obrigatórios.");
        }
        EnderecoEntrega enderecoEntrega = EnderecoEntregaMapper.toEntity(enderecoEntregaDTO);
        enderecoEntrega = enderecoEntregaRepository.save(enderecoEntrega);
        return EnderecoEntregaMapper.toDTO(enderecoEntrega);
    }

    public EnderecoEntregaDTO update(Long id, EnderecoEntregaDTO enderecoEntregaDTO) {
        EnderecoEntrega enderecoEntrega = EnderecoEntregaMapper.toEntity(enderecoEntregaDTO);
        enderecoEntrega.setId(id);
        enderecoEntrega = enderecoEntregaRepository.save(enderecoEntrega);
        return EnderecoEntregaMapper.toDTO(enderecoEntrega);
    }

    public void delete(Long id) {
        enderecoEntregaRepository.deleteById(id);
    }

    // Outros métodos de negócios conforme necessário
}
