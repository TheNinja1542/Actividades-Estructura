package EjerciciosCirculares.ListaColauni.Trabajos;

public class Disennador extends Empleados{
    public Disennador(String nombre, double salarioBase){
        super(nombre, salarioBase);
    }
    @Override 
    public double CalcularSalario(){
        return salarioBase * 300;
    }
}
