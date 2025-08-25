package aplicacao;

import arvores.ABBint;

import java.util.Scanner;

public class MenuABB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ABBint abb = new ABBint();
        int opcao;
        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir 1 valor na ABB");
            System.out.println("2 - Apresenta ABB em ordem");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Encerrando a execução");
                    break;
                case 1:
                    System.out.println("Informe o valor a ser inserido: ");
                    int valor = sc.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    abb.show(abb.root);
                    break;
                default:
                    System.out.println("Opção inválida");;
            }
        } while (opcao != 0);

        sc.close();
    }
}
