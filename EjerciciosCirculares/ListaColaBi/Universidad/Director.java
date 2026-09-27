package EjerciciosCirculares.ListaColaBi.Universidad;

public class Director extends PersonaU{
    public Director(String nombre, int edad){
        super(nombre, edad);
    }
    @Override 
    public void Accion(){
        System.out.println(nombre + " esta trabajando para mejorar la universidad");
    }
}