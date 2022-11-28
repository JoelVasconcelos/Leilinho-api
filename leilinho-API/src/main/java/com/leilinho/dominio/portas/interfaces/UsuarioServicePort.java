package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.Produto;
import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.dtos.UsuarioDTO;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface UsuarioServicePort {

    void criarUsuario(UsuarioDTO usuarioDTO);

    List<UsuarioDTO> buscarUsuarios();

    Optional<Usuario> buscarPeloNome(String email) throws NotFoundException;
}
