package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.infraestrutura.adaptadores.entidades.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpringProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
//    Optional<ProdutoEntity> findById(String nome);
}
