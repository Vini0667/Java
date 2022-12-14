import javax.swing.JOptionPane;

public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    
    public Carro(String modelo, String marca, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void imprimir () {
        JOptionPane.showMessageDialog(null, "Os dados do carro são:\nModelo: " + modelo + "\nMarca: " + marca + "\nPlaca: " + placa, "DADOS", JOptionPane.INFORMATION_MESSAGE);
    }
}