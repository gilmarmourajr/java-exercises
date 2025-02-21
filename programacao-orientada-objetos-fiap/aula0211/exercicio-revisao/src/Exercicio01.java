import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        while (true) {
            System.out.print(num + " ");
            if (num == 1) {
                break;
            }

            if (num % 2 == 1) {
                num = num * 3 + 1;
            } else {
                num = num / 2;
            }
        }
        entrada.close();
    }
}
