package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.Praca;
import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.PracaDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.dtos.UsuarioDTO;
import com.leilinho.dominio.portas.interfaces.PracaServicePort;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("praca")
public class PracaController {

    private final PracaServicePort pracaServicePort;

    public PracaController(PracaServicePort pracaServicePort) {
        this.pracaServicePort = pracaServicePort;
    }

    @PostMapping
    void criarPraca(@RequestBody PracaDTO pracaDTO) {
        pracaServicePort.criarPraca(pracaDTO);
    }

    @GetMapping
    List<PracaDTO> getPracas() {
        return pracaServicePort.buscarPracas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PracaDTO> detalhar(@PathVariable Long id) throws NotFoundException {
        Optional<Praca> praca = pracaServicePort.buscarPeloIdProduto(id);
        if (praca.isPresent()) {
            return ResponseEntity.ok(new PracaDTO(praca.get()));
        }
        return ResponseEntity.notFound().build();
    }
}
