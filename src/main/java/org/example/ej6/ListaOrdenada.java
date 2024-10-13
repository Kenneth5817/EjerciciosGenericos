package org.example.ej6;
import java.util.ArrayList;
import java.util.List;

//La clase ListaOrdenada va a extender a Comparable
public class ListaOrdenada<E extends Comparable<E>> {
    //Atributo-> lista de tipo E que almacenará los distintos elementos
    private List<E> elementos;

    // Constructor
    public ListaOrdenada() {
        this.elementos = new ArrayList<>();
    }

    // Añadimos un elemento en el orden adecuado
    public void add(E o) {
        int indice = 0;
        //Vemos si el indice es valido
        while (indice < elementos.size() && elementos.get(indice).compareTo(o) < 0) {
            //Si se encuentra, se incrementa
            indice++;
        }
        //Añade el elemento en la pos. adecuada
        elementos.add(indice, o);
    }

    //Método para obtener un elemento en concreto
    public E get(int indice) {
        //En primer lugar, vemos que sea un indice válido, que entre en el rango
        if (indice < 0 || indice >= elementos.size()) {
            //Si no, lanzará esta excepción
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        //Devuelve el elemento de un indice en concreto
        return elementos.get(indice);
    }

    // Devuelve el tamaño de la lista
    public int size() {
        return elementos.size();
    }

    // Comprueba si la lista está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Elimina el primer elemento encontrado
    public boolean remove(E o) {
        return elementos.remove(o);
    }

    // Devuelve el índice del elemento, o si no se encuentra -1
    public int indexOf(E o) {
        return elementos.indexOf(o);
    }

    //Método toString
    @Override
    public String toString() {
        return elementos.toString();
    }
}