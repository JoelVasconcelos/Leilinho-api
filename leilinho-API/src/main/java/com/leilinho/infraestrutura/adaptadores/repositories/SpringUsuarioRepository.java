package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.infraestrutura.adaptadores.entidades.ProdutoEntity;
import com.leilinho.infraestrutura.adaptadores.entidades.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpringUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByNome(String nome);
}
