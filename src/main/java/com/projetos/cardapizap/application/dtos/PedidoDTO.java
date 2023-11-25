package com.projetos.cardapizap.application.dtos;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
public class PedidoDTO {

    // Getters e setters
    private UUID id;
    private ClienteDTO cliente;
    private EnderecoEntregaDTO enderecoEntrega;
    private MetodoPagamentoDTO metodoPagamento;
    private List<ProdutoDTO> produtos;
    private BigDecimal valorTotal;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public void setEnderecoEntrega(EnderecoEntregaDTO enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void setMetodoPagamento(MetodoPagamentoDTO metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Construtores, se necessário
    public PedidoDTO() {
    }

    public PedidoDTO(UUID id, ClienteDTO cliente, EnderecoEntregaDTO enderecoEntrega, MetodoPagamentoDTO metodoPagamento, List<ProdutoDTO> produtos, BigDecimal valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.metodoPagamento = metodoPagamento;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    // Métodos utilitários, como conversões de/para a entidade Pedido, podem ser adicionados aqui
}
