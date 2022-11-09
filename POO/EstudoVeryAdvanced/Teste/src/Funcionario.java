public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco static Funci");
    }

    {
        System.out.println("Dentro do bloco de inicalização Funci 1");
    }

    {
        System.out.println("Dentro do bloco de inicalização Funci 2");
    }

    public Funcionario (String nome, double salario) {
        super (nome);
        this.salario = salario;
        System.out.println("Dentro do construtor!!! Funci");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimi () {
        super.imprimi();
        System.out.println(salario);
    }

    public void relatorioPagamento () {
        System.out.println("Eu " + this.nome + "Recebi o salario de " + salario);
    }
}