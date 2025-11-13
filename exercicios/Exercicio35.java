package exercicios;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {


            if (((float) i%7) == 0) {
                
                System.out.println("Primeiro multiplo de 7 encontrado: " + i);
                break;
            }

        }

    }

}
