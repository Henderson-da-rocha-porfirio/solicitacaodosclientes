package com.invext.solicitacoesdosclientes.modelo;

import lombok.Data;

@Data
public class Solicitacao {
    private String id;
    private String tipo;
    private String descricao;
    private String status;
}