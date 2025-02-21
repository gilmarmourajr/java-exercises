import java.util.Scanner;

public class Exercicio01_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        reduceNumber(num);
        sc.close();
    }

    public static void reduceNumber(int num) {
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
    }
}
