import javax.swing.JOptionPane;

public class IMC {
    public String nome, CPF;
    public float altura, peso;

    public void imprimirDados () {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + CPF + "\nAltura: " + altura + "\npeso: " + peso);
    }

    public float imc () {
        return peso / (altura * altura);
    }

    public void entradaDeDados () {
        CPF = JOptionPane.showInputDialog(null, "Insira seu CPF:");
        nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
        altura = Float.parseFloat(JOptionPane.showInputDialog (null, "Insira sua altura:"));
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua massa:"));
    }
}