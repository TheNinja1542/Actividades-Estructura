package EjerciciosCirculares.ListaColauni.Trabajos;

public class Empleados {
    protected String nombre;
    protected double salarioBase;

    public Empleados(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public double CalcularSalario(){
        return salarioBase;
    }
    public void Informacion(){
        System.out.println("empleado: " + nombre );
        System.out.println("salario: " +  salarioBase);
    }
}
