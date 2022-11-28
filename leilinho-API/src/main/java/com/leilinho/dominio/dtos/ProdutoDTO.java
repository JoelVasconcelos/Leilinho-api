package com.leilinho.dominio.dtos;

import com.leilinho.dominio.Produto;

public class ProdutoDTO {
    private Long idProduto;
    private String nome;
    private String descricao;
    private Double valor;
    private String imagem;
    private boolean arrematado;

    public ProdutoDTO(Long idProduto, String nome, String descricao, Double valor, String imagem, boolean arrematado) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
        this.arrematado = arrematado;
    }

    public ProdutoDTO(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
        this.imagem = produto.getImagem();
        this.arrematado = produto.isArrematado();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getImagem() {
        return imagem;
    }

    public boolean isArrematado() {
        return arrematado;
    }

    public Long getIdProduto() {
        return idProduto;
    }
}
