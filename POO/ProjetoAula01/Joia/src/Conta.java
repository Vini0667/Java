import javax.swing.JOptionPane;

public class Conta {
    public int numero;
    public String titular, extrato;
    public double saldo;

    public double sacar(double valor) {
        return saldo - valor > 0 ? saldo - valor : 0;
    }

    public double depositar(double valor) {
        if (valor > 0)
            return valor;
        else
            extrato = extrato + "\nSaque não autorizado";

        return this.saldo;
    }

    public void dados() {
        JOptionPane.showMessageDialog(null, "O titular é:  " + titular + "\nO saldo é: " + saldo + "\nO extrato é: "
                + extrato + "\nE o numero da conta é: " + numero, "Menssagem Daora", JOptionPane.INFORMATION_MESSAGE);
    }

    public Conta(int numero, String titular, String extrato, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.extrato = extrato;
        this.saldo = saldo;
    }
}