package EjerciciosCirculares.ListaColauni.Vehiculos2;

public class Vehiculos {
    protected String marca;
    protected int velocidad;

    public Vehiculos(String marca, int velocidad){
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void Informacion(){
        System.out.println("marca: " + marca);
        System.out.println("velocidad: " + velocidad);
    }

    public void Mover(){
        System.out.println("En movimiento");
    }
}
