package br.furb.restapifurb.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EquipamentoRequest(
        @NotBlank(message = "O nome do equipamento é obrigatório")
        @Size(min = 2, max = 120, message = "O nome deve ter entre 2 e 120 caracteres")
        String nome,

        @Valid
        @NotNull(message = "O tipo é obrigatório")
        TipoRequest tipo
) {
    public record TipoRequest(
            @NotNull(message = "O id do tipo é obrigatório")
            Long id,

            @NotBlank(message = "O nome do tipo é obrigatório")
            @Size(min = 2, max = 80)
            String nome
    ) {}
}
