package HombreBala;

public class Punto {
    double x;
    double y;

    Punto (double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double distanciaP (Punto a, Punto b){
        double Dx = a.x - b.x;
        double Dy =  a.y - b.y;

        return Math.sqrt(Dx*Dx + Dy*Dy);
    }
}
