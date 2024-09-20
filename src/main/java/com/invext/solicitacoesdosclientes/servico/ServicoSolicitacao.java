package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.SolicitacaoDTO;
import java.util.Map;

public interface ServicoSolicitacao {
    String criarEDistribuirSolicitacao(SolicitacaoDTO solicitacaoDTO);
    SolicitacaoDTO obterSolicitacao(String idSolicitacao);
    Map<String, Integer> obterStatusFila();
}