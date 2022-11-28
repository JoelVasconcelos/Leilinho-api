package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.dominio.Praca;
import com.leilinho.dominio.Usuario;
import com.leilinho.dominio.portas.repositories.PracaRepositoryPort;
import com.leilinho.dominio.portas.repositories.UsuarioRepositoryPort;
import com.leilinho.infraestrutura.adaptadores.entidades.PracaEntity;
import com.leilinho.infraestrutura.adaptadores.entidades.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PracaRepository implements PracaRepositoryPort {

    private final SpringPracaRepository springPracaRepository;

    public PracaRepository(SpringPracaRepository springPracaRepository) {
        this.springPracaRepository = springPracaRepository;
    }

    @Override
    public List<Praca> buscarPracas() {
        List<PracaEntity> pracaEntities = this.springPracaRepository.findAll();
        return pracaEntities.stream().map(PracaEntity::toPraca).collect(Collectors.toList());
    }

    @Override
    public Praca buscarPeloIdUsuario(String idUsuario) {
        Optional<PracaEntity> pracaEntity = this.springPracaRepository.findByIdUsuario(idUsuario);

        if (pracaEntity.isPresent())
            return pracaEntity.get().toPraca();

        throw new RuntimeException("Praca não existe");
    }


    @Override
    public void salvar(Praca praca) {
        PracaEntity pracaEntity;
        pracaEntity = new PracaEntity(praca);
        this.springPracaRepository.save(pracaEntity);
    }
}
