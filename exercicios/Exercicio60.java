package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio60 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Myke", "solange", "CArlos"));

        String entrada;

        System.out.println("--- Procurar nome na lista ---");
        System.out.print("Digite nome para pesquisa: ");
        entrada = join.next().toUpperCase();

        for (int i = 0; i < nomes.size(); i++) {
            nomes.set(i, nomes.get(i).toUpperCase());
        }


        if (nomes.contains(entrada)) {
            System.out.printf("O nome: %s. Foi encontrado na lista.", entrada);
        } else {
            System.out.printf("%s. NÃO ENCONTRADO", entrada);
        }




    }

}
