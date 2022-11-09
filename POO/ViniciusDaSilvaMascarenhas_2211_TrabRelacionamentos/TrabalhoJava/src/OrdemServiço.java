import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OrdemServiço {
    private int código;
    private String data;
    
    private Cliente cliente1;
    private Carro carro1;
    
    private ArrayList<Peça> peças;
    private ArrayList<Serviço> serviços;
    
    public OrdemServiço (int código, String data, Cliente cliente1, Carro carro1) {
        this.código = código;
        this.data = data;
        this.cliente1 = cliente1;
        this.carro1 = carro1;
        peças = new ArrayList<>();
        serviços = new ArrayList<>();
    }

    public double valorTotal () {
        return valorPeças() + valorServiços();
    }

    public double valorServiços () {
        double soma = 0;
        for (Serviço serviço : serviços) soma += serviço.getValor();

        return soma;
    }

    public double valorPeças () {
        double soma = 0;
        for (Peça peça : peças) soma += peça.getValor();

        return soma;
    }

    public void adicionaServiço (Serviço serviço) {
        serviços.add (serviço);
    }

    public void adicionaPeça (Peça peça) {
        peças.add (peça);
    }

    public void imprimir () {
        JOptionPane.showMessageDialog (null, "Os dados da ordem de serviço são:\nCódigo: " + código + "\nData: " + data, "DADOS",  JOptionPane.INFORMATION_MESSAGE);

        cliente1.imprimir();
        carro1.imprimir();

        for (int i = 0; i < peças.size (); i++) peças.get(i).imprimir();

        for (int i = 0; i < serviços.size(); i++) serviços.get(i).imprimir();            

        JOptionPane.showMessageDialog(null, "Os custos com peças foram: " + valorPeças() + "\nOs custos com os serviços foram: " + valorServiços() + "\nLogo o total foi de: " + valorTotal(), "DADOS", JOptionPane.INFORMATION_MESSAGE);
    }

    public Peça getPeças (int index) {
        return peças.get(index);
    }

    public Serviço getServiço (int index) {
        return serviços.get(index);
    }

    public void setPeças (Peça peça) {
        peças.add (peça);
    }

    public void setPeças (int i, Peça peça) {
        peças.add(i, peça);
    }

    public void setServiços (Serviço serviço) {
        serviços.add(serviço);
    }

    public void setServiços (int i, Serviço serviço) {
        serviços.add(i, serviço);
    }

    public int getCódigo () {
        return código;
    }

    public void setCódigo (int código) {
        this.código = código;
    }

    public String getData () {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
