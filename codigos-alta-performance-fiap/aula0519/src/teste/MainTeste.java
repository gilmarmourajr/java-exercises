package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		System.out.print("Informe valor positivo para inserir (negativo sair): ");
		int valor = le.nextInt();
		ListaIntCrescente lista = new ListaIntCrescente();
		while (valor>=0) {
			lista.insere(valor);
			lista.mostra();
			System.out.print("Informe valor positivo para inserir (negativo sair): ");
			valor = le.nextInt();
		}
		
		le.close();

	}

}
