package br.furb.restapifurb.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

public record EquipamentoPatchRequest(
        @Size(min = 2, max = 120, message = "O nome deve ter entre 2 e 120 caracteres")
        String nome,

        @Valid
        EquipamentoRequest.TipoRequest tipo
) {}
