package com.leilinho.dominio.adaptadores.services;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.dtos.PagamentoDTO;
import com.leilinho.dominio.portas.interfaces.PagamentoServicePort;
import com.leilinho.dominio.portas.repositories.PagamentoRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class PagamentoServiceImp implements PagamentoServicePort {

    private final PagamentoRepositoryPort pagamentoRepository;

    public PagamentoServiceImp(PagamentoRepositoryPort pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public void criarPagamento(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = new Pagamento(pagamentoDTO);
        this.pagamentoRepository.salvar(pagamento);
    }

    @Override
    public List<PagamentoDTO> buscarPagamentos() {
        List<Pagamento> pagamentos = this.pagamentoRepository.buscarTodos();
        List<PagamentoDTO> pagamentoDTOS = pagamentos.stream().map(Pagamento::toPagamentoDTO).collect(Collectors.toList());
        return pagamentoDTOS;
    }
}
