package EjerciciosCirculares.ListaColauni.Vehiculos2;

public class MainVehiculos {
    public static void main(String[] args) {
        ListaVehiculos lista = new ListaVehiculos();

        Vehiculos carro =  new Carros("ford", 150);
        Vehiculos moto = new Motos("kawasaki", 20);
        Vehiculos camion = new Camiones("toyota", 100);

        lista.Insertar(carro);
        lista.Insertar(moto);
        lista.Insertar(camion);

        lista.recorrer();
    }
}
