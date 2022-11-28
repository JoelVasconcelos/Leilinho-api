package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.PagamentoDTO;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface PagamentoServicePort {

    List<PagamentoDTO> buscarPagamentos();

    void criarPagamento(PagamentoDTO pagamentoDTO);

    Optional<Pagamento> buscarPeloIdUsuario(Long idUsuario) throws NotFoundException;
}
