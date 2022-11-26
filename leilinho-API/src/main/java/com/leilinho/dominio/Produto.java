package com.leilinho.dominio;

import com.leilinho.dominio.dtos.ProdutoDTO;

import java.util.UUID;

public class Produto {

    private UUID idProduto;
    private String nome;
    private String descricao;
    private Double valor;
    private String quantidade;
    private String imagem;
    private boolean arrematado;

    public Produto() {
    }

    public Produto(UUID idProduto, String nome, String descricao, String quantidade, Double valor, String imagem, boolean arrematado) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.imagem = imagem;
        this.arrematado = arrematado;
    }

    public UUID getIdProduto() {
        return idProduto;
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

    public String getQuantidade() {
        return quantidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public boolean isArrematado() {
        return arrematado;
    }

    public Produto(ProdutoDTO produtoDTO) {
        this.nome = produtoDTO.getNome();
        this.descricao = produtoDTO.getDescricao();
        this.valor = produtoDTO.getValor();
        this.quantidade = produtoDTO.getQuantidade();
        this.imagem = produtoDTO.getImagem();
        this.arrematado = produtoDTO.isArrematado();
    }

    public void atualizarEstoque(String quantidade) {
        this.quantidade = quantidade;
    }

    public ProdutoDTO toProdutoDTO() {
        return new ProdutoDTO(this.nome, this.descricao, this.valor, this.quantidade, this.imagem, this.arrematado);
    }
}
