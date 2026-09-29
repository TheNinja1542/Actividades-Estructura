package LIFO;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Pila3 {
    public static void main(String[] args) {
        Byte op = 0;
        int i;
        Stack<Integer> pila2 = new Stack<>();

        while(op != 6){
            op = Byte.parseByte(JOptionPane.showInputDialog("""
                Digite un numero
                1. Ingresar
                2. Eliminar
                3. Mostrar
                4. Invertir pila
                5. Mostrar pila invertida
                6. Salir
            """));

            switch (op) {
                case 1 -> {
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor "));
                    pila2.push(valor);
                }
                case 2 -> {
                    if(!pila2.isEmpty()){
                        int eliminar = pila2.pop();
                        JOptionPane.showMessageDialog(null, "Valor eliminado " + eliminar);
                    }else{
                        JOptionPane.showMessageDialog(null, "Pila vacia");
                    }
                }
                case 3 ->{
                    if(!pila2.isEmpty()){
                        String mensaje = "Pila: \n";
                        for ( i = pila2.size() -1; i >= 0; i--){
                            mensaje += pila2.get(i) + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                    }else{
                        JOptionPane.showMessageDialog(null, "ppila vacia");
                    }
                }
                case 4 ->{
                    if(pila2.peek() != -1){
                    Stack<Integer> auxiliar = new Stack<>();

                        while(!pila2.isEmpty()){
                        auxiliar.push(pila2.pop());
                        }
                        pila2 = auxiliar;

                        JOptionPane.showMessageDialog(null, "la pila ha sido invertida");
                    }else{
                        JOptionPane.showMessageDialog(null, "pila vacia");
                    }
                }
                case 5 ->{
                    if(!pila2.isEmpty()){

                        String mensaje = "pila invertida: \n";

                        for ( i = 0; i < pila2.size(); i ++){
                            mensaje += pila2.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(null, mensaje);
                    }else{
                        JOptionPane.showMessageDialog(null, "pila vacia");
                    }
                }
                case 6->{
                    JOptionPane.showMessageDialog(null, "Chaolin pinguin");
                }
            }
        }
    
    }
}