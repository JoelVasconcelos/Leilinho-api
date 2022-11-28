package com.leilinho.dominio.portas.repositories;

import com.leilinho.dominio.Produto;

import java.util.List;

public interface ProdutoRepositoryPort {
    List<Produto> buscarTodos();

    Produto buscarPeloId(Long id);

    void salvar(Produto produto);
}
