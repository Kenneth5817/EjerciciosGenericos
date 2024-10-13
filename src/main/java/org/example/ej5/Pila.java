package org.example.ej5;
import java.util.ArrayList;

//La clase Pila implementará la interfaz con los métodos de los genericos
public class Pila<T> implements ColeccionSimpleGenerica<T> {
    //Atributo->array donde almacenaremos los elementos
    private ArrayList<T> elementos;

    //Generamos contructor de Pila
    public Pila() {
        this.elementos = new ArrayList<>();
    }

    //IMPLEMENTACIÓN DE LOS MÉTODOS:
    @Override
    public boolean estaVacia() {
        //Comprueba si la lista está vacia
        return elementos.isEmpty();
    }

    @Override
    public T extraer() {
        if (estaVacia()) {
            //Si está vacía la pila lanzará esta excepción
            throw new IllegalStateException("La colección está vacía");
        }
        //Si no, devuelve borra el último elemento
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public T primero() {
        if (estaVacia()) {
            //Nuevamente, comprueba si está vacía
            throw new IllegalStateException("La colección está vacía");
        }
        //Nos devuevle el primer elemento de la colección
        return elementos.get(0);
    }

    //Este método añadirá el elemento introducido al final de la lista
    @Override
    public void aniadir(T elemento) {
        elementos.add(elemento);
    }
}
