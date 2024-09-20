package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.SolicitacaoDTO;
import org.springframework.stereotype.*;

import java.util.Map;

@Service
public interface ServicoSolicitacao {
    String criarEDistribuirSolicitacao(SolicitacaoDTO solicitacaoDTO);
    SolicitacaoDTO obterSolicitacao(String idSolicitacao);
    Map<String, Integer> obterStatusFila();
}