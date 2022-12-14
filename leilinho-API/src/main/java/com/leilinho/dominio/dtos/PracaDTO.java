package com.leilinho.dominio.dtos;

import com.leilinho.dominio.Praca;

public class PracaDTO {
    private Long idPraca;
    private Double valor;
    private Long idUsuario;
    private Long idProduto;

    public PracaDTO(Long idPraca, Double valor, Long idUsuario, Long idProduto) {
        this.idPraca = idPraca;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
    }

    public PracaDTO(Praca praca) {
        this.idPraca = praca.getIdPraca();
        this.valor = praca.getValor();
        this.idUsuario = praca.getIdUsuario();
        this.idProduto = praca.getIdProduto();
    }
    public Double getValor() {
        return valor;
    }

    public Long getIdPraca() {
        return idPraca;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Long getIdProduto() {
        return idProduto;
    }
}
