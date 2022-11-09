package Domain;

public class ItemPedido {
    private double precoUnidade;
    private int quantidade;
    private double precoTotal;
    private Produto produto;
    private Pedido pedido;
    
    public ItemPedido(double precoUnidade, int quantidade, Produto produto, Pedido pedido) {
        this.precoUnidade = precoUnidade;
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
    }


    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        return "ItemPedido [precoUnidade=" + precoUnidade + ", quantidade=" + quantidade + ", precoTotal=" + precoTotal
                + ", produto=" + produto + ", pedido=" + pedido + "]";
    }
}