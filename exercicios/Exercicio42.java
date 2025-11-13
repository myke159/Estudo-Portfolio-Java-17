package exercicios;

import java.util.Random;

public class Exercicio42 {

    public static void main(String[] args) {

        int padrao = 10;
        Random random = new Random();


        while (true) {

             int gerado = random.nextInt(9, 20);

            System.out.println(gerado);
            if (gerado == 10) {
                break;
            }

        }

    }

}
