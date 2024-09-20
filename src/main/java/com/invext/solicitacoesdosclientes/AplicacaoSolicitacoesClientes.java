package com.invext.solicitacoesdosclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.invext.solicitacoesdosclientes.modelo")
@EnableJpaRepositories("com.invext.solicitacoesdosclientes.repositorio")
public class AplicacaoSolicitacoesClientes {
	public static void main(String[] args) {
		SpringApplication.run(AplicacaoSolicitacoesClientes.class, args);
	}
}