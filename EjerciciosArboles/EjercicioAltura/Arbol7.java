package EjerciciosArboles.EjercicioAltura;

public class Arbol7 {
    int valor;
    Arbol7 izquierda;
    Arbol7 derecha;

    Arbol7(int valor){
        this.valor = valor;
    }

    static class ArbolBinario{
        Arbol7 raiz;

        public int altura(Arbol7 nodo){
            if(nodo == null){
                return -1;
            }

            int AlturaIzquierda = altura(nodo.izquierda);
            int AlturaDerecha = altura(nodo.derecha);

            return + 1+ Math.max(AlturaIzquierda, AlturaDerecha);
        }
    }
}
