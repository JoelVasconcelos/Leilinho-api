package com.leilinho.dominio.portas.interfaces;

import com.leilinho.dominio.Praca;
import com.leilinho.dominio.Produto;
import com.leilinho.dominio.dtos.PracaDTO;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface PracaServicePort {

    void criarPraca(PracaDTO pracaDTO);

    List<PracaDTO> buscarPracas();

    Optional<Praca> buscarPeloIdProduto(Long id) throws NotFoundException;

}
