package EjerciciosArboles.BusquedaAmplitud;
import java.util.LinkedList;
import java.util.Queue;

public class Arbol2 {
    char valor;
    Arbol2 derecha;
    Arbol2 izquierda;

    Arbol2(char valor){
        this.valor = valor;
    }

    static class ArbolBinario{
        Arbol2 raiz;

        public boolean busquedaA(char buscar){
            if(raiz == null){
                return false;
            }

            Queue<Arbol2> aux = new LinkedList<>();
            aux.add(raiz);

            while(!aux.isEmpty()){
                Arbol2 nodo = aux.poll();

                System.out.println("Nodo valor=  " + nodo.valor);
                if(nodo.valor == buscar){
                    return true;
                }
                if(nodo.izquierda != null){
                    aux.add(nodo.izquierda);
                }
                if(nodo.derecha != null){
                    aux.add(nodo.derecha);
                }
            }
            return false;
        }
    }
}
