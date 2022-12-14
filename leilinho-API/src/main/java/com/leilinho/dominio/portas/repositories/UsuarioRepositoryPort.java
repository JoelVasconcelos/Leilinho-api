package com.leilinho.dominio.portas.repositories;

import com.leilinho.dominio.Usuario;

import java.util.List;

public interface UsuarioRepositoryPort {
    List<Usuario> buscarTodos();

    Usuario buscarPeloEmail(String email);

    void salvar(Usuario usuario);
}
