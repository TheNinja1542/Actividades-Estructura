package EjerciciosArboles.BusquedaAmplitud;

import EjerciciosArboles.BusquedaAmplitud.Arbol2.ArbolBinario;

public class Estructura2 {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = new Arbol2('a');
        arbol.raiz.izquierda = new Arbol2('b');
        arbol.raiz.derecha = new Arbol2('c');
        arbol.raiz.izquierda.izquierda = new Arbol2('d');
        arbol.raiz.izquierda.derecha = new Arbol2('e');
        arbol.raiz.derecha.izquierda = new Arbol2('f');
        
        char buscando = 'k';
        System.out.println("buscando el valor " + buscando);
        boolean encontrar = arbol.busquedaA((buscando));

        System.out.println(encontrar ? "el valor fue encontrado": "no existe");
    }
}
