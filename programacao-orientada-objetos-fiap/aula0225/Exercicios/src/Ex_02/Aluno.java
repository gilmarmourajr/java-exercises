package Ex_02;

public class Aluno {
    String nome;
    int rm;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][2];
    double[] media = new double[3];
    boolean[] aprovado = new boolean[3];


    public void calcularStatus(){
        for(int i=0; i<3; i++){
            int somaNotas = 0;
            for(int j=0; j<2; j++){
                somaNotas+=this.notas[i][j];
            }
            this.media[i] = 1.0 * somaNotas / 2;
            if(this.media[i]>=6){
                this.aprovado[i] = true;
            }
        }
    }

    public void exibirAluno(){
        System.out.println("--- ALUNO "+this.nome);
        for(int i=0; i<3; i++){
            if(this.aprovado[i]){
                System.out.println("Disciplina "+this.disciplinas[i]+": Média "+this.media[i]+" - Aprovado");
            } else{
                System.out.println("Disciplina "+this.disciplinas[i]+": Média "+this.media[i]+" - Reprovado");
            }
        }
    }
}
