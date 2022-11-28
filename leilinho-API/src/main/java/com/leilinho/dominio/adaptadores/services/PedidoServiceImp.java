package com.leilinho.dominio.adaptadores.services;

import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import com.leilinho.dominio.portas.repositories.ProdutoRepositoryPort;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PedidoServiceImp implements ProdutoServicePort {

    private final ProdutoRepositoryPort produtoRepository;

    public PedidoServiceImp(ProdutoRepositoryPort produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void criarProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto(produtoDTO);
        this.produtoRepository.salvar(produto);
    }

    @Override
    public List<ProdutoDTO> buscarProdutos() {
        List<Produto> produtos = this.produtoRepository.buscarTodos();
        List<ProdutoDTO> produtoDTOS = produtos.stream().map(Produto::toProdutoDTO).collect(Collectors.toList());
        return produtoDTOS;
    }
    ProdutoDTO[] meuarray = new ProdutoDTO[10];

    @Override
    public Optional<Produto> buscarPeloId(Long id) {
        java.util.Optional<Produto> produto = Optional.ofNullable(produtoRepository.buscarPeloId(id));
        return produto;
    }
}
