package Source;

public class PessoaFisica extends Pessoa {
    protected String cpf;

    public PessoaFisica(String cpf, int codigo, String nome) {
        super (codigo, nome);
        this.cpf = cpf;
    }
}