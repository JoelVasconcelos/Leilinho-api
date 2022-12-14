package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
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
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> detalhar(@PathVariable Long id) throws NotFoundException {
        Optional<Produto> produto = produtoServicePort.buscarPeloId(id);
        if (produto.isPresent()) {
            return ResponseEntity.ok(new ProdutoDTO(produto.get()));
        }
        return ResponseEntity.notFound().build();
    }
}
