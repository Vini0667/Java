package Strings;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "William";
        String nome2 = "William";

        nome.concat(" Suane");

        System.out.println(nome == nome2);

        String nome3 = new String ("William");

        System.out.println(nome == nome3.intern());
    }
}