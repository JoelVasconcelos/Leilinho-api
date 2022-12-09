package com.leilinho.aplicacao.adaptatores.controllers;

import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.dtos.UsuarioDTO;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
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

    @GetMapping("/{email}")
    public ResponseEntity<UsuarioDTO> detalhar(@PathVariable String email) throws NotFoundException {
        Optional<Usuario> usuario = usuarioServicePort.buscarPeloNome(email);
        if (usuario.isPresent()) {
            return ResponseEntity.ok(new UsuarioDTO(usuario.get()));
        }
        return ResponseEntity.notFound().build();
    }
}