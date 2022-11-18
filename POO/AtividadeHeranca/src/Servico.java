public class Servico extends Item {
    protected String decricao;

    public Servico(String cliente, int codigo, double qtld, double valorUnit, double valor, int codigo2,
            String decricao) {
        super(cliente, codigo, qtld, valorUnit, valor, codigo2);
        this.decricao = decricao;
    }
}