package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.dtos.PracaDTO;
import com.leilinho.dominio.dtos.UsuarioDTO;
import com.leilinho.dominio.portas.interfaces.PracaServicePort;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
