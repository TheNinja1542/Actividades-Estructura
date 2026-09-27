package EjerciciosCirculares.ListaColauni.Zoo2;

public class Leones extends Animales{
    public Leones ( String nombre, int edad){
        super(nombre, edad);
    }

    @Override 
    public void VozAnimal(){
        System.out.println(nombre + "Roaar");
    }
}
