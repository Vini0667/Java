package Domain;

import java.util.ArrayList;

public class Pedido {
    private static int ip;
    private String data;
    private double valorTotal;
    Cliente cliente;
    ArrayList<ItemPedido> itens;

    public Pedido(int ip, String data, double valorTotal, Cliente cliente) {
        this.ip = ip;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        itens = new ArrayList<>();
    }

    public int getIp() {
        return ip;
    }

    public String getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido [ip=" + ip + ", data=" + data + ", valorTotal=" + valorTotal + ", cliente=" + cliente + ", item="
                + itens + "]";
    }
}