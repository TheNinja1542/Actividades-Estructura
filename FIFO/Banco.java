package FIFO;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Banco {
    public static void main(String[] args) {
        byte op = 0;
        Queue<Integer> fila = new LinkedList<>();

        while (op != 4) {
            op = Byte.parseByte(JOptionPane.showInputDialog("""
                            Menu
                            1. Ingresar Cliente
                            2. Atender cliente
                            3.Mostrar fila
                            4. Salir
                            """));

            switch (op) {
                case 1 -> {
                    int cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del cliente: "));
                    fila.offer(cliente);

                    JOptionPane.showMessageDialog(null, "Cliente " + cliente + " ingresado a la fila" );
                }
                case 2 -> {
                    if (!fila.isEmpty()) {

                        int atendido = fila.poll();
                        JOptionPane.showMessageDialog(null, "Atendiendo al cliente: " + atendido);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay clientes en la fila");
                    }
                }
                case 3 -> {
                    if (!fila.isEmpty()) {

                        String mensaje = "FILA DE CLIENTES\n\n";

                        for (Integer cliente : fila) {
                            mensaje += "Cliente: " + cliente + "\n";
                        }

                        JOptionPane.showMessageDialog(null, mensaje);

                    } else {
                        JOptionPane.showMessageDialog(null, "La fila esta vacia");
                    }
                }

                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
                }
            }
        }
    }
}
