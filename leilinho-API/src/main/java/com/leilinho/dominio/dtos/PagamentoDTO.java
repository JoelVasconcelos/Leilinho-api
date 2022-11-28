package com.leilinho.dominio.dtos;

import com.leilinho.dominio.Pagamento;

public class PagamentoDTO {
    private Long idPagamento;
    private String numeroCartao;
    private String proprietarioCartao;
    private Double cvc;
    private String validade;
    private Long idUsuario;


    public PagamentoDTO(Long idPagamento, String numeroCartao, String proprietarioCartao, Double cvc, String validade, Long idUsuario) {
        this.idPagamento = idPagamento;
        this.numeroCartao = numeroCartao;
        this.proprietarioCartao = proprietarioCartao;
        this.cvc = cvc;
        this.validade = validade;
        this.idUsuario = idUsuario;
    }

    public PagamentoDTO(Pagamento pagamento) {
        this.idPagamento = pagamento.getIdPagamento();
        this.numeroCartao = pagamento.getNumeroCartao();
        this.proprietarioCartao = pagamento.getProprietarioCartao();
        this.cvc = pagamento.getCvc();
        this.validade = pagamento.getValidade();
        this.idUsuario = pagamento.getIdUsuario();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getProprietarioCartao() {
        return proprietarioCartao;
    }

    public Double getCvc() {
        return cvc;
    }

    public String getValidade() {
        return validade;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }
}
