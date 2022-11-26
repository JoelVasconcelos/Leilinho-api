package com.leilinho.dominio.adaptadores.services;

import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.dtos.UsuarioDTO;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import com.leilinho.dominio.portas.repositories.UsuarioRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioServiceImp implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepository;

    public UsuarioServiceImp(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepository = usuarioRepositoryPort;
    }

    @Override
    public void criarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(usuarioDTO);
        this.usuarioRepository.salvar(usuario);
    }

    @Override
    public List<UsuarioDTO> buscarUsuarios() {
        List<Usuario> usuarios = this.usuarioRepository.buscarTodos();
        List<UsuarioDTO> usuarioDTOS = usuarios.stream().map(Usuario::toUsuarioDTO).collect(Collectors.toList());
        return usuarioDTOS;
    }
}
