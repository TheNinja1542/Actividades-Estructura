package EjerciciosCirculares.ListaColauni.Trabajos;

public class Programador extends Empleados{
    public Programador(String nombre, double salarioBase){
        super(nombre, salarioBase);
    }
    @Override 
    public double CalcularSalario(){
        return salarioBase * 100;
    }
}
