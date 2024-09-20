package com.invext.solicitacoesdosclientes.servico;

import com.invext.solicitacoesdosclientes.dto.SolicitacaoDTO;
import com.invext.solicitacoesdosclientes.repositorio.RepositorioSolicitacao;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ServicoSolicitacaoImpl implements ServicoSolicitacao {

    private final RepositorioSolicitacao repositorioSolicitacao;
    private final ServicoDistribuicao servicoDistribuicao;

    public ServicoSolicitacaoImpl(RepositorioSolicitacao repositorioSolicitacao, ServicoDistribuicao servicoDistribuicao) {
        this.repositorioSolicitacao = repositorioSolicitacao;
        this.servicoDistribuicao = servicoDistribuicao;
    }

    @Override
    public String criarEDistribuirSolicitacao(SolicitacaoDTO solicitacaoDTO) {
        String id = UUID.randomUUID().toString();
        servicoDistribuicao.distribuirSolicitacao(solicitacaoDTO);
        return id;
    }

    @Override
    public SolicitacaoDTO obterSolicitacao(String idSolicitacao) {
        return new SolicitacaoDTO();
    }

    @Override
    public Map<String, Integer> obterStatusFila() {
        return new HashMap<>();
    }
}