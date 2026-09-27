package EjerciciosCirculares.ListaColauni.Vehiculos2;

public class Motos extends Vehiculos{
    public Motos(String marca, int velocidad){
        super(marca, velocidad);
    }
    @Override 
    public void Mover(){
        System.out.println(marca + " moviendose en dos ruedas");
    }
}
