package EjerciciosCirculares.ListaColauni.Juego;

public class MainPersonaje {
    public static void main(String[] args) {
        ListaPersonaje lista = new ListaPersonaje();

        Personaje guerrero = new Guerrero("el mata dragones ", 50);
        Personaje mago = new Mago("baltasar ", 15);
        Personaje arquero = new Arquero("falcon ", 10);

        lista.Insertar(guerrero);
        lista.Insertar(mago);
        lista.Insertar(arquero);

        lista.turno();
    }
}
