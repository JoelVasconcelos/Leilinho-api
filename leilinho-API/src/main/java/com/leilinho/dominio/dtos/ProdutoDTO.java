package com.leilinho.dominio.dtos;

public class ProdutoDTO {
    private String nome;
    private String descricao;
    private Double valor;
    private String imagem;
    private boolean arrematado;

    public ProdutoDTO(String nome, String descricao, Double valor, String imagem, boolean arrematado) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
        this.arrematado = arrematado;
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
}
