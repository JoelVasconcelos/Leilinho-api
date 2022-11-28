package com.leilinho.infraestrutura.configuracao;

import com.leilinho.dominio.adaptadores.services.PagamentoServiceImp;
import com.leilinho.dominio.adaptadores.services.PedidoServiceImp;
import com.leilinho.dominio.adaptadores.services.PracaServiceImp;
import com.leilinho.dominio.adaptadores.services.UsuarioServiceImp;
import com.leilinho.dominio.portas.interfaces.PagamentoServicePort;
import com.leilinho.dominio.portas.interfaces.PracaServicePort;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
import com.leilinho.dominio.portas.repositories.PagamentoRepositoryPort;
import com.leilinho.dominio.portas.repositories.PracaRepositoryPort;
import com.leilinho.dominio.portas.repositories.ProdutoRepositoryPort;
import com.leilinho.dominio.portas.repositories.UsuarioRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    ProdutoServicePort produtoService(ProdutoRepositoryPort produtoRepositoryPort) {
        return new PedidoServiceImp(produtoRepositoryPort);
    }

    @Bean
    UsuarioServicePort usuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioServiceImp(usuarioRepositoryPort);
    }

    @Bean
    PagamentoServicePort pagamentoService(PagamentoRepositoryPort pagamentoRepositoryPort) {
        return new PagamentoServiceImp(pagamentoRepositoryPort);
    }

    @Bean
    PracaServicePort pracaService(PracaRepositoryPort pracaRepositoryPort) {
        return new PracaServiceImp(pracaRepositoryPort);
    }
}
