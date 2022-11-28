package com.leilinho.dominio.adaptadores.services;

import com.leilinho.dominio.Praca;
import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.dtos.PracaDTO;
import com.leilinho.dominio.dtos.UsuarioDTO;
import com.leilinho.dominio.portas.interfaces.PracaServicePort;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import com.leilinho.dominio.portas.repositories.PracaRepositoryPort;
import com.leilinho.dominio.portas.repositories.UsuarioRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class PracaServiceImp implements PracaServicePort {

    private final PracaRepositoryPort pracaRepository;


    public PracaServiceImp(PracaRepositoryPort pracaRepository) {
        this.pracaRepository = pracaRepository;
    }

    @Override
    public void criarPraca(PracaDTO pracaDTO) {
        Praca praca = new Praca(pracaDTO);
        this.pracaRepository.salvar(praca);
    }

    @Override
    public List<PracaDTO> buscarPracas() {
        List<Praca> pracas = this.pracaRepository.buscarPracas();
        List<PracaDTO> pracaDTOS = pracas.stream().map(Praca::toPracaDTO).collect(Collectors.toList());
        return pracaDTOS;
    }
}
