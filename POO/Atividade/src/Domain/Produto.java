package Domain;

import java.util.ArrayList;

public class Produto {
    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private ArrayList<Pedido> pedido;

    public Produto(int id, String titulo, String descricao, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        pedido = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco
                + ", pedido=" + pedido + "]";
    }
}