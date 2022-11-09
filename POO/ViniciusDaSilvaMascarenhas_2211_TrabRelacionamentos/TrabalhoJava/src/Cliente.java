import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private int RG;

    public Cliente (String nome, int RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int rG) {
        RG = rG;
    }

    public void imprimir () {
        JOptionPane.showMessageDialog(null, "Os dados do cliente são:\nNome: " + nome + "\nRG: " + RG, "DADOS", JOptionPane.INFORMATION_MESSAGE);
    }
}