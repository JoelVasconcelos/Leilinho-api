package com.leilinho.dominio.adaptadores.services;

import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.EstoqueDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import com.leilinho.dominio.portas.repositories.ProdutoRepositoryPort;
import javassist.NotFoundException;

import java.util.List;
import java.util.Objects;
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
    public void atualizarEstoque(String nome, EstoqueDTO estoqueDTO) throws NotFoundException {
        Produto produto = this.produtoRepository.buscarPeloNome(nome);

        if (Objects.isNull(produto))
            throw new NotFoundException("Produto não encontrado");

        produto.atualizarEstoque(estoqueDTO.getQuantidade());

        this.produtoRepository.salvar(produto);
    }
}
