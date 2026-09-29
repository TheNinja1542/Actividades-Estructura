package LIFO;

import java.util.Stack;

import javax.swing.JOptionPane;

public class HistorialNavegador {
    public static void main(String[] args) {
         
        Stack<String>  historial  = new Stack<>();
        Byte op = 0;

        while (op != 4) {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, """
                Menu
                1. Visitar pagina
                2. Volver a la pagina anterior
                3. Ver pagina actual
                4. Salir 
            """));

            switch (op) {
                case 1 ->{
                   String pagina  = JOptionPane.showInputDialog(null, "Ingrese la pagina");
                   historial.push(pagina);
                   JOptionPane.showMessageDialog(null, "Visitanto: " + pagina );
                }
                case 2->{
                    if(!historial.isEmpty()){
                        historial.pop();

                        JOptionPane.showMessageDialog(null, "Volviendo a: " + historial.peek());
                    }else{
                        JOptionPane.showMessageDialog(null, "Sin paginas visitadas");
                    }
                }
                case 3 ->{
                    if(!historial.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Pagina actual: " + historial.peek());
                    }else{
                        JOptionPane.showMessageDialog(null, "Sin paginas visitadas");
                    }
                }
                case 4 ->{
                    JOptionPane.showMessageDialog(null, "Cerrendo navegador");
                }
            }
        }
    }
}
