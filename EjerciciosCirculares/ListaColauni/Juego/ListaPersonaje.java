package EjerciciosCirculares.ListaColauni.Juego;

public class ListaPersonaje {
    private NodoPersonaje ultimoPersonaje;

    public void Insertar(Personaje personaje){
        NodoPersonaje nuevoPersonaje = new NodoPersonaje(personaje);

        if(ultimoPersonaje ==  null){
            ultimoPersonaje = nuevoPersonaje;
            nuevoPersonaje.siguientePersonaje =  nuevoPersonaje;
        }else{
            nuevoPersonaje.siguientePersonaje = ultimoPersonaje.siguientePersonaje;
            ultimoPersonaje.siguientePersonaje = nuevoPersonaje;
            ultimoPersonaje = nuevoPersonaje; 
        }
    }
    public void turno(){
        if(ultimoPersonaje == null){
            System.out.println("lista vacia");
            return;
        }
        NodoPersonaje actualPersonaje = ultimoPersonaje.siguientePersonaje;

        do{
            actualPersonaje.personaje.Informacion();
            actualPersonaje.personaje.Accion();
            actualPersonaje = actualPersonaje.siguientePersonaje;
        }while(actualPersonaje != ultimoPersonaje.siguientePersonaje);
    }
}
