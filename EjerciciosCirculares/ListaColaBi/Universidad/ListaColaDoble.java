package EjerciciosCirculares.ListaColaBi.Universidad;

public class ListaColaDoble {
    private NodoU inicioU;
    private NodoU finU;

    public void Insertar(PersonaU personaU){
        NodoU nuevoU = new NodoU(personaU);

        if(inicioU == null){
            inicioU = nuevoU;
            finU = nuevoU;

            nuevoU.siguienteU = nuevoU;
            nuevoU.anteriorU = nuevoU;
        }else{
            nuevoU.anteriorU = finU;
            nuevoU.siguienteU = inicioU;
            finU.siguienteU = nuevoU; 
            inicioU.anteriorU = nuevoU; 
            finU = nuevoU;
        }
    }
    public void Adelante(){
        if( inicioU == null){
            System.out.println("lista vacia");
            return;
        }
        NodoU actualU = inicioU;
        do{
            actualU.personaU.Informacion();
            actualU.personaU.Accion();

            actualU = actualU.siguienteU;
        }while(actualU != inicioU);
    }

    public void Atras(){
        if(finU == null){
            System.out.println("lista vacias");
            return;
        }
        NodoU actualU = finU;
        do{
            actualU.personaU.Informacion();
            actualU.personaU.Accion();

            actualU = actualU.anteriorU;
        }while(actualU != finU);
    }
}
