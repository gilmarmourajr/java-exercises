package Ex_01;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        System.out.print("Insira o nome do jogador: ");
        jogador1.nome = sc.nextLine();

        jogar(jogador1);

        System.out.println("");
        for(int i=0; i<3; i++){
            System.out.println(jogador1.exibirPontuacaoRodada(i));
        }
        System.out.println(jogador1.exibirPontuacaoTotal());

    }

    public static void jogar(Jogador jogador){
        for(int i=0; i<3; i++){
            System.out.print("Quantos pontos o jogador " + jogador.nome + " ganhou na rodada " + (i+1) + "? ");
            jogador.pontuacao[i] = Integer.valueOf(sc.nextLine());
        }
    }
}