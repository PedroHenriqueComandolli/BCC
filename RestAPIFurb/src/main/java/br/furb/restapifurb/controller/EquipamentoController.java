package br.furb.restapifurb.controller;

import br.furb.restapifurb.dto.EquipamentoPatchRequest;
import br.furb.restapifurb.dto.EquipamentoRequest;
import br.furb.restapifurb.model.Equipamento;
import br.furb.restapifurb.service.EquipamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/equipamentos")
@Tag(name = "Equipamentos", description = "Serviços REST para gerenciamento de equipamentos")
@SecurityRequirement(name = "bearerAuth")
public class EquipamentoController {

    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Lista todos os equipamentos")
    public Map<String, List<Equipamento>> listar() {
        return Map.of("equipamentos", service.listar());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca um equipamento pelo ID")
    public Equipamento buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    @Operation(summary = "Cadastra um equipamento")
    public ResponseEntity<Equipamento> criar(@Valid @RequestBody EquipamentoRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(request));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza somente os campos enviados")
    public Equipamento atualizarParcial(
            @PathVariable Long id,
            @Valid @RequestBody EquipamentoPatchRequest request) {
        return service.atualizarParcial(id, request);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove um equipamento")
    public Map<String, Map<String, String>> remover(@PathVariable Long id) {
        service.remover(id);

        Map<String, String> sucesso = new LinkedHashMap<>();
        sucesso.put("text", "equipamento removido");

        return Map.of("success", sucesso);
    }
}
