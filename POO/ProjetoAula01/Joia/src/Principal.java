import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta (1, "Vinicius", "0", 200);

        conta1.dados();
        JOptionPane.showMessageDialog(null, conta1.sacar(100));
    }
}