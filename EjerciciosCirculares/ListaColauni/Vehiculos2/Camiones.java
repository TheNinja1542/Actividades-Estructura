package EjerciciosCirculares.ListaColauni.Vehiculos2;

public class Camiones extends Vehiculos{
    public Camiones(String marca, int velocidad){
        super(marca, velocidad);
    }
    @Override 
    public void Mover(){
        System.out.println(marca + " moviendose con unos productos");
    }
}
