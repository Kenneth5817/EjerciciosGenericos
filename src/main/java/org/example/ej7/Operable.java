package org.example.ej7;

    //Creamos interfaz, los métodos se desarrollan en el Test Operaciones en la clase interna anónima
    public interface Operable<E> {
        //Métodos de operaciones que usaremos
        E sumar(E num2);
        E restar(E num2);
        E multiplicar(E num2);
        E dividir(E num2);

        //Para poner el valor de E
        void setValor(E num);
    }
    
