package com.projetos.cardapizap.application.mapper;

import com.projetos.cardapizap.application.dtos.ProdutoDTO;
import com.projetos.cardapizap.domain.model.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoMapper {

    public static ProdutoDTO toDTO(Produto produto) {
        if (produto == null) {
            return null;
        }

        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setPreco(produto.getPreco());

        return dto;
    }

    public static Produto toEntity(ProdutoDTO dto) {
        if (dto == null) {
            return null;
        }

        Produto produto = new Produto();
        produto.setId(dto.getId());
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());

        return produto;
    }

    public static List<ProdutoDTO> toDTOList(List<Produto> produtos) {
        if (produtos == null) {
            return null;
        }

        return produtos.stream()
                .map(ProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Produto> toEntityList(List<ProdutoDTO> produtoDTOs) {
        if (produtoDTOs == null) {
            return null;
        }

        return produtoDTOs.stream()
                .map(ProdutoMapper::toEntity)
                .collect(Collectors.toList());
    }

}
