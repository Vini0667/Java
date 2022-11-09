import javax.swing.JOptionPane;

public class Produtos {
     private String descricao, validade;
     private int cod;
     private double valor;

    public void entradaDados () {
        cod = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o codigo do produto:"));
        valor = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite o valor do produto:"));
        descricao = JOptionPane.showInputDialog(null, "Digite a descrição do produto:");
        validade = JOptionPane.showInputDialog(null, "Digite a validade do produto:");
    }
    
    public void imprimir () {
        JOptionPane.showMessageDialog(null, "O codigo do prduto e: " + cod + "\nValidade: " + validade + "\nDescricao: " + descricao + "\nValor: " + valor);
    }

    public void alteraPreco (double valorNovo) {
        this.valor = valorNovo;
    }
}
