package com.leilinho.infraestrutura.adaptadores.repositories;

import com.leilinho.dominio.Pagamento;
import com.leilinho.dominio.Produto;
import com.leilinho.dominio.portas.repositories.PagamentoRepositoryPort;
import com.leilinho.dominio.portas.repositories.ProdutoRepositoryPort;
import com.leilinho.infraestrutura.adaptadores.entidades.PagamentoEntity;
import com.leilinho.infraestrutura.adaptadores.entidades.ProdutoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PagamentoRepository implements PagamentoRepositoryPort {

    private final SpringPagamentoRepository springPagamentoRepository;

    public PagamentoRepository(SpringPagamentoRepository springPagamentoRepository) {
        this.springPagamentoRepository = springPagamentoRepository;
    }

    @Override
    public List<Pagamento> buscarTodos() {
        List<PagamentoEntity> produtoEntities = this.springPagamentoRepository.findAll();
        return produtoEntities.stream().map(PagamentoEntity::toPagamento).collect(Collectors.toList());
    }

    @Override
    public Pagamento buscarPeloIdUsuario(Long idUsuario) {
        Optional<PagamentoEntity> pagamentoEntity = this.springPagamentoRepository.findByIdUsuario(idUsuario);

        if (pagamentoEntity.isPresent())
            return pagamentoEntity.get().toPagamento();

        throw new RuntimeException("Pagamento não existe");
    }

    @Override
    public void salvar(Pagamento pagamento) {
        PagamentoEntity pagamentoEntity;
        if (Objects.isNull(pagamento.getIdPagamento()))
            pagamentoEntity = new PagamentoEntity(pagamento);
        else {
            pagamentoEntity = this.springPagamentoRepository.findById(pagamento.getIdPagamento()).get();
            pagamentoEntity.atualzar(pagamento);
        }

        this.springPagamentoRepository.save(pagamentoEntity);
    }
}
