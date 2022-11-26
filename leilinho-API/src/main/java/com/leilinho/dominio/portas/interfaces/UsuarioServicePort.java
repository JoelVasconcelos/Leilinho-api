package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.dtos.UsuarioDTO;

import java.util.List;

public interface UsuarioServicePort {

    void criarUsuario(UsuarioDTO usuarioDTO);

    List<UsuarioDTO> buscarUsuarios();
}
