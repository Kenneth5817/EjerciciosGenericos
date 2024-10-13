package org.example.ej6;

public class main {
    //Método main para probar la clase
    public static void main(String[] args) {
        //Creamos una ListaOrdenada de tipo Integer
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();

        // Vemos si la lista está vacía antes de añadir números
        System.out.println("¿Lista vacía? " + lista.isEmpty());

        // Añadimos elementos a la lista
        lista.add(5);
        lista.add(24);
        lista.add(84);
        lista.add(12);
        lista.add(11);
        lista.add(79);

        // Vemos si la lista está vacía
        System.out.println("¿Lista vacía? " + lista.isEmpty());

        //Mostramos la lista
        System.out.println("Lista ordenada: " + lista);

        //Obtenemos un elemento en concreto por ej. indice 1
        System.out.println("Elemento en índice 2: " + lista.get(1));

        //Sacamos el tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.size());

        // Borramos un elemento
        lista.remove(24);
        System.out.println("Lista después de eliminar 3: " + lista); //

        // Obtenemos el índice de elementos en concreto
        System.out.println("Índice de 5: " + lista.indexOf(5));
        System.out.println("Índice de 84: " + lista.indexOf(84));
    }
}


