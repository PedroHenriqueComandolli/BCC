package br.furb.restapifurb.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "equipamentos")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do equipamento é obrigatório")
    @Size(min = 2, max = 120, message = "O nome deve ter entre 2 e 120 caracteres")
    @Column(nullable = false, length = 120)
    private String nome;

    @Valid
    @NotNull(message = "O tipo é obrigatório")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_id", nullable = false)
    private Tipo tipo;

    public Equipamento() {}

    public Equipamento(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Tipo getTipo() { return tipo; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; }
}
