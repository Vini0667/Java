package Domain;

public abstract class Transporte {
    protected int capacidade;
    protected abstract void move ();

    Transporte (int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}