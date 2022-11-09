import javax.swing.JOptionPane;

public class PrincipalJogador {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Jõaozinho pé de vela", "01234567891");
        Jogador j2 = new Jogador("Cristiano Edinaldo", "01234567896", 15);

        for (int i = 0; i < 5; i++)
            j1.fazPonto();

        for (int i = 0; i < 5; i++)
            j2.fazPonto();

        JOptionPane.showMessageDialog(null, "Dados do 1° jogador: ", "Dados", JOptionPane.INFORMATION_MESSAGE);
        j1.imprimeDados();

        JOptionPane.showMessageDialog(null, "Dados do 2° jogador: ", "Dados", JOptionPane.INFORMATION_MESSAGE);
        j2.imprimeDados();
    }
}