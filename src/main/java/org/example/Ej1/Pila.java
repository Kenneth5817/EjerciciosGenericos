package org.example.Ej1;
import java.util.ArrayList;
import java.util.List;

//Creamos la clase Pila
public class Pila<T> {
    //Creamos una lista donde guardaremos los elementos
    private List<T> elementos;

    //Constructor
    public Pila() {
        this.elementos = new ArrayList<>();
    }

    //Métodos:
    //para saber si la pila está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    //para indicar que el último elemento queremos sacarlo de la pila
    public T extraer() {
        if (estaVacia()) {
            throw new IllegalStateException("En la pila no hay ningún elemento, está vacía");
        }
        //Se saca el último elemento de la pila
        return elementos.remove(elementos.size() - 1);
    }

    //para indicar que queremos que nos diga el primer elemento de la colección
    public T primero() {
        //En caso de que en la pila no haya nada, se mostrará la siguiente excepción
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(0);
    }

    //para indicar qué elemento queremos añadir a la pila
    public void aniadir(T dato) {
        elementos.add(dato);
    }

    //toString ;)
    @Override
    public String toString() {
        return "Pila: " + elementos.toString();
    }
}
