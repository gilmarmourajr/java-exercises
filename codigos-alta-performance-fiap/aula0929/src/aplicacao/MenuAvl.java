package aplicacao;

import java.util.Scanner;

import arvores.AVLint;

public class MenuAvl {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		AVLint avl = new AVLint();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Mostra FB de cada no");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado");
				break;
			case 1:
				System.out.println("Informe valor a ser inserido: ");
				int valor = le.nextInt();
				avl.root = avl.inserirAVL(avl.root, valor);
				avl.atualizaAlturas(avl.root);
				break;
			case 2:
				System.out.println("Apresentacao da AVL");
				avl.mostraFB(avl.root);
				break;
			default:
				System.out.println("Opcao Invalida");
			}

		} while (opcao != 0);

		le.close();
	}

}
