package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.PagamentoDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.portas.interfaces.PagamentoServicePort;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<PagamentoDTO> detalhar(@PathVariable Long id) throws NotFoundException {
        Optional<Pagamento> pagamento = pagamentoServicePort.buscarPeloIdUsuario(id);
        if (pagamento.isPresent()) {
            return ResponseEntity.ok(new PagamentoDTO(pagamento.get()));
        }
        return ResponseEntity.notFound().build();
    }
}
