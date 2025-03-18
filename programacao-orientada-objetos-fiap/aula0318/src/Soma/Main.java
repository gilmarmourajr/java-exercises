package Soma;

public class Main {
    public static void main(String[] args) {
        System.out.println(soma(1,2,3,4,5));
    }

    public static int soma(int ...numbers) {
        int soma = 0;
        for(int num : numbers) {
            soma += num;
        }

        return soma;
    }
}