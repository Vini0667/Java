import javax.swing.JOptionPane;

public class Peça {
    private String descrição;
    private int código;
    private double valor;
    
    public Peça(String descrição, int código, double valor) {
        this.descrição = descrição;
        this.código = código;
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void imprimir () {
        JOptionPane.showMessageDialog(null, "Os dados da peça são:\nDescrição: " + descrição + "\nCódigo: " + código + "\nValor: " + valor, "DADOS", JOptionPane.INFORMATION_MESSAGE);
    }
}
