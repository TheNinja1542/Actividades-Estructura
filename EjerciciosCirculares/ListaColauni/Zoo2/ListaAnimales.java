package EjerciciosCirculares.ListaColauni.Zoo2;

public class ListaAnimales {
    private NodoAnimal ultimoAnimal;

    public void Insertar(Animales animales){
        NodoAnimal nuevoAnimal = new NodoAnimal(animales);

        if(ultimoAnimal == null){
            ultimoAnimal = nuevoAnimal;
            nuevoAnimal.siguienteAnimal = nuevoAnimal;
        }else{
            nuevoAnimal.siguienteAnimal = ultimoAnimal.siguienteAnimal;
            ultimoAnimal.siguienteAnimal = nuevoAnimal; 
            ultimoAnimal = nuevoAnimal;
        }
    }

    public void recorrer(){
        if(ultimoAnimal == null){
            System.out.println("Lista vacia");
            return; 
        }
        NodoAnimal actulAnimal = ultimoAnimal.siguienteAnimal;

        do{
            actulAnimal.animales.informacionAnimal();
            actulAnimal.animales.VozAnimal();
            
            actulAnimal = actulAnimal.siguienteAnimal;
        }while(actulAnimal != ultimoAnimal.siguienteAnimal);
    }
}
