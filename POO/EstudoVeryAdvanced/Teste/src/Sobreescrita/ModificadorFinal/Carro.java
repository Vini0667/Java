package Sobreescrita.ModificadorFinal;

public class Carro {
    private String nome;
    public final double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime () {
        System.out.println(nome);
    }
}