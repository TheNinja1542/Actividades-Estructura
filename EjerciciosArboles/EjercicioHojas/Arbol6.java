package EjerciciosArboles.EjercicioHojas;

public class Arbol6 {
    int valor;
    Arbol6 izquierda;
    Arbol6 derecha;

    Arbol6(int valor){
        this.valor = valor;
    }

    static class ArbolBinario{
        Arbol6 raiz;

        public int ContarHojas(Arbol6 nodo){
            if (nodo == null){
                return 0;
            }

            if(nodo.izquierda == null && nodo.derecha == null){
                return 1;
            }

            return ContarHojas(nodo.izquierda) + ContarHojas(nodo.derecha);
        }
    }
}
