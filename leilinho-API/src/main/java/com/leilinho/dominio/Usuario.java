package com.leilinho.dominio;

import com.leilinho.dominio.dtos.UsuarioDTO;

import java.util.UUID;

public class Usuario {

    private Long idUsuario;
    private String email;
    private String nome;
    private String senha;
    private String imagem;

    public Usuario() {
    }

    public Usuario(Long IdUsuario, String email, String nome, String senha, String imagem) {
        this.idUsuario = IdUsuario;
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

    public Usuario(UsuarioDTO usuarioDTO) {
        this.idUsuario = usuarioDTO.getIdUsuario();
        this.email = usuarioDTO.getEmail();
        this.nome = usuarioDTO.getNome();
        this.senha = usuarioDTO.getSenha();
        this.imagem = usuarioDTO.getImagem();
    }


    public UsuarioDTO toUsuarioDTO() {
        return new UsuarioDTO(this.idUsuario, this.email, this.nome, this.senha, this.imagem);
    }
}
