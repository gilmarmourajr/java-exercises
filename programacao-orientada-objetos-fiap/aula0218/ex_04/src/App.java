import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Professor> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        DecimalFormat fM = new DecimalFormat("R$###.00");

        int n = 0;
        while (true) {
            arr.add(new Professor());

            System.out.print("Nome (digite 0 para sair):");
            String input = sc.next();

            if (input.equals("0")) {
                break;
            }

            arr.get(n).nome = input;
            System.out.print("N° de aulas semanais: ");
            arr.get(n).numAula = sc.nextInt();
            System.out.print("Valor hora-aula: ");
            arr.get(n).valHoraAula = sc.nextDouble();
            System.out.println("");
            n++;
        }

        sc.close();
        System.out.println("--------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Prof° " + arr.get(i).nome);
            System.out.println("Salário bruto: " + fM.format(arr.get(i).calcularSalarioBruto()));
        }

    }
}
