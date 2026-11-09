package EjerciciosArboles.BinarioPerfecto;

public class Arbol5 {
    int valor;
    Arbol5 izquierda;
    Arbol5 derecha;

    Arbol5(int valor){
        this.valor = valor;
    }

    static class ArbolBinario{
        Arbol5 raiz;

        public boolean Perfecto(Arbol5 nodo){
            int altura = altura(nodo);
            return verificar(nodo,0,altura);
        }
        private int altura(Arbol5 nodo){
            if(nodo == null){
                return -1;
            }
            return 1 +Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        }

        private boolean verificar(Arbol5 nodo, int nivel, int altura){
            if( nodo == null){
                return true;
            }

            if(nodo.izquierda == null && nodo.derecha == null){
                return nivel == altura;
            }
            if(nodo.izquierda == null || nodo.derecha == null){
                return false;
            }

            return verificar(nodo.izquierda, nivel + 1, altura) && verificar(nodo.derecha, nivel + 1, altura);

        }
    }
}
