package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.AtendenteDTO;
import com.invext.solicitacoesdosclientes.modelo.Time;

public interface ServicoAtendente {
    AtendenteDTO obterAtendenteDisponivel(Time time);
    void atualizarCapacidadeAtendente(String idAtendente, int novaCapacidade);
}