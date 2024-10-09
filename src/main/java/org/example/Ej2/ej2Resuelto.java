package org.example.Ej2;

import java.util.Arrays;

public class ej2Resuelto {

    class PilaArray<T> {
        private T[] elementos;
        private int contador;
        private static final int CAPACIDAD_INICIAL = 10; // Capacidad inicial del array

        @SuppressWarnings("unchecked")
        public PilaArray() {
            this.elementos = (T[]) new Object[CAPACIDAD_INICIAL]; // Inicialización del array
            this.contador = 0; // Contador de elementos
        }

        public boolean estaVacia() {
            return contador == 0; // La pila está vacía si el contador es 0
        }

        public void anadir(T dato) {
            if (contador == elementos.length) {
                // Si el array está lleno, duplicar su tamaño
                aumentarCapacidad();
            }
            elementos[contador++] = dato; // Añadir el elemento y aumentar el contador
        }

        public T extraer() {
            if (estaVacia()) {
                throw new IllegalStateException("La pila está vacía");
            }
            T dato = elementos[--contador]; // Decrementar el contador y obtener el elemento
            elementos[contador] = null; // Limpiar la referencia
            return dato;
        }

        public T primero() {
            if (estaVacia()) {
                throw new IllegalStateException("La pila está vacía");
            }
            return elementos[contador - 1]; // Retornar el último elemento sin extraerlo
        }

        private void aumentarCapacidad() {
            // Duplicar la capacidad del array
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Pila: [");
            for (int i = 0; i < contador; i++) {
                sb.append(elementos[i]);
                if (i < contador - 1) {
                    sb.append(" -> ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        public void main(String[] args) {
            PilaArray<Integer> pila = new PilaArray<>();
            System.out.println(pila.estaVacia()); // true
            pila.anadir(10);
            pila.anadir(20);
            pila.anadir(30);
            System.out.println(pila); // Pila: [10 -> 20 -> 30]
            System.out.println(pila.primero()); // 30
            System.out.println(pila.extraer()); // 30
            System.out.println(pila); // Pila: [10 -> 20]
            System.out.println(pila.estaVacia()); // false
        }
    }

}
