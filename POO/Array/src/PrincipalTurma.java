import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrincipalTurma {
    public static void main(String[] args) throws Exception {

        ArrayList<Alunos> alunos = new ArrayList<>();
        alunos.add (new Alunos(JOptionPane.showInputDialog(null, "Digite seu nome:"), Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:"))));

        alunos.forEach(Al -> JOptionPane.showMessageDialog (null, Al.imprimir()));

        ArrayList<Integer> ns = new ArrayList<>();

        ns.add(10);
        ns.add(145);

        ns.forEach(numero -> JOptionPane.showMessageDialog(null, numero));
    }
}