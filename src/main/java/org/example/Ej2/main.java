package org.example.Ej2;

public class main {
    public static void main(String[] args) {
        // Creamos una pila con capacidad para 10 elementos
        PilaArray<Integer> pila = new PilaArray<>(10);
        //Vemos si la pila está vacía
        System.out.println("La pila está vacía?: "+pila.estaVacia());
        System.out.println("Añadiendo elementos a la pila....");
        //Añadimos elementos a la Pila
        pila.aniadir(58);
        pila.aniadir(12);
        pila.aniadir(24);
        pila.aniadir(79);
        pila.aniadir(84);

        //Mostramos estado de la pila
        System.out.println(pila);

        //Sacamos el primer elemento
        System.out.println("Primer elemento: "+pila.primero());
        //Borramos el último de la pila"
        System.out.println("Borramos el último elemento: "+pila.extraer());
        System.out.println(pila);
        //Vemos si la pila está vacía ahora
        System.out.println("La pila está vacía?: "+pila.estaVacia());
    }
}