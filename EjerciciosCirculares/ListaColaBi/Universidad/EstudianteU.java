package EjerciciosCirculares.ListaColaBi.Universidad;

public class EstudianteU extends PersonaU{
    public EstudianteU(String nombre, int edad){
        super(nombre, edad);
    }
    @Override 
    public void Accion(){
        System.out.println(nombre + " esta estudiando");
    }
}
