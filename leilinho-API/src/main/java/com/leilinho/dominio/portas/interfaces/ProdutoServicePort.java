package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.ProdutoDTO;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface ProdutoServicePort {

    List<ProdutoDTO> buscarProdutos();

    void criarProduto(ProdutoDTO produtoDTO);

    Optional<Produto> buscarPeloId(Long id) throws NotFoundException;
}
