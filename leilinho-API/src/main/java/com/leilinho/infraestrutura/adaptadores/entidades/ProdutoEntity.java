package com.leilinho.infraestrutura.adaptadores.entidades;

import com.leilinho.dominio.Produto;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduto;
    private String nome;
    private String descricao;
    private Double valor;
    private String quantidade;
    private String imagem;
    private boolean arrematado;

    public ProdutoEntity() {
    }

    public ProdutoEntity(Produto produto) {
//        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
        this.quantidade = produto.getQuantidade();
        this.imagem = produto.getImagem();
        this.arrematado = produto.isArrematado();
    }

    public void atualizar(Produto produto) {
//        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.valor = produto.getValor();
        this.quantidade = produto.getQuantidade();
        this.imagem = produto.getImagem();
        this.arrematado = produto.isArrematado();
    }

    public Produto toProduto() {
        return new Produto(this.idProduto, this.nome, this.descricao, this.quantidade, this.valor, this.imagem, this.arrematado);
    }
}
