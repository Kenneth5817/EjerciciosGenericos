package org.example.ej5;
    //Al ser interfaz solo ponemos cabecera de metodos, se implementarán en la clase Pila
    public interface ColeccionSimpleGenerica<T> {

        //MÉTODOS:
        boolean estaVacia();

        T extraer();

        T primero();

        void aniadir(T elemento);
    }

