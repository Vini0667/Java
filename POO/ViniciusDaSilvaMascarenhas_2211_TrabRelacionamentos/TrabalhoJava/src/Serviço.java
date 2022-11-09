import javax.swing.JOptionPane;

public class Serviço {
    private String descrição;
    private float valor;
    
    public Serviço(String descrição, float valor) {
        this.descrição = descrição;
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void imprimir () {
        JOptionPane.showMessageDialog(null, "Os dados do serviço são:\nDescrição: " + descrição + "\nValor: " + valor, "DADOS", JOptionPane.INFORMATION_MESSAGE);
    }
}