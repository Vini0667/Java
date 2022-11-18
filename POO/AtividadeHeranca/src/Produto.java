public class Produto extends Item {
    protected String nome;

    public Produto(String cliente, int codigo, double qtld, double valorUnit, double valor, int codigo2, String nome) {
        super(cliente, codigo, qtld, valorUnit, valor, codigo2);
        this.nome = nome;
    } 
}