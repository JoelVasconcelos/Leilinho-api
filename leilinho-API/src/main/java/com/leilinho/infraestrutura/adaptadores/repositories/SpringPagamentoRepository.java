package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.infraestrutura.adaptadores.entidades.PagamentoEntity;
import com.leilinho.infraestrutura.adaptadores.entidades.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpringPagamentoRepository extends JpaRepository<PagamentoEntity, Long> {
    Optional<PagamentoEntity> findByIdUsuario(Long nome);
}
