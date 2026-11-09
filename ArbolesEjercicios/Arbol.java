package ArbolesEjercicios;

public class Arbol {

    Nodo raiz;
    public Arbol(){
        raiz = null;
    }

    public void Insertar(int i, Object frutas){
        Nodo n = new Nodo(i);
        n.contenido = frutas;

        if(raiz == null){
            raiz = n;
        }else{
            Nodo aux = raiz;
            while(aux != null){
                n.padre = aux;
                if(n.llave >= aux.llave){
                    aux = aux.derecha;
                }else{
                    aux = aux.izquierda;
                }
            }
            if(n.llave < n.padre.llave){
                n.padre.izquierda = n;
            }else{
                n.padre.derecha = n;
            }
        }
    }

    public void RecorrerPreorden(Nodo n){
        if(n != null){
            System.out.println("Indice " + n.llave + " frutas " + n.contenido);
            RecorrerPreorden(n.izquierda);
            RecorrerPreorden(n.derecha);
        }
    }

    public void RecorrerInorden(Nodo n){
        if(n != null){
            RecorrerInorden(n.izquierda);
            System.out.println("Indice " + n.llave + " frutas " + n.contenido);
            RecorrerInorden(n.derecha);
        }
    }

    public void RecorrerPostorden(Nodo n){
       if(n != null){
        RecorrerPostorden(n.izquierda);
        RecorrerPostorden(n.derecha);
        System.out.println("Indice " + n.llave + " frutas " + n.contenido);
       }
    }

    private class Nodo{
        public Nodo padre; 
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public Object contenido;

        public Nodo(int indice){
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
            contenido = null;
        }
    }
}