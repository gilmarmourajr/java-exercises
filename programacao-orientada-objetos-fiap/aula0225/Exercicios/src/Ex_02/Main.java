package Ex_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno alunoA = new Aluno();
        System.out.print("Insira o nome do aluno: ");
        alunoA.nome = sc.nextLine();

        System.out.print("Insira o RM do aluno: ");
        alunoA.rm = Integer.valueOf(sc.nextLine());

        for(int i=0; i<3; i++){
            System.out.print("Insira o nome da "+(i+1)+"° disciplina: ");
            alunoA.disciplinas[i] = sc.nextLine();

            for(int j=0; j<2; j++){
                System.out.print("Insira a "+(j+1)+" nota de "+ alunoA.disciplinas[i]+": ");
                alunoA.notas[i][j] = Integer.valueOf(sc.nextLine());
            }
            System.out.println("");
        }

        alunoA.calcularStatus();
        alunoA.exibirAluno();

    }
}