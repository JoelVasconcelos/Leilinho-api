package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.dtos.EstoqueDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    private final ProdutoServicePort produtoServicePort;

    public ProdutoController(ProdutoServicePort produtoServicePort) {
        this.produtoServicePort = produtoServicePort;
    }

    @PostMapping
    void criarProdutos(@RequestBody ProdutoDTO produtoDTO) {
        produtoServicePort.criarProduto(produtoDTO);
    }

    @GetMapping
    List<ProdutoDTO> getProdutos() {
        return produtoServicePort.buscarProdutos();
    }

    @PutMapping(value = "/{nome}")
    void atualizarEstoque(@PathVariable String nome, @RequestBody EstoqueDTO estoqueDTO) throws NotFoundException {
        produtoServicePort.atualizarEstoque(nome, estoqueDTO);
    }
}
