package com.leilinho.dominio.dtos;

import com.leilinho.dominio.Usuario;

import java.util.UUID;

public class UsuarioDTO {
    private Long idUsuario;
    private String email;
    private String nome;
    private String senha;
    private String imagem;

    public UsuarioDTO(Long idUsuario, String email, String nome, String senha, String imagem) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.imagem = imagem;
    }

    public UsuarioDTO(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.nome = usuario.getNome();
        this.senha = usuario.getSenha();
        this.imagem = usuario.getImagem();
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getImagem() {
        return imagem;
    }
}
