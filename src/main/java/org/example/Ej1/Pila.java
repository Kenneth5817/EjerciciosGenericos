package org.example.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Pila <T> {

    // Tenemos elemento T
    private T elemento;


    //Diferentes métodos
    public void estaVacia(T elemento){
        elemento = null;
    }
    public void extraer(T elemento){
        this.elemento = elemento;
    }
    public T primero(){
        return this.elemento;
    }
    public T aniadir(){
        return this.elemento;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "elemento=" + elemento +
                '}';
    }

        List<T> elementos = new ArrayList<>();

    //Métodos apilar y desapilar
    void apilar(T nuevo) {
        elementos.add(nuevo);
    }

    T desapilar() {
        T elem = null;
        if (elementos.size() > 0) {
            elem = elementos.remove(elementos.size() - 1);
        }
        return elem;
    }
}

