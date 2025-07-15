package com.marcos.service;

import com.marcos.model.User;
import com.marcos.repository.Repository;
import com.marcos.dto.Request;

import java.util.ArrayList;
import java.util.List;

public class Service{

    Repository repository = new Repository();

    public final boolean addNovoUser(Request nome){

        System.out.println(nome.getNome());

        User user = new User(nome.getNome());
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