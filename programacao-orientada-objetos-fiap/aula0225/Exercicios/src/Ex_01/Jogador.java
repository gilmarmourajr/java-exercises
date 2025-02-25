package Ex_01;

public class Jogador {
    public String nome;
    public int[] pontuacao = new int[3];

    public int calcularScoreTotal(){
        int total = 0;
        for(int i : this.pontuacao){
            total+=i;
        }
        return total;
    }

    public String exibirPontuacaoRodada(int contador){
        return "Pontuação na rodada " + (contador+1) + ": " + this.pontuacao[contador];
    }

    public String exibirPontuacaoTotal(){
        return "A pontuação total do jogador " + this.nome + " foi de " + this.calcularScoreTotal() + " pontos.";
    }
}
