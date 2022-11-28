package com.leilinho.dominio;

import com.leilinho.dominio.dtos.PracaDTO;
import com.leilinho.dominio.dtos.UsuarioDTO;

public class Praca {

    private Long idPraca;
    private Double valor;
    private Long idUsuario;
    private Long idProduto;

    public Praca() {
    }

    public Praca(Long idPraca, Double valor, Long idUsuario, Long idProduto) {
        this.idPraca = idPraca;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
    }

    public Long getIdPraca() {
        return idPraca;
    }

    public Double getValor() {
        return valor;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public Praca(PracaDTO pracaDTO) {
        this.valor = pracaDTO.getValor();
        this.idUsuario = pracaDTO.getIdUsuario();
        this.idProduto = pracaDTO.getIdProduto();
    }


    public PracaDTO toPracaDTO() {
        return new PracaDTO(this.idPraca, this.valor, this.idUsuario, this.idProduto);
    }
}
