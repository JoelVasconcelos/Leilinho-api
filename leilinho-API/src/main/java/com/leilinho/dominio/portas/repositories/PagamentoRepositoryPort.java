package com.leilinho.dominio.portas.repositories;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.Produto;

import java.util.List;

public interface PagamentoRepositoryPort {
    List<Pagamento> buscarTodos();

    Pagamento buscarPeloIdUsuario(Long idUsuario);

    void salvar(Pagamento pagamento);
}
