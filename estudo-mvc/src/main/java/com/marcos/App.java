package com.marcos;

import com.marcos.service.Service;
import com.marcos.dto.Request;

public class App 
{
    public static void main( String[] args )
    {
        Service service = new Service();
        Request dto = new Request("Luiz");


        System.out.println( "=============== ===================== =========" );

        //dto.setNome("Marcos");

        service.addNovoUser(dto.getNome());

        // String[] letras = {"A","B","C","D","E","A","B","C","D","E","A","B","C","D","E"};

        // String nome = "marcos";

        // for(int i = 0; i < letras.length; i++){
        //     boolean a = service.addNovoUser(letras[i]);
        // }


        service.usuarios();
    }
}
