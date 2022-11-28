package com.leilinho.dominio.portas.repositories;

import com.leilinho.dominio.Praca;
import com.leilinho.dominio.Usuario;

import java.util.List;

public interface PracaRepositoryPort {
    List<Praca> buscarPracas();

    Praca buscarPeloIdProduto(Long id);

    void salvar(Praca praca);
}
