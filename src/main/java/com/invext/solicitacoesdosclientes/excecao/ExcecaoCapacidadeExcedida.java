package com.invext.solicitacoesdosclientes.excecao;

public class ExcecaoCapacidadeExcedida extends RuntimeException {
    public ExcecaoCapacidadeExcedida(String mensagem) {
        super(mensagem);
    }
}