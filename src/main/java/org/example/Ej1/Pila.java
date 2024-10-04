package org.example.Ej1;

public class Pila <T> {

    private T elemento;

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



}
