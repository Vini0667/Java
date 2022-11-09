package Sobreescrita.ModificadorFinal;


public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro ();

        System.out.println(carro.VELOCIDADE_LIMITE);

        Ferrari ferrari = new Ferrari();

        ferrari.setNome("Enzo");

        ferrari.imprime();
    }
}