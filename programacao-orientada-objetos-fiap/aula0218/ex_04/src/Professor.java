public class Professor {
    String nome;
    int numAula;
    double valHoraAula;

    // Método: criar função para cada cálculo
    // public double calcularBase() {
    // return numAula * 4.5 * valHoraAula;
    // }

    // public double calcularAdicional() {
    // return calcularBase() * 0.05;
    // }

    // public double calcularDescansoSemanal() {
    // return (calcularBase() + calcularAdicional()) / 6;
    // }

    // public double calcularSalarioBruto() {
    // return calcularBase() + calcularAdicional() + calcularDescansoSemanal();
    // }

    public double calcularSalarioBruto() {
        double salBase, adicional, descanso;

        salBase = numAula * 4.5 * valHoraAula;
        adicional = salBase * 0.05;
        descanso = (salBase + adicional) / 6;
        return salBase + adicional + descanso;
    }
}
