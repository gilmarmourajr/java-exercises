package aula0217;

import java.util.Scanner;

public class Ex02 {

	static final int N=30;
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] RM = new int[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		
		int numAlunos = entradaDados(RM, nota1, nota2);
		double[] media = new double[numAlunos];
		calculaMedia(nota1, nota2, numAlunos, media);
		
		int[] rmAprovados = new int[numAlunos];
		int numAP = geraListaAprovados(RM, media, rmAprovados, numAlunos);
		
		System.out.println("--- RELATORIO DOS ALUNOS ---");
		
		for(int j=0; j<numAlunos; j++) {
			System.out.println("-- ALUNO "+(j+1));
			System.out.println("RM: "+RM[j]);
			System.out.println("MEDIA: "+media[j]);
		}
		System.out.println("");
		
		System.out.println("--- LISTA DE APROVADOS ---");
		
		for(int j=0; j<numAP; j++) {
			System.out.println("RM: "+rmAprovados[j]);
		}
		
	}
	
	public static int entradaDados(int RM[], double nota1[], double nota2[]) {
		int i=0;
		
		System.out.print("Digite o RM do aluno: ");
		int rm = entrada.nextInt();
		
		while(rm>0 && i<N) {
			RM[i] = rm;
			System.out.print("Digite a nota dos checkpoints do aluno "+rm+": ");
			nota1[i] = entrada.nextDouble();
			System.out.print("Digite a nota das GS do aluno "+rm+": ");
			nota2[i] = entrada.nextDouble();
			i++;
			
			if(i<N) {				
				System.out.print("Digite o RM do aluno: ");
				rm = entrada.nextInt();
			} else {
				System.out.println("Quantidade máxima de alunos excedida.");
			}
		}
		
		System.out.println("");
		return i;
	}
	
	public static void calculaMedia(double nota1[], double nota2[], int n, double media[]){		
		for(int i=0; i<n; i++) {
			media[i] = (nota1[i]+nota2[i])/2;
		}		
	}
	
	public static int geraListaAprovados(int RM[], double media[], int[] listaAP, int numAlunos) {
		int nAP = 0;
		
		for(int i=0; i<numAlunos; i++) {
			if(media[i]>=6) {
				listaAP[nAP] = RM[i];
				nAP++;
			}
		}
		
		return nAP;
	}

}