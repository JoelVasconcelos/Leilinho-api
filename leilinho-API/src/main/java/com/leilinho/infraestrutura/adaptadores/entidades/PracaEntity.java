package com.leilinho.infraestrutura.adaptadores.entidades;

import com.leilinho.dominio.Praca;
import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.dtos.PracaDTO;

import javax.persistence.*;

@Entity
@Table(name = "praca")
public class PracaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPraca;
    private Double valor;
    private Long idUsuario;
    private Long idProduto;

    public PracaEntity() {
    }

    public PracaEntity(Praca praca) {
        this.valor = praca.getValor();
        this.idUsuario = praca.getIdUsuario();
        this.idProduto = praca.getIdProduto();
    }

    public Praca toPraca() {
        return new Praca(this.idPraca, this.valor, this.idUsuario, this.idProduto);
    }
}
