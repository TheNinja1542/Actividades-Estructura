package FIFO;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class ControlColas {
    public static void main(String[] args) {

        byte op = 0;
        Queue<Integer> cola = new LinkedList<>();

        while (op != 4) {
            op = Byte.parseByte(
                    JOptionPane.showInputDialog("""
                            Menu
                            1.Insertar
                            2.Eliminar
                            3.Mostrar
                            4.Salir
                            """));
            switch (op) {
                case 1->{
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor: "));
                    cola.offer(valor);
                    JOptionPane.showMessageDialog(null, "Valor insertado: " + valor);
                }
                case 2->{
                    if (!cola.isEmpty()) {
                        int eliminado = cola.poll();

                        JOptionPane.showMessageDialog(null, "Valor eliminado: " + eliminado);
                    } else {

                        JOptionPane.showMessageDialog(null, "Underflow: Cola vacia");
                    }
                }
                case 3->{
                    if (!cola.isEmpty()) {

                        String mensaje = "Cola:\n";
                        for (Integer elemento : cola) {
                            mensaje += elemento + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {

                        JOptionPane.showMessageDialog(null, "Cola vacia" );
                    }
                }
                case 4->{
                    JOptionPane.showMessageDialog(null, "Gracias" );
                }
            }
        }
    }
}
