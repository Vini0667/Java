package Strings;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "Luffy", numeros = "012345";

        System.out.println(nome.charAt(0)); // Mostra o caractere do index
        System.out.println(nome.length()); // Mostra o tamanho da String
        System.out.println(nome.replace("f", "l")); // Troca os 'f' da String por 'l'
        System.out.println(nome.toLowerCase()); // Transforma tudo em minusculos
        System.out.println(nome.toUpperCase()); // Transforma tudo em maiusculo
        System.out.println(numeros.substring(0)); // Percorre a String de um ponto até o determinado no segundo parametro (Obs: Se não for passado nada ele percorre até o final);
        System.out.println(nome.trim()); // Remove os valores em branco do começo e do fim da String
    }
}