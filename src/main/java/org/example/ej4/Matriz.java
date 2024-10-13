package org.example.ej4;
public class Matriz<T> {

    //Atributos
    private T[][] matriz;
    private int filas;
    private int columnas;

    //Constructor de Matriz
    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        // Inicializa matriz con tipo genérico
        matriz = (T[][]) new Object[filas][columnas];
    }

    //Con el set modificaremos y pondremos elemento en fila y columna indicada
    public void set(int fila, int columna, T elemento) {
        //Comprobamos que los índices estén dentro del rango
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            //Si está fuera de rango, lanzamos una excepción
            throw new IndexOutOfBoundsException("Índices fuera de rango");
        }
        //Añade elemento en el lugar indicado
        matriz[fila][columna] = elemento;
    }

    //Con el get sacaremos elemento de una columna y fila indicada
    public T get(int fila, int columna) {
        // Valida que los índices estén dentro del rango
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
            throw new IndexOutOfBoundsException("Índices fuera de rango");
        }
        return matriz[fila][columna]; // Devuelve el elemento en la posición indicada
    }

    //Devuelve la cantidad de columnas que hay en la matriz
    public int columnas() {
        return columnas;
    }

    //Devuelve la cantidad de filas
    public int filas() {
        return filas;
    }

    //Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sb.append(matriz[i][j]);
                if (j < columnas - 1) {
                    sb.append("\t"); // Añade tabulación entre elementos
                }
            }
            sb.append("\n"); // Nueva línea para cada fila
        }
        return sb.toString(); // Devuelve la representación de la matriz
    }
}
