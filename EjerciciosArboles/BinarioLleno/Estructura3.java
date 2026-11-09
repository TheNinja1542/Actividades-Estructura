package EjerciciosArboles.BinarioLleno;

import EjerciciosArboles.BinarioLleno.Arbol3.ArbolBinario2;

public class Estructura3 {
    public static void main(String[] args) {
        ArbolBinario2 arbol = new ArbolBinario2();
        arbol.raiz = new Arbol3(1);
        arbol.raiz.izquierda = new Arbol3(2);
        arbol.raiz.derecha = new Arbol3(3);
        arbol.raiz.izquierda.izquierda = new Arbol3(4);
        arbol.raiz.izquierda.derecha = new Arbol3(5);
        arbol.raiz.derecha.izquierda = new Arbol3(6);
        arbol.raiz.derecha.derecha = new Arbol3(7);
        //arbol.raiz.izquierda.izquierda.izquierda = new Arbol3(8);

        System.out.println(arbol.Lleno(arbol.raiz)? "Binario lleno" : "Binario no lleno");
    }
}
