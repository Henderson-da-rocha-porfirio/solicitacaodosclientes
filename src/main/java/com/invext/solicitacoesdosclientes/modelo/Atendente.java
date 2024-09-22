package com.invext.solicitacoesdosclientes.modelo;

import jakarta.persistence.*;

@Entity
public class Atendente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nome;
    private String time;
    private int capacidadeMaxima;
    private int capacidadeAtual;

    public Atendente() {
    }

    public Atendente(String id, String nome, String time, int capacidadeMaxima, int capacidadeAtual) {
        this.id = id;
        this.nome = nome;
        this.time = time;
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = capacidadeAtual;
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    // toString, equals e hashCode

    @Override
    public String toString() {
        return "Atendente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", time='" + time + '\'' +
                ", capacidadeMaxima=" + capacidadeMaxima +
                ", capacidadeAtual=" + capacidadeAtual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atendente atendente = (Atendente) o;
        return id.equals(atendente.id);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}