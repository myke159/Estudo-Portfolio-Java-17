package logica;

import java.util.Scanner;

public class While {
    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        System.out.println("Contar de 1 até 5 com while\n");
        int contador = 1;

        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

    }
}
