package com.marcos.service;

import com.marcos.model.User;
import com.marcos.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Service{

    Repository repository = new Repository();

    public final boolean addNovoUser(String nome){
        User user = new User(nome);
        repository.addUser(user);
        return true;
    }

    public final void usuarios() {
        ArrayList<User> lista = repository.listUser(); // Não precisa criar uma nova ArrayList vazia

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome());
        }
    }

    // public final void usuarios() {
    //     ArrayList<User> lista = repository.listUser();

    //     for(User user : lista) {
    //         System.out.println(user.get(1));
    //     }
    // }
}