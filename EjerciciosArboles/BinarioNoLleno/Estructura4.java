package EjerciciosArboles.BinarioNoLleno;

import EjerciciosArboles.BinarioNoLleno.Arbol4.ArbolBinario;

public class Estructura4 {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = new Arbol4(1);
        arbol.raiz.izquierda = new Arbol4(2);
        arbol.raiz.derecha = new Arbol4(3);
        arbol.raiz.izquierda.izquierda = new Arbol4(4);
        //arbol.raiz.izquierda.derecha = new Arbol4(5);
        
        if (arbol.Lleno(arbol.raiz)) {
            System.err.println("Binario lleno");
        } else {
            System.out.println("binario no lleno");
        }
    }
}
