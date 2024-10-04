package org.example.Ej2;

public class ArrayGenerico<T> {
    public T[] getArray() {
        return array;
    }

    public ArrayGenerico(T[] array) {
        this.array = array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    private T []array;

    public static void main (String[]args){
        ArrayGenerico<Integer> arrayGenerico=new ArrayGenerico<Integer>(new Integer[]{1,2,3,4,5});

        for(Integer integer:arrayGenerico.getArray()){
            System.out.println(integer);
        }

        arrayGenerico.getArray()[3]=1000;
    }

}
