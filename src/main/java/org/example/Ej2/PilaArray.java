package org.example.Ej2;

public class PilaArray<T> {

    //Getters y Setters
    public T[] getArray() {
        return array;
    }

    public PilaArray(T[] array) {
        this.array = array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    //Atributo Privado Array
    private T []array;

    public static void main (String[]args){
        //Almacamos un array genérico de tipo Integer
        PilaArray<Integer> arrayGenerico=new PilaArray<Integer>(new Integer[]{1,2,3,4,5});

        //Usando un for each, vamos recorriendo e imprimos el resultado por pantalla
        for(Integer integer:arrayGenerico.getArray()){
            System.out.println(integer);
        }

        //En la posicion 3 se tendrá un valor de 558.
        arrayGenerico.getArray()[3]=558;
    }

}
