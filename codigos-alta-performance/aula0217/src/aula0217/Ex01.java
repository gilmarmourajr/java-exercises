package aula0217;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[] RM = new int[30];
		double[] nota1 = new double[30];
		double[] nota2 = new double[30];
		double[] media = new double[30];
		int numAlunos = 0, i=0;
		
		System.out.print("Digite o RM do aluno: ");
		int rm = entrada.nextInt();
		while(rm>0) {
			RM[i] = rm;
			System.out.print("Digite a nota dos checkpoints do aluno "+rm+": ");
			nota1[i] = entrada.nextDouble();
			System.out.print("Digite a nota das GS do aluno "+rm+": ");
			nota2[i] = entrada.nextDouble();
			media[i] = (nota1[i]+nota2[i])/2;
			i++;
			
			System.out.print("Digite o RM do aluno: ");
			rm = entrada.nextInt();
		}
		
		System.out.println("--- ENTRADA DE DADOS ENCERRADA ---");
		int[] rmAprovados = new int[numAlunos];
		for(int j=0; i<i; j++) {
			System.out.println("-- ALUNO "+(j+1));
			System.out.println("RM: "+RM[j]);
			System.out.println("MEDIA: "+media[j]);
			if(media[j]>=6) {
				rmAprovados[j] = RM[j];
			}
		}
		
		entrada.close();
	}

}
