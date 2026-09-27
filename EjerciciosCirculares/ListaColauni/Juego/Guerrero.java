package EjerciciosCirculares.ListaColauni.Juego;

 public class Guerrero extends Personaje{
    public Guerrero(String nombre, int nivel){
        super(nombre, nivel);
    }
    @Override 
    public void Accion(){
        System.out.println(nombre + "golpea con su espada");
    }
 }