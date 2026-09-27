package EjerciciosCirculares.ListaColaBi.Universidad;

public class MainU {
    public static void main(String[] args) {
        ListaColaDoble AdministracionU = new ListaColaDoble();

        PersonaU programador = new PersonaU("Andres", 20);
        PersonaU docente = new PersonaU("Michel", 40);
        PersonaU director = new PersonaU("Camila", 49);

        AdministracionU.Insertar(programador);
        AdministracionU.Insertar(docente);
        AdministracionU.Insertar(director);

        System.out.println("cola circular hacia adelante ");
        AdministracionU.Adelante();

        System.out.println("cola circullar hacia atras");
        AdministracionU.Atras();

        programador.Accion();
        docente.Accion();
        director.Accion();
    }
}
