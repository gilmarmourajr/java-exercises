package Ex_04;

import java.text.DecimalFormat;

public class Funcionario {
    String nome;
    double salario;
    String cargo;
    DecimalFormat fM = new DecimalFormat("R$###.00");

    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void aumentarSalario(String cargo, double aumento){
        if(this.cargo.equalsIgnoreCase(cargo)){
            this.salario *= (aumento/100 + 1);
        }
    }

    public void aumentarSalario(double aumento){
        aumentarSalario(this.cargo, aumento);
    }

    public void promover(String cargo){
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.cargo+": " + fM.format(this.salario);
    }
}
