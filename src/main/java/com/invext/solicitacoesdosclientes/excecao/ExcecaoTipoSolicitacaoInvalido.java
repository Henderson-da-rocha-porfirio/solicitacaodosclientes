package com.invext.solicitacoesdosclientes.excecao;

public class ExcecaoTipoSolicitacaoInvalido extends RuntimeException {
    public ExcecaoTipoSolicitacaoInvalido(String mensagem) {
        super(mensagem);
    }
}