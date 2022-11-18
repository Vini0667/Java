public class Produto extends Item {
    protected String nome;

    public Produto(String cliente, int codigo, double valor, int codigo2, String nome) {
        super(cliente, codigo, valor, codigo2);
        this.nome = nome;
    }
}