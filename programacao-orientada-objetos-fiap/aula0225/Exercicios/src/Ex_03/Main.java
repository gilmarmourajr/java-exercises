package Ex_03;

public class Main {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto(1, 2);
        Ponto pontoB = new Ponto(4, 6);

        System.out.println("Distância entre pontos A e B: "+pontoA.calcularDistancia(pontoB));
        System.out.println("Distância entre pontos B e A: "+pontoB.calcularDistancia(pontoA));
        System.out.println("Distância entre ponto A e origem: "+pontoA.calcularDistanciaOrigem());
        System.out.println("Distância entre ponto B e origem: "+pontoB.calcularDistanciaOrigem());
        System.out.println("Ponto mais próximo à origem: "+pontoA.compararDistanciaOrigem(pontoB));
        System.out.println("Ponto A: "+pontoA);
        System.out.println("Ponto B: "+pontoB);
    }
}