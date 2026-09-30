package FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();

        System.out.println("La cola esta vacia: " + cola.isEmpty());

        cola.offer(1);
        cola.offer(2);
        cola.offer(3);

        for (Integer elemento : cola) {
            System.out.println(elemento);
        }

        System.out.println("Cola: " + cola);

        System.out.println("La cola esta vacia? : " + cola.isEmpty());

        System.out.println("Primer dato ingresado: " + cola.peek());

        cola.poll();

        System.out.println("Cola despues de eliminar el primer dato: ");

        System.out.println(cola);
    }
}
