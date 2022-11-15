public class PessoaJuridica extends Pessoa {
    protected String cnpj;

    public PessoaJuridica(String cnpj, int codigo, String nome) {
        super (codigo, nome);
        this.cnpj = cnpj;
    }
}
