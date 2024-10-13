package org.example.ej4;

public class main {
    public static void main(String[] args) {

        // Crearemos una matriz de Integer con 4 filas y 2 columnas
        Matriz<Integer> matriz = new Matriz<>(4, 2);

        //Mostramos matriz inicial
        System.out.println("Matriz actual (vacía)\n"+matriz);

        System.out.println("Creando matriz...");

        // Rellenamos la matriz con números consecutivos empezando por el 1
        int contador = 1;
        for (int i = 0; i < matriz.filas(); i++) {
            for (int j = 0; j < matriz.columnas(); j++) {
                matriz.set(i, j, contador++);
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz:");
        System.out.println(matriz);

        // Mostramos el contenido en la fila 1-> (la primera será 0), columna 2 ->(será 1 al empezar en 0) ;)
        System.out.println("Contenido en (1,2): " + matriz.get(0, 1));
    }
}
