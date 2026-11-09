package EjerciciosArboles.BinarioLleno;

public class Arbol3 {
    int valor;
    Arbol3 izquierda;
    Arbol3 derecha;

    Arbol3(int valor){
        this.valor = valor;
    }

    static class ArbolBinario2{
        Arbol3 raiz;

        public boolean Lleno (Arbol3 nodo){
            if (nodo == null) {
                return true;
            }
            
            boolean hayIzquierda = nodo.izquierda != null;
            boolean hayDerecha = nodo.derecha != null;
            if(hayIzquierda != hayDerecha){
                return false;
            }

            return Lleno(nodo.izquierda) && Lleno(nodo.derecha);
        }
    }
}
