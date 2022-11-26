package com.leilinho.infraestrutura.configuracao;

import com.leilinho.dominio.adaptadores.services.PedidoServiceImp;
import com.leilinho.dominio.adaptadores.services.UsuarioServiceImp;
import com.leilinho.dominio.portas.interfaces.ProdutoServicePort;
import com.leilinho.dominio.portas.interfaces.UsuarioServicePort;
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
}
