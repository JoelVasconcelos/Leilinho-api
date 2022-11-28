package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.dtos.EstoqueDTO;
import com.leilinho.dominio.dtos.PagamentoDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.portas.interfaces.PagamentoServicePort;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("pagamento")
public class PagamentoController {

    private final PagamentoServicePort pagamentoServicePort;

    public PagamentoController(PagamentoServicePort pagamentoServicePort) {
        this.pagamentoServicePort = pagamentoServicePort;
    }

    @PostMapping
    void criarPagamento(@RequestBody PagamentoDTO pagamentoDTO) {
        pagamentoServicePort.criarPagamento(pagamentoDTO);
    }

    @GetMapping
    List<PagamentoDTO> getPagamento() {
        return pagamentoServicePort.buscarPagamentos();
    }

//    @PutMapping(value = "/{nome}")
//    void atualizarEstoque(@PathVariable String nome, @RequestBody EstoqueDTO estoqueDTO) throws NotFoundException {
//        produtoServicePort.atualizarEstoque(nome, estoqueDTO);
//    }
}