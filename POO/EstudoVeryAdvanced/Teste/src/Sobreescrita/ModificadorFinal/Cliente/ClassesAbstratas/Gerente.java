package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas;

public class Gerente extends Funcionarios {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente ['" + nome + '\'' + ", " + '\'' + salario + "'].";
    }

    @Override
    public void calculaBonus() {
        salario += salario * .2;
    }

    public void imprime () {
        System.out.println("Imprimindo...\n" + toString());
    }
}