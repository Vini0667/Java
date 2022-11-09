package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas.Interfaces;

public class DataBaseLoader implements DataLoader , DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando os dados ao banco de dados");
    }

    @Override
    public void remov() {
        System.out.println("Removendo do banco de dados...");
    }

    
}