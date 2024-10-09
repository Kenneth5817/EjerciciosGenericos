package org.example.ej7;

    public interface Operable<E> {
        E sumar(E otro);
        E restar(E otro);
        E multiplicar(E otro);
        E dividir(E otro);

        void setValor(E i);
    }
    
