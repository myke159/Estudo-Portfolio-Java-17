package exercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio59 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        ArrayList<Integer> valoresFixos = new ArrayList<>(Arrays.asList(5, 10, 20, 15, 30));

        int somaTotal = 0;

        for (int valor : valoresFixos) {
            somaTotal += valor;
        }

        System.out.printf("Valor da soma total: %d", somaTotal);



    }

}
