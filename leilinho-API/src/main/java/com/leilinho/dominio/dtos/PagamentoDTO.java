package com.leilinho.dominio.dtos;

public class PagamentoDTO {
    private String numeroCartao;
    private String proprietarioCartao;
    private Double cvc;
    private String validade;
    private Long idUsuario;


    public PagamentoDTO(String numeroCartao, String proprietarioCartao, Double cvc, String validade, Long idUsuario) {
        this.numeroCartao = numeroCartao;
        this.proprietarioCartao = proprietarioCartao;
        this.cvc = cvc;
        this.validade = validade;
        this.idUsuario = idUsuario;
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
}
