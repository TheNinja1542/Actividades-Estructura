package LIFO;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<>();    

        System.out.println("la lista esta vacia? : " + pila.isEmpty());

        pila.push(1);
        pila.push(2);
        pila.push(3);

        for(Integer listaPila : pila){
            System.out.println(listaPila);
        }

        System.out.println("pila: " + pila);
        System.out.println("la pila esta vacia ?: " + pila.isEmpty());

        System.out.println("eliminacion del ultimo dato ingresado: " + pila.peek());
        pila.pop();
        System.out.println("lista: ");
        System.out.println(pila);


    }
}
