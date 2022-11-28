package com.leilinho.infraestrutura.adaptadores.entidades;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.Produto;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "pagamento")
public class PagamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;
    private String numeroCartao;
    private String proprietarioCartao;
    private Double cvc;
    private String validade;
    private Long idUsuario;


    public PagamentoEntity() {
    }

    public PagamentoEntity(Pagamento pagamento) {
//        this.idProduto = produto.getIdProduto();
        this.numeroCartao = pagamento.getNumeroCartao();
        this.proprietarioCartao = pagamento.getProprietarioCartao();
        this.cvc = pagamento.getCvc();
        this.validade = pagamento.getValidade();
        this.idUsuario = pagamento.getIdUsuario();
    }

    public void atualzar(Pagamento pagamento) {
//        this.idProduto = produto.getIdProduto();
        this.numeroCartao = pagamento.getNumeroCartao();
        this.proprietarioCartao = pagamento.getProprietarioCartao();
        this.cvc = pagamento.getCvc();
        this.validade = pagamento.getValidade();
        this.idUsuario = pagamento.getIdUsuario();
    }

    public Pagamento toPagamento() {
        return new Pagamento(this.idPagamento, this.numeroCartao, this.proprietarioCartao, this.validade, this.cvc, this.idUsuario);
    }
}
