package org.example.ej4;

public class Ej4Resuelto {
    class Matriz<T> {
        private T[][] matriz;
        private int filas;
        private int columnas;

        @SuppressWarnings("unchecked")
        public Matriz(int filas, int columnas) {
            this.filas = filas;
            this.columnas = columnas;
            matriz = (T[][]) new Object[filas][columnas];
        }

        public void set(int fila, int columna, T elemento) {
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                throw new IndexOutOfBoundsException("Índices fuera de rango");
            }
            matriz[fila][columna] = elemento;
        }

        public T get(int fila, int columna) {
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                throw new IndexOutOfBoundsException("Índices fuera de rango");
            }
            return matriz[fila][columna];
        }

        public int columnas() {
            return columnas;
        }

        public int filas() {
            return filas;
        }

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

        public void main(String[] args) {
            // Crear una matriz de Integer con 4 filas y 2 columnas
            Matriz<Integer> matriz = new Matriz<>(4, 2);

            // Rellenar la matriz con números consecutivos comenzando por el 1
            int contador = 1;
            for (int i = 0; i < matriz.filas(); i++) {
                for (int j = 0; j < matriz.columnas(); j++) {
                    matriz.set(i, j, contador++);
                }
            }

            // Mostrar la matriz
            System.out.println("Matriz:");
            System.out.println(matriz);

            // Mostrar el contenido de la celda en la fila 1, columna 2
            System.out.println("Contenido de la celda en la fila 1, columna 2: " + matriz.get(1, 1));
        }
    }

}
