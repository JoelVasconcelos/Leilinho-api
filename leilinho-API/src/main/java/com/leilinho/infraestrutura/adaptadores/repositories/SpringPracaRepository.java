package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.infraestrutura.adaptadores.entidades.PracaEntity;
import com.leilinho.infraestrutura.adaptadores.entidades.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringPracaRepository extends JpaRepository<PracaEntity, Long> {
    Optional<PracaEntity> findByIdProduto(Long id);
}
