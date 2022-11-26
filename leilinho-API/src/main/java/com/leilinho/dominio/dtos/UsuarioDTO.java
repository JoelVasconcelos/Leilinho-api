package com.leilinho.dominio.dtos;

import java.util.UUID;

public class UsuarioDTO {
    private Long idUsuario;
    private String email;
    private String nome;
    private String senha;
    private String imagem;

    public UsuarioDTO(String email, String nome, String senha, String imagem) {
//        this.idUsuario = idUsuario;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.imagem = imagem;
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
