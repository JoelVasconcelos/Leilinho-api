package com.leilinho.dominio.portas.repositories;

import com.leilinho.dominio.Produto;

import java.util.List;

public interface ProdutoRepositoryPort {
    List<Produto> buscarTodos();

    Produto buscarPeloNome(String nome);

    void salvar(Produto produto);
}
