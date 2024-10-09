package org.example.ej5;
import java.util.ArrayList;

import java.util.ArrayList;

public class Pila<T> implements ColeccionSimpleGenerica<T> {
    private ArrayList<T> elementos; // Lista para almacenar los elementos

    public Pila() {
        this.elementos = new ArrayList<>(); // Inicializa la lista de elementos
    }

    @Override
    public boolean estaVacia() {
        return elementos.isEmpty(); // Verifica si la lista está vacía
    }

    @Override
    public T extraer() {
        if (estaVacia()) {
            throw new IllegalStateException("La colección está vacía"); // Lanza excepción si está vacía
        }
        return elementos.remove(elementos.size() - 1); // Elimina y devuelve el último elemento
    }

    @Override
    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La colección está vacía"); // Lanza excepción si está vacía
        }
        return elementos.get(elementos.size() - 1); // Devuelve el último elemento sin eliminarlo
    }

    @Override
    public void aniadir(T elemento) {
        elementos.add(elemento); // Añade el elemento al final de la lista
    }

    // Método para demostrar el uso de la pila
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>(); // Crea una pila de enteros

        // Añade elementos a la pila
        pila.aniadir(10);
        pila.aniadir(20);
        pila.aniadir(30);

        // Muestra el primer elemento
        System.out.println("El primer elemento (top) de la pila es: " + pila.primero()); // Debe mostrar 30

        // Extrae un elemento y muestra el nuevo top
        System.out.println("Extraer elemento: " + pila.extraer()); // Debe mostrar 30
        System.out.println("El primer elemento (top) ahora es: " + pila.primero()); // Debe mostrar 20

        // Verifica si la pila está vacía
        System.out.println("¿Está vacía la pila? " + pila.estaVacia()); // Debe mostrar false
    }
}
