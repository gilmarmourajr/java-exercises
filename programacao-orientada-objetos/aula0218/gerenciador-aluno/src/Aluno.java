public class Aluno {
    // variável global
    // atributo ou propriedade ou variável de instância
    int rm;
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String gerarStatus() {
        double media = calcularMedia();
        if (media >= 6) {
            return "Aprovado";
        }
        if (media >= 4) {
            return "Exame";
        }
        return "Reprovado";
    }
}
