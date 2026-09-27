package EjerciciosCirculares.ListaColauni.Juego;

public class Arquero extends Personaje{
    public Arquero(String nombre, int nivel){
        super(nombre,nivel);
    }
    @Override 
    public void Accion(){
        System.out.println(nombre + " lanza una flecha");
    }
}
