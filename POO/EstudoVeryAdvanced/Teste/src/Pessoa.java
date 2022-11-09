import javax.swing.JOptionPane;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco static Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicalização 1 Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicalização 2  Pessoa");
    }

    public Pessoa (String nome) {
        System.out.println("Dentro do construtor!! Pessoa");
        this.nome = nome;
    }

    public Pessoa (String nome, String cpf) {
        this(nome);
        CPF = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

   public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimi () {
        JOptionPane.showMessageDialog (null, nome + "\n" + CPF + "\n" + endereco.getRua() + "\n" + endereco.getCEP());
    }
}