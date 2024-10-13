package org.example.Ej3;

public class main {
    public static void main(String[] args) {
        // Crearemos matriz de tipo integer que tendrá 3 filas y 3 columnas
        Matriz <Integer> matriz = new Matriz<>(3, 3);
        //Mostramos matriz inicial
        System.out.println("Matriz actual (vacía)\n"+matriz);

        System.out.println("Creando matriz...");
        //Añadimos elementos especificando fila y columna
        matriz.set(0, 0, 5);
        matriz.set(0, 1, 8);
        matriz.set(0, 2, 1);
        matriz.set(1, 0, 7);
        matriz.set(1, 1, 4);
        matriz.set(1, 2, 24);
        matriz.set(2, 0, 12);
        matriz.set(2, 1, 38);
        matriz.set(2, 2, 10);

        System.out.println("Matriz:");
        System.out.println(matriz);
        //Probamos el método get
        System.out.println("Número (1, 1): " + matriz.get(1, 1));
        System.out.println("Número (2, 1): " + matriz.get(2, 1));
        System.out.println("Número (2, 2): " + matriz.get(2, 2));

        //mostramos el total de filas y columnas
        System.out.println(" ");
        System.out.println("Filas: " + matriz.filas());
        System.out.println("Columnas: " + matriz.columnas());
    }
}

