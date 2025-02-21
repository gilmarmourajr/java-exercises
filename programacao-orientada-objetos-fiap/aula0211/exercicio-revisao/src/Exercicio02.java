import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valMax = 0;

        System.out.print("Insira o valor de i: ");
        int i = sc.nextInt();
        System.out.print("Insira o valor de j: ");
        int j = sc.nextInt();

        // for (int cont = i; cont <= j; cont++) {
        // int result = reduceNumber(cont);
        // if (result > valMax) {
        // valMax = result;
        // }
        // }

        while (i <= j) {
            int result = reduceNumber(i);
            if (result > valMax) {
                valMax = result;
            }
            i++;
        }

        System.out.println("O valor máximo foi de: " + valMax);
        sc.close();
    }

    public static int reduceNumber(int num) {
        int numCont = 0;
        while (true) {
            numCont++;
            if (num == 1) {
                break;
            }

            if (num % 2 == 1) {
                num = num * 3 + 1;
            } else {
                num = num / 2;
            }
        }
        return numCont;
    }
}
