package LIFO;

import java.util.Stack;

import javax.swing.JOptionPane;

public class CalculadoraLIFO {

    public static void main(String[] args) {
        Stack<Integer> resultados = new Stack<>();

        int resultado = 0;
        Byte op = 0;

        while(op != 5){
            op = Byte.parseByte(JOptionPane.showInputDialog(null, """
                Menu
                1.Sumar
                2.Multiplicar
                3.Deshacer ultima operacion
                4.Historial
                5.Salir
                """));

            switch (op) {
                case 1->{
                    int suma = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                    resultado += suma;
                    JOptionPane.showMessageDialog(null, "resultsdo = " + resultado);
                }
                case 2->{
                    resultados.push(resultado);
                    int multiplicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                    resultado *= multiplicacion;
                    JOptionPane.showMessageDialog(null, "resultado = " + resultado);
                }
                case 3->{
                    if(!resultados.isEmpty()){
                        resultado = resultados.pop();
                        JOptionPane.showMessageDialog(null, "Ultima operacion deshecha");
                        JOptionPane.showMessageDialog(null, "Resultado anterior = " + resultado);
                    }else{
                    JOptionPane.showMessageDialog(null, "sin operaciones para deshacer");
                    }
                }
                    case 4->{
                        JOptionPane.showMessageDialog(null, "Historial");

                    for ( Integer numero : resultados) {
                        JOptionPane.showMessageDialog(null, numero);
                    }
                }
                case 5->{
                    JOptionPane.showMessageDialog(null, "Nos vemos pronto");
                }
            }            
        }
    }
}
