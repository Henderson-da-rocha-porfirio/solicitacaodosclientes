package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.*;
import com.invext.solicitacoesdosclientes.modelo.*;
import org.springframework.stereotype.Service;

@Service
public class ServicoAtendenteImpl implements ServicoAtendente {

    @Override
    public AtendenteDTO obterAtendenteDisponivel(Time time) {
        return new AtendenteDTO();
    }

    @Override
    public void atualizarCapacidadeAtendente(String idAtendente, int novaCapacidade) {
    }
}