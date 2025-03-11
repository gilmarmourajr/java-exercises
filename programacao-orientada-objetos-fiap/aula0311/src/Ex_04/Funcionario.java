package Ex_04;

public class Funcionario {
    String nome;
    double salario;
    String cargo;

    public void aumentarSalario(String cargo, double aumento){
        if(this.cargo.equalsIgnoreCase(cargo)){
            this.salario *= (aumento+1);
        }
    }

    public void aumentarSalario(double aumento){
        aumentarSalario(this.cargo, aumento);
    }

    public void promover(String cargo){
        this.cargo = cargo;
    }
}
