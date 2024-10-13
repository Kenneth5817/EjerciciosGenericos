package ej7;

import org.example.ej7.Operable;
import org.junit.Test;

public class TestOperaciones {

    @Test
    public void testOperaciones() {

        // Creamos una clase interna anónima que implementa la interfaz Operable para Integer
        Operable<Integer> operableInteger = new Operable<Integer>() {

            //Añadimos el método to String
            @Override
            public String toString() {
                return "anonymous Operable{" +
                        "valor=" + valor +
                        '}';
            }

            //Atributo
            private Integer valor;

            //Getter del valor
            public void getValor(Integer valor) {
                this.valor = valor;
            }

            // Setter del valor
            public void setValor(Integer valor) {
                this.valor = valor;
            }

            //Implementamos los diferentes métodos pedido (+-x/)
            @Override
            public Integer sumar(Integer nuevoNum) {
                //Suma 2 valores
                return valor + nuevoNum;
            }

            @Override
            public Integer restar(Integer nuevoNum) {
                //Resta el valor con el nuevo numero introducido
                return valor - nuevoNum;
            }

            @Override
            public Integer multiplicar(Integer nuevoNum) {
                //Multiplica un valor por el otro introducido por usuario
                return valor * nuevoNum;
            }

            @Override
            public Integer dividir(Integer nuevoNum) {
                //Si el numero nuevo es 0
                if (nuevoNum == 0) {
                    //mostrará la siguiente excepción
                    throw new ArithmeticException("No se puede dividir por cero");
                }
                //si no, devolverá el resultado
                return valor / nuevoNum;
            }
        };

        //pOnemos el valor del número con el que ahora haremos las operaciones.
        operableInteger.setValor(10);

        // Probamos las operaciones
        //Para ello, pondremos por ej.  de valor 2 al num2
        Integer num2 = 2;

        //Mostramos por pantalla los 2 números
        System.out.println("Num1: "+operableInteger);
        System.out.println("Num2: "+num2);

        System.out.println(" ");
        //Por último mostramos las operaciones
        System.out.println("OPERACIONES");
        System.out.println("Suma: " + operableInteger.sumar(num2));
        System.out.println("Resta: " + operableInteger.restar(num2));
        System.out.println("Multiplicación: " + operableInteger.multiplicar(num2));
        System.out.println("División: " + operableInteger.dividir(num2));
    }
}