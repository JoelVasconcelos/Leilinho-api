package com.leilinho.dominio;

import com.leilinho.dominio.dtos.PagamentoDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;

import java.util.UUID;

public class Pagamento {

    private Long idPagamento;
    private String numeroCartao;
    private String proprietarioCartao;
    private Double cvc;
    private String validade;
    private Long idUsuario;


    public Pagamento() {
    }

    public Pagamento(Long idPagamento, String numeroCartao, String proprietarioCartao, String validade, Double cvc, Long idUsuario) {
        this.idPagamento = idPagamento;
        this.numeroCartao = numeroCartao;
        this.proprietarioCartao = proprietarioCartao;
        this.cvc = cvc;
        this.validade = validade;
        this.idUsuario = idUsuario;
    }

    public Long getIdPagamento() {
        return idPagamento;
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

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Pagamento(PagamentoDTO pagamentoDTO) {
        this.idPagamento = pagamentoDTO.getIdPagamento();
        this.numeroCartao = pagamentoDTO.getNumeroCartao();
        this.proprietarioCartao = pagamentoDTO.getProprietarioCartao();
        this.cvc = pagamentoDTO.getCvc();
        this.validade = pagamentoDTO.getValidade();
        this.idUsuario = pagamentoDTO.getIdUsuario();
    }


    public PagamentoDTO toPagamentoDTO() {
        return new PagamentoDTO(this.idPagamento, this.numeroCartao, this.proprietarioCartao, this.cvc, this.validade, this.idUsuario);
    }
}
