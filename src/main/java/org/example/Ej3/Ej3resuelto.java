package org.example.Ej3;

public class Ej3resuelto {
    class Matriz<T> {
        private T[][] matriz;
        private int filas;
        private int columnas;

        @SuppressWarnings("unchecked")
        public Matriz(int filas, int columnas) {
            this.filas = filas;
            this.columnas = columnas;
            // Inicializa la matriz con el tipo genérico
            matriz = (T[][]) new Object[filas][columnas];
        }

        public void set(int fila, int columna, T elemento) {
            // Valida que los índices estén dentro del rango
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                throw new IndexOutOfBoundsException("Índices fuera de rango");
            }
            matriz[fila][columna] = elemento; // Inserta el elemento en la posición indicada
        }

        public T get(int fila, int columna) {
            // Valida que los índices estén dentro del rango
            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
                throw new IndexOutOfBoundsException("Índices fuera de rango");
            }
            return matriz[fila][columna]; // Devuelve el elemento en la posición indicada
        }

        public int columnas() {
            return columnas; // Devuelve el número de columnas
        }

        public int filas() {
            return filas; // Devuelve el número de filas
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
            // Ejemplo de uso de la clase Matriz
            Matriz<Integer> matriz = new Matriz<>(3, 3);
            matriz.set(0, 0, 1);
            matriz.set(0, 1, 2);
            matriz.set(0, 2, 3);
            matriz.set(1, 0, 4);
            matriz.set(1, 1, 5);
            matriz.set(1, 2, 6);
            matriz.set(2, 0, 7);
            matriz.set(2, 1, 8);
            matriz.set(2, 2, 9);

            System.out.println("Matriz:");
            System.out.println(matriz);
            System.out.println("Elemento en (1, 1): " + matriz.get(1, 1)); // Debería devolver 5
            System.out.println("Filas: " + matriz.filas()); // 3
            System.out.println("Columnas: " + matriz.columnas()); // 3
        }
    }

}
