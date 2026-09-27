package EjerciciosCirculares.ListaColauni.Vehiculos2;

public class Carros extends Vehiculos{
    public Carros(String marca, int velocidad){
        super(marca, velocidad);
    }
    @Override 
    public void Mover(){
        System.out.println(marca + " moviendose en cuatro ruedas");
    }
}
