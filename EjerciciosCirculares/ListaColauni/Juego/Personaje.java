package EjerciciosCirculares.ListaColauni.Juego;

public class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel){
        this.nombre = nombre; 
        this.nivel = nivel;
    }
    public void Accion(){
        System.out.println("realizo una accion");
    }
    public void Informacion(){
        System.out.println("nombre: " + nombre);
        System.out.println("nivel: " + nivel);
    }
}
