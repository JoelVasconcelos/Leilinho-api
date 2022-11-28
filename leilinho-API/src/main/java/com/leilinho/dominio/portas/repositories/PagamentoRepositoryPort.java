package com.leilinho.dominio.portas.repositories;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.Produto;

import java.util.List;

public interface PagamentoRepositoryPort {
    List<Pagamento> buscarTodos();

    Pagamento buscarPeloProprietarioCartao(String proprietarioCartao);

    void salvar(Pagamento pagamento);
}
