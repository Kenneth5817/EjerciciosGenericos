package org.example.ej6;
import java.util.ArrayList;
import java.util.List;
public class ej6Resuelto {

    public class ListaOrdenada<E extends Comparable<E>> {
        private List<E> elementos;

        // Constructor
        public ListaOrdenada() {
            this.elementos = new ArrayList<>(); // Inicializa la lista de elementos
        }

        // Añadir un elemento en el orden adecuado
        public void add(E o) {
            int index = 0;
            while (index < elementos.size() && elementos.get(index).compareTo(o) < 0) {
                index++; // Encuentra el índice donde insertar el nuevo elemento
            }
            elementos.add(index, o); // Inserta el elemento en la posición adecuada
        }

        // Obtener un elemento en el índice especificado
        public E get(int index) {
            if (index < 0 || index >= elementos.size()) {
                throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
            }
            return elementos.get(index); // Devuelve el elemento en el índice especificado
        }

        // Devuelve el tamaño de la lista
        public int size() {
            return elementos.size(); // Retorna el número de elementos
        }

        // Verifica si la lista está vacía
        public boolean isEmpty() {
            return elementos.isEmpty(); // Retorna true si la lista está vacía
        }

        // Elimina el primer elemento encontrado
        public boolean remove(E o) {
            return elementos.remove(o); // Retorna true si el elemento fue eliminado
        }

        // Devuelve el índice del elemento, o -1 si no se encuentra
        public int indexOf(E o) {
            return elementos.indexOf(o); // Retorna el índice del elemento, o -1 si no se encuentra
        }

        // Devuelve una representación en cadena de la lista
        @Override
        public String toString() {
            return elementos.toString(); // Retorna la representación en cadena de los elementos
        }

        // Método main para probar la clase
        public void main(String[] args) {
            ListaOrdenada<Integer> lista = new ListaOrdenada<>();

            // Añadir elementos
            lista.add(5);
            lista.add(3);
            lista.add(8);
            lista.add(1);

            // Mostrar la lista
            System.out.println("Lista ordenada: " + lista); // [1, 3, 5, 8]

            // Obtener un elemento
            System.out.println("Elemento en índice 2: " + lista.get(2)); // 5

            // Tamaño de la lista
            System.out.println("Tamaño de la lista: " + lista.size()); // 4

            // Verificar si la lista está vacía
            System.out.println("¿Está vacía la lista? " + lista.isEmpty()); // false

            // Remover un elemento
            lista.remove(3);
            System.out.println("Lista después de eliminar 3: " + lista); // [1, 5, 8]

            // Obtener el índice de un elemento
            System.out.println("Índice de 5: " + lista.indexOf(5)); // 1
            System.out.println("Índice de 10: " + lista.indexOf(10)); // -1
        }
    }

}
