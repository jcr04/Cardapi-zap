package com.projetos.cardapizap.infrastructure.controller;

import com.projetos.cardapizap.application.dtos.EnderecoEntregaDTO;
import com.projetos.cardapizap.application.service.EnderecoEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos-entrega")
public class EnderecoEntregaController {

    private final EnderecoEntregaService enderecoEntregaService;

    @Autowired
    public EnderecoEntregaController(EnderecoEntregaService enderecoEntregaService) {
        this.enderecoEntregaService = enderecoEntregaService;
    }

    @GetMapping
    public ResponseEntity<List<EnderecoEntregaDTO>> getAllEnderecosEntrega() {
        List<EnderecoEntregaDTO> enderecos = enderecoEntregaService.findAll();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoEntregaDTO> getEnderecoEntregaById(@PathVariable Long id) {
        EnderecoEntregaDTO enderecoEntrega = enderecoEntregaService.findById(id);
        return ResponseEntity.ok(enderecoEntrega);
    }

    @PostMapping
    public ResponseEntity<EnderecoEntregaDTO> createEnderecoEntrega(@RequestBody EnderecoEntregaDTO enderecoEntregaDTO) {
        EnderecoEntregaDTO novoEndereco = enderecoEntregaService.create(enderecoEntregaDTO);
        return ResponseEntity.ok(novoEndereco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoEntregaDTO> updateEnderecoEntrega(@PathVariable Long id, @RequestBody EnderecoEntregaDTO enderecoEntregaDTO) {
        EnderecoEntregaDTO enderecoAtualizado = enderecoEntregaService.update(id, enderecoEntregaDTO);
        return ResponseEntity.ok(enderecoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnderecoEntrega(@PathVariable Long id) {
        enderecoEntregaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Outros métodos do controller conforme necessário
}
