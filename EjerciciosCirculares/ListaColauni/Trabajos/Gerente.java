package EjerciciosCirculares.ListaColauni.Trabajos;

public class Gerente extends Empleados{
    public Gerente(String nombre, double salarioBase){
        super(nombre, salarioBase);
    }
    @Override 
    public double CalcularSalario(){
        return salarioBase * 200;
    }
}
