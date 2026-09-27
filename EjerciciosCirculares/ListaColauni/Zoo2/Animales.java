package EjerciciosCirculares.ListaColauni.Zoo2;

public class Animales {
    protected String nombre; 
    protected int edad;

    public Animales (String nombre, int edad){
        this.nombre = nombre;
        this.edad  = edad ;
    }

    public void VozAnimal(){
        System.out.println("El animal saluda");
    }

    public  void informacionAnimal(){
        System.out.println("Nombre: " + nombre + " edad: " + edad);
    }
    
}