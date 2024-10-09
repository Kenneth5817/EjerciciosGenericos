package org.example.Ej2;

public class Main {
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