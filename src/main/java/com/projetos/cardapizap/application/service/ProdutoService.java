package com.projetos.cardapizap.application.service;

import com.projetos.cardapizap.application.dtos.ProdutoDTO;
import com.projetos.cardapizap.application.exception.produtos.ProdutoInvalidoException;
import com.projetos.cardapizap.application.exception.produtos.ProdutoNotFoundException;
import com.projetos.cardapizap.application.mapper.ProdutoMapper;
import com.projetos.cardapizap.domain.model.Produto;
import com.projetos.cardapizap.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    public List<ProdutoDTO> findAll() {
        return produtoRepository.findAll().stream()
                .map(ProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProdutoDTO findById(Long id) {
        return produtoRepository.findById(id)
                .map(ProdutoMapper::toDTO)
                .orElseThrow(() -> new ProdutoNotFoundException(id));
    }


    public ProdutoDTO create(ProdutoDTO produtoDTO) {
        if (produtoDTO.getNome() == null || produtoDTO.getPreco() == null) {
            throw new ProdutoInvalidoException("Nome e preço são obrigatórios.");
        }
        Produto produto = ProdutoMapper.toEntity(produtoDTO);
        produto = produtoRepository.save(produto);
        return ProdutoMapper.toDTO(produto);
    }

    public ProdutoDTO update(Long id, ProdutoDTO produtoDTO) {
        Produto produto = ProdutoMapper.toEntity(produtoDTO);
        produto.setId(id);
        produto = produtoRepository.save(produto);
        return ProdutoMapper.toDTO(produto);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    // Outros métodos de negócios conforme necessário
}
