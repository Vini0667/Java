package Domain;

public abstract class Terrestre extends Transporte {
    protected int numRodas;

    Terrestre (int capacidade, int numRodas) {
        super (capacidade);
        this.numRodas = numRodas;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
}