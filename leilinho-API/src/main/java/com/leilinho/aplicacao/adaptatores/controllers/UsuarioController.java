package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.dtos.EstoqueDTO;
import com.leilinho.dominio.dtos.ProdutoDTO;
import com.leilinho.dominio.dtos.UsuarioDTO;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;

    public UsuarioController(UsuarioServicePort usuarioServicePort) {
        this.usuarioServicePort = usuarioServicePort;
    }

    @PostMapping
    void criarUsuarios(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioServicePort.criarUsuario(usuarioDTO);
    }

    @GetMapping
    List<UsuarioDTO> getUsuarios() {
        return usuarioServicePort.buscarUsuarios();
    }
}
