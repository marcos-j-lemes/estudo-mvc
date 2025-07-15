package com.marcos.repository;

import com.marcos.model.User;


import java.util.ArrayList;
import java.util.List;


public class Repository{

    private ArrayList<User> usuarios = new ArrayList<>();


    public final boolean addUser (User nome){
        usuarios.add(nome);
        return true;
    } 

    public final ArrayList<User> listUser(){
        return new ArrayList<>(usuarios);
    }
}
