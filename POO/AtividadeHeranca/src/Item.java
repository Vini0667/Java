public class Item extends Pedido {
    protected double valor;
    protected int codigo;
    
    public Item(String cliente, int codigo, double valor, int codigo2) {
        super(cliente, codigo);
        this.valor = valor;
        codigo = codigo2;
    }
}