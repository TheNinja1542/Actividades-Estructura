package EjerciciosArboles.BinarioNoLleno;

public class Arbol4 {
    int valor;
    Arbol4 izquierda;
    Arbol4 derecha;

    Arbol4(int valor){
        this.valor = valor;
    }

    static class ArbolBinario{
        Arbol4 raiz;

        public boolean Lleno(Arbol4 nodo){
            if(nodo == null){
                return true;
            }

            boolean HayIzquierda = nodo.izquierda != null;
            boolean HayDerecha = nodo.derecha != null;

            if(HayIzquierda != HayDerecha){
                return false;
            }
            return Lleno(nodo.izquierda) && Lleno(nodo.derecha);
        }
    }
}
