package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas;

public class Dev extends Funcionarios {
    public Dev (String nome, double salario) {
        super (nome, salario);
    }

    @Override
    public String toString() {
        return "Dev ['" + nome + '\'' + ", '" + salario + "'].";
    }

    @Override
    public void calculaBonus() {
        salario += salario * .05;
    }

    public void imprime () {
        System.out.println("Imprimindo...\n" + toString());
    }
}
