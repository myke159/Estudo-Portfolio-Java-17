package exercicios;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        String senha = "mudei123";

        String digitado;

        for (int i = 1; i <= 3; i++){

            System.out.print("Digite a senha [" + i + "]: ");
            digitado = join.nextLine();

            if (senha.equals(digitado)) {
                System.out.println("Acessando sistema...");
                break;

            } else if (!senha.equals(digitado)) {
                System.out.println("Senha incorreta! Digite novamente!");
            }

            if (!senha.equals(digitado) && i == 3) {
                System.out.println("Sistema bloqueado!!!");
                break;
            }

        }

    }

}
