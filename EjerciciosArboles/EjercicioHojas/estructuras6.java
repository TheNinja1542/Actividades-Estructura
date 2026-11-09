package EjerciciosArboles.EjercicioHojas;

import EjerciciosArboles.EjercicioHojas.Arbol6.ArbolBinario;

public class estructuras6 {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = new Arbol6(1);
        arbol.raiz.izquierda = new Arbol6(2);
        arbol.raiz.derecha = new Arbol6(3);
        arbol.raiz.izquierda.izquierda = new Arbol6(4);
        arbol.raiz.izquierda.derecha = new Arbol6(5);
        arbol.raiz.derecha.izquierda = new Arbol6(6);

        System.out.println("Cantidad de hojas: " + arbol.ContarHojas(arbol.raiz));
    }
}
