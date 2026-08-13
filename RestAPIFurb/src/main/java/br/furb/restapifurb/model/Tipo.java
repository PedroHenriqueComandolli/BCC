package br.furb.restapifurb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tipos")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do tipo é obrigatório")
    @Size(min = 2, max = 80, message = "O nome deve ter entre 2 e 80 caracteres")
    @Column(nullable = false, length = 80)
    private String nome;

    public Tipo() {}

    public Tipo(String nome) {
        this.nome = nome;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
