package com.marcos.dto;

public class Request {

    private String nome;

    public Request() {
    }

    public Request(String nome) {
        this.nome = nome;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
