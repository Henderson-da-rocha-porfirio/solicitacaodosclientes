package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.*;
import com.invext.solicitacoesdosclientes.modelo.*;

public interface ServicoAtendente {
    AtendenteDTO obterAtendenteDisponivel(Time time);
    void atualizarCapacidadeAtendente(String idAtendente, int novaCapacidade);
}