package EjerciciosCirculares.ListaColauni.Trabajos;

public class ListaEmpleados {
    private NodoEmpleado ultimoEmpleado;
    
    public void Insertar(Empleados empleados){
        NodoEmpleado nuevoEmpleado = new NodoEmpleado(empleados);

        if(ultimoEmpleado == null){
            ultimoEmpleado =  nuevoEmpleado;
            nuevoEmpleado.siguienteEmpleado = nuevoEmpleado;
        }else{
            nuevoEmpleado.siguienteEmpleado = ultimoEmpleado.siguienteEmpleado;
            ultimoEmpleado.siguienteEmpleado = nuevoEmpleado;
            ultimoEmpleado = nuevoEmpleado;
        }
    }
    public void recorrer(){
        if(ultimoEmpleado == null){
            System.out.println("lista vacia");
            return;
        }
        NodoEmpleado actualEmpleado = ultimoEmpleado.siguienteEmpleado;

        do{
            actualEmpleado.empleados.Informacion();
            actualEmpleado = actualEmpleado.siguienteEmpleado;
        }while(actualEmpleado != ultimoEmpleado.siguienteEmpleado);
    }
}
