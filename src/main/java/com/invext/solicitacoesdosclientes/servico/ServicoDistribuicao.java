package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.SolicitacaoDTO;

public interface ServicoDistribuicao {
    void distribuirSolicitacao(SolicitacaoDTO solicitacaoDTO);
}