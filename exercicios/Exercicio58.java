package exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio58 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);
        String nome;
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList());

        System.out.println("--- Cadatros de nomes ---");

        do {

            System.out.print("Digite o nome para cadastro: ");
            nome = join.next();

            if (!nome.equals("sair")) {
                nomes.add(nome);

            }

        } while (!nome.equals("sair"));


        for (int i = 0; i < nomes.size(); i++) {

            System.out.printf("%d. %S\n", i, nomes.get(i));

        }








    }

}
