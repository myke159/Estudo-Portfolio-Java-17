package exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args){

        Scanner join = new Scanner(System.in);

        String senha = "123";

        String tentativaDeSenha;

        while (true){

            System.out.print("Digite a senha: ");
            tentativaDeSenha = join.nextLine();

            if (tentativaDeSenha.equals(senha)) {
                System.out.println("Senha correta. Carregando Sistema");
                break;
            } else {
                System.out.println("Senha INCORRETA. TENTE NOVAMENTE!");
            }
        }

    }

}
