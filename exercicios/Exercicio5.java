package exercicios;
import java.util.Scanner;

/**
*   Verificar se o número é multiplo de 3 e 5 ao mesmo tempo.
 **/

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("teste");

        System.out.print("Digite um valor: ");
        int numero = entrada.nextInt();

        if ((numero % 3) == 0) {
            System.out.println("O número: " + numero + " é multiplo de 3");
        } else {
            System.out.println("O número: " + numero + " NÃO é multiplo de 3");
        }

        if (((numero % 5) == 0)) {
            System.out.println("O número: " + numero + " é multiplo de 5");
        } else {
            System.out.println("O número: " + numero + " NÃO é multiplo de 5");
        }
        entrada.close();
    }
}
