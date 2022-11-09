package Sobreescrita.ModificadorFinal.Cliente.ClassesAbstratas.Interfaces;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        FireLoader fireload = new FireLoader();
        DataBaseLoader dataload = new DataBaseLoader();

        dataload.load();
        fireload.load();
        dataload.checkPermission();
        System.out.println("-----------------------------");
        fireload.checkPermission();
    }
}