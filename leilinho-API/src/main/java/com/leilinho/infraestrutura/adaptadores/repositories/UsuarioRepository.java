package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.portas.repositories.UsuarioRepositoryPort;
import com.leilinho.infraestrutura.adaptadores.entidades.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UsuarioRepository implements UsuarioRepositoryPort {

    private final SpringUsuarioRepository springUsuarioRepository;

    public UsuarioRepository(SpringUsuarioRepository springUsuarioRepository) {
        this.springUsuarioRepository = springUsuarioRepository;
    }


    @Override
    public List<Usuario> buscarTodos() {
        List<UsuarioEntity> usuarioEntities = this.springUsuarioRepository.findAll();
        return usuarioEntities.stream().map(UsuarioEntity::toUsuario).collect(Collectors.toList());
    }


    @Override
    public Usuario buscarPeloNome(String nome) {
        Optional<UsuarioEntity> usuarioEntity = this.springUsuarioRepository.findByNome(nome);

        if (usuarioEntity.isPresent())
            return usuarioEntity.get().toUsuario();

        throw new RuntimeException("Usuario não existe");
    }


    @Override
    public void salvar(Usuario usuario) {
        UsuarioEntity usuarioEntity;
        if (Objects.isNull(usuario.getIdUsuario()))
            usuarioEntity = new UsuarioEntity(usuario);
        else {
            usuarioEntity = this.springUsuarioRepository.findById(usuario.getIdUsuario()).get();
            usuarioEntity.atualizar(usuario);
        }

        this.springUsuarioRepository.save(usuarioEntity);
    }
}
