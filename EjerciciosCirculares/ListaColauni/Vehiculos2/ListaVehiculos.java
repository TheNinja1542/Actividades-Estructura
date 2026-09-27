package EjerciciosCirculares.ListaColauni.Vehiculos2;

public class ListaVehiculos {
    private NodoVehiculos ultimVehiculos;

    public void Insertar(Vehiculos vehiculos){
        NodoVehiculos nuevoVehiculos = new NodoVehiculos(vehiculos);

        if(ultimVehiculos == null){
            ultimVehiculos = nuevoVehiculos;
            nuevoVehiculos.siguienteVehiculos = nuevoVehiculos;
        }else{
            nuevoVehiculos.siguienteVehiculos = ultimVehiculos.siguienteVehiculos;
            ultimVehiculos.siguienteVehiculos = nuevoVehiculos;
            ultimVehiculos = nuevoVehiculos;
        }
    }
    public void recorrer(){
        if(ultimVehiculos  == null){
            System.out.println("lista vacia");
            return;
        }
        NodoVehiculos actuaVehiculos = ultimVehiculos.siguienteVehiculos;
        do{
            actuaVehiculos.vehiculos.Informacion();
            actuaVehiculos.vehiculos.Mover();

            actuaVehiculos = actuaVehiculos.siguienteVehiculos;
        }while(actuaVehiculos != ultimVehiculos.siguienteVehiculos);
    }
}
