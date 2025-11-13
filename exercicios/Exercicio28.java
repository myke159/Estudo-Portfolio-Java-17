package exercicios;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner join = new Scanner(System.in);

        String digitado = "";
        String senha = "agora123";

        do {

            System.out.print("Digite a senha: ");
            digitado = join.nextLine();

            if (!senha.equals(digitado)) {
                System.out.println("Senha incorreta, tente novamente");
            }

        } while (!senha.equals(digitado));

    }

}
