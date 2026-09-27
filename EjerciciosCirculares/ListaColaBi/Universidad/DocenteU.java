package EjerciciosCirculares.ListaColaBi.Universidad;

public class DocenteU extends PersonaU{
    public DocenteU(String nombre, int edad){
        super(nombre, edad);
    }
    @Override 
    public void Accion(){
        System.out.println(nombre + " esta dando clases");
    }
}
