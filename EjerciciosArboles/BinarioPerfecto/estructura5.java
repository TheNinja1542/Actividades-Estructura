package EjerciciosArboles.BinarioPerfecto;

import EjerciciosArboles.BinarioPerfecto.Arbol5.ArbolBinario;

public class estructura5 {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = new Arbol5(1);
        arbol.raiz.izquierda = new Arbol5(2);
        arbol.raiz.derecha = new Arbol5(3);
        arbol.raiz.izquierda.izquierda = new Arbol5(4);
        arbol.raiz.izquierda.derecha = new Arbol5(5);
        arbol.raiz.derecha.izquierda = new Arbol5(6);
        arbol.raiz.derecha.derecha = new Arbol5(7);

        if(arbol.Perfecto(arbol.raiz)){
            System.out.println("Binario perfecto lleno");
        }else{
            System.out.println("Binario no lleno");
        }
    }
}
