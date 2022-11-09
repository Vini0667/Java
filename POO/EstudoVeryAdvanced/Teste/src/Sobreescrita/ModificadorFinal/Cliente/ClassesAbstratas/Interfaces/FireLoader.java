package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas.Interfaces;

public class FireLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando o arquivo");
    }

    @Override
    public void remov() {
        System.out.println("Removendo dados de um arquivo");
    }
}
