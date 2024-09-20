package com.invext.solicitacoesdosclientes.controlador;

import com.invext.solicitacoesdosclientes.dto.SolicitacaoDTO;
import com.invext.solicitacoesdosclientes.servico.ServicoSolicitacao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/solicitacoes")
public class ControladorSolicitacao {

    private final ServicoSolicitacao servicoSolicitacao;

    public ControladorSolicitacao(ServicoSolicitacao servicoSolicitacao) {
        this.servicoSolicitacao = servicoSolicitacao;
    }

    @PostMapping
    public ResponseEntity<String> criarSolicitacao(@RequestBody SolicitacaoDTO solicitacaoDTO) {
        String idSolicitacao = servicoSolicitacao.criarEDistribuirSolicitacao(solicitacaoDTO);
        return ResponseEntity.ok(idSolicitacao);
    }

    @GetMapping("/{idSolicitacao}")
    public ResponseEntity<SolicitacaoDTO> obterSolicitacao(@PathVariable String idSolicitacao) {
        SolicitacaoDTO solicitacao = servicoSolicitacao.obterSolicitacao(idSolicitacao);
        return ResponseEntity.ok(solicitacao);
    }

    @GetMapping("/status-fila")
    public ResponseEntity<Map<String, Integer>> obterStatusFila() {
        Map<String, Integer> statusFila = servicoSolicitacao.obterStatusFila();
        return ResponseEntity.ok(statusFila);
    }
}