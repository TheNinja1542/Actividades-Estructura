package ArbolesEjercicios;

public class Estructura {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        arbol.Insertar(4, "Naranja");
        arbol.Insertar(8, "Manzana");
        arbol.Insertar(1, "Uva");
        arbol.Insertar(7, "Pera");
        arbol.Insertar(9, "Sandia");


        System.out.println("Recorrido en In-Orden");
        arbol.RecorrerPreorden(arbol.raiz);

        System.out.println("Recorrido en In-Orden");
        arbol.RecorrerInorden(arbol.raiz);

        System.out.println("Recorrido en Post-Orden");
        arbol.RecorrerPostorden(arbol.raiz);


    }
}
