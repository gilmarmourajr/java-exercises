package Ex_04;

public class Main {
    public static void main(String[] args) {
        Funcionario fernando = new Funcionario("Fernando", 1500, "Desenvolvedor");
        System.out.println(fernando);

        fernando.aumentarSalario("Desenvolvedor", 50);
        fernando.aumentarSalario("Designer", 50);
        fernando.promover("Scrum Master");
        System.out.println(fernando);

        fernando.aumentarSalario(10);
        System.out.println(fernando);
    }
}
