package Strings;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Goku";
        nome.concat(" kamehameha");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder ("Olá");
        sb.append(" Como vai??").append(" Estas bem??");
        sb.substring (0, 2); // Cuidado: Pois retorna uma String -> Mesma coisa de String normal
        sb.substring(0, 2);
        sb.reverse(); // Inverte a ordem da String
        sb.delete (0, 4); // Deleta os caracteres de uma posição até a outra
        System.out.println(sb);
    }
}