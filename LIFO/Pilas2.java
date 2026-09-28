package LIFO;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Pilas2 {
    public static void main(String[] args) {


        Byte op = 0;
        Stack<Integer> pila = new Stack<>();

        while (op != 5) {
            op = Byte.parseByte(JOptionPane.showInputDialog("""
                Digite un numero
                1.Insertar
                2.Eliminar
                3.Mostrar
                4.Contar elementos
                5.Salir
            """));
            
            switch (op) {
                case 1 ->{
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: "));
                    pila.push(valor);
                    
                }
                case 2 ->{
                    if(!pila.isEmpty()){
                        int eliminar = pila.pop();
                        JOptionPane.showMessageDialog(null, "Valor eliminado: " + eliminar);
                    }else{
                        JOptionPane.showMessageDialog(null, "pila vacia");
                    }
                }
                case 3 ->{
                    if(!pila.isEmpty()){
                        String mensaje = "Pila:\n";
                        for(int i = pila.size() -1; i >=0; i--){
                            mensaje += pila.get(i) + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                    }else{
                        JOptionPane.showMessageDialog(null, "pila vacia");
                    }
                }
                case 4 ->{
                    int contador = 0;
                    int tope =  pila.peek();

                    while( tope != 0){
                        contador ++;
                        tope--;
                    }
                    JOptionPane.showMessageDialog(null, "Cantidad de elementos: " + contador);
                }
                case 5 ->{
                    JOptionPane.showMessageDialog(null, "Hasta la vista ");
                }
            }
        }            
    }
}
 