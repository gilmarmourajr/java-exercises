import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.nome = sc.next();
        System.out.print("RM: ");
        a.rm = sc.nextInt();
        System.out.print("Nota dos checkpoints: ");
        a.nota1 = sc.nextDouble();
        System.out.print("Nota dos Sprints: ");
        a.nota2 = sc.nextDouble();
        System.out.println("");

        System.out.println(a.nome + ", RM " + a.rm);
        System.out.println("Média: " + a.calcularMedia() + " - " + a.gerarStatus());
        sc.close();
    }
}
