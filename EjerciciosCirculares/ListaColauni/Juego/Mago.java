package EjerciciosCirculares.ListaColauni.Juego;

public class Mago extends Personaje{
    public Mago(String nombre, int nivel){
        super(nombre, nivel);
    }
    @Override 
    public void Accion(){
        System.out.println(nombre + " lanza un hechizo");
    }
}
