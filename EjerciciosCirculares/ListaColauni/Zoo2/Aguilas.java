package EjerciciosCirculares.ListaColauni.Zoo2;

public class Aguilas extends Animales{
    public Aguilas (String nombre, int edad){
        super(nombre, edad);
    }@Override 
    public void VozAnimal(){
        System.out.println(nombre + "Kiaaa");
    }
    public void volar(){
        System.out.println(" esta volando");
    }
}
