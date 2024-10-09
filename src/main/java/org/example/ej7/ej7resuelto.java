package org.example.ej7;

    public class ej7resuelto {
        public static void main(String[] args) {
            // Crear una clase interna anónima que implemente la interfaz Operable para Integer
            Operable<Integer> operableInteger = new Operable<Integer>() {
                private Integer valor;

                // Método para establecer el valor inicial
                public void setValor(Integer valor) {
                    this.valor = valor;
                }

                @Override
                public Integer sumar(Integer otro) {
                    return valor + otro; // Usa el valor almacenado en lugar de 'this'
                }

                @Override
                public Integer restar(Integer otro) {
                    return valor - otro; // Usa el valor almacenado
                }

                @Override
                public Integer multiplicar(Integer otro) {
                    return valor * otro; // Usa el valor almacenado
                }

                @Override
                public Integer dividir(Integer otro) {
                    if (otro == 0) {
                        throw new ArithmeticException("No se puede dividir por cero");
                    }
                    return valor / otro; // Usa el valor almacenado
                }
            };

            // Establecer el valor inicial
            operableInteger.setValor(10);

            // Probar las operaciones
            Integer b = 5;
            System.out.println("Suma: " + operableInteger.sumar(b));        // 15
            System.out.println("Resta: " + operableInteger.restar(b));      // 5
            System.out.println("Multiplicación: " + operableInteger.multiplicar(b)); // 50
            System.out.println("División: " + operableInteger.dividir(b));  // 2
        }
    }
