package Ex_04;

import java.util.Scanner;

public class Main {
    static int numFuncionarios = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[2];
        int selecao = 0;

        while(selecao != 4){
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Pesquisar funcionário");
            System.out.println("3 - Listar funcionários");
            System.out.println("4 - Finalizar");
            selecao = Integer.parseInt(sc.nextLine());

            while(!(selecao>=1 && selecao<=4)){
                System.out.println("Insira um número de 1 a 4.");
                System.out.println("1 - Cadastrar funcionário");
                System.out.println("2 - Pesquisar funcionário");
                System.out.println("3 - Listar funcionários");
                System.out.println("4 - Finalizar");
                selecao = Integer.parseInt(sc.nextLine());
            }
            System.out.println();

            if (selecao == 1) {
                if(numFuncionarios < funcionarios.length){
                    cadastrarFuncionario(funcionarios, sc);
                    numFuncionarios++;
                } else System.out.println("Capacidade máxima de cadastros atingida!");
            }
            if (selecao == 2) pesquisarFuncionario(funcionarios, sc);
            if (selecao == 3) listarFuncionarios(funcionarios);
        }
        sc.close();
    }

    public static void cadastrarFuncionario(Funcionario[] f, Scanner sc){
        System.out.print("Insira o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Insira o cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Insira o salário (em R$): ");
        double salario = Double.parseDouble(sc.nextLine());
        System.out.println();

        f[numFuncionarios] = new Funcionario(nome, salario, cargo);
        System.out.println(numFuncionarios);
    }

    public static void pesquisarFuncionario(Funcionario[] f, Scanner sc){
        if(numFuncionarios == 0){
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }

        System.out.println("Insira o nome do funcionário a ser buscado: ");
        String busca = sc.nextLine();
        boolean encontrado = false;

        if(busca.isEmpty()){
            System.out.println("Insira o nome do funcionário a ser buscado: ");
        }

        for(int i=0; i<numFuncionarios; i++){
            if(f[i].nome.equalsIgnoreCase(busca)){
                System.out.println(f[i]);
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("Nenhum resultado encontrado.");
        }

        System.out.println();
    }

    public static void listarFuncionarios(Funcionario[] f){
        if(numFuncionarios == 0){
            System.out.println("Nenhum funcionário cadastrado!");
            return;
        }

        for(int i=0; i<numFuncionarios; i++){
            System.out.println(f[i]);
        }
        System.out.println();
    }
}
