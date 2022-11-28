package com.leilinho.infraestrutura.adaptadores.entidades;

import com.leilinho.dominio.Usuario;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String email;
    private String nome;
    private String senha;
    private String imagem;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Usuario usuario) {
//        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.nome = usuario.getNome();
        this.senha = usuario.getSenha();
        this.imagem = usuario.getImagem();
    }

    public void atualizar(Usuario usuario) {
//        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.nome = usuario.getNome();
        this.senha = usuario.getSenha();
        this.imagem = usuario.getImagem();
    }

    public Usuario toUsuario() {
        return new Usuario(this.idUsuario, this.email, this.nome, this.senha, this.imagem);
    }
}
