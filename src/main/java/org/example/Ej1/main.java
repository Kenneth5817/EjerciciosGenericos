package org.example.Ej1;

import java.util.LinkedList;
import java.util.List;

public class main extends Pila<String> {

    public static void main(String[] args) {
        //Creamos una lista de tipo LinkedList (INTEGER)
        List<Integer> string=new LinkedList<>();

        System.out.println("Mostramos los resultados");

        //Almacenamos los resultados en una pila
        Pila<Integer> p=new Pila<>();
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }

        //Los desapilamos
        Integer num=p.desapilar();

        //Mientras que no sea nulo los seguiremos apilando
        while(num!=null){
            System.out.println(num);
            num=p.desapilar();
        }
    }
}
