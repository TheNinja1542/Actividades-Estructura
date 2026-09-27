package EjerciciosCirculares.ListaColauni.Trabajos;

public class MainTrabajo {
    public static void main(String[] args) {
        ListaEmpleados lista = new ListaEmpleados();

        Empleados empleado1 = new Programador("pepe", 100);
        Empleados empleado2 = new Gerente("nicolas", 150);
        Empleados empleado3 = new Disennador("perez", 90);

        lista.Insertar(empleado1);
        lista.Insertar(empleado2);
        lista.Insertar(empleado3);

        lista.recorrer();
    }
}
