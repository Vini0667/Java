public class Item extends ItemPedido {
    protected double valor;
    protected int codigo;
    
    public Item(String cliente, int codigo, double qtld, double valorUnit, double valor, int codigo2) {
        super(cliente, codigo, qtld, valorUnit);
        this.valor = valor;
        codigo = codigo2;
    }
}