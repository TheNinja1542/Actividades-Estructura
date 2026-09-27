package EjerciciosCirculares.ListaColauni.Zoo2;

public class MainAnimales {
    public static void main(String[] args) {
        ListaAnimales zoologico = new ListaAnimales();
        Animales leon = new Leones("Pepito", 10);
        Animales aguila =  new Aguilas("Flash", 2);
        Animales pinguino = new Pinguinos("Lucas", 3);
        Animales pinguino2 = new Pinguinos("pepe", 4);

        zoologico.Insertar(leon);
        zoologico.Insertar(aguila);
        zoologico.Insertar(pinguino);
        zoologico.Insertar(pinguino2);

        zoologico.recorrer();

        leon.VozAnimal();
        aguila.VozAnimal();
        pinguino.VozAnimal();

    }
}
