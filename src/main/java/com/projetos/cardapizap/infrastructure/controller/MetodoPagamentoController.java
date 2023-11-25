package com.projetos.cardapizap.infrastructure.controller;

import com.projetos.cardapizap.application.dtos.MetodoPagamentoDTO;
import com.projetos.cardapizap.application.service.MetodoPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metodos-pagamento")
public class MetodoPagamentoController {

    private final MetodoPagamentoService metodoPagamentoService;

    @Autowired
    public MetodoPagamentoController(MetodoPagamentoService metodoPagamentoService) {
        this.metodoPagamentoService = metodoPagamentoService;
    }

    @GetMapping
    public ResponseEntity<List<MetodoPagamentoDTO>> getAllMetodosPagamento() {
        List<MetodoPagamentoDTO> metodos = metodoPagamentoService.findAll();
        return ResponseEntity.ok(metodos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MetodoPagamentoDTO> getMetodoPagamentoById(@PathVariable Long id) {
        MetodoPagamentoDTO metodoPagamento = metodoPagamentoService.findById(id);
        return ResponseEntity.ok(metodoPagamento);
    }

    @PostMapping
    public ResponseEntity<MetodoPagamentoDTO> createMetodoPagamento(@RequestBody MetodoPagamentoDTO metodoPagamentoDTO) {
        MetodoPagamentoDTO novoMetodo = metodoPagamentoService.create(metodoPagamentoDTO);
        return ResponseEntity.ok(novoMetodo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MetodoPagamentoDTO> updateMetodoPagamento(@PathVariable Long id, @RequestBody MetodoPagamentoDTO metodoPagamentoDTO) {
        MetodoPagamentoDTO metodoAtualizado = metodoPagamentoService.update(id, metodoPagamentoDTO);
        return ResponseEntity.ok(metodoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMetodoPagamento(@PathVariable Long id) {
        metodoPagamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Outros métodos do controller conforme necessário
}
