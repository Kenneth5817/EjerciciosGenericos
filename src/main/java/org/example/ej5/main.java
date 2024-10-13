package org.example.ej5;

import org.example.Ej1.Pila;

public class main {
    public static void main(String[] args) {
        //Creamos una colección de Integer para almacenar los números
        Pila<Integer> pila = new Pila<>();
        //Vemos si la pila está vacía
        System.out.println("La pila está vacía?: " + pila.estaVacia());
        System.out.println("Añadiendo elementos a la pila....");

        //Añadimos elementos a la Pila
        pila.aniadir(58);
        pila.aniadir(12);
        pila.aniadir(24);
        pila.aniadir(79);
        pila.aniadir(84);
        System.out.println(pila);
        System.out.println("Primer elemento: " + pila.primero());
        System.out.println("Extraemos el último elemento: " + pila.extraer());
        System.out.println(pila);
        //Vemos si la pila está vacía ahora
        System.out.println("La pila está vacía?: " + pila.estaVacia());
    }
}
