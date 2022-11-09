package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas;

public class Teste {
    public static void main(String[] args) {        
        Gerente gerente = new Gerente("Nami", 5000);
        Dev dev = new Dev ("Vinícius", 12000);

        System.out.println(gerente);
        System.out.println(dev);

        gerente.imprime();
        dev.imprime();
    }
}