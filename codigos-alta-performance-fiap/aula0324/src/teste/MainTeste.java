package teste;

import pilhas.PilhaInt;

import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {
//		--- pilha de inteiros
//		PilhaInt pilha = new PilhaInt();
//		pilha.init();
//		pilha.push(10);
//		pilha.push(12);
//		pilha.push(22);
//		pilha.push(33);
//		pilha.push(44);
//		pilha.push(55);
//		pilha.push(66);
//		pilha.clear();
//		System.out.println(pilha.top());

//		--- converter decimal em binário
//		convertBinary(70);

		System.out.println(palindromo());
	}

	public static void convertBinary(int num) {
		PilhaInt pilha = new PilhaInt();
		while(num!=0) {
			pilha.push(num%2);
			num = num/2;
		}

		pilha.clear();
	}

	public static boolean palindromo() {
		Scanner sc = new Scanner(System.in);
		PilhaInt pilhaAux = new PilhaInt();
		PilhaInt pilhaA = new PilhaInt();
		PilhaInt pilhaB = new PilhaInt();

		System.out.println("Digite um número entre 0 e 9 (negativo encerra o programa):");
		int input = Integer.parseInt(sc.nextLine());
		while(!(input<=9)) {
			System.out.println("Número inválido. Digite um número entre 0 e 9:");
			input = Integer.parseInt(sc.nextLine());
		}

		while(input>=0) {
			pilhaAux.push(input);
			pilhaA.push(input);

			System.out.println("Digite um número entre 0 e 9 (negativo encerra o programa):");
			input = Integer.parseInt(sc.nextLine());
			while(!(input<=9)) {
				System.out.println("Número inválido. Digite um número entre 0 e 9:");
				input = Integer.parseInt(sc.nextLine());
			}
		}

		while(!pilhaAux.isEmpty()) {
			pilhaB.push(pilhaAux.pop());
		}

		boolean palindromo = true;
		while(palindromo && !(pilhaA.isEmpty())) {
			if(!(pilhaA.pop() == pilhaB.pop())) { palindromo = false; }
		}
		return palindromo;
	}

}
