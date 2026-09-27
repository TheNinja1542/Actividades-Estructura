package EjerciciosCirculares.ListaColauni.Zoo2;

public class Pinguinos extends Animales{
    public Pinguinos (String nombre, int edad){
        super(nombre, edad);
    }
    @Override 
    public void VozAnimal(){
        System.out.println(nombre + " gaaak");
    }
}
