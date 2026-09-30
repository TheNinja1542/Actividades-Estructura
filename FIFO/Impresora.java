package FIFO;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Impresora {
    public static void main(String[] args) {

        byte op = 0;

        Queue<String> documentos = new LinkedList<>();

        while (op != 4) {
            op = Byte.parseByte(
                    JOptionPane.showInputDialog("""
                            Menu
                            1. Agregar documento
                            2.  Imprimir documento
                            3. Mostraar documentos
                            4. Salir
                            """));

            switch (op) {
                case 1 -> {
                    String documento = JOptionPane.showInputDialog("Digite el nombre del documento: ");

                    documentos.offer(documento);

                    JOptionPane.showMessageDialog(null, "Documento agregado: " + documento);
                }
                case 2 -> {
                    if (!documentos.isEmpty()) {

                        String documento = documentos.poll();

                        JOptionPane.showMessageDialog(null, "Imprimiendo: " + documento);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay documentos para imprimir");
                    }
                }
                case 3 -> {
                    if (!documentos.isEmpty()) {

                        String mensaje = "Pendientes: \n";

                        for (String documento : documentos) {
                            mensaje += documento + "\n";
                        }

                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay documentos pendientes");
                    }
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}
