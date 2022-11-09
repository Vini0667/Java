import javax.swing.JOptionPane;

public class Traingulo {
    double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Traingulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double calculoPerimetro () {
        return a + b + c;
    }

    public void testeTriangulo () {
        String result = Math.abs (b - c) < a && a < b + c && Math.abs (a - c) < b && b < a + c && Math.abs (a - b) < c && c < a + b ? "O triangulo é valido" : "O triangulo é invalido";
        JOptionPane.showMessageDialog(null, result, "Triangulo", JOptionPane.INFORMATION_MESSAGE);
    }
}