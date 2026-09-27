package HombreBala;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HombreBalaMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el inicio en x: ");
        double iniciaX = entrada.nextDouble();

        System.out.print("Ingrese el inicio en y: ");
        double iniciaY = entrada.nextDouble();

        Punto inicio = new Punto(iniciaX, iniciaY);

        System.out.print("Ingrese el destino en x: ");
        double destinoX = entrada.nextDouble();

        System.out.print("Ingrese el destino en y: ");
        double destinoY = entrada.nextDouble();

        Punto destino = new Punto(destinoX, destinoY);

        System.out.print("Ingrese la cantidad de cañones: ");
        int n = entrada.nextInt();

        int total = n + 2;

        Punto[] puntos = new Punto[total];

    
        puntos[0] = inicio;

     
        for (int i = 1; i <= n; i++) {

            System.out.println("Ingresa la posicion x del cañon " + i);
            double x = entrada.nextDouble();

            System.out.println("Ingresa la posicion y del cañon " + i);
            double y = entrada.nextDouble();

            puntos[i] = new Punto(x, y);
        }

   
        puntos[n + 1] = destino;

        double[] distancia = new double[total];

        Arrays.fill(distancia, Double.POSITIVE_INFINITY);

        
        distancia[0] = 0.0;

        
        PriorityQueue<Nodo> prioridad =
                new PriorityQueue<>(Comparator.comparingDouble(a -> a.distancia));

        
        prioridad.add(new Nodo(0, 0.0));

        
        while (!prioridad.isEmpty()) {

            Nodo actual = prioridad.poll();

            int indiceActual = actual.indice;

            System.out.println("Procesado punto: " + indiceActual + " distancia: " + actual.distancia
            );

            if (actual.distancia > distancia[indiceActual]) {
                continue;
            }

        
            if (indiceActual == n + 1) {
                break;
            }

         
            for (int i = 0; i < total; i++) {

                if (i == indiceActual) {
                    continue;
                }

                
                double d = Punto.distanciaP(puntos[indiceActual],puntos[i]
                );

                double tiempo;

               
                if (indiceActual == 0) {

                    tiempo = d / 5.0;

                } else {

                    
                    double corriendo = d / 5.0;

                    
                    double cannon = 2.0 + Math.abs(d - 50.0) / 5.0;

                    
                    tiempo = Math.min(corriendo, cannon);
                }

                
                double nuevaDistancia = distancia[indiceActual] + tiempo;

                
                if (nuevaDistancia < distancia[i]) {

                    distancia[i] = nuevaDistancia;

                    prioridad.add(new Nodo(i, nuevaDistancia)
                    );
                }
            }
        }

        System.out.println("Tiempo minimo:");

        System.out.printf(
                "%.3f segundos%n",
                distancia[n + 1]
        );

        entrada.close();
    }
}