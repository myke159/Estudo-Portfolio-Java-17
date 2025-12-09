package exercicios;

public class Exercicio74 {

    public static int contaVogais(String palavra){

        int totalVogais = 0;

        palavra = palavra.toLowerCase();

        for (char c : palavra.toCharArray()) {

            if ("aeiou".indexOf(c) != -1) {

                totalVogais++;

            }

        }

        return totalVogais;

    }

    public static void main(String[] args) {

        System.out.println(contaVogais("amor"));

    }

}
