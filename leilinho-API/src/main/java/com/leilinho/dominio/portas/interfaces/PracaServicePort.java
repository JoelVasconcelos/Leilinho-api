package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.dtos.PracaDTO;

import java.util.List;

public interface PracaServicePort {

    void criarPraca(PracaDTO pracaDTO);

    List<PracaDTO> buscarPracas();
}
