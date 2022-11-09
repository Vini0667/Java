import javax.swing.JOptionPane;

public class App {
    public static void main (String[] args) throws Exception {
        Funcionario jotaro = new Funcionario ();
        
        jotaro.porcentagem (Double.parseDouble (JOptionPane.showInputDialog (null, "Digite a porcentagem de aumento do salario:", "Aumento", JOptionPane.QUESTION_MESSAGE)));

        JOptionPane.showMessageDialog(null, "O salario é: " + jotaro.getSalario(), "DADOS", JOptionPane.INFORMATION_MESSAGE);
    }
}
