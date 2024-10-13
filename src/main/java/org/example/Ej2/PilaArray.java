package org.example.Ej2;

// PilaArray.java
public class PilaArray<T> {

    // Atributos
    private T[] elementos;
    private int tamanio;
    private int contador;

    // Constructor
    public PilaArray(int capacidad) {
        //Decidimos el tamaño máx. de la pila
        this.tamanio = capacidad;
        // Inicializamos el array
        this.elementos = (T[]) new Object[tamanio];
        this.contador = 0;
    }

    // Comprueba si la pila está vacía
    public boolean estaVacia() {
        return contador == 0;
    }

    // para quitar el último elemento añadido
    public T extraer() {
        //Si no hay elementos lanzará una excepción
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        //Saca el último elemento
        T dato = elementos[contador - 1];
        contador--;
        return dato;
    }

    // para devolver el primer elemento (el más antiguo)
    public T primero() {
        //Si la pila está vacía, lanza una excepción
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        // Devuelve el primer elemento
        return elementos[0];
    }


    // para añadir un elemento a la pila
    public void aniadir(T dato) {
        // Si el contador es mayor o = al tamaño lanzará excepción
        if (contador >= tamanio) {
            throw new IllegalStateException("La pila está llena");
        }
        //Añade el nuevo elemento
        elementos[contador] = dato;
        //Incrementa el contador
        contador++;
    }

    // Devuelve la representación en cadena de la pila
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pila: [");
        for (int i = 0; i < contador; i++) {
            sb.append(elementos[i]);
            if (i < contador - 1) {
                sb.append(", "); // Añade una coma entre elementos
            }
        }
        sb.append("]");
        return sb.toString(); // Devuelve la representación de la pila
    }
}
