package com.leilinho.dominio;

import com.leilinho.dominio.dtos.ProdutoDTO;

public class Produto {

    private Long idProduto;
    private String nome;
    private String descricao;
    private Double valor;
    private String imagem;
    private boolean arrematado;

    public Produto() {
    }

    public Produto(Long idProduto, String nome, String descricao, Double valor, String imagem, boolean arrematado) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
        this.arrematado = arrematado;
    }

    public Long getIdProduto() {
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
        this.imagem = produtoDTO.getImagem();
        this.arrematado = produtoDTO.isArrematado();
    }

    public void atualizarEstoque(String quantidade) {
        this.arrematado = arrematado;
    }

    public ProdutoDTO toProdutoDTO() {
        return new ProdutoDTO(this.nome, this.descricao, this.valor, this.imagem, this.arrematado);
    }
}
