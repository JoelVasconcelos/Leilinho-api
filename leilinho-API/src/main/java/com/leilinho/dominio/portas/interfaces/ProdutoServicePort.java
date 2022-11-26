package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.dtos.EstoqueDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import javassist.NotFoundException;

import java.util.List;

public interface ProdutoServicePort {

    List<ProdutoDTO> buscarProdutos();

    void criarProduto(ProdutoDTO produtoDTO);

    void atualizarEstoque(String nome, EstoqueDTO estoqueDTO) throws NotFoundException;
}
