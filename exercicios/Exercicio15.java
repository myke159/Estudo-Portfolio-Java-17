package exercicios;

import java.util.Scanner;

public class Exercicio15 {

    /*
    Pedir para digitar números até digitar o 0
     */

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        int numero = 1;

        while (numero != 0) {
            System.out.print("Digite um numero! [0] para: ");
            numero = join.nextInt();
        }







    }

}
