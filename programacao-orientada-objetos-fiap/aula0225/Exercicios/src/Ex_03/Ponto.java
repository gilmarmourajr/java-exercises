package Ex_03;

public class Ponto {
    double x;
    double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+this.x+", "+this.y+")";
    }

    public double calcularDistancia(Ponto a) {
        return Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2));
    }

    public double calcularDistanciaOrigem(){
        Ponto origem = new Ponto(0, 0);
        return this.calcularDistancia(origem);
    }

/*    public Ponto compararDistanciaOrigem(Ponto b){
        double distanciaThis = this.calcularDistanciaOrigem();
        double distanciaB = b.calcularDistanciaOrigem();

        if(distanciaThis<distanciaB){
            return this;
        }

        return b;
    }
    */

    public static Ponto maisPertoDaOrigem(Ponto a, Ponto b){
        double distanciaA = a.calcularDistanciaOrigem();
        double distanciaB = b.calcularDistanciaOrigem();

        if(distanciaA<distanciaB){
            return a;
        }

        return b;
    }
}
