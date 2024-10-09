package org.example.Ej1;

public class Ej1resuelto {
    class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    class LinkedList<T> {
        private Nodo<T> cabeza;

        public LinkedList() {
            this.cabeza = null;
        }

        public boolean estaVacia() {
            return cabeza == null;
        }

        public void anadir(T dato) {
            Nodo<T> nuevoNodo = new Nodo<>(dato);
            if (cabeza == null) {
                cabeza = nuevoNodo;
            } else {
                Nodo<T> actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoNodo;
            }
        }

        public T extraer() {
            if (estaVacia()) {
                throw new IllegalStateException("La lista está vacía");
            }
            T dato = cabeza.dato;
            cabeza = cabeza.siguiente;
            return dato;
        }

        public T primero() {
            if (estaVacia()) {
                throw new IllegalStateException("La lista está vacía");
            }
            return cabeza.dato;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Nodo<T> actual = cabeza;
            while (actual != null) {
                sb.append(actual.dato).append(" -> ");
                actual = actual.siguiente;
            }
            return sb.length() > 0 ? sb.substring(0, sb.length() - 4) : ""; // Eliminar la última flecha
        }
    }

    class Pila<T> {
        private LinkedList<T> elementos;

        public Pila() {
            this.elementos = new LinkedList<>();
        }

        public boolean estaVacia() {
            return elementos.estaVacia();
        }

        public T extraer() {
            return elementos.extraer();
        }

        public T primero() {
            return elementos.primero();
        }

        public void anadir(T dato) {
            elementos.anadir(dato);
        }

        @Override
        public String toString() {
            return "Pila: [" + elementos.toString() + "]";
        }

        public void main(String[] args) {
            Pila<Integer> pila = new Pila<>();
            System.out.println(pila.estaVacia()); // true
            pila.anadir(10);
            pila.anadir(20);
            pila.anadir(30);
            System.out.println(pila); // Pila: [10 -> 20 -> 30]
            System.out.println(pila.primero()); // 10
            System.out.println(pila.extraer()); // 10
            System.out.println(pila); // Pila: [20 -> 30]
            System.out.println(pila.estaVacia()); // false
        }
    }

}
