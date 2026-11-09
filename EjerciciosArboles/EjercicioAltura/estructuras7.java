package EjerciciosArboles.EjercicioAltura;

import EjerciciosArboles.EjercicioAltura.Arbol7.ArbolBinario;

public class estructuras7 {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = new Arbol7(1);
        arbol.raiz.izquierda = new Arbol7(2);
        arbol.raiz.derecha = new Arbol7(3);
        arbol.raiz.izquierda.izquierda = new Arbol7(4);
        arbol.raiz.derecha.derecha = new Arbol7(5);
        arbol.raiz.izquierda.izquierda.izquierda = new Arbol7(6);

        System.out.println("Altura del arbol: " + arbol.altura(arbol.raiz) + " hojas ");
    }
}
