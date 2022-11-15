package Domain;

public class Automovel extends Terrestre {
    protected String cor, placa;
    protected int numPortas;

    public Automovel(int capacidade, int numRodas, String cor, int numPortas, String placa) {
        super (capacidade, numRodas);
        this.cor = cor;
        this.numPortas = numPortas;
        this.placa = placa;
    }

    public void move () {
        System.out.println("Estou me movendo!!! Vrum, Vrum");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    

}