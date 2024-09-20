package com.invext.solicitacoesdosclientes.repositorio;

import com.invext.solicitacoesdosclientes.modelo.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAtendente extends JpaRepository<Atendente, String> {
}