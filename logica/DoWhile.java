package logica;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        int contador = 1;

        Scanner join = new Scanner(System.in);

        do {
            System.out.println("Contagem: " + contador);
            contador++;
        } while (contador <= 5);

    }

}
