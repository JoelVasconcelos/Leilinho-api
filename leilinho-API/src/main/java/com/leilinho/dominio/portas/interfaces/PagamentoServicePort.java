package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.dtos.PagamentoDTO;

import java.util.List;

public interface PagamentoServicePort {

    List<PagamentoDTO> buscarPagamentos();

    void criarPagamento(PagamentoDTO pagamentoDTO);
}
