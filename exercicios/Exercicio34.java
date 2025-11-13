package exercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercicio34 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        System.out.println("Digite palavras separadas por virgulas: ");
        String digitado = join.nextLine();

//        "casa", "carro", "sol", "arvore"
        List<String> listaPalavras = Arrays.asList(digitado.split(","));

        for (String item : listaPalavras) {
            if (item.length() > 4) {
                System.out.println(item);
            }
        }

    }

}
