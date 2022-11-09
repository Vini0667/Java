package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas;

public abstract class Funcionarios extends Pessoa {
    protected String nome;
    protected double salario;
    
    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public String toString() {
        return "Funcionarios [nome=" + nome + ", salario=" + salario + "]";
    }

    public abstract void calculaBonus ();
}