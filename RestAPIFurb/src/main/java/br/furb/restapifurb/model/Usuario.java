package br.furb.restapifurb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O username é obrigatório")
    @Size(min = 3, max = 50)
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, max = 120)
    @Column(nullable = false, length = 120)
    private String senha;

    public Usuario() {}

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
