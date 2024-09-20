package com.invext.solicitacoesdosclientes.modelo;

import lombok.*;

@Data
public class Atendente {
    private String id;
    private String nome;
    private Time time;
    private int capacidadeMaxima;
    private int capacidadeAtual;
}