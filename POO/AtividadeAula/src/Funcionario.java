public class Funcionario {
    private int matricula, idade;
    private String nome, cargo;
    private double salario;
    
    public int getMatricula () {
        return matricula;
    }
    
    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }
    
    public int getIdade () {
        return idade;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public String getNome () {
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getCargo () {
        return cargo;
    }
    
    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario () {
        return salario;
    }
    
    public void setSalario (double salario) {
        this.salario = salario;
    }
    
    public Funcionario () {
        salario = 1500;
    }

    public Funcionario (int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Funcionario (int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public void porcentagem (double porcentagemDeAumento) {
        salario += porcentagemDeAumento > 0 ? salario * porcentagemDeAumento / 100 : 0;
    }
}