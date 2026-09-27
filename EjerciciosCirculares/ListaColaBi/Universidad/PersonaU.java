package EjerciciosCirculares.ListaColaBi.Universidad;

public class PersonaU {
    protected String nombre;
    protected int edad;

    public PersonaU(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void Accion(){
        System.out.println(nombre + " la persona esta hablando");
    }
    public void Informacion(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
}
