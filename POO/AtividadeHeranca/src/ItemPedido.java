public class ItemPedido extends Pedido {
    protected double qtld;
    protected double valorUnit;
    
    public ItemPedido(String cliente, int codigo, double qtld, double valorUnit) {
        super(cliente, codigo);
        this.qtld = qtld;
        this.valorUnit = valorUnit;
    }
}