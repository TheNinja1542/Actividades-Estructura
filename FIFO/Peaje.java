package FIFO;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Peaje {
    public static void main(String[] args) {
        byte op = 0;
        Queue<String> vehiculos = new LinkedList<>();

        while (op != 4){

            op = Byte.parseByte(JOptionPane.showInputDialog("""
                    Menu
                    1.Ingresar vehiculo
                    2.Siguiente vehiculo
                    3.Mostrar vehiculo
                    4.Salir
                    """));

            switch (op) {
                case 1 -> {
                    String placa = JOptionPane.showInputDialog("Digite la placa del vehiculo: ");
                    vehiculos.offer(placa);

                    JOptionPane.showMessageDialog(null, "Vehiculo " + placa + " ingreso a la fila");
                }

                case 2 -> {
                    if (!vehiculos.isEmpty()) {

                        String vehiculo = vehiculos.poll();

                        JOptionPane.showMessageDialog(null,"El vehiculo " + vehiculo +" ha pasado el peaje");

                    } else {

                        JOptionPane.showMessageDialog(null,"No hay vehiculos esperando");
                    }
                }
                case 3 -> {
                    if (!vehiculos.isEmpty()) {

                        String mensaje ="Vehiculos en espera\n";

                        for (String placa : vehiculos) {
                            mensaje += "Placa: " + placa + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay vehiculos en espera");
                    }
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Sistema de peaje finalizado");
                }
            }
        }
    }
}
