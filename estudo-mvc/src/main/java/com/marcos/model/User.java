package com.marcos.model;

public class User{

    private String nome;


    public User (String nome){
        this.nome = nome;
    } 

    public final String getNome(){
        return nome;
    }

    public final void setNome(String nome){
        this.nome = nome;
    }
}
