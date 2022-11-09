import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Traingulo a = new Traingulo(3, 4, 5);
        JOptionPane.showMessageDialog(null, "O perimetro é: " + a.calculoPerimetro(), "Perimetro", JOptionPane.INFORMATION_MESSAGE);
        a.testeTriangulo ();
    }
}