package com.invext.solicitacoesdosclientes.repositorio;

import com.invext.solicitacoesdosclientes.modelo.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioSolicitacao extends JpaRepository<Solicitacao, String> {
}